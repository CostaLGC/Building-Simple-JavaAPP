### Java MySQL Docker Example
Este projeto é um exemplo simples de uma aplicação Java que consulta um banco de dados MySQL em um contêiner Docker. Foi desenvolvido como parte do projeto voluntário de mentoria da Escola da Nuvem.

## Como Usar  
**Pré-requisitos**  
- Docker instalado e configurado no ambiente de desenvolvimento (Em breve será disponibilidazado um manfiesto Terraform p/ AWS provisionando esta infraestrutura)  
- Maven instalado para compilar e executar o projeto Java


**Configuração**  
- Clone este repositório:  


```
git clone https://github.com/seu-usuario/java-mysql-docker-example.git  
cd java-mysql-docker-example
```  

**Compile o projeto:**  

```
mvn compile
```
**Execute o projeto:**

```
mvn exec:java -Dexec.mainClass="com.exemplo.MySQLExample"  
```

**Detalhes do Projeto**  

- **MySQLExample.java:** Contém o código-fonte Java que realiza a conexão com o banco de dados MySQL dentro do contêiner Docker.  
- **pom.xml:** Arquivo de configuração do Maven que gerencia as dependências do projeto.  




**Contribuições**
Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar pull requests com melhorias.

**Contato**
Para mais informações, entre em contato com lg2costa@gmail.com.
