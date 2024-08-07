package com.aluracursos.foro.dto;

import com.aluracursos.foro.modelo.StatusTopico;
import com.aluracursos.foro.modelo.Topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(String titulo, String mensaje, LocalDateTime fecha, StatusTopico estatus, String autor, String curso) {
    public DatosListadoTopico (Topico topico){
        this(topico.getTitulo(), topico.getMensaje(), topico.getFecha_creacion(), topico.getStatus_topico(), topico.getAutor(), topico.getCurso());
    }
}