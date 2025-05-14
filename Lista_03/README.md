# Projeto 03 - Implementação de Busca em Tabela Hash

**Disciplina:** Estruturas de Dados 2  
**Curso:** Sistemas de Informação  
**Professor:** Dr. Alysson A. Naves Silva  
**Instituição:** LIBERTAS – Faculdades Integradas  
**Aluno:** Adryan Santos  
**R.A.:** 007194  
**Prazo de entrega:** 14/05/2025  

---

## 📌 Descrição

Este projeto consiste na implementação de uma **função de busca** dentro de uma **tabela hash**, utilizando uma função hash simples baseada na letra inicial da palavra. O objetivo é distribuir 100 palavras aleatórias entre 26 categorias (A-Z) e permitir que o usuário busque palavras verificando se elas existem na categoria correta da tabela.

---

## 🧠 Lógica da Tabela Hash

- A função `funcaoHash()` calcula a posição da palavra na tabela com base na sua letra inicial (convertida para maiúscula) somada a 13 e tirando o módulo com o tamanho da tabela.
- As palavras são armazenadas em um vetor de listas (`ArrayList[]`), onde cada índice representa uma "categoria" da hash.

---

## 🔍 Funcionalidade de Busca

A função `buscarPalavra(String palavra, ArrayList<String>[] tabelaHash, int tam)` realiza a busca eficiente da palavra dentro da categoria correspondente:

1. Calcula o índice da categoria usando `funcaoHash`.
2. Busca na lista correspondente se a palavra está presente.
3. Retorna `true` se encontrar, `false` caso contrário.

A busca é feita usando o método `.contains()` da classe `ArrayList`.

---

## 🛠️ Como Executar

1. Clone ou baixe o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Compile e execute com o terminal ou via IDE (ex: VS Code, IntelliJ):

   ```bash
   javac App.java
   java App
   ```

3. Digite palavras geradas aleatoriamente para buscar.

---

## 📸 Exemplo de Execução

```txt
Digite uma palavra para buscar: xdpwoq
Categoria esperada para 'xdpwoq': 11
Palavra 'xdpwoq' não encontrada.

Deseja continuar? (S/N): S
Digite uma palavra para buscar: kqezvc
Categoria esperada para 'kqezvc': 24
Palavra 'kqezvc' encontrada.
```

---

## 📚 Referência

Repositório oficial da disciplina:  
[https://github.com/anaves/SIS-ED2-2025-1](https://github.com/anaves/SIS-ED2-2025-1)

---

**Desenvolvido por Adryan Santos – R.A. 007194
