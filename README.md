# API REST - Cadastro de Cliente, Pedido e Entrega

API REST desenvolvida com Spring Boot para gerenciamento de clientes, pedidos e entregas, seguindo arquitetura em camadas e boas práticas de desenvolvimento.

## 📌 Tecnologias Utilizadas
- Java 17
- Spring Boot 
- Spring Web
- Spring Data JPA
- Banco H2 (em memória)
- Lombok
- Swagger OpenAPI
  
---

## 🏗 Arquitetura

O projeto segue o padrão de arquitetura em camadas:

- **API** → Camada de exposição REST (Controllers)
- **Service** → Regras de negócio
- **Repository** → Acesso a dados (JPA)
- **Domain** → Entidades e DTOs
- **Infra** → Configurações
- **Handler** → Tratamento global de exceções

---

## 📂 Estrutura do Projeto
```
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
```
---

## 📌 Modelo de Dados

- Um Cliente pode ter vários Pedidos
- Um Pedido pertence a um único Cliente
- Um Pedido possui uma Entrega
- Uma Entrega está vinculada a um Pedido

### Cliente
- id (UUID)
- nome
- email
- celular
- cpf
- sexo
- endereco

### Pedido
- id (UUID)
- valor
- status
- itens
- cliente (Relacionamento)

### Entrega
- id (UUID)
- endereco
- status
- dataEnvio
- dataEntrega
- pedido (Relacionamento)
---

## ▶ Como Executar o Projeto

### Pré-requisitos
- JDK 17 instalado
- Maven instalado

## Passos para execução

1. Clone o repositório
```
https://github.com/Celsonjardim/pedido-delivery.git
```
2. Abra o projeto no IntelliJ
3. Execute a classe `PedidoDeliveryApplication`
4. Acesse:

Swagger:
```
http://localhost:8080/pedido-delivery/api/swagger
```

H2 Console:
```
http://localhost:8080/pedido-delivery/api/h2-console
```
---
📡 Endpoints

### Cliente

| Método | Endpoint | Descrição |
|--------|----------|-----------|
- POST /api/clientes → Criar cliente
- GET /api/clientes → Listar clientes
- GET /api/clientes/{id} → Consultar cliente por ID
- PUT /api/clientes/{id} → Atualizar cliente
- DELETE /api/clientes/{id} → Deletar cliente
  
### Pedido

| Método | Endpoint | Descrição |
|--------|----------|-----------|
- POST /api/pedidos → Criar pedido
- GET /api/pedidos → Listar pedidos
- GET /api/pedidos/{id} → Consultar pedido por ID
- PUT /api/pedidos/{id} → Atualizar pedido
- DELETE /api/pedidos/{id} → Deletar pedido
  
### Entrega

| Método | Endpoint | Descrição |
|--------|----------|-----------|
- POST /api/entregas → Criar entrega
- GET /api/entregas → Listar entregas
- GET /api/entregas/{id} → Consultar entrega por ID
- PUT /api/entregas/{id} → Atualizar entrega
- DELETE /api/entregas/{id} → Deletar entrega
---

## 📌 Status do Projeto

✔ Projeto concluído para fins de estudo e portfólio.

---

## 👨‍💻 Autor

Desenvolvido por **Celson Jardim**  
📧 celsonjardim.dev@outlook.com  
📌 GitHub: https://github.com/Celsonjardim
