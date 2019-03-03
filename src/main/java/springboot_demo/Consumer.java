package springboot_demo;

import java.util.Map;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@JmsListener(destination="itcast")
	public void readMessage(String text){
		System.out.println("接受消息："+text);
	}
	
	@JmsListener(destination="itcastMap")
	public void readMessageMap(Map map){
		
		System.out.println("接受消息："+map);
	}
	
	
}
