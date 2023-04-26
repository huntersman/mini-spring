package org.example.beans;

// bean工厂，存放bean到map中
public interface BeanFactory {

    Object getBean(String name);

}
