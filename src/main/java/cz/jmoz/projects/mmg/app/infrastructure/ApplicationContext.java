package cz.jmoz.projects.mmg.app.infrastructure;

import org.springframework.stereotype.Component;

@Component
public class ApplicationContext {
  private Class activeMenuItem;
  private Class activeSubMenuItem;
  
  public Class getActiveMenuItem() {
    return activeMenuItem;
  }
  public void setActiveMenuItem(Class activeMenuItem) {
    this.activeMenuItem = activeMenuItem;
  }
  public Class getActiveSubMenuItem() {
    return activeSubMenuItem;
  }
  public void setActiveSubMenuItem(Class activeSubMenuItem) {
    this.activeSubMenuItem = activeSubMenuItem;
  }

}
