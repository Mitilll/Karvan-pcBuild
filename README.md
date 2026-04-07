# KARVAN PC BUILD

Plataforma web para montagem de computadores personalizados, permitindo ao usuário selecionar e organizar componentes com base em dados atualizados de mercado.

<img width="1024" height="1024" alt="ideogram-v3 0_gere_uma_logo_marca_minimalista_cinza_e_vermelha_use_as_cores_degrade_e_use_como-0" src="https://github.com/user-attachments/assets/c4a985c6-fa65-4a4e-aa52-8b76fb26a27f" />


## Tecnologias

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

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
