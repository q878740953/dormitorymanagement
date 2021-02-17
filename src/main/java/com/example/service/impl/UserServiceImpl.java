//package com.example.service.impl;
//
//import com.example.domain.Users;
//import com.example.mapper.UsersMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private UsersMapper usersMapper;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Users user = usersMapper.findUserByUsername(username);
//        return user;
//    }
//}
