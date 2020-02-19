package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


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
    public void testSetName(){
        //given
        Cat cat1 = new Cat("Zula",null,null);
        String givenName = "Zula";
        //when
        cat1.setName(givenName);
        String catName = cat1.getName();
        //then
        Assert.assertEquals(catName, givenName);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //given
        Cat cat1 = new Cat(null,null,null);
        String expected = "meow!";

        //when
        String actual = cat1.speak();

        //then
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        //given
        Cat cat1 = new Cat(null, null, null);
        Date birthDate = new Date();
        //when
        cat1.setBirthDate(birthDate);
        Date expected = birthDate;

        //then
        Date actual = cat1.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        //given
        Cat cat1 = new Cat(null, null, null);
        Food can = new Food();
        //when
        cat1.eat(can);
        Integer expected = 1;
        //then
        Integer actual = cat1.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        //given
        Cat cat1 = new Cat(null,null,1);
        //when
        Integer expected = 1;
        //then
        Integer actual = cat1.getId();
        Assert.assertEquals(expected,actual);

        }


    }

