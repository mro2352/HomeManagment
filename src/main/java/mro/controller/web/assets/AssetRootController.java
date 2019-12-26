package mro.controller.web.assets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AssetRootController {

    @RequestMapping("/assets")
    public String assetIndex(){
        return "assets/assetsIndex";
    }
}
