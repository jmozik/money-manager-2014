package cz.jmoz.projects.mmg.web.pages;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;


public class MenuTopPanel extends Panel {
  private static final long serialVersionUID = 1L;

  public MenuTopPanel(String id) {
    super(id);

    BookmarkablePageLink<Void> linkHome = new BookmarkablePageLink<Void>(
        "linkHome", IndexPage.class);
    linkHome.add(new Label("lblLinkHome", getString("label.pagelink.home")));

    BookmarkablePageLink<Void> linkOverviews = new BookmarkablePageLink<Void>(
        "linkOverviews", OverviewsPage.class);
    linkOverviews.add(new Label("lblLinkOverviews", getString("label.pagelink.overviews")));
    
    BookmarkablePageLink<Void> linkSettings = new BookmarkablePageLink<Void>(
        "linkSettings", SettingsPage.class);
    linkSettings.add(new Label("lblLinkSettings", getString("label.pagelink.settings")));
    
    add(linkHome);
    add(linkOverviews);
    add(linkSettings);
  }

}
