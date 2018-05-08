package com.mikhaylovich.gwmonitoring.domain.model;

import org.springframework.util.Assert;

/**
 * @author dmitry.mikhailovich@gmail.com
 */
public class User {

    private int id;

    public User(int id) {
        Assert.isTrue(id > 0, "User identifier must be positive.");
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return this.id == user.id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
