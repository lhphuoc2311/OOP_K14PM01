/*
*  created date: Mar 17, 2022
*  author: cgm
*/
package oo.tuan5.buoi9;

import java.util.ArrayList;
import java.util.List;

import oo.tuan5.buoi9.robot.RobotDog;

public class DaHinhMang {

    public static void main(String[] args) {

        Animal dsAnimal[] = new Animal[4];

        Dog dog = new Dog();
        Dog dog2 = new Dog();

        Cat cat = new Cat();
        Cat cat2 = new Cat();

        dsAnimal[0] = dog;
        dsAnimal[1] = dog2;
        dsAnimal[2] = cat;
        dsAnimal[3] = cat2;


        for (Animal animal : dsAnimal) {
            
           // if(animal instanceof Cat){
               //gửi chỉ 1 thông điệp
                animal.makeNoise();//Ket qua DA hinh
           // }
        }

        //Pet dsPet[] = new Pet[2];
        List<Pet> listPet = new ArrayList<>();
        Dog dogPet = new Dog();
        RobotDog robotDog = new RobotDog();
        Cat catPet = new Cat();

        listPet.add(dogPet);
        listPet.add(robotDog);
        listPet.add(catPet);

        for (Pet pet : listPet) {
            pet.beFriendly();
        }

        // for (Pet pet : dsPet) {
            //Gui Thong diep - message
            // pet.beFriendly();
            // pet.play();
        // }

    }

}
