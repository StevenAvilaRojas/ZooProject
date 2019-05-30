var showModule = angular.module('showModule');

showModule.controller('showCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        //Arreglo para almacenar la respuesta del servidor
        $scope.shows = new Array();
        
        $http.get('api/shows').then(function(response){
            console.log(response);
            $scope.shows = response.data;
        }, function(error){
           console.log(error);
        });

        $scope.eliminar = function(id){
            $http.delete('api/shows/'+id).then(function(response){
                //Recarga la pagina
                $state.reload();
            }, function(error){
               console.log(error);
            });
        };
    }]);
