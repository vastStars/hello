package com.hello.core;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.config.PlaceholderConfigurerSupport;

/**
 * @author zili.wang@hand-china.com 2017/5/27 13:23
 * @version 1.0
 * @name JndiObjectFactoryBean
 * @description
 **/
public class JndiObjectFactoryBean extends org.springframework.jndi.JndiObjectFactoryBean{

    @Override
    public void setJndiName(String jndiName) {
        super.setJndiName(jndiName);
    }
}


