package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setName(){
        //Given
        Cat cat = new Cat(null,null,null);
        String givenName = "Leo";

        //When
        cat.setName(givenName);

        //Then
        Assert.assertEquals(givenName, cat.getName());

    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        //given
        String speak ="meow!";

        //When
        Cat cat = new Cat();

        //Then
        Assert.assertEquals(speak,cat.speak());

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
        //Given
        Date givenBirthDate = new Date();

        //When
        Cat cat = new Cat(null,givenBirthDate,0);
        cat.setBirthDate(givenBirthDate);

        //Then
        Assert.assertEquals(givenBirthDate, cat.getBirthDate());

    }
    // TODO - Create tests for `Integer getId()`

    @Test
    public void getId(){
        //Given

        Integer expectedId =6;

        //When
        Cat cat = new Cat(null,null,expectedId);
        Integer actualId = cat.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatMeal(){
        Integer given =0;
        Integer expected =1;

        //When
        Food food = new Food();
        Cat cat = new Cat(null,null,0);

        //Then
        cat.eat(food);
        Integer eatMeals = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, eatMeals);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceAnimal(){
        //Given
        Cat cat = new Cat();
        //Then
        Assert.assertTrue(cat instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceMammal(){
        //Given
        Cat cat = new Cat();
        //Then
        Assert.assertTrue(cat instanceof Mammal);
    }


}
