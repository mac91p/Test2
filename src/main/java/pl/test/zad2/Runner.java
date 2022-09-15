package pl.test.zad2;

public class Runner {
    public static void main(String[] args) {

        long start1 = System.nanoTime();
        String s1 = "";
        for (int i = 0; i < 100000; i++) {
            s1 = s1 + i + " ";
        }
        long stop1 = System.nanoTime();

        long start2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
            sb.append(" ");
        }
        String s2 = sb.toString();
        long stop2 = System.nanoTime();

        long result1 = stop1 - start1;
        long result2 = stop2 - start2;
        System.out.println("StringBuilder jest szybszy " + ((double)result1/result2) + " razy.");
    }
}
//Spowodowane jest to faktem iż String jest niezmienny, tzn. raz utworzony już zawsze ma taką postać. W powyższym przykładzie z konkatenacją,
//wraz z każdym wykonaniem się pętli tworzy się nowy ciąg, który jest wynikiem konkatencji dwóch poprzednich. Więc w rezultacie pamięc przydzielana jest
// dla każdego kolejnego obiektu String. Z kolei, obiekty klasy StringBuilder są implementowane jako sekwencje znaków, tzn dołączając kolejny ciąg,
// ten dotychczasowy jest aktualizowany, a nie tworzony od nowa jak przypadku konkatenacji.