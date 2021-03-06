<h2>Digital Innovation: Expert class - Construindo uma API Rest de consulta de cidades do Brasil do zero até a produção com Spring Boot</h2>

Nesta live coding foi desenvolvido um pequeno sistema construido uma API Rest de consulta de cidades do Brasil, criada com o Spring Boot.

Durante a sessão, foram desenvolvidos e abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários para validação das funcionalidades
* Implantação do sistema na nuvem através do Heroku

```
https://cities-api-1.herokuapp.com
```

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
https://cities-api-1.herokuapp.com/cities
http://localhost:8080/cities
```
```
https://cities-api-1.herokuapp.com/countries
http://localhost:8080/countries
```
```
https://cities-api-1.herokuapp.com/countries/258
http://localhost:8080/countries/258
```
```
https://cities-api-1.herokuapp.com/states
http://localhost:8080/states
```
```
https://cities-api-1.herokuapp.com/distances/by-points?from=4929&to=5254
http://localhost:8080/distances/by-points?from=4929&to=5254
```
```
https://cities-api-1.herokuapp.com/distances/by-cube?from=4929&to=5254
http://localhost:8080/distances/by-cube?from=4929&to=5254
```
