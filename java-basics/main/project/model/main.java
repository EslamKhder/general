package main.project.model;

import main.project.service.ApplicationService;
import main.project.service.ApplicationServiceImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {

        //new ApplicationServiceImpl().run();

        Map<String, Integer> mapq  = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> map  = new LinkedHashMap<>();
        map.put("ya" , 5);
        map.put("ea" , 1);
        map.put("aa" , 2);
        map.put("za" , 7);

        System.out.println(map);
    }


}
