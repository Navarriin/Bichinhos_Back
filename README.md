# Exercícios de Back End

## Lista 1 (Logica)

1. **Logica e algoritmo puro**
   - **Descrição:**  Entender o desenvolvimento das habilidades de lógica e algoritmo utilizando Java.
   - **Objetivo:**
     - Ordenação de dados: Receber uma lista de numeros e a retornar de forma organizada.
   - **Metodos:**
      - `receivingListOfNumbersAndConvert()` - Método onde recebe a string do usuário com os números separados por ",", o salva em um array de strings e o converte para um array de numeros inteiros, retornando o mesmo.
      - `sortedListAndPrint(List<Integer> numbers)` - Método que recebe a lista que o método anterior retorna, a ordena de forma crescende(do menor para o maior) e printa os números do array separados por "," para o usuário. 

## Lista 2 (Interfaces)

1. **Classe CurrencyConverter:**
   - **Descrição:** Implementa a interface `FinancialConverter`.
   - **Métodos:**
     - `convertDollarToReal(double dollarValue)` - Converte um valor de dólar para real.
     - `convertRealToDollar(double realValue)` - Converte um valor de real para dólar.
   - **Detalhes:** O método deve receber o valor como parâmetro e utilizar a taxa de câmbio atual para realizar a conversão.

2. **Classe RectangularRoomCalculator:**
   - **Descrição:** Implementa a interface `GeometricCalculation`.
   - **Métodos:**
     - `calculateArea(double height, double width)` - Calcula a área de uma sala retangular.
     - `calculatePerimeter(double height, double width)` - Calcula o perímetro de uma sala retangular.

3. **Classe MultiplicationTable:**
   - **Descrição:** Implementa a interface `MultiplicationTable`.
   - **Método:**
     - `showMultiplicationTable(int numero)` - Exibe a tabuada de um número.
   - **Detalhes:** O método deve mostrar a tabuada do número de 1 a 10.

4. **Interface ConversorTemperatura:**
   - **Descrição:** Define métodos para conversão de temperatura.
   - **Métodos:**
     - `celsiusToFahrenheit(double celsius)` - Converte Celsius para Fahrenheit.
     - `fahrenheitToCelsius(double fahrenheit)` - Converte Fahrenheit para Celsius.

5. **Interface Calculable:**
   - **Descrição:** Define o método `calculateFinalPrice()` para calcular o preço final de um produto ou serviço.

6. **Classe Books (Implementa Calculable):**
   - **Descrição:** Representa um livro com atributos como preço base e desconto.
   - **Método:**
     - `calculateFinalPrice()` - Calcula o preço final do livro considerando o desconto.

7. **Classe Product (Implementa Calculable):**
   - **Descrição:** Representa um produto físico com atributos como preço base, custo de envio e taxa de imposto.
   - **Método:**
     - `calculateFinalPrice()` - Calcula o preço final do produto físico considerando envio e imposto.

8. **Interface Salable:**
   - **Descrição:** Define métodos para produtos ou serviços vendáveis.
   - **Métodos:**
     - `calculateTheFinalPrice(int quantity)` - Calcula o preço total de um produto ou serviço com base na quantidade.
     - `applyDiscount(double discount)` - Aplica um desconto no preço total.
9. **Classe Produto (Implementa Vendavel):**
    - **Descrição:** Representa um produto com atributos como preço unitário e quantidade em estoque.
    - **Métodos:**
      - `calculateTheFinalPrice(int quantity)` - Verifica se a quantidade está disponível em estoque e retorna o preço total.
      - `applyDiscount(double discount)` - Aplica o desconto no preço unitário.

10. **Classe Servico (Implementa Vendavel):**
    - **Descrição:** Representa um serviço com atributos como preço por hora e horas de trabalho.
    - **Métodos:**
      - `calculateTheFinalPrice(int quantity)` - Calcula o preço total com base nas horas de trabalho.
      - `applyDiscount(double discount)` - Aplica o desconto no preço por hora.

