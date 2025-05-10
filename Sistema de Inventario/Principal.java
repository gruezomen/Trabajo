
public class Principal{
    public static void main(String args[]){


        Inventario inventario;
        AlmacenInventario almacen = new AlmacenInventario();
        inventario = new Inventario(almacen);
    
        Producto arroz = new Abarrote("Arroz", 1000);
        Producto aceite = new Abarrote("Aceite", 2500);
        Producto fideos = new Abarrote("Fideos", 100);
        Producto yogurt = new Lacteo("Yogurt", 1800, new Fecha(15, 6, 2025));
        Producto queso = new Lacteo("Queso", 2200, null);

        inventario.registrarProducto(yogurt, 10);
        inventario.registrarProducto(arroz, 20);
        inventario.registrarProducto(aceite, 5);
        inventario.registrarProducto(queso, 5);
        inventario.registrarProducto(fideos, 3);

        ValidadorProducto validadorLacteo = new ValidadorLacteo();
        yogurt.setValidador(validadorLacteo);
        queso.setValidador(validadorLacteo);

        System.out.println("Productos registrados:");
        System.out.println("Yogurt: " + "Validez para su registro:" + yogurt.esValido() + "| Con fecha de vencimiento:" + ((Lacteo) yogurt).getCaducidad().mostrarFecha());
        System.out.println("arroz: " + "Validez para su registro:" + arroz.esValido());
        System.out.println("aceite: " + "Validez para su registro:" + aceite.esValido());
        System.out.println("Queso: " + "Validez para su registro:" + queso.esValido());
        System.out.println("fideos: " + "Validez para su registro:" + fideos.esValido());
        
    }
}