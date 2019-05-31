var encargadoShowModule = angular.module('encargadoShowModule');

encargadoShowModule.controller('caEncargadoShowCtrl', ['$scope', '$http', '$state', function($scope, $http, $state){
      var id = $state.params.id;

      $scope.encargadoShow = {};

      if(id){
        $http.get('api/encargadoShows/'+id).then(function(response){
            $scope.encargadoShow = response.data;
        }, function(error){
            console.log(error);
        });
      }

      $scope.guardarEncargadoShow = function(){
        if($scope.encargadoShow.tipoId && $scope.encargadoShow.numeroId && $scope.encargadoShow.celular && $scope.encargadoShow.fechaNacimiento && $scope.encargadoShow.nombre ){
            $http.post('api/encargadoShows', JSON.stringify($scope.encargadoShow)).then(function(response){
                $scope.encargadoShow = {};
                //Redireccion a la lista
                $state.go('encargadoShows');
            }, function(error){
                console.log(error);
            });
        }
      };

      $scope.actualizarEncargadoShow = function(){
         if($scope.encargadoShow.tipoId && $scope.encargadoShow.numeroId && $scope.encargadoShow.celular && $scope.encargadoShow.fechaNacimiento && $scope.encargadoShow.nombre ){
             $http.put('api/encargadoShows/'+id, JSON.stringify($scope.encargadoShow)).then(function(response){
                 $scope.encargadoShow = {};
                 $state.go('encargadoShows');
             }, function(error){
                console.log(error);
             });

         }
      };
}]);
