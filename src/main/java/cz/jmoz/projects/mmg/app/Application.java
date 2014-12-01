package cz.jmoz.projects.mmg.app;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import cz.jmoz.projects.mmg.web.pages.IndexPage;

public class Application extends WebApplication {
  
  @Override
  protected void init() {
    super.init();
    
    getComponentInstantiationListeners().add(getSpringInjector());
  }
  
  protected SpringComponentInjector getSpringInjector() {
    return new SpringComponentInjector(this);
  }

	@Override
	public Class<IndexPage> getHomePage() {
		return IndexPage.class;
	}

}
