package Springboot.project.service;

import Springboot.project.bean.UserConfig;

public class UserService {
    UserConfig userConfig;

    public UserService(UserConfig userConfig){
        this.userConfig=userConfig;
    }
}