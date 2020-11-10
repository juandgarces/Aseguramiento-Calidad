# language: es

  Característica: Usar petbook
    Como propietario de una mascota
    Quiero una pagina exclusiva para mascotas
    Para poder montar imagenes

  @testCase1 @Escenari1
  Escenario: Visualizar que al seleccionar Perro se filtren las imagenes de los perros
    Dado Que Juan ingresa a la pagina Pet Book
    Cuando Juan seleciona ver solo los perros
    Entonces la pagina filtra las imagenes para mostrar solo los perros