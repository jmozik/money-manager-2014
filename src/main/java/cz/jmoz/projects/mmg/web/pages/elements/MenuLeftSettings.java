package cz.jmoz.projects.mmg.web.pages.elements;

import org.apache.wicket.markup.html.panel.Panel;

import cz.jmoz.projects.mmg.web.pages.IndexPage;

public class MenuLeftSettings extends Panel {
  private static final long serialVersionUID = 1L;

  public MenuLeftSettings(String id) {
    super(id);

    PageLink linkCategories = new PageLink("linkCategories", IndexPage.class,
        getString("label.pagelink.categories"));

    add(linkCategories);

  }

}
