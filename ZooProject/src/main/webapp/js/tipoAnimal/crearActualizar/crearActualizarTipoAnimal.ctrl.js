var tipoAnimalModule = angular.module('tipoAnimalModule');

tipoAnimalModule.controller('caTipoAnimalCtrl', ['$scope', '$http', '$state', function($scope, $http, $state){
      var id = $state.params.id;

      $scope.tipoAnimal = {};

      if(id){
        $http.get('api/tipoAnimales/'+id).then(function(response){
            $scope.tipoAnimal = response.data;
        }, function(error){
            console.log(error);
        });
      }

      $scope.guardarTipoAnimal = function(){
        if($scope.tipoAnimal.idTipoAnimal && $scope.tipoAnimal.nombreAnimal){
            $http.post('api/tipoAnimales', JSON.stringify($scope.tipoAnimal)).then(function(response){
                $scope.tipoAnimal = {};
                //Redireccion a la lista
                $state.go('tipoAnimales');
            }, function(error){
                console.log(error);
            });
        }
      };

      $scope.actualizarTipoAnimal = function(){
         if($scope.tipoAnimal.idTipoAnimal && $scope.tipoAnimal.nombreAnimal){
             $http.put('api/tipoAnimales/'+id, JSON.stringify($scope.tipoAnimal)).then(function(response){
                 $scope.tipoAnimal = {};
                 $state.go('tipoAnimales');
             }, function(error){
                console.log(error);
             });

         }
      };
}]);
