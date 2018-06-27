package TDD;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LeapYearCheckerTest {

    LeapYearChecker lt;

@BeforeMethod
public void createObject(){

    lt=new LeapYearChecker();

}

@DataProvider
public Object[][] getData(){

    return new Object[][]{
            {1996,true},
            {2001,false},
            {1900,false}



    };

}
@Test(dataProvider="getData")
public void testLeapYear(int year,boolean expectedValue){

assertEquals(lt.validate(year),expectedValue);

}

@AfterMethod
    public void setNull(){

    lt=null;
}

}