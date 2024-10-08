package com.tienda.crud_spring.Repositories;

import com.tienda.crud_spring.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}