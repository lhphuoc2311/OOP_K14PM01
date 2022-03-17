/*
*  created date: Mar 17, 2022
*  author: cgm
*/
package oo.tuan5.buoi9;

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
            
            if(animal instanceof Cat){
                animal.makeNoise();//Ket qua DA hinh
            }
        }

    }

}
