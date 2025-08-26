import java.util.ArrayList;
import java.util.List;

public class ControleRemotoTest {
    public static void main(String[] args) {
       ControleRemoto cr = new ControleRemoto();
       List<String> frutas = new ArrayList<>();
       frutas.add("pera");
       frutas.add("goiaba");
       frutas.add("melancia");
       frutas.add("maracuja");
       frutas.add("uva");
       frutas.add("tomate");
       frutas.add("açai");
       frutas.add("Maça");
       frutas.add("banana");
       cr.setBotao1(1);
       cr.setBotao2(2);
       cr.setBotao3(3);
       cr.setBotao4(4);
       cr.setBotao5(5);
       cr.desligar();
       cr.ligar();
       cr.volumeMenos();
       cr.volume();
       cr.volumeMenos();
       cr.desligar();
       System.out.println(frutas);
    }
}
