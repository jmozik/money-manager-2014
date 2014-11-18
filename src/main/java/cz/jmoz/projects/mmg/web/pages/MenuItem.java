package cz.jmoz.projects.mmg.web.pages;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class MenuItem extends WebMarkupContainer {
	private static final long serialVersionUID = 1L;

	public MenuItem(String id) {
		super(id);
	}
	
	public MenuItem(String id, Class<? extends BasePage> linkTo,
            Class<? extends BasePage> currentGeneric) {
		this(id);
		
		boolean isCurrentPage = currentGeneric.equals(linkTo);
        setOutputMarkupId(isCurrentPage);
        add(new BookmarkablePageLink("link", linkTo));
		
	}

}
