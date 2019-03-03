package springboot_demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueueController {
	
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@RequestMapping("/send")
	public void send(String text){
		jmsMessagingTemplate.convertAndSend("itcast", text);
	}
	
	
	@RequestMapping("/sendMap")
	public void sendMap(){
		Map map=new HashMap();
		map.put("AAA", 123);
		map.put("bbb", 345);
		map.put("ccc", 456);
		jmsMessagingTemplate.convertAndSend("itcastMap", map);
	}
}
