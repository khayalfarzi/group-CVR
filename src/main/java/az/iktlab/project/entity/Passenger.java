package az.iktlab.project.entity;

import java.util.Scanner;
public class Passenger {
    private Long id;
    private String username;
    private String password;
    private String email;//email validation
    private List<Flight> flights;//manyToMany
    private List<Friend> flyWith;


    public Passenger() {
    }

    public Passenger(Long id, String username, String password, String email, List<Flight> flights, List<Friend> flyWith) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.flights = flights;
        this.flyWith = flyWith;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Friend> getFlyWith() {
        return flyWith;
    }

    public void setFlyWith(List<Friend> flyWith) {
        this.flyWith = flyWith;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", flights=" + flights +
                ", flyWith=" + flyWith +
                '}';
    }
}

