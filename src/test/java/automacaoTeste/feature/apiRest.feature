#language: pt

Funcionalidade: Testar retorno da API


    Cenario: Validar mensagem de retorno da API
        Quando chamar a api "https://jsonplaceholder.typicode.com/todos/1"
        Entao valido a resposta da chamada
