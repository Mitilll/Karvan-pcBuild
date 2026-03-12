package pcBuild.Karvan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class GpuController {

    @GetMapping("/gpu")
    public String index(){
        return "index";
    }

    @GetMapping("/cpu")
    public String index2(){
        return "index";
    }



}
