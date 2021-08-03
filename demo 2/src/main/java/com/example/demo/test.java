package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class test {

//    @Autowired
//BankDao user = new BankDao();


    @Autowired
    private JpaRepo JPAService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("listCustomer", JPAService.findAll());
        return "index";
    }

    @GetMapping("/hello")
    public List<BankAccount> hello() {

        return JPAService.findAll();

    }

    @PostMapping("/createUser")
    public void creatUsers(@Validated @RequestBody BankAccount users) {

        JPAService.save(users);


    }


    @GetMapping("/showUpdate/{accountnumber}{customerName}")
    public void showUpdate(@PathVariable(value = "accountnumber") int accountnumber){
        BankAccount user = JPAService.getById(accountnumber);
        user.setCustomerName("Rajeeb Manandhar");
        user.setEmail("rawzip@hotmail.com");
        JPAService.save(user);


    }

    @GetMapping("/delete/{accountnumber}")
    public String delete(@PathVariable(value = "accountnumber") int accountnumber){
        JPAService.deleteById(accountnumber);
        return "Account Deleted";
    }
}
