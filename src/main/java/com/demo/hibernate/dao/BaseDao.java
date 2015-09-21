package com.demo.hibernate.dao;

import com.demo.hibernate.test.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/9
 * @Description:
 * @CodeReviewer:
 */
public class BaseDao<T> {
    protected Class<T> entityClass;
    public Session session = HibernateUtil.getSessionFactory().openSession();


    public BaseDao() {
        Class clazz = this.getClass();
        Type genType = clazz.getGenericSuperclass();
        Type[] types = ((ParameterizedType) genType).getActualTypeArguments();
        System.out.println(types[0]);
        this.entityClass = (Class<T>) types[0];
    }

    public List<T> find() {
        Criteria criteria = session.createCriteria(entityClass);
        return criteria.list();
    }

    public void save(T entity) {
        session.save(entity);
    }

    public void saveOrUpdate(T entity) {
        session.saveOrUpdate(entity);
    }

    public void delete(String id) {
        session.delete(id);
    }

    public void update(T entity) {
        session.update(entity);
    }

    public void findOne(String id) {
        session.get(entityClass, id);
    }

    public T findOneByPV(String p,Object v) {
        Criteria criteria = session.createCriteria(entityClass);
        Criterion criterion = Restrictions.eq(p, v);
        criteria.add(criterion);
        return (T) criteria.uniqueResult();
    }

}
