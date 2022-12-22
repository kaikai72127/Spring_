package tw.leonchen.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.Room;

public class DemoRoomAction {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		Room room1 = context.getBean("room1",Room.class);
		System.out.println(room1.getId()+" "+room1.getName()+" "+room1.getSize());
		
		
		Room room2 = context.getBean("room2",Room.class);
		System.out.println(room2.getId()+" "+room2.getName()+" "+room2.getSize()+" "+room2.getDate());
		
		Room room3 = context.getBean("room3",Room.class);
		System.out.println(room3.getId()+" "+room3.getName()+" "+room3.getSize()+" "+room3.getDate());
		
		Room room4 = context.getBean("room1",Room.class);
		Room room5 = context.getBean("room1",Room.class);
		
		System.out.println(room4.hashCode());
		System.out.println(room5.hashCode());
		
		context.close();
	}

}
