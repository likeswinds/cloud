package com.skynet.dao;

import com.skynet.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.apache.shiro.web.filter.mgt.DefaultFilter.user;

/**
 * Created by Administrator on 2016-11-23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserDaoTest {
    private static Logger Log  = LoggerFactory.getLogger(UserDaoTest.class);
    @Autowired
    private  UserDao userDao ;
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findAll() throws Exception {
     List<User> users=userDao.findAll();
        Log.info(users.toString());
    }

    @Test
    public void findByName() throws Exception {
        User user=userDao.findByName("rose");
        Log.info(user.toString());
    }

}