package com.mkyong.common.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;
import java.util.Arrays;


public class UserInfo implements UserDetailsService {

    @Resource
    private PasswordEncoder passwordEncoder;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        GrantedAuthorityImpl role_user = new GrantedAuthorityImpl("ROLE_USER");
       // String hello = passwordEncoder.encode("hello");
       // System.out.println(hello);
        UserDetails user=new User(username, "63c90cdc8e3d55f54f22de52acb35ef95a9fe77c2747eb844a0cffe3340a00643cc979fa87772e0c", Arrays.asList(role_user));
        return user;
    }
}
