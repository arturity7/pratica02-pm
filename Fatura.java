import java.util.ArrayList;
import java.util.List;

public class Fatura{
    private List<int> itens = new ArrayList<>();

    public void calcularItem(int item){
        itens.add(item);
    } 

    public void listarItens(){
        for (int item : itens){
            System.out.println(item);
        }
    }
}