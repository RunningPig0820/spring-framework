package studySpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Description :
 * @Author : zhangmin
 * @Data 2019-06-19 10:06 AM
 **/
public class ApplicationMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
	}
}
