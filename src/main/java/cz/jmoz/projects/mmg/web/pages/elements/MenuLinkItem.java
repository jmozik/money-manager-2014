package cz.jmoz.projects.mmg.web.pages.elements;

import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;

public class MenuLinkItem extends Panel {
  private static final long serialVersionUID = 1L;

  public MenuLinkItem(String id) {
    super(id);
  }

  public MenuLinkItem(String id, BookmarkablePageLink<Void> pageLink, boolean isActive) {
    super(id);

    add(pageLink);
    if (isActive) {
      add(new AttributeAppender("class", "active"));
    }
  }
}
