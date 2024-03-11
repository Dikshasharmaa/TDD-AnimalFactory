package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testAdd(){
        //Given
        String name = "Leo";
        Date birthDate = new Date(2015,5,12);
        Integer id = 0;

        //When
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat(name, birthDate, id);

        //Then
        catHouse.add(cat);
        Integer expectedCats =1;
        Assert.assertEquals(expectedCats, catHouse.getNumberOfCats());
    }
    @Test
    public void testRemoveById(){
        //Given
        String name = "Leo";
        Date birthDate = new Date(2015,5,12);
        Integer id = 0;

        //When
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat(name, birthDate, id);
        catHouse.add(cat);
        Integer expectedCatsAdded =1;
        Assert.assertEquals(expectedCatsAdded, catHouse.getNumberOfCats());

        //Then
       catHouse.remove(id);
       Integer expectedCats = 0;
       Assert.assertEquals(expectedCats, catHouse.getNumberOfCats());
    }

    @Test
    public void testRemoveByCat(){
        //Given
        String name = "Leo";
        Date birthDate = new Date(2015,5,12);
        Integer id = 0;

        //When
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat(name, birthDate, id);
        catHouse.add(cat);
        Integer expectedCatsAdded =1;
        Assert.assertEquals(expectedCatsAdded, catHouse.getNumberOfCats());

        //Then
        catHouse.remove(cat);
        Integer expectedCats = 0;
        Assert.assertEquals(expectedCats, catHouse.getNumberOfCats());
    }

    @Test
    public void testGetCatById(){
        //Given
        String name = "Leo";
        Date birthDate = new Date(2015,5,12);
        Integer id = 0;

        //When
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat(name, birthDate, id);
        catHouse.add(cat);
        Integer expectedCats =1;
        Assert.assertEquals(expectedCats, catHouse.getNumberOfCats());

        //Then
       Cat cat1  = catHouse.getCatById(id);
       Assert.assertEquals(cat,cat1);
    }
    @Test
    public void testGetNumberOfCats(){
        //Given
        String name = "Leo";
        Date birthDate = new Date(2015,5,12);
        Integer id = 0;

        String name2 = "Kitty";
        Date birthDate2 = new Date(2019,7,23);
        Integer id2= 1;

        //When
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat(name, birthDate, id);
        catHouse.add(cat);
        Cat cat2 = new Cat(name2, birthDate2, id2);
        catHouse.add(cat2);

        //Then
        Integer expectedCats =2;
        Assert.assertEquals(expectedCats, catHouse.getNumberOfCats());
    }
}
