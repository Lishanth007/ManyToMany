package MappingPkg;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManiMapping {

	public static void main(String[] args) {

		SocialMedia sm1 = new SocialMedia();
		sm1.setsId(101);
		sm1.setSoccialMediaName("Meta");

		SocialMedia sm2 = new SocialMedia();
		sm2.setsId(102);
		sm2.setSoccialMediaName("Instagram");

		SocialMedia sm3 = new SocialMedia();
		sm3.setsId(103);
		sm3.setSoccialMediaName("LinkedIn");

		SocialMedia sm4 = new SocialMedia();
		sm4.setsId(104);
		sm4.setSoccialMediaName("Telegram");

		SocialMedia sm5 = new SocialMedia();
		sm5.setsId(105);
		sm5.setSoccialMediaName("SnapChat");

		SocialMedia sm6 = new SocialMedia();
		sm6.setsId(106);
		sm6.setSoccialMediaName("Whatsapp");

		ArrayList<SocialMedia> mediaList1 = new ArrayList<SocialMedia>();
		mediaList1.add(sm1);
		mediaList1.add(sm2);
		ArrayList<SocialMedia> mediaList2 = new ArrayList<SocialMedia>();
		mediaList2.add(sm3);
		mediaList2.add(sm4);
		ArrayList<SocialMedia> mediaList3 = new ArrayList<SocialMedia>();
		mediaList3.add(sm5);
		mediaList3.add(sm6);
		ArrayList<SocialMedia> mediaList4 = new ArrayList<SocialMedia>();
		mediaList4.add(sm1);
		mediaList4.add(sm4);

		Person person1 = new Person();
		person1.setpId(1);
		person1.setPersonName("Lishanth");
		person1.setAppList(mediaList1);

		Person person2 = new Person();
		person2.setpId(2);
		person2.setPersonName("Sarah");
		person2.setAppList(mediaList2);
		
		Person person3 = new Person();
		person3.setpId(3);
		person3.setPersonName("Hinata");
		person3.setAppList(mediaList3);

		Person person4 = new Person();
		person4.setpId(4);
		person4.setPersonName("Rio");
		person4.setAppList(mediaList4);

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(SocialMedia.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		mediaList1.forEach(session::save);
		mediaList2.forEach(session::save);
		mediaList3.forEach(session::save);
		mediaList4.forEach(session::save);
		session.save(person1);
		session.save(person2);
		session.save(person3);
		session.save(person4);
		
		transaction.commit();
	}

}
