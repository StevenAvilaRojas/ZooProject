var evaluacionShowModule = angular.module('evaluacionShowModule');

evaluacionShowModule.controller('evaluacionShowCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        //Arreglo para almacenar la respuesta del servidor
        $scope.evaluacionShows = new Array();

        $http.get('api/evaluacionShows').then(function(response){
            console.log(response);
            $scope.evaluacionShows = response.data;
        }, function(error){
           console.log(error);
        });

        $scope.eliminar = function(id){
            $http.delete('api/evaluacionShows/'+id).then(function(response){
                //Recarga la pagina
                $state.reload();
            }, function(error){
               console.log(error);
            });
        };
    }]);
