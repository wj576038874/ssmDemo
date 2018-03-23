package com.winfo.ssm.service.impl;

import com.winfo.ssm.dao.AppUserDao;
import com.winfo.ssm.entity.AppUser;
import com.winfo.ssm.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private AppUserDao appUserDao;

    public List<AppUser> getAppUserList() {
        return appUserDao.queryAllAppUser();
    }

    public AppUser getAppUserByUserName(String userName) {
        return appUserDao.queryByUserName(userName);
    }
}
