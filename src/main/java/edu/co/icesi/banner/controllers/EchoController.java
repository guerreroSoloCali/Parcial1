package edu.co.icesi.banner.controllers;

import edu.co.icesi.banner.entity.Carrito;
import edu.co.icesi.banner.entity.Product;
import edu.co.icesi.banner.entity.User;
import edu.co.icesi.banner.repositories.ProductRepository;
import edu.co.icesi.banner.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("echo")
    public String echo(){
        User user = new User(11111, "jose", 2, 2);
        user.setName("Jose Guerrero");
        user.setId(1999292);
        userRepository.save(user);

        Product int1 = new Product();
        int1.setName("Bicicleta");
        int1.setId("1.000.000");
        int1.setUser(user);
        productRepository.save(int1);

        return "echo";
    }

}
