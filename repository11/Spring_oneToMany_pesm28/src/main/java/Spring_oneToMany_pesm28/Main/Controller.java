package Spring_oneToMany_pesm28.Main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Spring_oneToMany_pesm28.dao.CardDao;
import Spring_oneToMany_pesm28.dao.Cardconfiganation;
import Spring_oneToMany_pesm28.dto.Card;
import Spring_oneToMany_pesm28.dto.Item;

public class Controller {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cardconfiganation.class);
		Item item1 = applicationContext.getBean("item", Item.class);
		item1.setName("Laptop");
		item1.setPrise(15000);
		Item item2 = applicationContext.getBean("item", Item.class);
		item2.setName("Iphone");
		item2.setPrise(199000);
		
		Card card=applicationContext.getBean("card",Card.class);
		card.setName("Amazon");
		card.setEmail("r@gamil");
		
		
		List<Item>items=new ArrayList<Item>();
		items.add(item1);
		items.add(item2);

		card.setItems(items);
		CardDao dao=applicationContext.getBean("cardDao",CardDao.class);
		//dao.savacard(card);
//		dao.getfind(1);
//		dao.getfind(2);
		//dao.DeleteItem(1);
	dao.UpdateAll(1, item1);
	dao.UpdateAll(2, item2);
	}

}
