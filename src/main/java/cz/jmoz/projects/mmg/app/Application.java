package cz.jmoz.projects.mmg.app;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cz.jmoz.projects.mmg.app.infrastructure.ApplicationContext;
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
    ApplicationContext context = getApplicationContext();
    if (context.getActiveMenuItem() == null) {
      context.setActiveMenuItem(IndexPage.class);
    }
    return IndexPage.class;
  }

  public ApplicationContext getApplicationContext() {
    return (ApplicationContext) WebApplicationContextUtils
        .getRequiredWebApplicationContext(getServletContext()).getBean(
            ApplicationContext.class);
  }

}
