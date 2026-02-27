# Order System in Java

Este projeto é um mini sistema de pedidos implementado em Java, focado em:

- Orientação a objetos (OO)
- Uso de enums para status de pedidos
- Validação de regras de negócio
- Tratamento de exceções (`IllegalArgumentException`)
- Fluxo completo: criar pedido, adicionar itens, pagar e cancelar

---

## Como funciona

1. Crie um pedido com o nome do cliente.
2. Adicione itens ao pedido usando `addItem(price)` — valores negativos lançam exceção.
3. Pague o pedido com `pay()`, que só funciona se o total > 0.
4. Cancele o pedido com `cancel()`, que só funciona se ainda estiver **PENDING**.

---

## Exemplo de execução

```
Status inicial: PENDING
Total inicial: 0.0
Total depois do item 50: 50.0
Total depois do item 100: 150.0
Price must be greater than zero
Status depois do pagamento: PAID
Pedido já foi pago ou cancelado
````

## Observação 


---

**Observação:**  
Este projeto serve como estudo prático de Java, OO e tratamento de exceções, ideal para portfólio acadêmico ou pessoal.


