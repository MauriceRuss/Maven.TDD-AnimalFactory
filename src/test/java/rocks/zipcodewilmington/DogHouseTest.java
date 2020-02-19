package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
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

    @Before
    public void BeforeTest(){
        DogHouse.clear();
    }

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
        DogHouse.getNumberOfDogs();
    }
    // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void testAddDog(){
        //given
        Dog dog1 = new Dog("Holly", new Date(), 1);
        DogHouse.add(dog1);
        Assert.assertEquals(dog1, DogHouse.getDogById(1));
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveDogWithId(){
        Dog dog1 = new Dog("Holly", new Date(), 1);
        DogHouse.add(dog1);
        DogHouse.remove(1);
        Assert.assertEquals(null, DogHouse.getDogById(1));
    }
}
