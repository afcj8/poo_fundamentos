# 14. Sobrescrita de Métodos

Uma diferença relevante entre os tipos de conta é que, para a conta poupança, não há cobrança de taxa ao efetuar um saque. Já na conta corrente do tipo básica, existe uma taxa ao realizar retiradas. Para refletir essa distinção, o comportamento do método retirar na classe ContaCorrente deve ser sobrescrito.

Sobrescrever um método significa redefinir, na subclasse, um método já existente na superclasse. Assim, quando o método `retirar` for chamado em um objeto do tipo `ContaCorrente`, o método sobrescrito na subclasse será executado, em vez do método original da superclasse. Para implementar isso, o método `retirar` na classe `ContaCorrente` precisa ter a mesma assinatura do método da classe `Conta`:

```
@Override
public void retirar(double valor) {
    valor = valor + 10;  // Soma a taxa de R$10 ao valor retirado
    super.retirar(valor);  // Chama o método retirar da classe Conta
}
``` 