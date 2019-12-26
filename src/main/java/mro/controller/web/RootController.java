package mro.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class RootController {

    @RequestMapping("/")
    public String welcome(HttpServletRequest request, HttpServletResponse response) {
        Map<String, String[]> requestMap = request.getParameterMap();
        for (Object key:requestMap.keySet()) {
            System.out.println("key:\t" + key);
            for (String value:requestMap.get(key)) {
                System.out.println("\tvalue:\t" + value);
            }
        }
        return "index";
    }

    @RequestMapping("/form")
    public String addAssetForm() {
        return "addAssetForm";
    }
}
