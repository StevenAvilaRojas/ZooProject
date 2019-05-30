var animalModule = angular.module('animalModule');

animalModule.controller('animalCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        //Arreglo para almacenar la respuesta del servidor
        $scope.animales = new Array();
        
        $http.get('api/animales').then(function(response){
            console.log(response);
            $scope.animales = response.data;
        }, function(error){
           console.log(error);
        });

        $scope.eliminar = function(id){
            $http.delete('api/animales/'+id).then(function(response){
                //Recarga la pagina
                $state.reload();
            }, function(error){
               console.log(error);
            });
        };
    }]);
