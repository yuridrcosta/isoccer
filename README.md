## Funcionalidades:
 1. **Gerenciar funcionários:**<br/>
				 - Adicionar funcionários<br/>
				 - Remover funcionário<br/>
				 - Buscar dados de um funcionário<br/>
				 - Alterar status de saúde de um jogador<br/>
				 - Editar dados de um funcionário (a ser implementado)<br/>
			
 2. **Gerenciar recursos fisicos:**<br/>
		 - Adicionar estádio<br/>
		 - Adicionar centro de treinamento<br/>
		 - Adicionar ônibus<br/>
		 - Verificar dados de recursos<br/>
		 - Aumentar capacidade de estádio<br/>
		 - Aumentar número de lanchonetes no estádio<br/>
		 - Aumentar número de banheiros no estádio<br/>
		 - Alterar status de disponibilidade de um recurso<br/>
 3. **Gerenciar sócios-torcedores:**<br/>
		 - Adicionar sócio-torcedor<br/>
		 - Buscar dados de sócio-torcedor<br/>
		 - Alterar status de adimplência de sócio-torcedor<br/>
		 - Editar dados de sócio-torcedor (a ser implementado) <br/>
 4. **Relatórios**<br/>
		 - Gerar relatório geral<br/>
		 - Gerar relatório sobre os funcionários<br/>
		 - Gerar relatório sobre os recursos<br/>
		 - Gerar relatório sobre os torcedores<br/>

 

## Classes

 1. **Person**<br/>
	 - Motivação: Todas as pessoas tem dados em comum, independente do tipo de funcionário ou se é um sócio-torcedor.<br/>
	 - Vantagens: Grande número de métodos não precisam ser reescritos.<br/>
	 -  Desvantagens: Maior dificuldade de lidar com a grande quantidade de subclasses, como por exemplo, para receber objetos, passar objetos entre os métodos.<br/>
 2. **Employee** - Subclasse de Person<br/>
	-  Motivação: Todos os funcionários tem dados em comum, que sócios-torcedores não tem, como por exemplo, salário.<br/>
	-  Vantagens: Facilidade em alterar salários em todos os funcionários, sem precisar reescrever funções.<br/>
	- Desvantagens: Semelhante as desvantagens da classe Person.<br/>
 3. **Partner** - Subclasse de Person<br/>
	 - Motivaçao: Apenas sócios-torcedores realizam contribuição e tem um determinado tipo de sócio-torcedor.<br/>
	 - Vantagens: Métodos que só fazem sentido para objetos dessa classe só funcionam para essa classe.<br/>
 4. **Player** - Subclasse de Employee<br/>
	-  Motivação: Somente jogadores tem uma posição em campo e um status de saúde.<br/>
	- Vantagens: Métodos que só fazem sentido para objetos dessa classe só funcionam para essa classe.<br/>
 5. **Cooker** - Subclasse de Employee<br/>
	 - Motivação: Caso seja necessário adicionar mais dados sobre os cozinheiros e funções específicas, a classe está criada.<br/>
	 -  Vantagens: Manutenção mais fácil após código ter sido desenvolvido com essa classe preparada.
	 - Desvantagens: Se não for preciso futuramente colocar métodos específicos de um cozinheiro, a classe não tem diferença da classe Employee.<br/>
 6. **Coach** - Subclasse de Employee<br/>
	- Motivação: Caso seja necessário adicionar mais dados sobre os treinadores e funções específicas, a classe está criada.<br/>
	-   Vantagens: Manutenção mais fácil após código ter sido desenvolvido com essa classe preparada, pode por exemplo, adicionar agora dados sobre o estilo de jogo do treinador.<br/>
	 - Desvantagens: Se não for preciso futuramente colocar métodos específicos de um treinador, a classe não tem diferença da classe Employee.<br/>
 7. **Doctor** - Subclasse de Employee<br/>
	- Motivação: Necessário por dados específicos referentes a classe.<br/>
	- Vantagens: Receber dados do CRM e novos métodos<br/>
 8. **Driver** - Subclasse de Employee<br/>
	  - Motivação: Caso seja necessário adicionar mais dados sobre os motoristas e funções específicas, a classe está criada.<br/>
	 -  Vantagens: Manutenção mais fácil após código ter sido desenvolvido com essa classe preparada.<br/>
	 - Desvantagens: Se não for preciso futuramente colocar métodos específicos de um motorista, a classe não tem diferença da classe Employee.<br/>
 9. **Lawyer** - Subclasse de Employee
	 - Motivação: Caso seja necessário adicionar mais dados sobre os advogados e funções específicas, a classe está criada.<br/>
	 -  Vantagens: Manutenção mais fácil após código ter sido desenvolvido com essa classe preparada.<br/>
	 - Desvantagens: Se não for preciso futuramente colocar métodos específicos de um advogado, a classe não tem diferença da classe Employee.<br/>
 10. **PersonalTrainer** - Subclasse de Employee<br/>
	 -  Motivação: Caso seja necessário adicionar mais dados sobre os preparadores físicos e funções específicas, a classe está criada.<br/>
	 -  Vantagens: Manutenção mais fácil após código ter sido desenvolvido com essa classe preparada.<br/>
	 - Desvantagens: Se não for preciso futuramente colocar métodos específicos de um preparador físico, a classe não tem diferença da classe Employee.<br/>
 11. **President** - Subclasse de Employee<br/>
	 -  Vantagens: Manutenção mais fácil após código ter sido desenvolvido com essa classe preparada.<br/>
	 - Desvantagens: Se não for preciso futuramente colocar métodos específicos de um preparador físico, a classe não tem diferença da classe Employee.<br/>
 12. **Bus**<br/>
		- Motivação: Necessidade de registrar a disponibilidade do ônibus.<br/>
		- Vantagens: Futuramente pode-se acrescentar mais dados sobre os ônibus.<br/>
 13. **Stadium**
		- Motivação: Registrar dados de capacidade, número de banheiros, número de lanchonetes.<br/>
		- Vantagens: Funções específicas para lidar com esses dados, facilidade em acrescentar novas funções e informações.<br/>
 14. **TrainingCenter**
		- Motivação: Registrar quantidade de dormitórios de cada CT.<br/>
		- Vantagens: Funções específicas para lidar com esses dados, facilidade em acrescentar novas funções e informações.<br/>

