# Livraria-JAVA

# **Atividade: Sistema de Gerenciamento de Biblioteca**

## **Objetivo**
Criar um sistema simples de gerenciamento de uma biblioteca, aplicando os conceitos de POO como encapsulamento, herança e polimorfismo.

## **Requisitos**

### 1. **Crie uma classe `Livro`**
- **Atributos:**
    - `titulo` (String)
    - `autor` (String)
    - `anoPublicacao` (int)
    - `disponivel` (boolean)

- **Métodos:**
    - `emprestarLivro()`: Define o livro como indisponível se ele estiver disponível.
    - `devolverLivro()`: Define o livro como disponível.
    - `exibirDetalhes()`: Mostra os detalhes do livro.

### 2. **Crie uma classe `Usuario`**
- **Atributos:**
    - `nome` (String)
    - `idUsuario` (int)

- **Métodos:**
    - `emprestarLivro(Livro livro)`: Verifica se o livro está disponível e o empresta.
    - `devolverLivro(Livro livro)`: Devolve o livro emprestado.

### 3. **Crie uma classe `Biblioteca`**
- **Atributos:**
    - `listaLivros` (ArrayList de `Livro`)
    - `listaUsuarios` (ArrayList de `Usuario`)

- **Métodos:**
    - `adicionarLivro(Livro livro)`: Adiciona um livro à biblioteca.
    - `removerLivro(Livro livro)`: Remove um livro da biblioteca.
    - `listarLivrosDisponiveis()`: Lista os livros disponíveis.

### 4. **Crie uma classe `Main`**
- **Ações a serem implementadas:**
    - Adicione pelo menos 3 livros.
    - Cadastre pelo menos 2 usuários.
    - Teste os métodos de empréstimo e devolução.

## **Extras para desafios**
- Adicione um sistema de limite de livros emprestados por usuário.
- Registre histórico de empréstimos e devoluções.
- Crie uma exceção personalizada para evitar emprestar um livro já emprestado.
