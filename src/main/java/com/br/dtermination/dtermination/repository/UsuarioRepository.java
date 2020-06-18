package com.br.dtermination.dtermination.repository;

import com.br.dtermination.dtermination.model.Credenciais;
import com.br.dtermination.dtermination.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    @Query("select u from Usuario u where u.credencial = :credencial")
    public Usuario validaLoginESenha(@Param("credencial") Credenciais credencial);

  //  public List<Usuario> findByNome(String name);

//    public List<Usuario> findByEmailAndSenha(String name, Integer password);

}
