#Criar o meu docker com o cassandra
sudo docker run -p 9042:9042 --name some-cassandra -d cassandra

#Rodar o cqlsh no meu cassandra do docker
sudo docker run -it --link some-cassandra:cassandra --rm cassandra cqlsh cassandra

#Criar o Keyspace e a tabela
create keyspace webflux with replication = { 'class' : 'SimpleStrategy', 'replication_factor':1 };
create table person ( id int, name text, primary key (id, name));

