package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then

        Integer expectedDogs =1;
        Assert.assertEquals(expectedDogs,DogHouse.getNumberOfDogs() );
    }
    @Test
    public void testAdd(){
        //Given
        String name = "Tommy";
        Date birthDate = new Date(2000,3,7);
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        //When
        DogHouse.add(animal);

        //Then
        Integer expectedDogs =1;
        Assert.assertEquals(expectedDogs, DogHouse.getNumberOfDogs());
    }

    @Test
    public void testRemoveByDog(){
        //Given
        String name = "Tommy";
        Date birthDate = new Date(2000,3,7);
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        //When
        DogHouse.add(animal);
        Integer expectedDogs =1;
        Assert.assertEquals(expectedDogs, DogHouse.getNumberOfDogs());

        //Then
        DogHouse.remove(animal);
        Integer expectedAfterRemove =0;
        Assert.assertEquals(expectedAfterRemove, DogHouse.getNumberOfDogs());
    }

    @Test
    public void testRemoveById(){
        //Given
        String name = "Tommy";
        Date birthDate = new Date(2000,3,7);
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        //When
        DogHouse.add(animal);
        Integer expectedDogs =1;
        Assert.assertEquals(expectedDogs, DogHouse.getNumberOfDogs());

        //Then
        DogHouse.remove(animal.getId());
        Integer expectedAfterRemove =0;
        Assert.assertEquals(expectedAfterRemove, DogHouse.getNumberOfDogs());
    }

    @Test
    public void testGetDogById(){
        //Given
        String name = "Tommy";
        Date birthDate = new Date(2000,3,7);
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        //When
        DogHouse.add(animal);
        Integer expectedDogs =1;
        Assert.assertEquals(expectedDogs, DogHouse.getNumberOfDogs());

        //Then
        Dog dog = DogHouse.getDogById(animal.getId());
        Assert.assertEquals(animal,dog);
    }

}
