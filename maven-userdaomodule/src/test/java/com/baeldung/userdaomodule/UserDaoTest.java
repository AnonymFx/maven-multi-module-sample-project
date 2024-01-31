package com.baeldung.userdaomodule;

import com.baeldung.entitymodule.User;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class UserDaoTest {

    @Test
    void testUserDao() {
        UserDao userDao = new UserDao();
        assertThat(userDao.findAll()).isEmpty();
    }

}