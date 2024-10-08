package com.tienda.crud_spring.Repositories;

import com.tienda.crud_spring.Models.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository  
public interface ProductoRepository extends MongoRepository<Producto, String> {
    
    Producto findByNombre(String nombre);
}
