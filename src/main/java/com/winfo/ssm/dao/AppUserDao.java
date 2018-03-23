package com.winfo.ssm.dao;

import com.winfo.ssm.entity.AppUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppUserDao {

    List<AppUser> queryAllAppUser();

    AppUser queryByUserName(@Param("userName") String userName);
}
