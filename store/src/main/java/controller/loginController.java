package controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {

    /**
     *第一次打开界面自动跳转到登陆界面
     * @return 登录界面的view
     */
    @RequestMapping(value = "/loginPage")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String receive(@Param("name") String name, @Param("password") String password, ModelMap modelMap){
        modelMap.addAttribute("name",name);
        modelMap.addAttribute("password",password);
        return "show";
    }
}
