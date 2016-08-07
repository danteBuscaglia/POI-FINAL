package entrega3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entrega1.POI;
import entrega2.Usuario;

public class FabricaDeDB {
	public void crearPOI(POI poi) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(POI.class)
				.buildSessionFactory();
		Session sesion = null;
		try {
			sesion = factory.getCurrentSession();
		} catch (org.hibernate.HibernateException he) {
			sesion = factory.openSession();
		}

		try {
			sesion.beginTransaction();
			sesion.save(poi);
			sesion.getTransaction().commit();
		} finally {
			factory.close();
		}

	}

	public Usuario obtenContacto(String nombre) {
		Usuario u;

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuario.class)
				.buildSessionFactory();
		Session sesion = null;
		try {
			sesion = factory.getCurrentSession();
		} catch (org.hibernate.HibernateException he) {
			sesion = factory.openSession();
		}

		try {
			sesion.beginTransaction();
			u = (Usuario) sesion.get(Usuario.class, nombre);
		} finally {
			factory.close();
		}
		return u;
	}

}
