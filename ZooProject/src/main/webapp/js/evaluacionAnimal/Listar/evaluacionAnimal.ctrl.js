var evaluacionAnimalModule = angular.module('evaluacionAnimalModule');

evaluacionAnimalModule.controller('evaluacionAnimalCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        //Arreglo para almacenar la respuesta del servidor
        $scope.evaluacionAnimales = new Array();

        $http.get('api/evaluacionAnimales').then(function(response){
            console.log(response);
            $scope.evaluacionAnimales = response.data;
        }, function(error){
           console.log(error);
        });

        $scope.eliminar = function(id){
            $http.delete('api/evaluacionAnimales/'+id).then(function(response){
                //Recarga la pagina
                $state.reload();
            }, function(error){
               console.log(error);
            });
        };
    }]);
