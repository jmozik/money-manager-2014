package cz.jmoz.projects.mmg.web.pages;

import org.apache.wicket.markup.html.WebPage;

public class BasePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public BasePage() {
		add(new MenuTopPanel("menuTop"));
		
	}
}
