package org.example._2024_07_09;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class DataBaseHelperHibernate {

    @Getter
    private SessionFactory sessionFactory = build();

    private SessionFactory build() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        configuration.addAnnotatedClass(Author.class);

        ServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        return configuration.buildSessionFactory(registry);
    }

    public static void main(String[] args) {
        SessionFactory sessionFactory1 = new DataBaseHelperHibernate().build();

        Session session = sessionFactory1.openSession();
        Query<Author> query = session.createQuery("from Author", Author.class);
        List<Author> authors = query.getResultList();

        for (Author author : authors) {
            System.out.println(author);
        }

        session.close();
    }
}
