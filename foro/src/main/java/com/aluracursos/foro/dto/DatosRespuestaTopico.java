package com.aluracursos.foro.dto;

import com.aluracursos.foro.modelo.StatusTopico;
import com.aluracursos.foro.modelo.Topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, LocalDateTime fecha, StatusTopico statusTopico,String autor, String curso) {
    public DatosRespuestaTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha_creacion(), topico.getStatus_topico(), topico.getAutor(), topico.getCurso());
    }
}