
import beans.PersonBean;

public class TestPersonBean {
    
    public static void main (String[] args) {
        PersonBean person = new PersonBean();
        person.setName("Bob");
        person.setDeceased(false);
        
        System.out.println(person.getName());
        System.out.println(person.isDeceased() ? " [deceased]" : " [alive]");
    }
    
}
