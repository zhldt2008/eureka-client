package com.example.eurekaclient.restservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUserName/{name}")
    public String getUserName(@PathVariable String name){
        return "你好:"+name;
    }
    @RequestMapping(value="/get-name",method=RequestMethod.GET)
    public String getName(@RequestParam String name) {
        return "UserController name :"+name;
    }

    @RequestMapping(value="/head-name", method=RequestMethod.HEAD)
    public String headName(@RequestHeader String name) {
        return "UserController name :"+name;
    }


}
