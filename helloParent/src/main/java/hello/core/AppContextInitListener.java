package hello.core;

import org.springframework.context.ApplicationContext;

/**
 * @author zili.wang@hand-china.com 2017/5/22 15:45
 * @version 1.0
 * @name AppContextInitListener
 * @description
 **/
public interface AppContextInitListener {
    void contextInitialized(ApplicationContext applicationContext);
}
