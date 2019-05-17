var cuidadorModule = angular.module('cuidadorModule');

cuidadorModule.controller('cuidadorCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        //Arreglo para almacenar la respuesta del servidor
        $scope.cuidadores = new Array();
        
        $http.get('api/cuidadores').then(function(response){
            console.log(response);
            $scope.cuidadores = response.data;
        }, function(error){
           console.log(error);
        });

        $scope.eliminar = function(id){
            $http.delete('api/cuidadores/'+id).then(function(response){
                //Recarga la pagina
                $state.reload();
            }, function(error){
               console.log(error);
            });
        };
    }]);
