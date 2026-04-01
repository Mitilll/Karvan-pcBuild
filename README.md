# KARVAN PC BUILD

Plataforma web para montagem de computadores personalizados, permitindo ao usuário selecionar e organizar componentes com base em dados atualizados de mercado.

---

## Tecnologias

* Java + Spring Boot
* MongoDB
* API do Mercado Livre
* REST APIs
* JavaScript (Frontend)

---

## Funcionalidades

*  Busca de peças com dados atualizados (preço, disponibilidade)
*  Montagem de PCs personalizados
*  Organização e recomendação de componentes
*  Integração com API externa (Mercado Livre)
*  Persistência de dados com MongoDB

---

##  Arquitetura

O projeto segue boas práticas de desenvolvimento backend:

* Estrutura em camadas (Controller, Service, Repository)
* Consumo de APIs externas
* Tratamento e normalização de dados
* Código organizado e escalável

---

## Integração com API

Os dados dos produtos são obtidos via API do Mercado Livre, garantindo:

* Preços atualizados
* Informações reais de mercado
* Maior confiabilidade nas escolhas do usuário

---

## ▶️ Como rodar o projeto

```bash
# Clonar repositório
git clone https://github.com/seu-usuario/karvan-pc-build

# Entrar na pasta
cd karvan-pc-build

# Rodar aplicação
./mvnw spring-boot:run
```

---

## 📌 Futuras melhorias

* Sistema de autenticação de usuários
* Salvamento de builds
* Comparação de componentes
* Interface mais interativa

---
