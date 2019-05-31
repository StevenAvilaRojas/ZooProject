var ubicacionModule = angular.module('ubicacionModule');

ubicacionModule.controller('ubicacionCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        //Arreglo para almacenar la respuesta del servidor
        $scope.ubicaciones = new Array();

        $http.get('api/ubicaciones').then(function(response){
            console.log(response);
            $scope.ubicaciones = response.data;
        }, function(error){
           console.log(error);
        });

        $scope.eliminar = function(id){
            $http.delete('api/ubicaciones/'+id).then(function(response){
                //Recarga la pagina
                $state.reload();
            }, function(error){
               console.log(error);
            });
        };
    }]);
