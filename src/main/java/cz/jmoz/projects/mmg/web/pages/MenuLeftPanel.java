package cz.jmoz.projects.mmg.web.pages;

import org.apache.wicket.markup.html.panel.Panel;

import cz.jmoz.projects.mmg.web.pages.elements.PageLink;

public class MenuLeftPanel extends Panel {
  private static final long serialVersionUID = 1L;

  public MenuLeftPanel(String id) {
    super(id);

    PageLink linkCategories = new PageLink("linkCategories", CategoriesPage.class,
        getString("label.pagelink.categories"));

    add(linkCategories);

  }

}
