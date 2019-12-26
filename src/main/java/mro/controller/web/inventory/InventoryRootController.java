package mro.controller.web.inventory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InventoryRootController {

    @RequestMapping("/inventory")
    public String inventoryIndex() {
        return "inventory/inventoryIndex";
    }
}
