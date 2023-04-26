package org.example.beans.factory.support;

import org.example.beans.BeanFactory;
import org.example.beans.BeansException;
import org.example.beans.factory.config.BeanDefinition;
import org.example.beans.factory.config.DefaultSingletonBeanRegistry;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
