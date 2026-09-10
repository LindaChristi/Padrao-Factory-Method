# Padrão Factory Method

Implementação do padrão de projeto criacional **Factory Method** em Java, desenvolvida para a disciplina de Padrões de Projeto.

## Sobre o projeto

Este projeto apresenta uma aplicação simples de envio e cancelamento de notificações, utilizando o padrão de projeto **Factory Method**.

O objetivo é demonstrar como uma classe Factory pode ser utilizada para criar diferentes tipos de objetos sem que a aplicação precise instanciar diretamente suas classes concretas.

O sistema possui três tipos de notificações válidas:

- E-mail
- SMS
- WhatsApp

Além dessas notificações, existe a classe `NotificacaoTikTok`, utilizada nos testes para representar uma notificação inválida, pois ela não implementa a interface `INotificacao`.

## Padrão Factory Method

Neste projeto, a interface `INotificacao` define os comportamentos que as notificações devem possuir:

```java
public interface INotificacao {
    String enviar();
    String cancelar();
}
````

A classe `NotificacaoFactory` é responsável por criar a notificação solicitada:

```java
INotificacao notificacao =
        NotificacaoFactory.obterNotificacao("Email");
```

A Factory identifica a classe correspondente ao tipo informado e retorna um objeto que implementa `INotificacao`.

Dessa forma, a aplicação não precisa criar diretamente as classes concretas. A criação dos objetos fica centralizada na `NotificacaoFactory`.

## Estrutura do projeto

```text
ExFactoryMethod
│
├── images
│   └── diagrama-factory-method.jpeg
│
├── src
│   │
│   ├── main
│   │   └── java
│   │       │
│   │       ├── Aplicacao.java
│   │       │
│   │       └── padroescriacao
│   │           └── factorymethod
│   │               ├── INotificacao.java
│   │               ├── NotificacaoFactory.java
│   │               ├── NotificacaoEmail.java
│   │               ├── NotificacaoSMS.java
│   │               ├── NotificacaoWhatsapp.java
│   │               └── NotificacaoTikTok.java
│   │
│   └── test
│       └── java
│           └── padroescriacao
│               └── factorymethod
│                   ├── NotificacaoFactoryTest.java
│                   ├── NotificacaoEmailTest.java
│                   ├── NotificacaoSMSTest.java
│                   └── NotificacaoWhatsappTest.java
│
├── .gitignore
├── pom.xml
└── README.md
```
## Casos de teste

O projeto utiliza **JUnit 5** para validar o funcionamento das classes e da Factory.

Foram implementados os seguintes testes:

### NotificacaoEmailTest

* Verifica o envio de e-mail.
* Verifica o cancelamento de e-mail.

### NotificacaoSMSTest

* Verifica o envio de SMS.
* Verifica o cancelamento de SMS.

### NotificacaoWhatsappTest

* Verifica o envio de WhatsApp.
* Verifica o cancelamento de WhatsApp.

### NotificacaoFactoryTest

* Verifica o tratamento de uma notificação inexistente.
* Verifica o tratamento de uma notificação inválida.

## Diagrama de Classes

O diagrama de classes do projeto está disponível no diretório:

```text
images/diagrama-factory-method.jpeg
```

O diagrama apresenta a interface `INotificacao`, suas implementações, a `NotificacaoFactory`, além das classes utilizadas no processo de criação e tratamento de exceções.

## Como executar

### Pré-requisitos

É necessário possuir instalado:

* Java 21
* Maven
* IntelliJ IDEA

### Executando a aplicação

Abra o projeto no IntelliJ IDEA e execute a classe `Aplicacao.java`.

### Executando os testes

Os testes podem ser executados diretamente pelo IntelliJ IDEA ou através do Maven:

```bash
mvn test
```

## Objetivo acadêmico

Este projeto foi desenvolvido individualmente com o objetivo de demonstrar a utilização prática do padrão de projeto **Factory Method**, incluindo:

* Código-fonte;
* Aplicação utilizando o padrão;
* Casos de teste;
* Diagrama de classes.


Projeto desenvolvido individualmente para a disciplina de Padrões de Projeto.
