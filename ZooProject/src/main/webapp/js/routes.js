var app = angular.module("ZooProject");

//Configuracion de enrutamiento de la app
app.config(["$stateProvider", "$urlRouterProvider", function ($stateProvider, $urlRouterProvider) {
        //Direccionamiento cuando no encuentra ruta
        $urlRouterProvider.otherwise('/');

        $stateProvider.state("home", {
            url: '/home',
            //Donde lo va a publicar
            views: {
                mainView: {
                    templateUrl: './js/home/home.html'
                }
            }
        });

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

        $stateProvider.state("tipoAnimales", {
            url: '/tipoAnimales',
            //Donde lo va a publicar
            views: {
                mainView: {
                    templateUrl: './js/tipoAnimal/Listar/tipoAnimales.html',
                    controller: 'tipoAnimalCtrl'
                }
            }
        });

        $stateProvider.state("crearTipoAnimal", {
            url: '/crearTipoAnimal',
            views: {
                mainView: {
                    templateUrl: './js/tipoAnimal/crearActualizar/crearActualizarTipoAnimal.html',
                    controller: 'caTipoAnimalCtrl'
                }
            }
        });


        $stateProvider.state("actualizarTipoAnimal", {
            url: '/actualizarTipoAnimal/:id',
            views: {
                mainView: {
                    templateUrl: './js/tipoAnimal/crearActualizar/crearActualizarTipoAnimal.html',
                    controller: 'caTipoAnimalCtrl',
                    params: {
                        id: null
                    }
                }
            }
        });

        $stateProvider.state("animales", {
            url: '/animales',
            //Donde lo va a publicar
            views: {
                mainView: {
                    templateUrl: './js/animal/Listar/animales.html',
                    controller: 'animalCtrl'
                }
            }
        });

        $stateProvider.state("crearAnimal", {
            url: '/crearAnimal',
            views: {
                mainView: {
                    templateUrl: './js/animal/crearActualizar/crearActualizarAnimal.html',
                    controller: 'caAnimalCtrl'
                }
            }
        });


        $stateProvider.state("actualizarAnimal", {
            url: '/actualizarAnimal/:id',
            views: {
                mainView: {
                    templateUrl: './js/animal/crearActualizar/crearActualizarAnimal.html',
                    controller: 'caAnimalCtrl',
                    params: {
                        id: null
                    }
                }
            }
        });

        $stateProvider.state("alimentos", {
            url: '/alimentos',
            //Donde lo va a publicar
            views: {
                mainView: {
                    templateUrl: './js/alimento/Listar/alimentos.html',
                    controller: 'alimentoCtrl'
                }
            }
        });

        $stateProvider.state("crearAlimento", {
            url: '/crearAlimento',
            views: {
                mainView: {
                    templateUrl: './js/alimento/crearActualizar/crearActualizarAlimento.html',
                    controller: 'caAlimentoCtrl'
                }
            }
        });


        $stateProvider.state("actualizarAlimento", {
            url: '/actualizarAlimento/:id',
            views: {
                mainView: {
                    templateUrl: './js/alimento/crearActualizar/crearActualizarAlimento.html',
                    controller: 'caAlimentoCtrl',
                    params: {
                        id: null
                    }
                }
            }
        });

        $stateProvider.state("evaluacionShows", {
            url: '/evaluacionShows',
            //Donde lo va a publicar
            views: {
                mainView: {
                    templateUrl: './js/evaluacionShow/Listar/evaluacionShows.html',
                    controller: 'evaluacionShowCtrl'
                }
            }
        });

        $stateProvider.state("crearEvaluacionShow", {
            url: '/crearEvaluacionShow',
            views: {
                mainView: {
                    templateUrl: './js/evaluacionShow/crearActualizar/crearActualizarEvaluacionShow.html',
                    controller: 'caEvaluacionShowCtrl'
                }
            }
        });


        $stateProvider.state("actualizarEvaluacionShow", {
            url: '/actualizarEvaluacionShow/:id',
            views: {
                mainView: {
                    templateUrl: './js/evaluacionShow/crearActualizar/crearActualizarEvaluacionShow.html',
                    controller: 'caEvaluacionShowCtrl',
                    params: {
                        id: null
                    }
                }
            }
        });

        $stateProvider.state("evaluacionAnimales", {
            url: '/evaluacionAnimales',
            //Donde lo va a publicar
            views: {
                mainView: {
                    templateUrl: './js/evaluacionAnimal/Listar/evaluacionAnimales.html',
                    controller: 'evaluacionAnimalCtrl'
                }
            }
        });

        $stateProvider.state("crearEvaluacionAnimal", {
            url: '/crearEvaluacionAnimal',
            views: {
                mainView: {
                    templateUrl: './js/evaluacionAnimal/crearActualizar/crearActualizarEvaluacionAnimal.html',
                    controller: 'caEvaluacionAnimalCtrl'
                }
            }
        });


        $stateProvider.state("actualizarEvaluacionAnimal", {
            url: '/actualizarEvaluacionAnimal/:id',
            views: {
                mainView: {
                    templateUrl: './js/evaluacionAnimal/crearActualizar/crearActualizarEvaluacionAnimal.html',
                    controller: 'caEvaluacionAnimalCtrl',
                    params: {
                        id: null
                    }
                }
            }
        });

        $stateProvider.state("encargadoShows", {
            url: '/encargadoShows',
            //Donde lo va a publicar
            views: {
                mainView: {
                    templateUrl: './js/encargadoShow/Listar/encargadoShows.html',
                    controller: 'encargadoShowCtrl'
                }
            }
        });

        $stateProvider.state("crearEncargadoShow", {
            url: '/crearEncargadoShow',
            views: {
                mainView: {
                    templateUrl: './js/encargadoShow/crearActualizar/crearActualizarEncargadoShow.html',
                    controller: 'caEncargadoShowCtrl'
                }
            }
        });


        $stateProvider.state("actualizarEncargadoShow", {
            url: '/actualizarEncargadoShow/:id',
            views: {
                mainView: {
                    templateUrl: './js/encargadoShow/crearActualizar/crearActualizarEncargadoShow.html',
                    controller: 'caEncargadoShowCtrl',
                    params: {
                        id: null
                    }
                }
            }
        });
    }]);
