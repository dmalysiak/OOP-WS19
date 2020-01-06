package solutions.exercise13.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import solutions.exercise13.beans.SimpleBean;

@Controller
@RequestMapping("/beans")
public class WebController {

    @Autowired
    private SimpleBean bean;

    //@RequestMapping(value = "/{id}", headers = "key=val", method = GET)
    @GetMapping(path="/{id}", produces = "application/json")
    public @ResponseBody SimpleBean getBook(@PathVariable int id, @RequestParam(name="name", required=false, defaultValue="Hello World") String name) {
        this.bean.setName(name+id);
        return this.bean;
    }

}
