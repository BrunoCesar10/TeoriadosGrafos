# TeoriadosGrafos

Código simples de representação de grafos usando a linguagem Java.

O Grafo e suas manipulações são representados no console.

# Cadastrando Grafos:

Para cadastar um grafo, no método main, instancie um objeto da classe **GrafoNaoDirecionado** ou da classe **GrafoDirecionado**.

Para adicionar uma aresta no Grafo previamente cadastrado, utilize o método **adicionarAresta(origem, destino, peso)** no objeto.

Para exibir o Grafo cadastrado, utilize o método **printarGrafo()** no objeto.

Todos os métodos serão executados quando o código for executado na própria IDE sendo utilizada.

# Métodos de Manipulação dos Grafos:

## Árvore Geradora Mínima:

A Árvore Geradora Mínima é calculada em um Grafo **Não Direcionado apenas**, utilizando o método **gerarArvore()**.

## Ordenação Topológica:

A Ordenação Topológica é calculada em um Grafo **Direcionado apenas**, utilizando o método **ordenarTopologica()**.

# Exemplos:

Na classe main do projeto, estão implementados um grafo não direcionado e um direcionado, com os métodos de Árvore Geradora Mínima e Ordenação Topológica, respectivamente.

### Grafo Não Direcionado:
![Grafo Não Direcionado](https://i.gyazo.com/ec65d13175c3fa89f71a1da17a196d69.png)

### Grafo Direcionado:
![Grafo Direcionado](https://i.gyazo.com/6d83a6d3922fd291e77acf327c0bf304.png)

# Outros Métodos:

Também estão disponíveis no projeto outros métodos, são eles:

## getAdjacentes()

Encontra os adjacentes de todos os vértices do grafo criado.

## ehRegular()

Verifica se o grafo criado é regular ou não, retorna **true** ou **false**

## ehCompleto()

Verifica se o grafo criado é completo ou não, retorna **true** ou **false**

## Dijkstra(inicio)

Algoritmo que encontra o menor caminho de um vértice inicio colocado como parâmetro até todos os outros vértices.
