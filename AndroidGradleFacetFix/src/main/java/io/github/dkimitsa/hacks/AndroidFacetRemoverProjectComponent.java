package io.github.dkimitsa.hacks;

import com.android.tools.idea.gradle.project.facet.gradle.GradleFacet;
import com.android.tools.idea.gradle.project.facet.java.JavaFacet;
import com.intellij.facet.*;
import com.intellij.notification.*;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.android.facet.AndroidFacet;

public class AndroidFacetRemoverProjectComponent implements ProjectComponent {

    private static final NotificationGroup GROUP = new NotificationGroup("Android facet-fix notifications",
            NotificationDisplayType.NONE, true);
    private final Project myProject;

    public AndroidFacetRemoverProjectComponent(Project p) {
        myProject = p;
        ProjectWideFacetListenersRegistry.getInstance(myProject).registerListener(new ProjectWideFacetAdapter<Facet>(){
            @Override
            public void facetAdded(Facet facet) {
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
            String modulesUpdated = "";
            String facetsRemoved = "";
            for (Module module : ModuleManager.getInstance(myProject).getModules()) {
                if (AndroidFacet.getInstance(module) == null && GradleFacet.getInstance(module) != null) {
                    ModifiableFacetModel model = FacetManager.getInstance(module).createModifiableModel();
                    model.removeFacet(GradleFacet.getInstance(module));
                    facetsRemoved = GradleFacet.getFacetId();
                    if (JavaFacet.getInstance(module) != null) {
                        model.removeFacet(JavaFacet.getInstance(module));
                        facetsRemoved += ", " + JavaFacet.getFacetId();
                    }
                    model.commit();

                    modulesUpdated += facetsRemoved + " from module <b>" + module.getName() + "</b><br>";
                }
            }

            if (!modulesUpdated.isEmpty()) {
                Notification notification = GROUP.createNotification("Facets removed",  modulesUpdated, NotificationType.INFORMATION, null);
                Notifications.Bus.notify(notification, myProject);
            }
        });
    }
}
