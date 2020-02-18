public class Person {
    private String name;
    private int age;
    private String favouriteDrink;
    private  boolean isAttendingParty;
    private String currentPartyName;

    public Person(String name, int age, String favouriteDrink) {
        this.name = name;
        this.age = age;
        this.favouriteDrink = favouriteDrink;
    }

    @Override
    public String toString() {
        return "The name is: "+ name + "\nThe age is: " + age + "\nThe favourite drink is: " + favouriteDrink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavouriteDrink() {
        return favouriteDrink;
    }

    public void setFavouriteDrink(String favouriteDrink) {
        this.favouriteDrink = favouriteDrink;
    }

    public boolean isAttendingParty() {
        return isAttendingParty;
    }

    public void setAttendingParty(boolean attendingParty) {
        isAttendingParty = attendingParty;
    }

    public String getCurrentPartyName() {
        return currentPartyName;
    }

    public void setCurrentPartyName(String currentPartyName) {
        this.currentPartyName = currentPartyName;
    }
}
