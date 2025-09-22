# 🌐 Sistemas Distribuídos

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-007396?style=for-the-badge&logo=java&logoColor=white)
![Socket](https://img.shields.io/badge/Socket-Programming-blue?style=for-the-badge)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)

</div>

Repositório contendo implementações práticas de conceitos fundamentais de **Sistemas Distribuídos**, desenvolvidas durante o curso da disciplina. Os projetos abordam desde conceitos básicos de comunicação em rede até implementações avançadas de sincronização e coordenação distribuída.

## 📚 Conteúdo Teórico

### 📖 [Aula 05 - Relógios Físicos e Lógicos, Exclusão Mútua e Eleição](./Aula%2005%20-%20Relógios%20Físicos%20e%20Lógicos.%20Exclusão%20Mútua%20e%20Eleição.md)

Material teórico abordando:

- **Relógios Físicos**: Sincronização baseada em hardware
- **Relógios Lógicos**: Ordenação de eventos por causalidade (Lamport Timestamps)
- **Exclusão Mútua**: Controle de acesso a recursos críticos
- **Algoritmos de Eleição**: Coordenação em sistemas distribuídos

## 🚀 Projetos Práticos

### 1. 💬 **Sockets com Interface Swing** - `3.1-Sockets_Swing/`

Sistema de comunicação cliente-servidor utilizando sockets TCP com interface gráfica.

**Características:**

- Interface gráfica desenvolvida em Java Swing
- Comunicação bidirecional em tempo real
- Arquitetura cliente-servidor robusta
- Tratamento de conexões múltiplas

**Arquivos principais:**

- `JFrameServidor.java` - Interface e lógica do servidor
- `JFrameCliente.java` - Interface e lógica do cliente

### 2. 📧 **Gerador de Email** - `GerarEmail/`

Sistema distribuído para geração e validação de endereços de email.

**Características:**

- Servidor TCP para processamento de requisições
- Validação de dados pessoais
- Geração automática de emails corporativos
- Interface gráfica para interação

**Arquivos principais:**

- `ServidorTCPBasico.java` - Servidor de processamento
- `ClienteTCPBasico.java` - Cliente de requisições
- `ServidorTCPInterface.java` - Interface gráfica do servidor
- `Pessoa.java` - Modelo de dados

### 3. 🎮 **Jogo Frutinha** - `jogo-frutinha/`

Jogo interativo demonstrando conceitos de programação distribuída com interface gráfica.

**Características:**

- Interface gráfica em Java Swing
- Sistema de movimentação em tempo real
- Demonstração de threads e concorrência
- Experiência de usuário fluida

**Arquivos principais:**

- `JFrame_Principal.java` - Interface principal do jogo
- `Movimenta.java` - Lógica de movimentação

### 4. 💻 **Mini Chat** - `minichat/`

Sistema de chat distribuído demonstrando comunicação em tempo real.

**Características:**

- Chat em tempo real via sockets
- Interface gráfica intuitiva
- Arquitetura cliente-servidor
- Sincronização de mensagens

**Arquivos principais:**

- `MiniChatServer.java` - Servidor de chat
- `MiniChatCliente.java` - Cliente de chat
- `ChatFrame.java` - Interface gráfica

### 5. 📝 **Atividade Acadêmica** - `Atividade- Thiago Marzari - Gabriel Pinheiro/`

Projeto colaborativo demonstrando implementações específicas da disciplina.

**Características:**

- Implementação de algoritmos distribuídos
- População e manipulação de estruturas de dados
- Demonstração de conceitos teóricos

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java (JDK 8+)
- **IDE**: NetBeans
- **Interface Gráfica**: Java Swing
- **Comunicação**: Sockets TCP/IP
- **Serialização**: ObjectInputStream/ObjectOutputStream
- **Build**: Apache Ant (build.xml)

## 📋 Pré-requisitos

- **Java Development Kit (JDK)** 8 ou superior
- **NetBeans IDE** (recomendado)
- **Sistema Operacional**: Windows, Linux ou macOS

## 🚀 Como Executar

### Usando NetBeans:

1. Abra o NetBeans IDE
2. Selecione `File > Open Project`
3. Navegue até a pasta do projeto desejado
4. Clique em `Run` ou pressione `F6`

### Via Terminal:

```bash
# Navegue até a pasta do projeto
cd nome-do-projeto

# Compile o projeto
javac -cp . src/*.java

# Execute a classe principal
java -cp . NomeDaClassePrincipal
```

## 📖 Conceitos Implementados

### 🔄 Comunicação Distribuída

- **Sockets TCP/IP**: Comunicação confiável entre processos
- **Serialização de Objetos**: Transmissão de dados complexos
- **Modelo Cliente-Servidor**: Arquitetura fundamental

### ⏰ Sincronização

- **Threads**: Programação concorrente
- **Exclusão Mútua**: Controle de recursos compartilhados
- **Sincronização de Eventos**: Coordenação temporal

### 🎯 Interface de Usuário

- **Java Swing**: Interfaces gráficas responsivas
- **Event-Driven Programming**: Programação orientada a eventos
- **MVC Pattern**: Separação de responsabilidades

## 🏗️ Estrutura do Projeto

```
sistemas-distribuidos/
├── 📄 README.md
├── 📖 Aula 05 - Relógios Físicos e Lógicos...
├── 💬 3.1-Sockets_Swing/
├── 📧 GerarEmail/
├── 🎮 jogo-frutinha/
├── 💻 minichat/
└── 📝 Atividade- Thiago Marzari - Gabriel Pinheiro/
```

## 🎓 Objetivos de Aprendizado

- ✅ Compreender os fundamentos de sistemas distribuídos
- ✅ Implementar comunicação via sockets
- ✅ Desenvolver interfaces gráficas responsivas
- ✅ Aplicar conceitos de sincronização e coordenação
- ✅ Construir aplicações cliente-servidor robustas

</div>
