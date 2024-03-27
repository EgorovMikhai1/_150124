package org.example._2024_03_27.inc;

public class User {
     private String login;

     public String getLogin() {
          return login;
     }

     public void setLogin(String login) {
          this.login = login;
     }

     @Override
     public String toString() {
          return "User{" +
                  "login='" + login + '\'' +
                  '}';
     }
}
