package com.ssm.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssm.pojo.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import sun.awt.SunHints;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping(value ="/save")
    @ResponseBody
    public User save() throws JsonProcessingException, UnsupportedEncodingException {
        User user = new User();
        user.setAge(25);
        user.setLocation("北京市");
        user.setName("小李");
        return user;
    }

    @RequestMapping(value ="/save1")
    @ResponseBody
    public void save1(User user,HttpServletRequest req) throws JsonProcessingException, UnsupportedEncodingException {
        System.out.println(req.getContextPath());
        System.out.println(user);
    }

    @RequestMapping(value ="/save2")
    @ResponseBody
    public void save2(@RequestBody List<User> users) throws JsonProcessingException, UnsupportedEncodingException {
        for (User user: users
             ) {
            System.out.println(user);
        }
    }

    @RequestMapping(value ="/save3/{name}")
    @ResponseBody
    public void save3(@PathVariable(value="name") String name)  {
        System.out.println(name);
    }

    @RequestMapping("/save4")
    @ResponseBody
    public void save4(Date date)  {
        System.out.println(date);
    }

    @RequestMapping("/save5")
    @ResponseBody
    public void save5(Date date)  {
        System.out.println(date);
    }

    @RequestMapping("/save6")
    @ResponseBody
    public void save6(MultipartFile uploadFile1,MultipartFile uploadFile2) throws IOException {
        //获取文件名称
        String originalFilename1 = uploadFile1.getOriginalFilename();
        //保存文件
        uploadFile1.transferTo(new File("C:\\upload\\"+originalFilename1));
        //获取文件名称
        String originalFilename2 = uploadFile2.getOriginalFilename();
        //保存文件
        uploadFile1.transferTo(new File("C:\\upload\\"+originalFilename2));
    }

    @RequestMapping("/back")
    public ModelAndView back(ModelAndView modelAndView){
        modelAndView.addObject("data","---TestSuccess---");
        modelAndView.setViewName("success.jsp");
        return modelAndView;
    }
}
