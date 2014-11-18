package cz.jmoz.projects.mmg.app;

import org.apache.wicket.protocol.http.WebApplication;

import cz.jmoz.projects.mmg.web.pages.IndexPage;

public class Application extends WebApplication {

	@Override
	public Class<IndexPage> getHomePage() {
		return IndexPage.class;
	}

}
