package Spring_oneToMany_pesm28.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Spring_oneToMany_pesm28.dto.Card;
import Spring_oneToMany_pesm28.dto.Item;

@Component
public class CardDao {
	@Autowired
	private EntityManager entityManager;

	public void savacard(Card card) {
		entityManager.getTransaction().begin();
		entityManager.persist(card);
		entityManager.getTransaction().commit();
	}
	public void getfind(int id)
	{
		Item item=entityManager.find(Item.class, id);
		System.out.println(item);
		
		
	}
	public void DeleteItem(int id)
	{
		Card card=entityManager.find(Card.class, id);
		entityManager.getTransaction().begin();
		entityManager.remove(card);
		entityManager.getTransaction().commit();
		System.out.println("id removerd  succefully!!!!");
	}
	
	
	public void UpdateAll(int id ,Item item)
	{
		Item dbcard=entityManager.find(Item.class, id);
		if(dbcard!=null)
		{
		item.setId(id);
		entityManager.getTransaction().begin();
		entityManager.merge(item);
		entityManager.getTransaction().commit();
		System.out.println("Item update  succefully!!!!");
		
		}
	}
 
		
	}
	

