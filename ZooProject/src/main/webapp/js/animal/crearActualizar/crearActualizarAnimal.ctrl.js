var animalModule = angular.module('animalModule');

animalModule.controller('caAnimalCtrl', ['$scope', '$http', '$state', function($scope, $http, $state){
      var id = $state.params.id;

      $scope.animal = {};

      if(id){
        $http.get('api/animales/'+id).then(function(response){
            $scope.animal = response.data;
        }, function(error){
            console.log(error);
        });
      }

      $scope.guardarAnimal = function(){
        if($scope.animal.nombreAnimal && $scope.animal.nombreCientifico && $scope.animal.idTipoAnimal && $scope.animal.idCuidador && $scope.animal.especie && $scope.animal.descripcion ){
            $http.post('api/animales', JSON.stringify($scope.animal)).then(function(response){
                $scope.animal = {};
                //Redireccion a la lista
                $state.go('animales');
            }, function(error){
                console.log(error);
            });
        }
      };

      $scope.actualizarAnimal = function(){
         if($scope.animal.nombreAnimal && $scope.animal.nombreCientifico && $scope.animal.idTipoAnimal && $scope.animal.idCuidador && $scope.animal.especie && $scope.animal.descripcion  ){
             $http.put('api/animales/'+id, JSON.stringify($scope.animal)).then(function(response){
                 $scope.animal = {};
                 $state.go('animales');
             }, function(error){
                console.log(error);
             });

         }
      };
}]);
