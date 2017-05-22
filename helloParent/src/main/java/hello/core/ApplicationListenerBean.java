package hello.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.Map;

/**
 * @author zili.wang@hand-china.com 2017/5/22 15:42
 * @version 1.0
 * @name ApplicationListenerBean
 * @description
 **/
public class ApplicationListenerBean implements ApplicationListener{

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ContextRefreshedEvent) {
            ApplicationContext applicationContext = ((ContextRefreshedEvent) event).getApplicationContext();
            Map<String, AppContextInitListener> beanMap = applicationContext.getBeansOfType(AppContextInitListener.class);
            beanMap.forEach((k, v) -> {
                v.contextInitialized(applicationContext);
            });
        }
    }
}
