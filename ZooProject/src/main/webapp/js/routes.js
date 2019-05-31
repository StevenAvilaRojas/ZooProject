var app = angular.module("ZooProject");

//Configuracion de enrutamiento de la app
app.config(["$stateProvider", "$urlRouterProvider", function ($stateProvider, $urlRouterProvider) {
        //Direccionamiento cuando no encuentra ruta
        $urlRouterProvider.otherwise('/');



        $stateProvider.state("cuidadores", {
            url: '/cuidadores',
            //Donde lo va a publicar
            views: {
                mainView: {
                    templateUrl: './js/cuidador/Listar/cuidadores.html',
                    controller: 'cuidadorCtrl'
                }
            }
        });

        $stateProvider.state("crearCuidadores", {
            url: '/crearCuidador',
            views: {
                mainView: {
                    templateUrl: './js/cuidador/crearActualizar/crearActualizarCuidador.html',
                    controller: 'caCuidadorCtrl'
                }
            }
        });

        $stateProvider.state("actualizarCuidador", {
            url: '/actualizarCuidador/:id',
            views: {
                mainView: {
                    templateUrl: './js/cuidador/crearActualizar/crearActualizarCuidador.html',
                    controller: 'caCuidadorCtrl',
                    params: {
                        id: null
                    }
                }
            }
        });

        $stateProvider.state("ubicaciones", {
            url: '/ubicaciones',
            //Donde lo va a publicar
            views: {
                mainView: {
                    templateUrl: './js/ubicacion/Listar/ubicaciones.html',
                    controller: 'ubicacionCtrl'
                }
            }
        });

        $stateProvider.state("crearUbicacion", {
            url: '/crearUbicacion',
            views: {
                mainView: {
                    templateUrl: './js/ubicacion/crearActualizar/crearActualizarUbicacion.html',
                    controller: 'caUbicacionCtrl'
                }
            }
        });
        

                $stateProvider.state("actualizarUbicacion", {
            url: '/actualizarUbicacion/:id',
            views: {
                mainView: {
                    templateUrl: './js/ubicacion/crearActualizar/crearActualizarUbicacion.html',
                    controller: 'caUbicacionCtrl',
                    params: {
                        id: null
                    }
                }
            }
        });
        
        $stateProvider.state("shows", {
            url: '/shows',
            //Donde lo va a publicar
            views: {
                mainView: {
                    templateUrl: './js/show/Listar/shows.html',
                    controller: 'showCtrl'
                }
            }
        });

        $stateProvider.state("crearShow", {
            url: '/crearShow',
            views: {
                mainView: {
                    templateUrl: './js/show/crearActualizar/crearActualizarShow.html',
                    controller: 'caShowCtrl'
                }
            }
        });
        

                $stateProvider.state("actualizarShow", {
            url: '/actualizarShow/:id',
            views: {
                mainView: {
                    templateUrl: './js/show/crearActualizar/crearActualizarShow.html',
                    controller: 'caShowCtrl',
                    params: {
                        id: null
                    }
                }
            }
        });
    }]);
