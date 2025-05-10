import java.util.ArrayList;

public class ProductoCombo extends Producto{

    private  ArrayList<Producto> combo = new ArrayList<>();

    public ProductoCombo(String nombre) {
        super(nombre, 0);
    }

    public void agregarProductoCombo(Producto producto){
        combo.add(producto);
        precioProducto += producto.getPrecioProducto();
    }

    public boolean esValido() {
        return combo.stream().allMatch(Producto::esValido);
    }
}