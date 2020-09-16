
/**
 * Write a description of class Person here.
 *
 * @author JC
 * @version (a version number or a date)
 */


public class Person
{
    //Instace variables
    private String cprno;
    private String name;
    private String address;
    private String cityName;
    private double height;
    private double weight;
    private int postalCode;
 
    //Constructor
    public Person(String personCprno, String personName) {
        cprno = personCprno;
        cityName = personName;
    }
 
    //Mutator methods
    public void setAddress(String personAddress) {
        address = personAddress;
    }
    
    public void setCityName(String personCityName) {
        cityName = personCityName;
    }
    
    /**
     * Please enter height in meter ex: 1.78 m
     */
    public void setHeight(double personHeight) {
        height = personHeight;
    }
    
    /**
     * Please enter weight in kilograms ex: 84 kilograms
     */
    public void setWeight(double personWeight) {
        weight = personWeight;
    }
    
    public void setPostalCode(int personPostalCode) {
        postalCode = personPostalCode;
    } 
    
    //Accessor methods
    /**
     * Method to calculate persons age from CPR
     */
    //Man kan lave en intput type int, så man har valget et indsætte et nyt eller bestemt år
    //For at se denne metode kig på kommentarene
    public int getPersonAge(/*int year*/) {
        //int now = year
        int millenniumCentury = Integer.parseInt(cprno.substring(6,7));
        if(millenniumCentury < 5) {
            millenniumCentury = 19;
        } else {
            millenniumCentury = 20;
        }
        String stringFullYear = millenniumCentury + cprno.substring(4,6);
        int intFullYear = Integer.parseInt(stringFullYear);
        int personAge = 2020 - intFullYear;
        //int personAge = now - intFullyear;
        return personAge;
    }
    
    /**
     * Method to calculate persons BMI
     */
    public double getBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }
    
    public String getTest() {
       return cprno.substring(6,7);
    }
    
    public String getCprno() {
        return cprno;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getCityName() {
        return cityName;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public int getPostalCode() {
        return postalCode;
    } 
}
