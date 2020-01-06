package solutions.exercise13.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import solutions.exercise13.beans.Customer;
import solutions.exercise13.beans.SimpleBean;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping(path="", produces = "application/json")
    public @ResponseBody Customer getBook(@RequestParam(name="name", required=false, defaultValue="Hugo") String name,
                                            @RequestParam(name="address", required=false, defaultValue="Baustr.16, 45322") String address) throws InputError {
        if(name.startsWith("Hugo"))
        {
            throw new InputError();
        }

        return new Customer(name,address);
    }

}
