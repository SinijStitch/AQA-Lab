package day_6;


import org.hibernate.Session;

public class HibernateMain {
    public static void main(String[] args){
       Session session = (Session) HibernateUtil.getSessionFactory().openSession();
        User user = new User();
        user.setName("Oleh");
        user.setAge(20);
        user.setCity_id(1);

        // Create
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();

        // Read
        session.beginTransaction();
        System.out.println(session.find(User.class, 1).toString());
        session.getTransaction().commit();
        session.close();

        // Update
        session.beginTransaction();
        User Oleh = session.find(User.class, 1);
        Oleh.setAge(21);
        session.update(Oleh);
        session.getTransaction().commit();
        session.close();

        // Delete
        session.beginTransaction();
        User Oleh1 = session.find(User.class, 1);
        session.delete(Oleh1);
        session.getTransaction().commit();
        session.close();

    }
}
