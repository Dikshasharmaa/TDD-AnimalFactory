package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Tommy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        //given
        String speak = "bark!";

        //When
        Dog dog = new Dog();

        //Then
        Assert.assertEquals(speak, dog.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
        //Given
        Date givenBirthDate = new Date();

        //When
       Dog dog = new Dog(null,givenBirthDate,0);
        dog.setBirthDate(givenBirthDate);

        //Then
        Assert.assertEquals(givenBirthDate, dog.getBirthDate());

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatMeal(){
        Integer given =0;
        Integer expected =1;

        //When
        Food food = new Food();
        Dog dog = new Dog(null,null,0);

        //Then
        dog.eat(food);
        Integer eatMeals = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, eatMeals);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getId(){
        //Given

        Integer expectedId =6;

        //When
        Dog dog = new Dog(null,null,expectedId);
        Integer actualId = dog.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceAnimal(){
        //Given
        Dog dog = new Dog();
        //Then
        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceMammal(){
        //Given
        Dog dog = new Dog();
        //Then
        Assert.assertTrue(dog instanceof Mammal);
    }
}