**Sugestão de Upgrade**: Criação da classe **Utility**, para conter métodos buscadores, listadores, tratamento de exceções e menus. **(Breve)**<br/>

## Distribuição de Métodos

 1. **Métodos buscadores e de listagem:**<br/>
- findEmployee(), findPlayer(), findPartner(), findStadium(), findBus(), findTrainingCenter(), listBuses(), listEmployees(), listPlayers(), listTrainingCenters(), listStadiums(), listPartners().<br/><br/>
	- Motivação: Buscam/listam objetos de cada classe. Foram colocados todos na classe principal devido a localização dos ArrayLists de registro, como por exemplo o ArrayList de registro de todos os empregados.<br/>
	- Vantagens: Não é necessário passar os registros (ArrayLists) como parâmetros.<br/>
	- Desvantagens: Grandes responsáveis pela geração de uma classe enorme que guarda a maioria dos métodos podendo gerar dificuldades na manutenção.<br/>
 2. **verifyAvailability()**<br/>
	- Motivação: O método verifica se um determinado recurso físico está disponível. Colocado na classe principal devido aos registros (ArrayLists) estarem nessa classe.<br/>
	- Vantagens: É uma funcionalidade principal do sistema, colocar em outras classes traria dificuldades não necessárias.<br/>
3. **Métodos gerenciadores de menu:**<br/>
- manageResources(), managePartners(), reports(), mainMenu(), manageEmployees().<br/><br/>
	- Motivação: Função que irá apresentar o menu de opções para os recursos e direcionar ao método que faz o que a opção escolhida no menu deve fazer.<br/>
	- Vantagens: Estão localizados na classe principal pois são métodos de gerenciamento do sistema, não utilitários opcionais.<br/>
4. **showLogin()**<br/>
	- Motivação: Este método gera o sistema de login inicial, verificando se usuário e senha estão corretos.<br/>
	- Vantagens: Está localizado na classe principal pois é o primeiro método a ser chamado pelo método main.<br/>
5. **changeCompliance()**<br/>
	- Motivação: Este método altera o status de adimplência de um sócio-torcedor a ser buscado pelo nome.<br/>
	- Solução: Como o método não só busca nos registros, como obtém o nome do sócio-torcedor, colocamos na classe principal.<br/>
	- Vantagens: Facilidade no acesso aos registros (ArrayLists), sem a necessidade de passar como parâmetro.<br/>
6. **changeHealthyStatus()**<br/>
	- Motivação: Este método altera o status de saúde de um jogador a ser buscado pelo nome.<br/>
	- Solução: Como o método não só busca nos registros, como obtém o nome do jogador, colocamos na classe principal.<br/>
	- Vantagens: Facilidade no acesso aos registros (ArrayLists), sem a necessidade de passar como parâmetro.<br/>
7. **readNumber()**<br/>
	- Motivação: Função que lê inteiros com tratamento de exceções.<br/>
	- Vantagens: Caso seja necessário alterar o que é feito após capturar uma exceção ao ler inteiros, ao alterar este método, toda a leitura de inteiros do sistema está atualizada.<br/>
8. **readFloat()**<br/>
	- Motivação: Função que lê números reais (floats) com tratamento de exceções.<br/>
	- Vantagens: Caso seja necessário alterar o que é feito após capturar uma exceção ao ler floats, ao alterar este método, toda a leitura de floats do sistema está atualizada. 
 

## Herança

- Motivação: Muitas classes tinham dados em comum e o sistema poderia ser expandido gerando mais classes com esses dados em comum e especificidades. Poderia ser necessário também que cada classe tivesse seu método exclusivo, que só fizesse sentido, como getCrm faz sentido para um médico, mas não para um treinador.
- Solução: Criação da classe Person, superclasses para todas as classes que são referentes a pessoas, contendo dados básicos como nome, email, cpf e telefone. Após isso, a classe se divide em duas, para sócios-torcedores e empregados, sabendo que as únicas características em comum deles são as que estão presentes na classe Person. A classe Employee contém ainda outras subclasses, com cada tipo de empregado. 
- Vantagens: As especificidades de cada função estão respeitadas. Se um dado só faz sentido para um tipo de funcionário, ou pessoa, só objetos dessa classe terão esse método. Apesar de algumas classes não estarem sendo bem utilizadas, caso venha a ser necessário, o sistema está pronto para receber novas funcionalidades.
- Desvantagem: Algumas classes não estão sendo bem utilizadas no momentos.

## Tratamento de Exceções
- Motivação: Erros de digitação podem acontecer e o sistema precisa deixar claro qual foi o erro ocorrido, sem necessidade de conhecimento técnico de computação.
- Solução: Métodos para os tipos de exceções possíveis. (readNumber() e readFloat())
- Vantagens: Utilizando métodos, caso seja necessário alterar o que é feito após capturar uma exceção ao ler inteiros, ao alterar este método, toda a leitura de inteiros do sistema está atualizada.
