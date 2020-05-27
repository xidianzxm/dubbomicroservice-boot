package com.test.dubbo.bean;

import java.io.Serializable;

public class Order implements Serializable {
    private Integer movieId;
    private String movieName;
    private String userName;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Override
    public String toString() {
        return "Order{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
