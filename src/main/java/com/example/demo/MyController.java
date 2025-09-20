package com.example.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired 
	MyRepo repo;
    
    @GetMapping("/cust")
    public List<Customer> show()
    {
    	return repo.findAll();
    }
    
    @PostMapping("/cust")
    public Customer save(@RequestBody Customer c)
    {
    	return repo.save(c);
    }
    
    @DeleteMapping("/cust/{id}")
    public String delete(@PathVariable Long id)
    {
    	repo.deleteById(id);
        return "No Content..";
    }
}
