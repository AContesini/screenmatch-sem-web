package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T Obterdados(String json, Class<T> classe);
}
