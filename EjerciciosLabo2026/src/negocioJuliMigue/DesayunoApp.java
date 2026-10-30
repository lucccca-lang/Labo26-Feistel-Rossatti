package negocioJuliMigue;

import java.util.HashMap;

public class DesayunoApp {
    static void main() {
        Bizcochuelo bizcochuelo = new Bizcochuelo(100, 250, 200, 2, 2, 2000, 2, 150);
        Brownie brownie = new Brownie(222, 300, 122, 4, 1, 1500, 400);
        Cookie cookie = new Cookie(300, 100, 140, 5, 5, 2500, 50, Topping.CONFITES);

        Sistema sist = new Sistema(new HashMap<>(), new HashMap<>());

        System.out.println(bizcochuelo.conocerReceta());
        System.out.println(cookie.conocerReceta());
        System.out.println(brownie.conocerReceta());

        brownie.actualizarStock(2);
        cookie.actualizarStock(3);

        System.out.println(brownie.descripcionVenta());
        System.out.println(cookie.descripcionVenta());

        System.out.println(brownie.calcularPrecio(2));
        System.out.println(cookie.calcularPrecio(3));

        brownie.vender(1);
        cookie.vender(6);

        sist.registrarVenta(cookie, 8);
        sist.registrarVenta(brownie, 3);


       /* try{
            sist.nuevaPreparacion(cookie, 3);
        }
        catch (IngredienteInvalidoExeception e){
            System.out.println(e.getMessage());
        }*/

        /*sist.reponerProducto(brownie, 3);*/

        sist.listaPreparaciones.put(cookie, 2);
        sist.listaPreparaciones.put(brownie, 4);
        sist.listaPreparaciones.put(bizcochuelo, 1);

        sist.cantProdVendible();
    }
}
