//package ru.kata.spring.boot_security.demo.dao;
//
//import org.springframework.stereotype.Repository;
//import ru.kata.spring.boot_security.demo.models.Role;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
//@Repository
//public class RoleDaoImpl implements RoleDao{
//    @PersistenceContext
//    EntityManager entityManager;
//
//    @Override
//    public List<Role> getRoles() {
//        return entityManager.createQuery("SELECT r from Role r", Role.class).getResultList();
//    }
//
//    @Override
//    public Role getRole(Long id) {
//        return entityManager.find(Role.class, id);
//    }
//
//    @Override
//    public Role findByRole(String role) {
//        return entityManager.createQuery("SELECT r from Role r where r.name = :name", Role.class).setParameter("name", role)
//                .getSingleResult();
//    }
//}
