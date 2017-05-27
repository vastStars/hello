package com.hello.system.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author zili.wang 2017/5/23 10:22
 * @version 1.0
 * @name DemoController
 * @description
 **/
@Controller
public class DemoController {

    @Autowired
    private BeanFactory beanFactory;

    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/login")
    public String index(){
        System.out.println("--------------000----------");
        logger.info("slf4j + logback");
        Object  m = beanFactory.getBean("iWantKnow");
        DataSource dataSource = (DataSource) beanFactory.getBean("dataSource");
        Connection conn = null;
        String url= "";
        try {
            conn = dataSource.getConnection();
            // 获取url
            url = conn.getMetaData().getURL();
            PreparedStatement ps = conn.prepareStatement("select * from sys_code_b");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(2));
                rs.getString(2);
            }

        } catch (SQLException e) {
            System.out.println("00");
            e.printStackTrace();
        }finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(m.toString());
        System.out.println(url);
        return "login";
    }
}
