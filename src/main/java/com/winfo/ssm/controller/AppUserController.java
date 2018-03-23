package com.winfo.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.winfo.ssm.entity.AppUser;
import com.winfo.ssm.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/appUser")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getAppUserList(Model model) {
        List<AppUser> appUserList = appUserService.getAppUserList();
        model.addAttribute("appUserList", appUserList);
        return "users/user";
    }

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    public String getAppUserByUserName(@PathVariable("userName") String userName) {
        AppUser appUser = appUserService.getAppUserByUserName(userName);
        return JSON.toJSONString(appUser);
    }
}
