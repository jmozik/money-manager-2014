package cz.jmoz.projects.mmg.web.pages.elements;

import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import cz.jmoz.projects.mmg.web.pages.IndexPage;
import cz.jmoz.projects.mmg.web.pages.OverViewsPage;
import cz.jmoz.projects.mmg.web.pages.SettingsPage;

public class MenuTopPanel extends Panel {
  private static final long serialVersionUID = 1L;
  private String activePage = "";

  @Autowired
  private ApplicationContext context;

  public MenuTopPanel(String id) {
    super(id);

    initContent();
  }

  public MenuTopPanel(String id, PageParameters params) {
    super(id);
    this.activePage = params.get("activeMenu").toString();
    initContent();
  }

  private void initContent() {
    add(createLinkHome());
    add(createLinkOverViews());
    add(createLinkSettings());
  }

  private Link<Void> createLinkSettings() {
    Link<Void> link = new Link<Void>("linkSettings") {
      private static final long serialVersionUID = 1L;

      @Override
      public void onClick() {
        
        setResponsePage(SettingsPage.class);
      }
    };
    link.add(new Label("lblLinkSettings", getString("link.label.settings")));
    if (activePage.equals(SettingsPage.class.getSimpleName()))
      link.add(new AttributeAppender("class", "selected"));

    return link;
  }

  private Link<Void> createLinkOverViews() {
    Link<Void> link = new Link<Void>("linkOverViews") {
      private static final long serialVersionUID = 1L;

      @Override
      public void onClick() {
        PageParameters params = new PageParameters();
        params.add("activeMenu", OverViewsPage.class.getSimpleName());

        setResponsePage(OverViewsPage.class, params);
      }
    };
    link.add(new Label("lblLinkOverViews", getString("link.label.overViews")));
    if (activePage.equals(OverViewsPage.class.getSimpleName()))
      link.add(new AttributeAppender("class", "selected"));

    return link;
  }

  private Link<Void> createLinkHome() {
    Link<Void> link = new Link<Void>("linkHome") {
      private static final long serialVersionUID = 1L;

      @Override
      public void onClick() {
        PageParameters params = new PageParameters();
        params.add("activeMenu", IndexPage.class.getSimpleName());

        setResponsePage(IndexPage.class, params);
      }
    };
    link.add(new Label("lblLinkHome", getString("link.label.home")));
    if (activePage.equals(IndexPage.class.getSimpleName()))
      link.add(new AttributeAppender("class", "selected"));

    return link;
  }
}
