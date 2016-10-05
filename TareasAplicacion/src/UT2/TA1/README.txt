UNIDAD TEM�TICA 2: ARBOLES GEN�RICOS, TRIES Y ARBOLES B

Trabajo de Aplicación 1

ESCENARIO
La Universidad Católica del Uruguay necesita desarrollar una aplicación informática que le permita
mantener su organigrama.

El analista del proyecto ha definido que la mejor forma de representar este problema es mediante el
tipo de datos abstracto ARBOL. El árbol tiene una referencia a un nodo llamado raíz, y a su vez los nodos tienen una referencia a su hermano derecho, una referencia a su primer hijo, una etiqueta que lo
distingue y una referencia a donde están almacenados los datos de ese nodo.

De las funcionalidades que debe tener el sistema a desarrollar, el analista ha asignado a su grupo de
desarrolladores las siguientes:

- Modificar los datos de un componente dado.

EJERCICIO 1:
Para cumplir con los requerimientos, su equipo deberá desarrollar el método para recuperar un nodo
del árbol.

Desarrollar en seudocódigo el siguiente algoritmo, con las firmas dadas:

- Buscar(unaEtiqueta) : devuelve el nodo que tiene como etiqueta �unaEtiqueta�; si no encuentra
esa etiqueta devuelve el nodo nulo.

En cada uno de los casos debe escribirse el método del árbol y el método del nodo.
	a) Descripción en lenguaje natural del algoritmo solicitado
	b) Identificaci�n de precondiciones y postcondiciones correspondientes
	c) Escritura del algoritmo en seudocódigo formal
	d) Análisis detallado del orden del tiempo de ejecución del algoritmo
	e) Ilustrar el funcionamiento del algoritmo buscando divisiones / departamentos que existan y
	que no existan.
	f) Calcular la cantidad de comparaciones en cada caso.
	g) Hallar el orden del tiempo de ejecución de cada algoritmo escrito.

- Evaluación del algoritmo por pares de acuerdo al formulario estándar de evaluación de
algoritmos