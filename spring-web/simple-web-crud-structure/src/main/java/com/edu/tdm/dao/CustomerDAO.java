package com.edu.tdm.dao;

import com.edu.tdm.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
    }

    public List<Customer> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Customer", Customer.class).list();
    }

    public Customer getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Customer.class, id);
    }

    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.byId(Customer.class).load(id);
        session.delete(customer);
    }
}
