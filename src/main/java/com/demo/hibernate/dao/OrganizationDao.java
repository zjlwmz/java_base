package com.demo.hibernate.dao;

import com.alibaba.fastjson.JSON;
import com.demo.hibernate.entity.Organization;
import org.junit.Test;

import java.util.List;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/9
 * @Description:
 * @CodeReviewer:
 */
public class OrganizationDao extends BaseDao<Organization> {

    @Test
    public void findOrg() {
        BaseDao dao = new OrganizationDao();
        List<Organization> organizationList = dao.find();
        System.out.println(JSON.toJSONString(organizationList));
    }

    @Test
    public void findByPV() {
        BaseDao dao = new OrganizationDao();
        Organization organization = (Organization) dao.findOneByPV("name", "北京市政府");
        System.out.println(JSON.toJSONString(organization));
    }
}
