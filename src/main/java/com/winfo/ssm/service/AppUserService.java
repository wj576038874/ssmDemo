package com.winfo.ssm.service;

import com.winfo.ssm.entity.AppUser;

import java.util.List;

public interface AppUserService {

    List<AppUser> getAppUserList();

    AppUser getAppUserByUserName(String userName);
}
