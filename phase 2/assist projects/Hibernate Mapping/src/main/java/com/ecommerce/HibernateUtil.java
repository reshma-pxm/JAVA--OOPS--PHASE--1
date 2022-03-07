package com.ecommerce;

public class HibernateUtil {
	
private static SessionFactory sessionFactory;
	
	static {
		try {
			
			StandardServiceRegistry registry= new StandardServiceRegistryBuilder().
					configure("hibernate.cfg.xml").build();
			
			Metadata metadata= new MetadataSources(registry).getMetadataBuilder().build();
			
			sessionFactory= metadata.getSessionFactoryBuilder().build();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
}
}
