#Criar o meu docker com o cassandra
sudo docker run -p 9042:9042 --name some-cassandra -d cassandra

#Rodar o cqlsh no meu cassandra do docker
sudo docker run -it --link some-cassandra:cassandra --rm cassandra cqlsh cassandra

#Criar o Keyspace e a tabela
create keyspace webflux with replication = { 'class' : 'SimpleStrategy', 'replication_factor':1 };
create table person ( id int, name text, primary key (id, name));

#references
https://docs.datastax.com/en/cql/3.3/cql/cql_reference/cqlCreateTable.html#cqlCreateTable
http://www.baeldung.com/spring-data-cassandra-tutorial
https://hub.docker.com/_/cassandra/
https://github.com/mohitsinha/tutorials/tree/master/spring-boot-webflux-reactive-mongo/src/main/java/com/spring/example/controllers
https://dzone.com/articles/spring-boot-reactive-tutorial
http://www.baeldung.com/spring-5-functional-web
http://www.baeldung.com/reactor-core
https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#spring-webflux
