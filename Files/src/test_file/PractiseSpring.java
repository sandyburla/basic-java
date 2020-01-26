package test_file;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;

public class PractiseSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource r = new ClassPathResource("resource/spring.xml");
		//BeanFactory facotry = new  xmlBeanFactory(r);
		BeanFactory factory = new XmlBeanFactory(r);
		
Object o = factory.getBean("h");
TestSpring h = (TestSpring) o;
h.hello();
	}

}
