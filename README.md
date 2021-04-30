# API-CRUD-PETSHOP

O QUE FOI USADO NO PROJETO:

Linguagem JAVA, Criação do projeto com Spring, usado Maven.

Dependências: LOMBOK e H2.

Server: TOMCAT.

Para Testar: POSTMAN.
___________________________________________________________________________________________________________________________________

DESCRIÇÃO DO OBJETO ANIMAL:

  Long id;

  String descricaoAnimal;
  
  +-------------------------------- CRIAÇÃO DAS CLASSES ENUM ------------------------------------------------------------+
  
  * CRIADAS SEPARADAMENTE*

  Enum grupoAnimais (TERRESTRE, AQUATICO, AEREO);

  Enum classeAnimais (MAMIFERO, REPTIL, AVE, ANFIBIO, PEIXE);
____________________________________________________________________________________________________________________________________

BAIXANDO O ARQUIVO API:

1º Passo: Faça o download do arquivo no Github.

2º Passo: Passe para a pasta de Documentos e extraia o ZIP na pasta.

____________________________________________________________________________________________________________________________________

ABRINDO O ARQUIVO NO INTELLIJ:

1º Passo:  Abra seu Intellij e clique no canto superior esquerdo "File", em seguida clique em "Open".

2º Passo: Vá para a pasta Documentos e encontre a pasta api e clique nela para selecionar, em seguida clique em OK.

____________________________________________________________________________________________________________________________________

INSTALANDO O POSTMAN NO PC:

1º Passo: Digite no google, download postman e baixe o Postman para PC(só assim ele testa LocalHost), depois de instalado, logue.
____________________________________________________________________________________________________________________________________

TESTANDO COM O POSTMAN:

1º Passo: Com o projeto aberto no INTELLIJ, clique em src -> java -> com.example.APICrudAnimais.api -> controller -> AnimaisController.

2º Passo: Abra ApiApplication em com.example.APICrudAnimais.api, e depois clique em Run(canto superior direito).

3º Passo: O INTELLIJ vai começar a contruir a API no seu PC, e em sequida o TOMCAT vai startar o server na porta 8080.

4º Passo: Após o TOMCAT estar rodando, entre no POSTMAN

5º Passo: Selecione POST e insira essa URL http://localhost:8080/animal

6º Passo: Copie e cole a linha de código em JSON abaixo.

OBS: Ao preencher o grupoAnimais e classeAnimais siga a nomenclatura em MAIÚSCULO e sem ASSENTUCAO, segue abaixo:


grupoAnimais (TERRESTRE, AQUATICO, AEREO);              
                                                           
classeAnimais (MAMIFERO, REPTIL, AVE, ANFIBIO, PEIXE); 


{
    "descricaoAnimal": "Cachorro",
    "grupoAnimais": "TERRESTRE",
    "classeAnimais": "MAMIFERO"
    
}

7º Passo: Clique em Send.

8º Passo: Após ir inserindo os animais, troque de POST para GET, e ai você vai puxar os animais que acabou de adicionar.
