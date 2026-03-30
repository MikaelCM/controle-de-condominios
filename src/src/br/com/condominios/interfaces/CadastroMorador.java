package br.com.condominios.interfaces;

import java.util.List;

public interface CadastroMorador<T> {
    void cadastrarMorador(T obj);
    List<T> listarMoradores();
}