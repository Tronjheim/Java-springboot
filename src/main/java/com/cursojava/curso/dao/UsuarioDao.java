package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.*;

public interface UsuarioDao {
   List<Usuario> getUsuarios();

   void eliminar(Long id);

   void registrar(Usuario usuario);
   Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
