package com.baeldung.entitymodule;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class UserTest {

    @Test
    void testUser() {
        User user = new User("test");
        assertThat(user.getName()).isEqualTo("test");
    }

}