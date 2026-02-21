API REST - Castro de Cliente, Pedido e Entrega

Este projeto é uma aplicação Java com Spring Boot que expõe endpoints REST para gerenciar clientes, pedidos e entregas

📌 Tecnologias Utilizadas
Java 17
Spring Boot 4.0.1
Spring Web
Spring Data JPA
Banco embarcado H2
Lombok
Swagger OpenAPI
________________________________________________________________________________________________________________________
📂 Estrutura do Projeto
src/main/java/br/com/ekan/desafioekan
│
├── cliente
│ ├── api                  # Controllers REST de cliente
│ ├── domain               # Entidades e DTOs de cliente
│ ├── infra                # Configurações e utilitários de cliente
│ ├── repository           # Repositórios JPA de cliente
│ └── service              # Regras de negócio de cliente
│
├── entrega
│ ├── api                  # Controllers REST de entrega
│ ├── domain               # Entidades e DTOs de entrega
│ ├── infra                # Configurações e utilitários de entrega
│ ├── repository           # Repositórios JPA de entrega
│ └── service              # Regras de negócio de entrega
|
├── pedido
│ ├── api                  # Controllers REST de pedido
│ ├── domain               # Entidades e DTOs de pedido
│ ├── infra                # Configurações e utilitários de pedido
│ ├── repository           # Repositórios JPA de pedido
│ └── service              # Regras de negócio de pedido
│
└── handler                # Tratamento global de exceções
______________________________________________________________________________________________________

🗄 Modelo de Dados
Relacionamento:
Um pedido obrigatoriamente precisa ter um cliente e um cliente pode ter vários pedidos.
Uma entrega obrigatoriamente necessita estar vinculada a um pedido.

Cliente

id
nome
email
celular
cpf
sexo
endereco

Entrega

id
endereco
status
data do envio
data da entrega
id_clienteEntreha (FK)
id_pedidoEntrega (FK)

Pedido

id
valor do pedido
status
itens
id_clientePedido (FK)
___________________________________________________________________________________

🚀 Executando o Projeto
Pré-requisitos
- JDK 17 instalado
- Maven instalado
- Banco de dados H2 configurado

  
Passos para execução

- Clone o repositório: https://github.com/Celsonjardim/pedido-delivery.git
- Compile e rode a aplicação: mvn spring-boot:run
- A Plicação estara disponiel em: http://localhost:8080/pedido-delivery/api/swagger
_____________________________________________________________________________________
📡 Endpoints

Cliente
- POST /api/clientes → Criar cliente
- GET /api/clientes → Listar clientes
- GET /api/clientes/{id} → Consultar cliente por ID
- PUT /api/clientes/{id} → Atualizar cliente
- DELETE /api/clientes/{id} → Deletar cliente
  
Pedido
- POST /api/pedidos → Criar pedido
- GET /api/pedidos → Listar pedidos
- GET /api/pedidos/{id} → Consultar pedido por ID
- PUT /api/pedidos/{id} → Atualizar pedido
- DELETE /api/pedidos/{id} → Deletar pedido
  
Entrega
- POST /api/entregas → Criar entrega
- GET /api/entregas → Listar entregas
- GET /api/entregas/{id} → Consultar entrega por ID
- PUT /api/entregas/{id} → Atualizar entrega
- DELETE /api/entregas/{id} → Deletar entrega
_____________________________________________________________________________________________

🛠 Banco de Dados (H2)
Console H2:

http://localhost:8080/pedido-delivery/api/console
Configurações:

JDBC URL: jdbc:h2:mem:demodb
User: sa
Password: (em branco)
___________________________________________________________________________________________

📜 Documentação Swagger
Após iniciar a aplicação, acessar:

http://localhost:8080/pedido-delivery/api/swagger
___________________________________________________________________________________________

👨‍💻 Autor
Desenvolvido por Celson Jardim
📧 Email: celsonjardim.dev@outlook.com 📌 GitHub: Celsonjardim
