# 🚚 ExpressLine - Sistema de Gerenciamento de Entregas
---

## 📘 Descrição

Este projeto simula a malha de entregas da empresa fictícia **ExpressLine**, utilizando listas duplamente encadeadas genéricas implementadas manualmente em Java. Cada cidade pode possuir conexões diretas com outras cidades, e essas ligações incluem informações como distância, tráfego e número de pedágios.

O sistema oferece uma interface gráfica baseada em **JOptionPane** para interação com o usuário.

---

## 🔄 Funcionalidades

1. Cadastrar cidades na lista principal.  
2. Cadastrar ligações diretas entre cidades.  
3. Listar todas as cidades com suas ligações diretas.  
4. Verificar ligação direta entre duas cidades e exibir o tempo estimado da entrega.  
5. Exibir todas as ligações diretas dentro de um tempo limite (em minutos).

---

## ⚖️ Cálculo de Tempo Estimado

```
tempo = (distância * fator_tráfego) + (número_de_pedágios * 2)
```

---

## 📂 Estrutura de Dados

- Lista duplamente encadeada **genérica** implementada manualmente.
- Cada nó da lista principal representa uma cidade.
- Cada cidade referencia uma lista de suas ligações diretas.

---

## ❌ Restrições

- Não utilizar `ArrayList`, `LinkedList`, `HashMap` ou qualquer outra estrutura pronta da linguagem Java.
- Interface obrigatoriamente gráfica com `JOptionPane`.
- Não utilizar classes de estruturas de dados do pacote `java.util`.
- A classe `ListaDupla` deve ser genérica e independente de qualquer projeto específico.
- A classe `ListaDupla` deve ser convertida em um `.JAR` utilizado no projeto.

---

---

## 🛠️ Geração do Arquivo `ListaDupla.jar`

O arquivo `ListaDupla.jar` foi gerado a partir das implementações manuais das classes `No` e `ListaDupla`. Essas classes foram criadas para serem genéricas e independentes de qualquer funcionalidade específica do projeto.

### Código das Classes

#### `No.java`
```java
class No<T> {
    T dado;
    No<T> anterior, proximo;

    No(T dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}
```

#### `ListaDupla.java`
```java
class ListaDupla<T> {
    No<T> inicio, fim;

    public void adicionar(T dado) {
        No<T> novo = new No<>(dado);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void listar() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }
}
```

Desenvolvido para fins acadêmicos - Estrutura de Dados - 2025.

