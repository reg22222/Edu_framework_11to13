package jeonggeun.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TVUser {
	public static void main(String[] args) {
		// 1. pring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup) �Ѵ�.
		TV tv = (TV) factory.getBean("tv"); // == TV tv = factory.getBean("tv",TV.class);
		TV tv2 = (TV) factory.getBean("tv"); 
		//TV tv3 = (TV) factory.getBean("tv"); //singleton �϶��� �ѹ��� �����, prototype�̶�� 3�������
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		factory.close();
	}

}
