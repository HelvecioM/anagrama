# Programa para Geração dos Anagramas Possíveis
Descrição do Projeto
O programa tem como objetivo gerar todos os anagramas possíveis a partir de um determinado grupo de letras distintas. Por exemplo, se a entrada for {a, b, c}, o programa deverá retornar a saída: abc, acb, bac, bca, cab, cba.

#Estrutura Básica do Programa
O programa foi estruturado em três classes principais:

##Classe Anagrama: Contém o método main, que gerencia a execução do código e a entrada dos dados pelo usuário.

Classe AnagramaGerador: Nesta classe, são realizadas as validações para garantir que a entrada contenha apenas letras, sem espaços ou caracteres inválidos. Também é responsável pela lógica de geração das combinações (anagramas).

Classe AnagramaTest: Contém os testes unitários do programa, para garantir que as funcionalidades do código funcionem corretamente.

#Lógica Implementada
Após a entrada dos dados pelo usuário utilizando a classe Scanner do Java, a classe AnagramaGerador valida o grupo de letras digitados para garantir que atendem aos requisitos (sem espaço, somente letras). Depois, o programa gera as combinações possíveis, ou seja, os anagramas.

#Detalhes da Geração dos Anagramas
A lógica para gerar os anagramas utiliza recursão. Quando a string str ficar vazia (ou seja, quando não houver mais caracteres para combinar), o processo de recursão é interrompido e o anagrama gerado até esse ponto é adicionado à lista de resultados.

Para gerar os anagramas, a recursão é feita da seguinte forma:

for (int i = 0; i < str.length(); i++) {
    // Geração de anagramas recursivamente
}

Este loop percorre cada caractere da string str. Cada vez que um caractere é escolhido, ele é removido da string, e o próximo anagrama é gerado recursivamente.

#Prevenção de Anagramas Duplicados
Para evitar a criação de anagramas duplicados, é implementada a seguinte validação:

if (i > 0 && str.charAt(i) == str.charAt(i - 1)) {
    continue;
}

Este código verifica se o caractere atual (str.charAt(i)) é igual ao caractere anterior (str.charAt(i - 1)). Se for, a iteração é ignorada (usando continue), o que impede a recursão com o mesmo caractere repetido e evita anagramas idênticos.

#Geração dos Anagramas
A chamada recursiva para gerar os anagramas ocorre da seguinte forma:

gerarAnagramas(str.substring(0, i) + str.substring(i + 1), anagrama + str.charAt(i), anagramasGerados);
str.substring(0, i) + str.substring(i + 1) cria uma nova string sem o caractere i, removendo-o.
anagrama + str.charAt(i) adiciona o caractere atual ao final da string do anagrama.
Este processo é repetido até que a string str seja completamente reduzida, ou seja, quando str.length() se torna zero. Nesse ponto, o anagrama completo é gerado e adicionado à lista de resultados.

#Fluxo do Programa Passo a Passo
Imaginando a entrada "abc", a execução do programa seria algo como:

Inicialmente, anagrama = "" e str = "abc".

A função começa a percorrer a string:

Para i = 0, escolhe o caractere 'a' e faz uma chamada recursiva com str = "bc" e anagrama = "a".

Para i = 1, escolhe o caractere 'b' e faz uma chamada recursiva com str = "ac" e anagrama = "b".

Para i = 2, escolhe o caractere 'c' e faz uma chamada recursiva com str = "ab" e anagrama = "c".

A cada chamada recursiva, a função continua escolhendo caracteres e formando novas combinações. 

Quando a string str se esvazia (ou seja, quando str.length() é zero), o anagrama completo é gerado e adicionado à lista.


#Exemplo de Execução
Entrada: "abc"

Saída:
abc
acb
bac
bca
cab
cba

#Requisitos
Java 8 ou superior.
Ambiente configurado para compilar e executar programas em Java.

#Como Rodar
Clone o repositório:

git clone https://github.com/HelvecioM/anagrama.git
Compile o programa:

javac Anagrama.java AnagramaGerador.java AnagramaTest.java
Execute o programa:

java Anagrama

#Testes
A classe AnagramaTest contém os testes unitários para validar o funcionamento do programa. Ela pode ser executada com qualquer framework de testes Java, como JUnit.
