package com.ejercicios.apiOrdenamieto.service;

import java.util.Collections;
import java.util.List;

public class OrdenService implements IOrdenService{

    @Override
    public List<String> ordenarNombres(List<String> listaNombres) {
        Collections.sort(listaNombres);
        return listaNombres;
    }
    
}
