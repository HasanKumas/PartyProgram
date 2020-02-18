import java.util.ArrayList;
import java.util.List;

public class Party {
    List<Person> personList = new ArrayList<>();
    private String location;
    private String name;

    public Party(String location, String name) {
        this.location = location;
        this.name = name;
    }

    public void enter(Person person){
        if(person.isAttendingParty()){
            System.out.println("Person " + person.getName() + " is already at the party " + person.getCurrentPartyName());
        }else {
            person.setAttendingParty(true);
            person.setCurrentPartyName(name);
            System.out.println("Person " + person.getName() + " entered party " + name);
            personList.add(person);
        }
    }

    public void leave(Person person){
        if (personList.contains(person)) {
            personList.remove(person);
            System.out.println("Person " + person.getName() + " left party " + name);
            person.setAttendingParty(false);
            person.setCurrentPartyName(" ");
        }else {
            System.out.println("Person " + person.getName() + " is not at this party right now ");
        }
    }

    public void numberOfPeople(){
        System.out.println("There are currently " + personList.size() + " people on the party "+ name);
    }
    public void attendeesOfParty(){
        for (Person person: personList) {
            System.out.println(person);
        }

    }
}
