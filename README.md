Este projeto em Java implementa um módulo contábil para o cálculo de diferentes impostos aplicáveis a vendas de produtos. Desenvolvido no NetBeans, o sistema utiliza uma hierarquia de classes e interfaces para representar impostos, permitindo fácil extensão e manutenção.

Características
Interface Imposto: Define os métodos calcularImposto e getDescricao para uniformizar o cálculo e a descrição dos impostos;
Classes PIS e IPI: Implementam a interface Imposto e contêm a lógica específica para o cálculo de cada tipo de imposto;
PIS: Calcula o imposto com base nos valores de débito e crédito da empresa;
IPI: Calcula o imposto com base no valor do produto, frete, seguro, outras despesas e uma alíquota percentual;
Classe Pagamento: Armazena o nome da empresa e uma lista de impostos a serem pagos. Fornece métodos para adicionar impostos e exibir os detalhes dos impostos cadastrados;
Interatividade: Através de um método main, o sistema permite que o usuário informe dados da empresa e cadastre múltiplos impostos de forma consecutiva. O usuário pode encerrar o cadastro digitando "pare".

Funcionalidades
Cadastro interativo de impostos com entrada de dados via console;
Cálculo e exibição dos valores de impostos cadastrados;
Extensibilidade para incluir novos tipos de impostos no futuro.
