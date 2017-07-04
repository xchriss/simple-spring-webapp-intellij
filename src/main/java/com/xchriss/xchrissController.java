package com.xchriss;

import javafx.util.converter.LocalDateTimeStringConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.*;

@RestController
public class xchrissController {

    @RequestMapping("/xchriss")
    public String whoIsTheKing() {
        return "xchriss";
    }

    @RequestMapping("/xchriss/list")
    public List<String> list() {
        List<String> listOfString = new ArrayList<String>();
        listOfString.add("One");
        listOfString.add(UUID.randomUUID().toString());
        listOfString.add(LocalDateTime.now().toString());
        return listOfString;
    }

    @RequestMapping("/xchriss/map")

    public Map<String, String> map() {
        Map<String, String> map = new HashMap<>();
        map.put("A", UUID.randomUUID().toString());
        map.put("B", "Hello");
        return map;
    }
}
