var alimentoModule = angular.module('alimentoModule');

alimentoModule.controller('alimentoCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        //Arreglo para almacenar la respuesta del servidor
        $scope.alimentos = new Array();

        $http.get('api/alimentos').then(function(response){
            console.log(response);
            $scope.alimentos = response.data;
        }, function(error){
           console.log(error);
        });

        $scope.eliminar = function(id){
            $http.delete('api/alimentos/'+id).then(function(response){
                //Recarga la pagina
                $state.reload();
            }, function(error){
               console.log(error);
            });
        };
    }]);
