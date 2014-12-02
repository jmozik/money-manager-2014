package cz.jmoz.projects.mmg.web.pages.elements;

import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import cz.jmoz.projects.mmg.app.infrastructure.ApplicationContext;
import cz.jmoz.projects.mmg.web.pages.IndexPage;
import cz.jmoz.projects.mmg.web.pages.OverViewsPage;
import cz.jmoz.projects.mmg.web.pages.SettingsPage;

public class MenuTopPanel extends Panel {
  private static final long serialVersionUID = 1L;

  @SpringBean
  private ApplicationContext context;

  public MenuTopPanel(String id) {
    super(id);

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
        context.setActiveMenuItem(SettingsPage.class);
        setResponsePage(SettingsPage.class);
      }
    };
    link.add(new Label("lblLinkSettings", getString("link.label.settings")));
    if(context.getActiveMenuItem().equals(SettingsPage.class))
      link.add(new AttributeAppender("class", "selected"));

    return link;
  }

  private Link<Void> createLinkOverViews() {
    Link<Void> link = new Link<Void>("linkOverViews") {
      private static final long serialVersionUID = 1L;

      @Override
      public void onClick() {

        context.setActiveMenuItem(OverViewsPage.class);
        setResponsePage(OverViewsPage.class);
      }
    };
    link.add(new Label("lblLinkOverViews", getString("link.label.overViews")));
    if(context.getActiveMenuItem().equals(OverViewsPage.class))
      link.add(new AttributeAppender("class", "selected"));

    return link;
  }

  private Link<Void> createLinkHome() {
    Link<Void> link = new Link<Void>("linkHome") {
      private static final long serialVersionUID = 1L;

      @Override
      public void onClick() {
        context.setActiveMenuItem(IndexPage.class);
        setResponsePage(IndexPage.class);
      }
    };
    link.add(new Label("lblLinkHome", getString("link.label.home")));
    if(context.getActiveMenuItem().equals(IndexPage.class))
      link.add(new AttributeAppender("class", "selected"));

    return link;
  }
}
