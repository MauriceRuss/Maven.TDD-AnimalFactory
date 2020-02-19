package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAdd(){
        //given
       CatHouse bed = new CatHouse();
        Cat cat1 = new Cat(null, null, null);
        //when
        bed.add(cat1);
        Integer expected = 1;
        //then
        Integer actual = bed.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemove(){
        //given
        CatHouse bed = new CatHouse();
        Cat cat1 = new Cat(null, null, 1);
        //when
        bed.remove(1);
        Integer expected = 1;
        //then
        Integer actual = cat1.getId();
        Assert.assertEquals(expected, actual);

    }

}
