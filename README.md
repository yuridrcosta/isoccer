
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
	 -  Vantagens: Manutenção mais fácil após código ter sido desenvolvido com essa classe preparada.
	 - Desvantagens: Se não for preciso futuramente colocar métodos específicos de um advogado, a classe não tem diferença da classe Employee.<br/>
