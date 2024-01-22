package io.github.dkimitsa.hacks;

import com.android.tools.idea.gradle.project.facet.gradle.GradleFacet;
import com.intellij.facet.Facet;
import com.intellij.facet.FacetManager;
import com.intellij.facet.ModifiableFacetModel;
import com.intellij.facet.ProjectWideFacetAdapter;
import com.intellij.facet.ProjectWideFacetListenersRegistry;
import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.android.facet.AndroidFacet;
import org.jetbrains.annotations.NotNull;

public class AndroidFacetRemoverProjectComponent implements ProjectComponent {

    private final Project myProject;

    public AndroidFacetRemoverProjectComponent(Project p) {
        myProject = p;
        ProjectWideFacetListenersRegistry.getInstance(myProject).registerListener(new ProjectWideFacetAdapter<>() {
            @Override
            public void facetAdded(@NotNull Facet facet) {
                if (facet.getTypeId().equals(GradleFacet.getFacetTypeId())) {
                    ApplicationManager.getApplication().invokeLater(() -> {
                        ApplicationManager.getApplication().runWriteAction(() -> {
                            removeExtraFacets();
                        });
                    });
                }
            }
        });
    }

    @Override
    public void projectOpened() {
        ApplicationManager.getApplication().invokeLater(() -> {
            ApplicationManager.getApplication().runWriteAction(this::removeExtraFacets);
        });
    }

    private void removeExtraFacets() {
        StringBuilder sb = new StringBuilder();
        for (Module module : ModuleManager.getInstance(myProject).getModules()) {
            if (AndroidFacet.getInstance(module) == null && GradleFacet.getInstance(module) != null) {
                ModifiableFacetModel model = FacetManager.getInstance(module).createModifiableModel();
                model.removeFacet(GradleFacet.getInstance(module));
                model.commit();

                sb.append(GradleFacet.getFacetId()).append(" from module <b>").append(module.getName()).append("</b><br>");
            }
        }

        if (sb.length() > 0) {
            String message = "Facets removed:\n" + sb;
            NotificationGroupManager.getInstance()
                    .getNotificationGroup("Android Facet removed notification")
                    .createNotification(message, NotificationType.INFORMATION)
                    .notify(myProject);
        }
    }
}
