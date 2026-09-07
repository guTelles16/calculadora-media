# Calculadora de Média

Projeto simples em Java desenvolvido para calcular a média de notas escolares, determinar a situação final do aluno e validar as regras de negócio por meio de testes unitários automatizados.

---

## Funcionalidades

- **Cálculo da Média:** calcula a média aritmética a partir das notas informadas.
- **Verificação de Status:** avalia a nota final e define a situação do aluno:
  - **APROVADO**
  - **EM RECUPERAÇÃO**
  - **REPROVADO**
- **Testes Automatizados:** validação de cenários de cálculo e limites de aprovação utilizando JUnit 5.

---

## Tecnologias Utilizadas

- **Linguagem:** Java
- **Testes Unitários:** JUnit 5
- **IDE:** IntelliJ IDEA

---

## Estrutura do Projeto

```text
calculadora-media/
├── src/
│   └── CalculoMedia.java        # Classe principal com a lógica de negócio
├── test/
│   └── CalculoMediaTest.java    # Cenários de testes automatizados com JUnit 5
└── .gitignore                   # Regras de arquivos ignorados pelo Git
