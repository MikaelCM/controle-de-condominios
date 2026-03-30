# 🏢 Sistema de Controle de Condomínios

Este projeto foi desenvolvido com o objetivo de aplicar na prática os conceitos de **Programação Orientada a Objetos (POO)** utilizando a linguagem **Java**.  
O sistema realiza o cadastro e listagem de moradores de um condomínio, organizando as informações por apartamento.

---

## 📚 Conceitos de POO aplicados

O projeto utiliza os seguintes conceitos:

- Pacotes
- Classe e Objeto
- Construtor
- Instância
- Herança
- Encapsulamento
- Polimorfismo
- Interface

---

## 🏗️ Estrutura do Projeto

```
br.com.condominios
│
├── model
│ ├── Pessoa.java
│ └── Morador.java
│
├── interfaces
│ └── CadastroMorador.java
│
├── repository
│ └── ListaDeMoradores.java
│
├── controller
│ └── MoradorController.java
│
├── view
│ ├── Menu.java
│ ├── CadastrarMorador.java
│ └── ConsultarMoradores.java
│
└── Main.java
```

---

## 🧠 Explicação da Arquitetura

O sistema foi dividido em camadas para melhor organização:

| Camada | Responsabilidade |
|-------|------------------|
| Model | Representa as entidades (Pessoa, Morador) |
| Repository | Armazena os dados em memória |
| Controller | Controla as regras do sistema |
| View | Interface com o usuário |
| Interface | Define contratos que o controller deve implementar |

Essa organização segue o padrão **MVC (Model - View - Controller)**.

---

## 🧬 Conceitos aplicados no código

### Herança
A classe `Morador` herda da classe `Pessoa`.

```java
public class Morador extends Pessoa {
Encapsulamento

Os atributos são privados e acessados por getters.

private String nome;
private String cpf;
Interface

A interface define métodos que o controller deve implementar.

public interface CadastroMorador<T> {
    void cadastrarMorador(T obj);
    List<Morador> listarMoradores();
}
```

### Polimorfismo

Ocorre quando o controller implementa a interface e sobrescreve os métodos com @Override.

```java
@Override
public void cadastrarMorador(Morador morador) {
    lista.salvarEmLista(morador);
}
```

## ▶️ Como executar o projeto
- Abra o projeto no IntelliJ
- Execute a classe Main.java
- O menu será exibido no console
- Escolha a opção desejada
  
## 👨‍💻 Autor

Mikael Carvalho Mendes <br />
Curso: Análise e Desenvolvimento de Sistemas <br />
Projeto desenvolvido para a disciplina de Programação Orientada a Objetos em Java.

## 📌 Observações

Este projeto tem fins acadêmicos e foi desenvolvido para demonstrar a aplicação prática dos conceitos de orientação a objetos, como herança, encapsulamento, interfaces e polimorfismo.

---

```md
# Sistema de Controle de Condomínios

Projeto acadêmico desenvolvido em Java utilizando Programação Orientada a Objetos (POO) e arquitetura MVC.
```

## 🚀 Tecnologias
- Java
- Programação Orientada a Objetos
- MVC
- IntelliJ IDEA
