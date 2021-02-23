package com.athome.springbootwithmybatis.controller;

import com.athome.springbootwithmybatis.entity.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Zhaopo
 * @Date: 2021/2/20 16:04
 * @Description:
 */
@RestController
@RequestMapping("/testBoot")
public class MovieController {
    @RequestMapping("getMovie/{id}")
    public Movie GetUser(@PathVariable int id){
        Movie movie = new Movie();
        movie.setID(id);
        movie.setReleaseDate("2021");
        movie.setGenre("很好");
        movie.setPrice("88");
        movie.setTitle("火影海贼王");
        return movie;
    }
}
