---

# 📋 Requisitos Funcionais

1. **Cadastro de Usuário**
   - O sistema deve permitir que novos usuários se cadastrem com informações como nome, e-mail e senha.
   - O sistema deve permitir autenticação de usuários registrados.

2. **Visualização de Produtos**
   - Usuários devem poder visualizar uma lista de produtos disponíveis no sistema.
   - Os produtos devem conter informações como nome, descrição, preço e disponibilidade em estoque.

3. **Reserva de Produto**
   - O usuário poderá **reservar um produto por até 3 dias**.
   - Após o prazo, se a compra não for concluída, a reserva será cancelada automaticamente.
   - Durante o período de reserva, o produto não poderá ser adquirido por outros usuários.

4. **Compra de Produto**
   - O sistema deve permitir a compra de produtos disponíveis em estoque.
   - O mesmo produto **não pode ser adquirido por mais de um usuário**.
   - Ao concluir uma compra, o estoque deve ser atualizado corretamente.

5. **Histórico de Pedidos**
   - O sistema deve manter o histórico de compras dos usuários para consulta posterior.

---

# 🎯 Atributos de Qualidade

| Qualidade                     | Descrição                                                                 |
|------------------------------|---------------------------------------------------------------------------|
| **Desempenho**               | O sistema deve responder rapidamente, mesmo sob alta carga.               |
| **Escalabilidade**           | A arquitetura deve permitir crescimento horizontal para lidar com picos. |
| **Consistência de Dados**    | O sistema deve garantir que um mesmo produto **não seja comprado duas vezes**. |
| **Segurança**                | Os dados do usuário (cadastro, pedidos, etc.) devem estar protegidos.    |
| **Alta Disponibilidade**     | O sistema deve manter-se funcional mesmo durante períodos de alto tráfego.|
| **Responsividade Backend**   | O backend pode responder rapidamente ao usuário antes de finalizar todo o processamento do pedido. |
| **Auditabilidade**           | As ações importantes (reservas, compras, falhas) devem ser registradas.  |

---

# 🔒 Restrições de Design

- O **backend** deve ser desenvolvido utilizando **Spring Boot com Kotlin**.
- O **frontend** deve ser implementado em **React**, com interface moderna e responsiva.
- O sistema deve usar banco de dados relacional ou distribuído que garanta integridade transacional para operações de reserva e compra.
- O sistema deve adotar uma arquitetura orientada a microsserviços ou baseada em serviços (por exemplo: produto, pedido, pagamento).
- Deve ser possível **responder ao usuário antes de processar toda a cadeia do pedido**, usando padrões como *eventual consistency* ou *event-driven architecture*.
- Deve seguir boas práticas de segurança como:
  - Criptografia de senhas (BCrypt)
  - Proteção contra CSRF, XSS e SQL Injection
  - HTTPS em todas as camadas
- A infraestrutura deve permitir **escalabilidade horizontal**, como uso de Docker/Kubernetes ou serviços cloud-based.


