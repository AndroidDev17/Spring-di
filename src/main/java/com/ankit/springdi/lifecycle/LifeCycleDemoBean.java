package com.ankit.springdi.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * created by ADMIN on Mar, 2022
 */

@Component
public class LifeCycleDemoBean implements InitializingBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, DisposableBean {

    private String TAG = LifeCycleDemoBean.class.getSimpleName();

    public void out(String msg) {
        System.out.println("##" + TAG + " : "+ msg);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        out("afterPropertiesSet");
    }

    @Override
    public void setBeanName(String s) {
        out("setBeanName-> "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        out("setBeanFactory-> "+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        out("setApplicationContext");
    }

    @Override
    public void destroy() throws Exception {
        out("bean destroy");
    }

    public void beforeInit() {
        out("beforeInit");
    }

    public void afterInit() {
        out("afterInit");
    }
}
