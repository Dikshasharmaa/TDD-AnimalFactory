package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog(){
        //Given
        String name = "Tommy";
        Date birthDate = new Date(2000,3,7);
        Integer id = 0;
        String speak = "bark!";

        //When
        AnimalFactory animalfactory = new AnimalFactory();
        Dog dog = animalfactory.createDog(name, birthDate);


        //Then
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        Integer actualId = dog.getId();
        String actualSpeak = dog.speak();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);
        Assert.assertEquals(id, actualId);
        Assert.assertEquals(speak, actualSpeak);
    }

    @Test
    public void testCreateCat(){
        //Given
        String name = "Leo";
        Date birthDate = new Date(2015,5,12);
        Integer id = 0;
        String speak = "meow!";

        //When
        AnimalFactory animalfactory = new AnimalFactory();
        Cat cat = animalfactory.createCat(name, birthDate);

        //Then
        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();
        Integer actualId = cat.getId();
        String actualSpeak = cat.speak();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);
        Assert.assertEquals(id, actualId);
        Assert.assertEquals(speak, actualSpeak);
    }
}


