# API_RESTful_Java
API RESTful que nos permite gerenciar as informações das propriedades dos países (identificador – gerado automaticamente, nome, capital, região, sub-região, área).

### Ferramentas Usadas
Intellij Community Edition 2020.2.1
MySQL Server 5.5
PostMan

### Descrição
O desafio foi resolvido usando o Spring Boot com as seguintes depedências:
- Lombok,
- Spring Data JPA,
- Spring Web e 
- MySQL Driver.

No arquivo main encontramos os seguintes pacotes, classes e interfaces:
- Pacote Entity: disponibiliza a classe Pais com os todos os atributos possiveis para a auto - criação da tabela na base de dados indicada, dentro da classe podemos encontrar um construtor primario, secundario e metodos getters e setters dos atributos para classe Pais;
- Pacote Service: responsavel pela lógica de manipulação dos dados fornecidos e requisitados atraves da aplicação Postman, essa logica contem os metodos de inserão de um pais, inserção de uma lista de paises, actualização, recuperação, e remoção;
- Pacote Controller: com uma classe que fornece as urls implementadas para a manipulação dos dados dos paises atraves dos metodos existentes no pacote service. Essas urls pode ser acessadas a partir do Past para as diversas funcionalidades descritas para a gestão dos dados referentes a cada ou varios paises;
- Pacote Repository: é uma interface extendida a biblioteca JpaRepository para a ordenação dos paises e dentro dessa interface encontra-se o metodo para localizar um pais atraves do nome, metodo esse inserido manualmente.

### Execuntando localmente
Antes de execuntar a aplicação, crie uma base de dados (MySQL Server) com um nome a sua escolha e vincule a mesma atraves do fciheiro (application.properties) localizada dentro do pacote resources.

### Faça as seguintes edições no ficheiro (application.properties):
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/NOME_DA_SUA_BASE_DE_DADOS
spring.datasource.username = NOME_DO_USUARIO_D_BD
spring.datasource.password = SENHA_DA_BD
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
server.port=9191 DEFINA UMA PORTA A SUA ESCOLHA PARA QUE PODER RECEBER E ENVIAR SOLICITAÇÕES

### Apos as alterações
Execute a aplicação, abra a aplicação Postman e digite o endereço que corresponde a sua porta de entra e saida de dados. Por exemplo: "http://localhost:9191/countries"

### Links
- http://localhost:9191/countries - Listagem dos paises existentes na bd;
- http://localhost:9191/update - Actualização dos dados de um pais;
- http://localhost:9191/delete/id - Remoção de um pais atraves do ID;
- http://localhost:9191/addCountry - Adicionar um pais;
- http://localhost:9191/addCountries - Adicionar uma lista de paises,
- http://localhost:9191/countryById/id - Localizar um pais pelo seu ID;
- http://localhost:9191/country/Mozambique - Localizar um pais pelo seu nome
