package cn.zx.WebStocketDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class DemoCtrl {
    @RequestMapping("indexPage")
    public String helloFtl(Map<String,Object> map) {

        map.put("hello","Hello FreeMarker");
        return "index";
    }
}
