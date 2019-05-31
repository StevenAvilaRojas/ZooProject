var encargadoShowModule = angular.module('encargadoShowModule');

encargadoShowModule.controller('encargadoShowCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        //Arreglo para almacenar la respuesta del servidor
        $scope.encargadoShows = new Array();

        $http.get('api/encargadoShows').then(function(response){
            console.log(response);
            $scope.encargadoShows = response.data;
        }, function(error){
           console.log(error);
        });

        $scope.eliminar = function(id){
            $http.delete('api/encargadoShows/'+id).then(function(response){
                //Recarga la pagina
                $state.reload();
            }, function(error){
               console.log(error);
            });
        };
    }]);
