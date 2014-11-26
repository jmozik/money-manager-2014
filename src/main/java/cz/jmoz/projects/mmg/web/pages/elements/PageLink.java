package cz.jmoz.projects.mmg.web.pages.elements;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class PageLink extends BookmarkablePageLink<Void> {
  private static final long serialVersionUID = 1L;

  public PageLink(String id, Class pageClass) {
    super(id, pageClass);  
  }
  
  public PageLink(String id, Class pageClass, String resource) {
    super(id, pageClass);
    
    Character ch = Character.toUpperCase(id.charAt(0));
    String rest = id.substring(1);
    
    add(new Label("lbl" + ch + rest, resource));
  }
}
