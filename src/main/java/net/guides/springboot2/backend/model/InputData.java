package net.guides.springboot2.backend.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data

public class InputData {

    protected static List<Product> items = Arrays.asList(new Product(41,"Sparadrap","Extensible de Fixation Curafix H 10 cm x 10 m (Rouleau)",21.9,20,"assets\\images\\pensement\\sparadrap.png","assets\\images\\pensement\\sparadrap.png"),
            new Product(42,"Bandage","Extensible de Fixation Curafix H 10 cm x 10 m (Rouleau)",20.9,20,"assets\\images\\pensement\\sparadrap.png","assets\\images\\pensement\\sparadrap.png"),
            new Product(43,"Canne","Extensible de Fixation Curafix H 10 cm x 10 m (Rouleau)",21.9,20,"assets\\images\\pensement\\sparadrap.png","assets\\images\\pensement\\sparadrap.png")
    ,new Product(44,"Table de Massage","Extensible de Fixation Curafix H 10 cm x 10 m (Rouleau)",21.9,20,"assets\\images\\pensement\\sparadrap.png","assets\\images\\pensement\\sparadrap.png")
    );


    public static Map<User, HashMap<Product, Double>> initializeData(int numberOfUsers) {
        Map<User, HashMap<Product, Double>> data = new HashMap<>();
        HashMap<Product, Double> newUser;
        Set<Product> newRecommendationSet;
        for (int i = 0; i < numberOfUsers; i++) {
            newUser = new HashMap<Product, Double>();
            newRecommendationSet = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                newRecommendationSet.add(items.get((int) (Math.random() * 5)));
            }
            for (Product item : newRecommendationSet) {
                newUser.put(item, Math.random());
            }
            data.put(new User(i+3,"User " + i,"username" + i,"user"+ i +"@gmail.com","123","sidi bouzid",9114,"12345678"), newUser);
        }
        return data;
    }

}
