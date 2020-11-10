# language: es

  Característica: Usar petbook
    Como propietario de una mascota
    Quiero una pagina exclusiva para mascotas
    Para poder montar imagenes

  @testCase1 @Escenario1
  Escenario: Visualizar que al seleccionar Perro se filtren las imagenes de los perros
    Dado Que Juan ingresa a la pagina Pet Book
    Cuando Juan seleciona ver solo los "perros"
    Entonces la pagina filtra las imagenes para mostrar solo los perros

  @testCase2 @Escenario2
  Escenario: Visualizar que al seleccionar Gato se filtren las imagenes de los gatos
    Dado Que Juan ingresa a la pagina Pet Book
    Cuando Juan seleciona ver solo los "gatos"
    Entonces la pagina filtra las imagenes para mostrar solo los gatos

  @testCase3 @Escenario3
  Escenario: Visualizar que al ingresar a la pagina se muestren todas las imagenes de los animales
    Dado Que Juan ingresa a la pagina Pet Book
    Cuando Juan espera a que la pagina cargue
    Entonces la pagina muestra todas las imagenes de los animales

  @testCase4 @Escenario4
  Escenario: Visualizar que se pueda saltar del perfil de perro al de gato y las imagenes cambien
    Dado Que Juan ingresa a la pagina Pet Book
    Cuando Juan seleciona ver solo los "perros" carga las fotos de perros
    Cuando Juan cambia para ver los "gatos"
    Entonces la pagina cambia las imagenes de los perros por la de los gatos

  @testCase5 @Escenario5
  Escenario: Visualizar que se pueda saltar del perfil de perro al de gato y las imagenes cambien
    Dado Que Juan ingresa a la pagina Pet Book
    Cuando Juan seleciona ver solo los "perros" carga las fotos de perros
    Cuando Juan cambia para ver los "all" animales
    Entonces la pagina muestra todas las imagenes de los animales