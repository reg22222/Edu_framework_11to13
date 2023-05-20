package jeonggeun.spring.collection;

import java.util.*;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		/*
		 List<String> addressList = bean.getAddressList();
		 for (String key : addressList) {
		 System.out.println(key);
		 }
		 */
		/*
		Map<String, String> addressList = bean.getAddressList();
		for( String key : addressList.keySet() ){
		System.out.println(String.format("Ű : %s, �� : %s", key, addressList.get(key)) );
		}
		 */
		/*
		Properties addressList = bean.getAddressList();
		for( String key : addressList.stringPropertyNames() ){
		System.out.println(String.format("Ű : %s, �� : %s", key, addressList.get(key)) );
		}
		*/
		Set<String> addressList = bean.getAddressList();
		
		
		factory.close();
	}
}
