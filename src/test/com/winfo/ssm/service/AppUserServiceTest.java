package com.winfo.ssm.service;

import com.winfo.ssm.entity.AppUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:configs/spring/spring-dao.xml","classpath:configs/spring/spring-service.xml"})
public class AppUserServiceTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Autowired
    private AppUserService appUserService;

    @Test
    public void getAppUserList() {
        List<AppUser> appUserList = appUserService.getAppUserList();
        for (AppUser appUser : appUserList){
            logger.error("appuser={}",appUser);
        }
    }

    @Test
    public void getAppUserByUserName() {
        AppUser appUser = appUserService.getAppUserByUserName("15012551396");
        logger.error("appuser={}" , appUser);
    }
}