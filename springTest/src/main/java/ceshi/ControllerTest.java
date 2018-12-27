package ceshi;

import com.sun.deploy.net.HttpResponse;
import org.apache.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ControllerTest {
    private final static Logger log = Logger.getLogger(ControllerTest.class.getClass());
    @RequestMapping(value ="/demo")
    public String demo(ModelMap map, HttpServletRequest request){
        log.error("error!!!!!");

        String name =request.getParameter("name");
        map.addAttribute("name",name);
        System.out.println("用户输入的名字是："+name);
        System.out.println("进入demo");
        return "hello";
    }

    @RequestMapping(value="/")
    public String index(){
        System.out.println("进入index");
        return "index";
    }

    @RequestMapping(value="/static")
    public String getStatic(){
        System.out.println("进入static");
        return "redirect:/pages/final.jsp";
    }
}
