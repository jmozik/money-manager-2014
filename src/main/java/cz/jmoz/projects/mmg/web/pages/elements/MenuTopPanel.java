package cz.jmoz.projects.mmg.web.pages.elements;

import org.apache.wicket.markup.html.panel.Panel;

import cz.jmoz.projects.mmg.web.pages.IndexPage;
import cz.jmoz.projects.mmg.web.pages.OverviewsPage;
import cz.jmoz.projects.mmg.web.pages.SettingsPage;

public class MenuTopPanel extends Panel {
  private static final long serialVersionUID = 1L;

  public MenuTopPanel(String id) {
    super(id);

    PageLink linkHome = new PageLink("linkHome", IndexPage.class,
        getString("label.pagelink.home"));

    PageLink linkOverviews = new PageLink("linkOverviews", OverviewsPage.class,
        getString("label.pagelink.overviews"));

    PageLink linkSettings = new PageLink("linkSettings", SettingsPage.class,
        getString("label.pagelink.settings"));
        
    add(linkHome);
    add(linkOverviews);
    add(linkSettings);

  }

}
