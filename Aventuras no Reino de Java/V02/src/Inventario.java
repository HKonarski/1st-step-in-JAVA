import java.util.ArrayList;
import java.util.List;

public class Inventario
{
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item)
    {
        itens.add(item);
        System.out.println(item.getNome() + " foi adicionado ao inventário!");
    }

    public void listarItens()
    {
        System.out.println("Itens no inventário:");
        for (Item i : itens)
        {
            System.out.println("- " + i.getNome());
        }
    }
}

