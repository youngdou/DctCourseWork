package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
/**
 * Created by young on 16-11-2.
 */

@Controller
@RequestMapping("/cuisine_detail/{name}")
public class DetailController {

    @GetMapping
    public String getDetail(@PathVariable("name") String name, Model model) {
        model.addAttribute("title", "点单详情");
        model.addAttribute("name", name);
        return "cuisine_detail";
    }
}
