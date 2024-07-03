FROM mysql:5.7
LABEL maintainer="lgcosta"

# Copia o arquivo SQL de inicialização para o diretório padrão do MySQL
COPY ./init.sql /docker-entrypoint-initdb.d/

# Define variáveis de ambiente para configurar o MySQL
ENV MYSQL_ROOT_PASSWORD=senha_root
ENV MYSQL_DATABASE=nome_do_banco
ENV MYSQL_USER=usuario
ENV MYSQL_PASSWORD=senha_usuario

# Expor a porta 3306 para conexões externas
EXPOSE 3306

# Comando padrão para iniciar o MySQL
CMD ["mysqld"]
