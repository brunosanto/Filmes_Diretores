#language: pt

Funcionalidade: Realizar pesquisa no google e obter resultados dos diretoes e seus filmes

    Contexto: Cadastrar diretor e filme
      Dado que tenho os dados diretor e filme cadastrados


    Cenario: Buscar resultados dos filmes e diretores
        E que acesse o site do google para pesquisar
        Quando informo os dados de filme e diretor e clico em buscar
        Entao valido os resultados obtidos

