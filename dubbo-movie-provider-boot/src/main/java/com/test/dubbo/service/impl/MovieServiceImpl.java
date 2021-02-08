package com.test.dubbo.service.impl;

import com.test.dubbo.bean.Movie;
import com.test.dubbo.service.MovieService;
//import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


@Component //本工程内的组件可以Autowire
@Service(group = "test") //使用dubbo家的service暴露出来,为别的工程远程调用
public class MovieServiceImpl implements MovieService {
    public Movie getNewMovie() {
        //模拟经过数据库操作，等一些列操作获取了最新的电影
        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("电影名");
        movie.setPrice(96.99);
        System.out.println("电影服务被调用");
        return movie;
    }
}
