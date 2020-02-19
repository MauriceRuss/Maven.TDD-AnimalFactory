package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
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

    @Before
    public void BeforeTest(){
        CatHouse.clear();
    }

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAdd(){
        //given
        Cat cat1 = new Cat("gabby", new Date(), 1);
        //when
        CatHouse.add(cat1);
        //then
         Assert.assertEquals(cat1, CatHouse.getCatById(1));
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveById(){
        //given
        Cat cat1 = new Cat("gabby", new Date(), 1);
        CatHouse.add(cat1);
        //when
        CatHouse.remove(1);
        //then
        Assert.assertEquals(null, CatHouse.getCatById(1));
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat(){
        //given
        Cat cat1 = new Cat("gabby", new Date(), null);
        CatHouse.add(cat1);
        //when
        CatHouse.remove(cat1);
        //then
        Assert.assertEquals(null, CatHouse.getCatById(1));
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){
        //given
        Cat cat1 = new Cat("gabgy", new Date(), 1);
        CatHouse.add(cat1);
        Cat cat2 = new Cat("gandalf", new Date(), 2);
        CatHouse.add(cat2);
        Integer expected = 2;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

}
