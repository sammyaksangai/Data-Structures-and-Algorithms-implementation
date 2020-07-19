def DFS(graph, startNode):
    visited[startNode] = True
    print(startNode)

    # Check list of startNode. if not visited, dive into it
    for j in range(len(graph[startNode])):
        if visited[j] != True and graph[startNode][j] != 0:
            DFS(graph, j)


visited = [False, False, False, False]


def DFSTraversal():
    graph = [[1, 1, 1, 0],
             [1, 1, 1, 0],
             [1, 1, 1, 1],
             [0, 0, 1, 1]]
    startNode = 2
    DFS(graph, startNode)

    # If there are multiple components in a graph, then this for loop will be executed
    for i in range(len(graph)):
        if not visited[i]:
            DFS(graph, i)


DFSTraversal()
