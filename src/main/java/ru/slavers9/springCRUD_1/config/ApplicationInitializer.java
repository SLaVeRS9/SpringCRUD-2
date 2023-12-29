package ru.slavers9.springCRUD_1.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    //Указываем файл с конфигурацией спринга
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfiguration.class};
    }

    //Указываем какие запросы уходят на диспатчер сервлетов
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
