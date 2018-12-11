package com.springboot.common;

import java.util.UUID;

/**
 * Интерфейс к объекту "базовый пользователь"
 */

public interface UserRoot {

     String getLogin();
     void setLogin(String login);

     String getPassword();
     void setPassword(String password);

     Long getId();
     void setId(Long id);

     UUID getUUID();
     void setUUID(UUID uuid);

}
