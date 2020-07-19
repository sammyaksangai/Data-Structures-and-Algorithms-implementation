def BFS(graph,startNode):
    queue = []
    queue.append(startNode)
    visited[startNode] = True
    print (startNode)
    while len(queue) > 0:
        currentNode = queue[0]
        queue.pop(0)
        for i in range(len(graph)):
            if graph[currentNode][i] == 1 and currentNode != i and (not visited[i]):
                queue.append(i)
                visited[i] = True
                print (i)

num_of_nodes = 4
visited = []
for j in range(num_of_nodes):
    visited.append(False)

def BFSTraversal():
    graph = [[1, 1, 1, 0],
             [1, 1, 1, 0],
             [1, 1, 1, 1],
             [0, 0, 1, 1]]
    startNode = 0
    BFS(graph, startNode)

    for k in range (num_of_nodes):
        if not visited[k]:
            BFS(graph,visited[k])

BFSTraversal()



