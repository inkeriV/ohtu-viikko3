/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.services;

/**
 *
 * @author inkeriv
 */
public interface AuthService {

    boolean createUser(String username, String password);

    boolean logIn(String username, String password);
    
}
