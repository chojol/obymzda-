import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NaPewnoZdam naPewnoZdam = new NaPewnoZdam("", 4, "");
        NaPewnoZdam naPewnoZdam2 = new NaPewnoZdam("", 4, "");
        NaPewnoZdam naPewnoZdam3 = new NaPewnoZdam("", 4, "");
        Zdalem zdalem = new Zdalem("", 5, "", LocalDate.now());
        List<NaPewnoZdam> naPewnoZdamList = new ArrayList<>();
        naPewnoZdamList.add(naPewnoZdam);
        naPewnoZdamList.add(naPewnoZdam2);
        naPewnoZdamList.add(naPewnoZdam3);
        naPewnoZdamList.add(zdalem);
        for (NaPewnoZdam pewnoZdam : naPewnoZdamList) {
            System.out.println(pewnoZdam);
        }
        naPewnoZdamList.remove(naPewnoZdam2);
    }
}