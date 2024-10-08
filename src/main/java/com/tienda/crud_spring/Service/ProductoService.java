package com.tienda.crud_spring.Service;

import com.tienda.crud_spring.Models.Producto;
import com.tienda.crud_spring.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Método para listar todos los productos
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    // Método para agregar un nuevo producto
    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Método para obtener un producto por su ID
    public Producto obtenerProductoPorId(String id) {
        Optional<Producto> producto = productoRepository.findById(id);
        return producto.orElse(null); // Retorna null si no se encuentra el producto
    }

    // Método para actualizar un producto
    public Producto actualizarProducto(String id, Producto producto) {
        if (productoRepository.existsById(id)) {
            producto.setId(id); // Asegúrate de establecer el ID
            return productoRepository.save(producto);
        }
        return null; // O puedes lanzar una excepción si prefieres
    }

    // Método para eliminar un producto
    public void eliminarProducto(String id) {
        productoRepository.deleteById(id);
    }
}