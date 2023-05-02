import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String args[]){
        ArrayList<Person> personsList=new ArrayList<>();
        List finallist= personsList.stream().map(person -> person.getAccountNo())
                .filter(bankAccount -> bankAccount.accountBalance>300)
                .collect(Collectors.toList());

    }
}

