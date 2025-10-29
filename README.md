- 🏪 Mini Mercado 2A
Um sistema de gerenciamento de um Mini Mercado, usado em condominios, empresas. desenvolvido em Java, que permite o cadastro de produtos, clientes, controle de vendas e formas de pagamento.  
O projeto segue princípios de Programação Orientada ao Objeto (POO) e foi criado para fins de estudo e prática acadêmica.

---

## 🚀 Funcionalidades

- 👨‍💼 **Modo Gerente**
  - Cadastrar, listar e remover produtos  
  - Cadastrar e listar clientes  
  - Consultar histórico de vendas  

- 🛒 **Modo Cliente**
  - Visualizar produtos disponíveis  
  - Realizar compras  
  - Escolher forma de pagamento (💵 Dinheiro, 💳 Cartão, ⚡ PIX)

- 💾 Sistema modular com classes separadas (`Produto`, `Cliente`, `Venda`, `Pagamento`, etc.)

---

## 🧠 Estrutura do Projeto

MiniMercado/
├── src/
│ └── minimarket/
│ └── modelo/
│ └── A2Mercado/
│ ├── Main.java
│ ├── Molde/
│ │ ├── Cliente.java
│ │ ├── Produto.java
│ │ ├── Venda.java
│ │ └── Pagamento.java
│ └── Service/
│ ├── ClienteService.java
│ ├── ProdutoService.java
│ └── VendaService.java
├── .gitignore
└── README.md


---

## ⚙️ Como executar o projeto

### 🔧 Pré-requisitos
- **Java 17** ou superior instalado  
- (Opcional) IDE recomendada: **IntelliJ IDEA** ou **VS Code com extensão de Java**

### ▶️ Execução via terminal

```bash
# Compilar o projeto
javac src/minimarket/modelo/A2Mercado/Main.java

# Executar
java minimarket.modelo.A2Mercado.Main

Ou, se preferir, basta abrir o projeto na IDE e executar a classe Main.java.
💻 Tecnologias Utilizadas

    ☕ Java 17+

    💡 Paradigma: Programação Orientada a Objetos (POO)

    🧰 Ferramentas: IntelliJ IDEA / VS Code

    🧾 Controle de Versão: Git e GitHub

👥 Colaboradores
Nome	GitHub
⚙️ [Seu Nome Aqui]	@⚙️SeuUsuarioGitHub
⚙️ [Nome do Amigo Aqui]	@⚙️UsuarioDoAmigo
📄 Licença

Este projeto está sob a licença MIT.
Você pode usar, modificar e distribuir livremente, desde que mantenha os créditos aos autores originais.
🧭 Melhorias Futuras

    💾 Adicionar persistência de dados em arquivos ou banco de dados

    📊 Criar relatórios detalhados de vendas

    🌐 Migrar para uma versão web com Spring Boot

    🎨 Implementar uma interface gráfica com JavaFX

💬 Contato

📧 Email: ⚙️ [seuemail@exemplo.com
]
🐙 GitHub: @⚙️SeuUsuarioGitHub


🔗 LinkedIn: ⚙️ [link do seu perfil no LinkedIn (opcional)]

    📘 Projeto desenvolvido para fins acadêmicos, com foco em boas práticas de POO e modularização em Java.

