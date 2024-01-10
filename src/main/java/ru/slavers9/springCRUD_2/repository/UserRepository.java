package ru.slavers9.springCRUD_2.repository;

import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.slavers9.springCRUD_2.models.UserModel;
import java.util.List;

@Repository
@AllArgsConstructor
public class UserRepository {
    SessionFactory sessionFactory;

    @Transactional
    public List<UserModel> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        Query<UserModel> query = session.createQuery("FROM UserModel");
        return query.getResultList();
    }

    @Transactional
    public UserModel getUserById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(UserModel.class, id);
    }

    @Transactional
    public void editUser(UserModel user, Long id) {
        Session session = sessionFactory.getCurrentSession();
        user.setId(id);
        session.merge(user);
    }

    @Transactional
    public void addUser(UserModel user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Transactional
    public void deleteUser(Long id) {
        Session session = sessionFactory.getCurrentSession();
        UserModel deletedUser = getUserById(id);
        session.remove(deletedUser);
    }
}
