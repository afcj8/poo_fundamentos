# 26. Captura e Tratamento de Exceções

Para lidar com exceções (checked ou unchecked) em tempo de execução, é necessário capturá-las e tratá-las adequadamente. O Java oferece duas estruturas essenciais para o tratamento de exceções: `try-catch` e `try-catch-finally`. Essas estruturas ajudam a separar o código principal das rotinas de tratamento de erros, conforme demonstrado abaixo:

```
try {
    // código
} catch (excecao) {
    // tratamento da exceção
}
```