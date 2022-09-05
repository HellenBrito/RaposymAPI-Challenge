create table exercicio (
    id bigint not null, 
    dsExercicio varchar(255), 
    score integer not null, 
    status integer not null, 
    titulo varchar(255), 
    primary key (id)
);

 insert into exercicio (dsExercicio, score, status, title, id) 
 values ('Leia um lovrp que te acalme, pelo menos 10 páginas por dia', 100, 0, 'Ler', 0);
