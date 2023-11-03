# Sprint 2 - Rubén Bonilla

## Descripción
Esta aplicación Android te permite conectarte a un servidor utilizando un nombre de usuario y una dirección IP válida. La aplicación consta de dos actividades: MainActivity y MessagesWindow. La MainActivity valida los datos de entrada, mientras que MessagesWindow te permite escribir mensajes que se mostrarán en una lista. Además, hemos implementado un desplazamiento automático para mostrar los mensajes más recientes en la parte inferior de la lista.


## Características Clave
- Ingrese un nombre de usuario y una dirección IP para conectarse al servidor.
- Valida que el nombre de usuario no esté vacío y que la dirección IP sea válida.
- Interfaz de usuario atractiva y fácil de usar.
- Abre una ventana de chat para enviar y recibir mensajes una vez conectado.
- Implementa el desplazamiento automático para mostrar los mensajes más recientes en la parte inferior de la lista.

## Uso
1. Abra la aplicación.
2. Ingrese su nombre de usuario y la dirección IP del servidor.
3. Presione el botón "Conectar".
4. Una vez conectado, se abrirá la ventana de chat para enviar  mensajes.
5. Escriba un mensaje en la parte inferior de la ventana y presione el botón "Enviar".
6. El mensaje se mostrará en la lista y se desplazará automáticamente para mostrar los mensajes más recientes.

## MainActivity.kt
1. Importaciones de bibliotecas y clases: Importamos las bibliotecas y clases necesarias para trabajar con la actividad y los componentes de la interfaz de usuario.
2. Declaración de variables y objetos: Se declaran las variables y objetos para las vistas y la lógica de la actividad.
3. Método onCreate: Configuramos el contenido de la actividad, obtenemos referencias a las vistas y configuramos el botón "Conectar".

## MessagesWindow.kt
1. Declaración de la clase MessagesWindow: Declaramos la clase MessagesWindow, que muestra la ventana de chat.
2. Declaración de variables de vistas: Se declaran variables para las vistas utilizadas en la ventana de chat.
3. Sobreescritura del método onCreate: Inicializamos la actividad, recuperamos datos del Intent y configuramos las vistas.
4. Configuración del TextView de conexión: Se muestra información de conexión que incluye el nombre de usuario y la dirección del servidor.
5. Configuración del EditText para mensajes: El usuario puede ingresar mensajes.
6. Configuración del botón de envío (borrar texto): Cuando se hace clic, borra el texto del EditText.
7. Implementación del desplazamiento automático: Se ha agregado la lógica para desplazarse automáticamente al último mensaje en la lista después de enviar un mensaje.
8. En resumen, estos cambios permiten al usuario conectarse, enviar mensajes y ver los mensajes más recientes en la ventana de chat en la actividad MessagesWindow.