package mro.controller.errors;

import mro.Consts;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class Errors implements ErrorController {

    @RequestMapping(Consts.ERROR_MAPPING)
    public String handleError(HttpServletRequest request) {
        String returnString = "errors/404";
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());

            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                returnString = "errors/404";
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                returnString = "errors/500";
            }
        }

        return returnString;
    }

    @Override
    public String getErrorPath() {
        return Consts.ERROR_MAPPING;
    }
}
