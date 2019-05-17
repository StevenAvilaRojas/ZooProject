var app = angular.module("ZooProject");

//Configuracion de enrutamiento de la app
app.config(["$stateProvider", "$urlRouterProvider", function ($stateProvider, $urlRouterProvider) {
        //Direccionamiento cuando no encuentra ruta
        $urlRouterProvider.otherwise('/');

        $stateProvider.state("cuidadores", {
            url: '/',
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
    }]);
