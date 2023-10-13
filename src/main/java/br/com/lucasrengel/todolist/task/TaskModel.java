package br.com.lucasrengel.todolist.task;


import java.time.LocalDateTime;
import java.util.UUID;

public class TaskModel {

    /*
    Id
    Usuario (id_usuario)
    Descricao
    Titulo
    Data de inicio
    Data de termino
    Prioridade
     */
    private UUID id;
    private String description;
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    private LocalDateTime createdAt;
}
