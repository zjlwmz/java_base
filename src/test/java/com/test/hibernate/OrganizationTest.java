package com.test.hibernate;

import com.alibaba.fastjson.JSON;
import com.demo.hibernate.dao.OrganizationDao;
import com.demo.hibernate.entity.Organization;
import org.junit.Test;

import java.util.List;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/10
 * @Description:
 * @CodeReviewer:
 */
public class OrganizationTest {
    public OrganizationDao dao = new OrganizationDao();
    @Test
    public void findOrg() {
        List<Organization> organizationList = dao.find();
        System.out.println(JSON.toJSONString(organizationList));
    }

    @Test
    public void findByPV() {
        Organization organization = dao.findOneByPV("name", "南京市政府");
        System.out.println(JSON.toJSONString(organization));
    }
}
