package com.hello.system.util;

import com.hello.core.JndiObjectFactoryBean;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.config.PlaceholderConfigurerSupport;

import java.io.IOException;
import java.util.Properties;

/**
 * @author zili.wang 2017/5/27 13:46
 * @version 1.0
 * @name Demo
 * @description
 **/
public class Demo {

    public static void main(String[] args){
        getJndi("${java:comp/env/jdbc/hap_dev}");
    }

    public static void getJndi(String jndiName){
        String defaultValue = null;
        if (jndiName.startsWith(PlaceholderConfigurerSupport.DEFAULT_PLACEHOLDER_PREFIX)){
            String rawKey = jndiName.substring(2, jndiName.length() - 1);
            System.out.println("rawKey: "+rawKey);

            int idx = rawKey.indexOf(PlaceholderConfigurerSupport.DEFAULT_VALUE_SEPARATOR);
            System.out.println("idx: "+idx);
            if (idx != -1) {
                rawKey = StringUtils.trim(rawKey.substring(0, idx));
                System.out.println("rawKey: "+rawKey);
                defaultValue = StringUtils.trim(rawKey.substring(idx + 1));
            }

            System.out.println(defaultValue);
        }

        Properties properties = new Properties();
        try {
            properties.load(JndiObjectFactoryBean.class.getResourceAsStream("/config.properties"));
            jndiName = properties.getProperty("db.jndiName");
            System.out.println(jndiName);
            if (jndiName == null && defaultValue != null) {
                jndiName = defaultValue;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
