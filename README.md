# Exercícios de Back End

## Lista 1

1. **Logica e algoritmo puro**
   - **Descrição:**  Entender o desenvolvimento das habilidades de lógica e algoritmo utilizando Java.
   - **Objetivo:**
     - Ordenação de dados: Receber uma lista de numeros e a retornar de forma organizada.
   - **Metodos:**
      - `receivingListOfNumbersAndConvert()` - Método onde recebe a string do usuário com os números separados por ",", o salva em um array de strings e o converte para um array de numeros inteiros, retornando o mesmo.
      - `sortedListAndPrint(List<Integer> numbers)` - Método que recebe a lista que o método anterior retorna, a ordena de forma crescende(do menor para o maior) e printa os números do array separados por "," para o usuário. 

## Lista 2

1. **Classe ConversorMoeda:**
   - **Descrição:** Implementa a interface `ConversaoFinanceira`.
   - **Métodos:**
     - `converterDolarParaReal(double valorDolar)` - Converte um valor em dólar para real.
   - **Detalhes:** O método deve receber o valor em dólar como parâmetro e utilizar a taxa de câmbio atual para realizar a conversão.

2. **Classe CalculadoraSalaRetangular:**
   - **Descrição:** Implementa a interface `CalculoGeometrico`.
   - **Métodos:**
     - `calcularArea(double altura, double largura)` - Calcula a área de uma sala retangular.
     - `calcularPerimetro(double altura, double largura)` - Calcula o perímetro de uma sala retangular.

3. **Classe TabuadaMultiplicacao:**
   - **Descrição:** Implementa a interface `Tabuada`.
   - **Método:**
     - `mostrarTabuada(int numero)` - Exibe a tabuada de um número.
   - **Detalhes:** O método deve mostrar a tabuada do número de 1 a 10.

4. **Interface ConversorTemperatura:**
   - **Descrição:** Define métodos para conversão de temperatura.
   - **Métodos:**
     - `celsiusParaFahrenheit(double celsius)` - Converte Celsius para Fahrenheit.
     - `fahrenheitParaCelsius(double fahrenheit)` - Converte Fahrenheit para Celsius.

5. **Classe ConversorTemperaturaPadrao:**
   - **Descrição:** Implementa a interface `ConversorTemperatura`.
   - **Detalhes:** Fornece as implementações para os métodos de conversão de temperatura utilizando as fórmulas padrão.

6. **Interface Calculavel:**
   - **Descrição:** Define o método `calcularPrecoFinal()` para calcular o preço final de um produto ou serviço.

7. **Classe Livro (Implementa Calculavel):**
   - **Descrição:** Representa um livro com atributos como preço base e desconto.
   - **Método:**
     - `calcularPrecoFinal()` - Calcula o preço final do livro considerando o desconto.

8. **Classe ProdutoFisico (Implementa Calculavel):**
   - **Descrição:** Representa um produto físico com atributos como preço base, custo de envio e taxa de imposto.
   - **Método:**
     - `calcularPrecoFinal()` - Calcula o preço final do produto físico considerando envio e imposto.

9. **Interface Vendavel:**
   - **Descrição:** Define métodos para produtos ou serviços vendáveis.
   - **Métodos:**
     - `calcularPrecoTotal(int quantidade)` - Calcula o preço total de um produto ou serviço com base na quantidade.
     - `aplicarDesconto(double desconto)` - Aplica um desconto no preço total.

10. **Classe Produto (Implementa Vendavel):**
    - **Descrição:** Representa um produto com atributos como preço unitário e quantidade em estoque.
    - **Métodos:**
      - `calcularPrecoTotal(int quantidade)` - Verifica se a quantidade está disponível em estoque e retorna o preço total.
      - `aplicarDesconto(double desconto)` - Aplica o desconto no preço unitário.

11. **Classe Servico (Implementa Vendavel):**
    - **Descrição:** Representa um serviço com atributos como preço por hora e horas de trabalho.
    - **Métodos:**
      - `calcularPrecoTotal(int quantidade)` - Calcula o preço total com base nas horas de trabalho.
      - `aplicarDesconto(double desconto)` - Aplica o desconto no preço por hora.

