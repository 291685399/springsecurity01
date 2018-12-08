package com.wyj.service.impl;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wyj
 * @create 2018-12-08 14:15
 */
public class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //校验用户是否是VIP

        //用户相关操作行为

        //TODO 从数据库查询出来的密码
        String password = "$2a$10$XEjEcTgXSokooaEhyYbF8efP8L4KyUZuSUOsrxrRdQUqRVgiBko6i";

        //校验通过后放行
        List<GrantedAuthority> grantedList = new ArrayList<>();
        //这里需要给用户授权对应的角色
        grantedList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        grantedList.add(new SimpleGrantedAuthority("ROLE_USER"));

        return new User(username, password, grantedList);
    }

}
