#Documentação

##Estrutura de Código Entidades (Modelos):

###Eu defini entidades Carro, Marca e Modelo utilizando anotações JPA (@Entity, @Id, @GeneratedValue, etc.) para mapeamento objeto-relacional. Isso facilita a persistência de objetos Java em banco de dados relacionais. Repositórios:

###Utilização de interfaces de repositório (CarroRepository, ModeloRepository, MarcaRepository) que estendem JpaRepository. Isso aproveita o poder do Spring Data JPA para operações de persistência CRUD básicas e consultas personalizadas. Serviços:

###Os serviços (CarroService, ModeloService, MarcaService) encapsulam a lógica de negócios e orquestram as operações entre os controladores e os repositórios. Isso promove a separação de preocupações e facilita a reutilização de código. Controladores (Controllers):

###Os controladores (CarroController, ModeloController, MarcaController) são responsáveis por receber requisições HTTP, chamar os métodos apropriados nos serviços e retornar respostas HTTP. Aqui eu gerenciei as operações de CRUD e qualquer lógica adicional necessária para lidar com requisições. Tratamento de Erros:

###Tratamento de exceções (@ExceptionHandler, exceções personalizadas) para lidar com erros de forma controlada e retornar respostas HTTP adequadas (como o exemplo de RuntimeException para marca não encontrada). Integração com Banco de Dados:

###Uso de Hibernate com JPA para mapear entidades Java para tabelas no banco de dados. Configurações de chave estrangeira (@ManyToOne, @OneToMany) são utilizadas para definir relacionamentos entre entidades. Decisões Tomadas Spring Boot: Utilização do Spring Boot para facilitar a configuração e o desenvolvimento de aplicações Java, com configuração automática e dependências simplificadas.

###JPA e Hibernate: Escolha do Spring Data JPA com Hibernate como provedor JPA padrão, aproveitando a abstração de banco de dados e mapeamento objeto-relacional.

###Arquitetura MVC: Adoção do padrão de arquitetura MVC (Model-View-Controller) para separar responsabilidades entre lógica de negócios (serviços), apresentação (controladores) e dados (entidades, repositórios).

###Gerenciamento Transacional: Uso de transações declarativas (@Transactional) para garantir atomicidade nas operações de banco de dados, mantendo a integridade dos dados.

###Padrões de Nomenclatura: Utilização de padrões de nomenclatura simples e significativos para classes, métodos e variáveis, facilitando a manutenção e compreensão do código por outros desenvolvedores.

##Todos os endpoints disponiveis! 

![image](https://github.com/gdssvpp/WSWork---Java/assets/92610124/db859a69-b161-4168-a2d9-c6af475cceff)
