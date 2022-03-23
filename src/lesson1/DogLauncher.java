package lesson1;



public class DogLauncher {
    public static void main(String[] args) {
        Dog[] dogArr = new Dog[2];

        dogArr[0] = new Dog(2);
        dogArr[1] = new Dog(51);

        Dog theBigger = Dog.whichOneIsBigger(dogArr[0], dogArr[1]);
        theBigger.makeNoise();
        Dog.name = "cat";
        System.out.println(Dog.name);
    }
}


