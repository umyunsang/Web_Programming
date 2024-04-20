package com.web.p1;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/ex01")
    public String ex01() {
        return "ex01";
    }

    @GetMapping("/ex01/answer")
    public String ex01Answer(@RequestParam("mid") String mid, 
    						@RequestParam("ps")String ps, Model mo){
        mo.addAttribute("mid", mid);
        mo.addAttribute("ps",ps);
        return "ex01Answer";
    }
    @PostMapping("/ex02/answer")
    public String ex02Answer(@RequestParam("mname") String mname,
                             @RequestParam("po") String po, Model mo) {
        mo.addAttribute("mname", mname);
        mo.addAttribute("po", po);
        int salary = 0;
        switch(po){
            case "사원" -> salary = 3500;
            case "대리" -> salary = 5000;
            case "팀장" -> salary = 7000;
            case "임원" -> salary = 9900;
        }
        mo.addAttribute("salary", salary);
        return "ex02Answer";
    }
    
    @GetMapping("/ex02")
    public String ex02() {
        return "ex02"; 
    }
    
    @GetMapping("/ex03")
    public String ex03() {
        return "ex03"; // ex03.html을 반환
    }

    @PostMapping("/ex03/answer")
    public String ex03Answer(@RequestParam("mname") String mname,
                             @RequestParam("color") String color, Model mo) {
        mo.addAttribute("mname", mname);
        mo.addAttribute("color", color);
        return "ex03Answer"; // ex03Answer.html을 반환
    }
    @GetMapping("/wise")
    public String wise() {
    	return "wise";
    }
    @PostMapping("/wise/answer")
    public String wiseAnswer(@RequestParam("pname") String pname,
    						@RequestParam("word") String word, Model mo) {
    	mo.addAttribute("pname", pname);
    	mo.addAttribute("word", word);
    	return "wiseAnswer";
    }
    @GetMapping("/bread")
    public String bread() {
    	return "bread";
    }
    @GetMapping("/bread/answer")
    public String breadAnswer(@RequestParam("bread") String bread,
    						@RequestParam("count") Integer count,
    						@RequestParam("money") Integer money, Model mo) {
    	mo.addAttribute("bread", bread);
    	mo.addAttribute("money", money);
    	int sum = money * count;
    	mo.addAttribute("sum", sum);
    	return "breadAnswer";
    }
    @GetMapping("/q06a")
    public String q06a() {
    	return "q06a";
    }
    @GetMapping("/q06")
    public String q06() {
    	return "q06";
    }
    @GetMapping("/q06aa")
    public String q06aa(@RequestParam("frist") String frist,
    						@RequestParam("second") String second, Model mo) {
    	mo.addAttribute("frist", frist);
    	mo.addAttribute("second", second);
    	return "q06aa";
    }
    @GetMapping("/q06b")
    public String q06b() {
    	return "q06b";
    }
    @GetMapping("/q06bb")
    public String q06bb(@RequestParam("job") String job, Model mo) {
    	mo.addAttribute("job", job);
    	return "q06bb";
    }
    @GetMapping("/ex04")
    public String ex04(Model mo) {
        var arr = new ArrayList<String>();
        arr.add("고흐");
        arr.add("james");
        arr.add("dooli");
        arr.add("bread");
        mo.addAttribute("arr",arr);
        return "ex04"; 
    }
    @GetMapping("/ex05")
    public String ex05(Model mo) {
        var arr1 = new ArrayList<Integer>();
        var arr2 = new ArrayList<String>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        arr1.add(50);
        arr2.add("엄");
        arr2.add("윤");
        arr2.add("상");
        arr2.add("엄윤상");
        arr2.add("윤상");
        arr2.add("um");
        arr2.add("yun3");
        mo.addAttribute("arr1",arr1);
        mo.addAttribute("arr2",arr2);
        return "ex05"; 
    }
    @GetMapping("/popuptest") 
    public String popuptest() { 
    	return "popuptest";
    }
    
}