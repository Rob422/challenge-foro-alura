package com.aluracursos.foro.modelo;


import com.aluracursos.foro.dto.DatosActualizarTopico;
import com.aluracursos.foro.dto.DatosRegistroTopico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha_creacion = LocalDateTime.now();
    @Enumerated(EnumType.STRING)
    private StatusTopico status_topico = StatusTopico.SIN_RESPUESTAS;
    private String autor;
    private String curso;
    private boolean activo;

    public Topico(DatosRegistroTopico registroTopico) {
        this.titulo = registroTopico.titulo();
        this.mensaje = registroTopico.mensaje();
        this.autor = registroTopico.autor();
        this.curso = registroTopico.curso();
        this.activo = true;
    }

    public void actualizar(DatosActualizarTopico datosActualizarTopico) {
        this.titulo = datosActualizarTopico.titulo();
        this.mensaje = datosActualizarTopico.mensaje();
        this.autor = datosActualizarTopico.autor();
        this.curso = datosActualizarTopico.curso();
    }

    public void desactivarTopico() {
        this.activo = false;
    }
}