package ceshi;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ControllerTest {
    @RequestMapping(value="/demo",method = RequestMethod.POST)
    public String demo(ModelMap map, HttpServletRequest request){
        String name =request.getParameter("name");
        map.addAttribute("name",name);
        return "hello";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
