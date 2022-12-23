package io.github.dkimitsa.hacks;

import com.android.tools.idea.gradle.project.facet.gradle.GradleFacet;
import com.intellij.facet.*;
import com.intellij.notification.*;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.android.facet.AndroidFacet;
import org.jetbrains.annotations.NotNull;

public class AndroidFacetRemoverProjectComponent implements ProjectComponent {

    private static final NotificationGroup GROUP = new NotificationGroup("Android facet-fix notifications",
            NotificationDisplayType.NONE, true);
    private final Project myProject;

    public AndroidFacetRemoverProjectComponent(Project p) {
        myProject = p;
        ProjectWideFacetListenersRegistry.getInstance(myProject).registerListener(new ProjectWideFacetAdapter<>() {
            @Override
            public void facetAdded(@NotNull Facet facet) {
                if (facet.getTypeId().equals(GradleFacet.getFacetTypeId()))
                    removeExtraFacets();
            }
        });
    }

    @Override
    public void projectOpened() {
        removeExtraFacets();
    }

    private void removeExtraFacets() {
        ApplicationManager.getApplication().runWriteAction(() -> {
            StringBuilder sb = new StringBuilder();
            String facetsRemoved = "";
            for (Module module : ModuleManager.getInstance(myProject).getModules()) {
                if (AndroidFacet.getInstance(module) == null && GradleFacet.getInstance(module) != null) {
                    ModifiableFacetModel model = FacetManager.getInstance(module).createModifiableModel();
                    model.removeFacet(GradleFacet.getInstance(module));
                    facetsRemoved = GradleFacet.getFacetId();
                    model.commit();

                    sb.append(facetsRemoved).append(" from module <b>").append(module.getName()).append("</b><br>");
                }
            }

            if (sb.length() > 0) {
                Notification notification = GROUP.createNotification("Facets removed", sb.toString(), NotificationType.INFORMATION);
                Notifications.Bus.notify(notification, myProject);
            }
        });
    }
}
