package io.everyonecodes.booster.steam_users.data;

import java.util.Objects;
import java.util.Set;

public class SteamUser {

    private String id;
    private String username;
    private String password;
    private Set<String> authorities;

    public SteamUser(String id, String username, String password, Set<String> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public SteamUser() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<String> authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SteamUser steamUser = (SteamUser) o;
        return Objects.equals(id, steamUser.id) && Objects.equals(username, steamUser.username) && Objects.equals(password, steamUser.password) && Objects.equals(authorities, steamUser.authorities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, authorities);
    }

    @Override
    public String toString() {
        return "SteamUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}
