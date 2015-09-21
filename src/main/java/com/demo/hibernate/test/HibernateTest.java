package com.demo.hibernate.test;

import com.alibaba.fastjson.JSON;
import com.demo.hibernate.entity.Article;
import com.demo.hibernate.entity.Organization;
import com.demo.hibernate.entity.Role;
import com.demo.hibernate.entity.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/6
 * @Description:
 * @CodeReviewer:
 */
public class HibernateTest<T> {
    public static Session session = HibernateUtil.getSessionFactory().openSession();
    @Test
    public void save() {
        org.hibernate.Transaction tx;
        tx = session.beginTransaction();
        Article article = new Article();
        article.setTitle("你是最棒的");
        article.setContent("你是这个世界上无与伦比的美丽");
        session.saveOrUpdate(article);
        tx.commit();
        session.close();
    }

    public List<T> find(Class clazz) {
        Criteria criteria = session.createCriteria(clazz);
        return criteria.list();
    }

    @Test
    public void testFind() {
        List<Organization> organizations = (List<Organization>) find(Organization.class);
        System.out.println(JSON.toJSONString(organizations));

    }

    @Test
    public void saveOrganization() {
        Transaction tx = session.beginTransaction();
        Organization organization = new Organization();
        organization.setName("南京市政府");
        session.saveOrUpdate(organization);
        tx.commit();
        session.close();
    }

    @Test
    public void saveUser() {
        Transaction tx = session.beginTransaction();
        Set<Role> roles = new HashSet<Role>((Collection<? extends Role>) find(Role.class));
        User user = new User();
        Organization organization = new Organization();
        organization.setId("org_00");
        user.setName("阿碧");
        user.setRoles(roles);
        user.setOrganization(organization);
        session.saveOrUpdate(user);
        tx.commit();
        session.close();
    }

    @Test
    public void deleteUser() {
        Transaction tx = session.beginTransaction();
        User user = new User();
        user.setId("user_02");
        session.delete(user);
        tx.commit();
        session.close();
    }
}
