package com.hyx.service;

/**
 * User Service.
 *
 * @author hyx
 **/

public interface UserService {
    
    String login(String account, String password);
    
    String register(String email, String password);
}
