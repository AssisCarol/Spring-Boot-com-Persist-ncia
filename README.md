# 🧸 Projeto API - Gerenciamento de Brinquedos

Este projeto tem como objetivo desenvolver uma API REST utilizando **Spring Boot com Maven** e linguagem **Java**, voltada para o gerenciamento de brinquedos de crianças até 14 anos. A API realiza operações básicas de **Create (POST)** e **Read (GET)** em uma base de dados **Oracle SQL Developer**, acessando a tabela `TDS_TB_Brinquedos`.

---

## ⚙️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- Oracle SQL Developer
- Postman
- Tomcat (porta padrão: `8080`)
- Ferramentas auxiliares: cURL, GitHub

---

## 📄 Estrutura da Tabela no Banco de Dados Oracle

**Tabela:** `TDS_TB_Brinquedos`

| Coluna        | Tipo         |
|---------------|--------------|
| id            | NUMBER (PK)  |
| nome          | VARCHAR2     |
| tipo          | VARCHAR2     |
| classificacao | VARCHAR2     |
| tamanho       | VARCHAR2     |
| preco         | NUMBER       |

---

curl --location 'http://localhost:8080/brinquedos' \
--header 'Content-Type: application/json' \
--data '{
  "nome": "Carrinho",
  "tipo": "Veículo",
  "classificacao": "Infantil",
  "tamanho": "Pequeno",
  "preco": 19.99
}'

![Configuração Spring Boot Initialzr](caminho/para/imagem.png)
