public class ApplicationParty {
    public static void main(String[] args) {
        //creating parties
        Party party1 = new Party("Amsterdam", "birthday");
        Party party2 = new Party("Amsterdam", "new year");

        //creating people
        Person person1 = new Person("Hasan", 45, "wine");
        Person person2 = new Person("John", 34, "beer");

        //joining and leaving party
        party1.enter(person1);
        party1.enter(person2);
        party1.leave(person2);
        party1.leave(person2);
        party1.enter(person2);

        //showing the number of people and attendees in a party
        party1.numberOfPeople();
        party1.attendeesOfParty();

        //joining and leaving party
        party2.enter(person1);
        party2.enter(person2);
        party2.enter(person2);
        party2.leave(person2);
        party2.leave(person2);
        party2.enter(person2);

        //showing the number of people and attendees in a party
        party2.numberOfPeople();
        party2.attendeesOfParty();
    }
}
