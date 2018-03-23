package com.winfo.ssm.dao;

import com.winfo.ssm.entity.AppUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:configs/spring/spring-dao.xml"})
public class AppUserDaoTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private AppUserDao appUserDao;

    @Test
    public void queryAllAppUser() {
        List<AppUser> appUserList = appUserDao.queryAllAppUser();
        for (AppUser appUser : appUserList){
            logger.error("appuser={}",appUser);
        }
    }

    @Test
    public void queryByUserName() {
        AppUser appUser = appUserDao.queryByUserName("15012551396");
        logger.error("appuser={}" , appUser);
    }

}