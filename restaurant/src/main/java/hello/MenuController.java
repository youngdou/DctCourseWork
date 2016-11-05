package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;

/**
 * Created by young on 16-11-2.
 */

@Controller
@RequestMapping("/menu")
public class MenuController {

    @GetMapping
    public String getMenu(Model model)
    {
        model.addAttribute("title", "菜单");
        return "menu";
    }
}
