package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
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
    public void testNewDog(){
        //given
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //when
        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        String retrievedName = dog1.getName();
        Date retrievedBirthDate = dog1.getBirthDate();
        Integer retrievedId = dog1.getId();
        //then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //given
        Dog dog1 = new Dog(null, null, null);
        String expected = "bark!";
        //when
        String actual = dog1.speak();
        //then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        //given
        Dog dog1 = new Dog(null, null, null);
        Date birthDate = new Date();
        //when
        dog1.setBirthDate(birthDate);
        Date expected = birthDate;
        //then
        Date actual = dog1.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        //given
        Dog dog1 = new Dog(null, null, null);
        Food can = new Food();
        //when
        dog1.eat(can);
        Integer expected = 1;
        //then
        Integer actual = dog1.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        //given
        Dog dog1 = new Dog(null, null, 1);
        //when
        Integer expected = 1;
        //then
        Integer actual = dog1.getId();
        Assert.assertEquals(expected, actual);
    }
}
