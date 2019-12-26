package mro.controller.web.mealPlan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MealPlanRootController {

    @RequestMapping("/mealPlan")
    public String mealPlanIndex() {
        return "mealplanning/mealplanningIndex";
    }
}
