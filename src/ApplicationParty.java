public class ApplicationParty {
    public static void main(String[] args) {
        Party party1 = new Party("Amsterdam", "birthday");
        Party party2 = new Party("Amsterdam", "new year");

        Person person1 = new Person("Hasan", 45, "wine");
        Person person2 = new Person("John", 34, "beer");

        party1.enter(person1);
        party1.enter(person2);
        party1.leave(person2);
        party1.leave(person2);
        party1.enter(person2);

        party1.numberOfPeople();
        party1.attendeesOfParty();

        party2.enter(person1);
        party2.enter(person2);
        party2.enter(person2);
        party2.leave(person2);
        party2.leave(person2);
        party2.enter(person2);

        party2.numberOfPeople();
        party2.attendeesOfParty();
    }
}
