# Controle de Combustíveis

Aplicação de linha de comando em Java para registrar quais **combustíveis** um cliente adicionou ao carrinho:
**Álcool**, **Gasolina** e **Diesel**. O programa lê opções numéricas, atualiza contadores por produto e exibe um resumo ao final.

---

## ✨ Funcionalidades
- Menu simples com opções:
  1. Álcool
  2. Gasolina
  3. Diesel
  4. Fim (encerra o programa)
- Contagem das escolhas feitas pelo usuário.
- Resumo final com total de cada combustível selecionado.

---

## 📦 Estrutura do projeto
```
.
├── Main.java       # Ponto de entrada: exibe menu, lê opções e imprime o resumo
└── Variaveis.java  # Classe que mantém os contadores e métodos de incremento
```

### `Main.java` (visão geral)
- Instancia `Variaveis`.
- Exibe o menu e lê a opção via `Scanner`.
- Para cada opção válida (1–3), chama o método de contagem correspondente.
- Encerra quando a opção é **4**.

### `Variaveis.java` (visão geral)
- Atributos inteiros para **gasolina**, **álcool** e **disel** (diesel).
- Métodos `contagemGasolina(int)`, `contagemAlcool(int)` e `contagemDisel(int)` incrementam os contadores.
- Getters para obter os totais (`getGasolina()`, `getAlcool()`, `getDisel()`).

---

## 🛠 Pré-requisitos
- **Java JDK 8+** (recomendado JDK 11 ou superior)
- Terminal para compilar e executar

Verifique sua instalação:
```bash
java -version
javac -version
```

---

## ▶️ Como compilar e executar
1. **Compile** os arquivos:
   ```bash
   javac Main.java Variaveis.java
   ```
2. **Execute** a aplicação:
   ```bash
   java Main
   ```

---

## 🧪 Exemplo de uso
Entrada (usuário):
```
Qual produto deseja colocar no seu carro: 
1.Álcool
2.Gasolina
3.Diesel
4.Fim
Digite um valor de entrada: 1
Digite uma opcao das opções do produto: 2
Digite uma opcao das opções do produto: 3
Digite uma opcao das opções do produto: 4
```

Saída esperada:
```
O cliente adquiriu alcool, cadastro feito  com sucesso!
O cliente adquiriu Gasolina, cadastro feito  com sucesso!
O cliente adquiriu Disel, cadastro feito  com sucesso!

Muito Obrigado !!!
Os produtos que o cliente adiquiriu: 
Alcool:1
Gasolina:1
Disel: 1
Muito obrigado por comprar na nossa loja, volte sempre!!
```

> Observação: as mensagens acima refletem o comportamento atual do seu código.

---

## ⚠️ Observações e melhorias sugeridas
- **Operador lógico**: troque `&` por `&&` no `while` (evita avaliação bit a bit).
  ```java
  while (opcao != 4 && opcao <= 4) { ... }
  ```
- **Validação de entrada**: tratar valores fora do intervalo (ex.: `<=0` ou `>4`) e mensagens claras.
- **Nomenclatura**: padronizar "Diesel" (em vez de "Disel"). Considere também renomear `Variaveis` para algo como `CarrinhoCombustiveis`.
- **Uso do parâmetro `valor`**: hoje os métodos `contagemX(int valor)` ignoram o parâmetro e apenas incrementam. Se o objetivo é somar múltiplas unidades de uma vez, utilize o parâmetro:
  ```java
  public void contagemGasolina(int valor) { gasolina += valor; }
  public void contagemAlcool(int valor)   { alcool   += valor; }
  public void contagemDisel(int valor)    { disel    += valor; }
  ```
- **Ortografia/mensagens**: corrigir pequenos erros ("adicquire" → "adquiriu"; "Digite uma opcao" → "Digite uma opção").
- **UX**: permitir sair digitando `4` a qualquer momento, e imprimir o menu novamente a cada iteração.
- **Relatório final**: alinhar e formatar a saída final.

---

## 🧩 Exemplo de código ajustado (opcional)
> Apenas como referência para clareza; adapte conforme sua necessidade.
```java
while (true) {
    System.out.println("\nEscolha uma opção: \n1. Álcool\n2. Gasolina\n3. Diesel\n4. Fim");
    System.out.print("Opção: ");
    if (!input.hasNextInt()) { break; }
    opcao = input.nextInt();

    switch (opcao) {
        case 1 -> { v.contagemAlcool(1); System.out.println("Álcool adicionado."); }
        case 2 -> { v.contagemGasolina(1); System.out.println("Gasolina adicionada."); }
        case 3 -> { v.contagemDisel(1); System.out.println("Diesel adicionado."); }
        case 4 -> { System.out.println("Encerrando..."); break; }
        default -> System.out.println("Opção inválida. Tente novamente.");
    }
    if (opcao == 4) break;
}
```

---

## 👤 Autor
- Pedro Henrique Alves Dos Santos

---

## 📄 Licença
Este projeto pode ser usado livremente para fins educacionais. Para publicar como software livre, considere adicionar uma licença como **MIT** ou **Apache-2.0**.
