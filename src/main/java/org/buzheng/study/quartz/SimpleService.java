package org.buzheng.study.quartz;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service("simpleService")
public class SimpleService implements Serializable {

	private static final long serialVersionUID = 122323233244334343L;  
	
	private static Log logger = LogFactory.getLog(SimpleService.class);
      
    public void testMethod1(){  
        //这里执行定时调度业务  
        logger.info("testMethod1.......1");
    }  
      
    public void testMethod2(){  
        logger.info("testMethod2.......2");
    }  

}
