package com.spring.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.jpa.entities.User;
import com.spring.jpa.repository.UserRepository;

@SpringBootApplication
public class LearnjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnjpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user = new User();
		user.setUser_name("Virender Singh Negi");
		user.setSalary(3331);
		user.setUser_address("D-944, Dabua Colony, N.I.T Faridabad");
        
		User user1 = new User();
		user1.setUser_name("Rijwam Khan");
		user1.setSalary(25000);
		user1.setUser_address("Sec-48 , Sainik Colony");

		User user2 = new User();
		user2.setUser_name("Parnav pantra");
		user2.setSalary(27000);
		user2.setUser_address("Sec-55, Gauchi");

		// for storing multiple user ....
		List<User> Alluser = List.of(user,user1,user2);
        Iterable<User> result = userRepository.saveAll(Alluser); 
		
        // for updating old value by id ...
//        Optional<User> optional = userRepository.findById(1);
//        
//        User user3 = optional.get();
//        user3.setUser_name("Viren Negi");
//        User save = userRepository.save(user3);
//        System.out.println("updated value : "+user3);
        
//   for deleting value by id       
//        userRepository.deleteById(4);
//        userRepository.deleteById(3);
         
//        Iterable<User> findAll = userRepository.findAll();
//        
//        findAll.forEach(u -> System.out.println(u));
//        
//       userRepository.deleteAll(findAll);
        
        result.forEach(u -> {
        	System.out.println(u);
        });
//      System.out.println("-------------------------------------------");
//        List<User> byUserName = userRepository.getByUserName("Virender Singh Negi");
//        byUserName.forEach(us -> System.out.println(us));
	}

}
