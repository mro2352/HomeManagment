package mro.controller.web.cookbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookbookRootController {

    @RequestMapping("/cookbook")
    public String cookbookIndex() {
        return "cookbook/cookbookIndex";
    }
}
