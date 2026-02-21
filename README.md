Pedido_Delivery API - Java Backend
📌 Descrição
Sistema simplificado para controle de pedidos e entrega.
Desenvolvido em Java 17 com Spring Boot 4.0.1, utilizando H2 como banco de dados e documentação via OpenAPI 2.8.5 (Swagger).

🚀 Tecnologias Utilizadas
- Java 12
- Spring Boot 4.0.1
- Maven
- H2
- OpenAPI 2.8.5 (Swagger)

⚙️ Configuração do Projeto
Pré-requisitos
- JDK 17 instalado
- Maven instalado
- Banco de dados H2 configurado

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

📖 Observações
- O design dos atributos das entidades é livre e pode ser ajustado conforme necessidade.
- Não há frontend, apenas APIs RESTful.
