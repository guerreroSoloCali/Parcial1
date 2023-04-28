package edu.co.icesi.banner.entity;
import edu.co.icesi.banner.entity.Product;
import edu.co.icesi.banner.entity.User;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Inventario {
    private Map<String, Double> products;

    public Inventario() {
        products = new HashMap<String, Double>();
    }

    public void agregarProducto(String name, double id) {
        products.put(name, id);
    }

    public boolean existeProducto(String name) {
        return products.containsKey(name);
    }

    public double obtenerPrecio(String name) {
        return products.get(name);
    }
}