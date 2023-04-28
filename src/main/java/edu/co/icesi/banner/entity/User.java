package edu.co.icesi.banner.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private List<String> carrito;

    @OneToMany(mappedBy = "user")//Nombre de la CLASE
    @JsonIgnore
    private List<Product> products;

    public User(int id, String jose, int i, int products) {

        carrito = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public List<Product> getProduct() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setId(int id) {
        this.id = (long) id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<String> carrito) {
        this.carrito = (ArrayList<String>) carrito;
    }

    public User(long id, String name, List<String> carrito, int products) {
        this.id = id;
        this.name = name;
        this.carrito = new ArrayList<>();
        this.carrito = carrito;
        this.products = products;
    }

    public void agregarAlCarrito(String name) {
        carrito.add(name);
    }

    public void eliminarDelCarrito(String name) {
        carrito.remove(name);
    }

    public double obtenerPrecioTotal(Inventario inventario) {
        double precioTotal = 0;
        for (String name : carrito) {
            if (inventario.existeProducto(name)) {
                precioTotal += inventario.obtenerPrecio(name);
            } else {
                throw new IllegalArgumentException("Producto " + name + " no existe en el inventario.");
            }
        }
        return precioTotal;
    }


}
