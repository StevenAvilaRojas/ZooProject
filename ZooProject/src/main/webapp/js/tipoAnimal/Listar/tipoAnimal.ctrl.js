var tipoAnimalModule = angular.module('tipoAnimalModule');

tipoAnimalModule.controller('tipoAnimalCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        //Arreglo para almacenar la respuesta del servidor
        $scope.tipoAnimales = new Array();

        $http.get('api/tipoAnimales').then(function(response){
            console.log(response);
            $scope.tipoAnimales = response.data;
        }, function(error){
           console.log(error);
        });

        $scope.eliminar = function(id){
            $http.delete('api/tipoAnimales/'+id).then(function(response){
                //Recarga la pagina
                $state.reload();
            }, function(error){
               console.log(error);
            });
        };
    }]);
