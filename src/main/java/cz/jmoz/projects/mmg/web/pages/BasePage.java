package cz.jmoz.projects.mmg.web.pages;

import org.apache.wicket.markup.html.WebPage;

import cz.jmoz.projects.mmg.web.pages.elements.MenuTopPanel;

public class BasePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public BasePage() {
		add(new MenuTopPanel("menuTop"));
		
	}
}
