var evaluacionAnimalModule = angular.module('evaluacionAnimalModule');

evaluacionAnimalModule.controller('caEvaluacionAnimalCtrl', ['$scope', '$http', '$state', function($scope, $http, $state){
      var id = $state.params.id;

      $scope.evaluacionAnimal = {};

      if(id){
        $http.get('api/evaluacionAnimales/'+id).then(function(response){
            $scope.evaluacionAnimal = response.data;
        }, function(error){
            console.log(error);
        });
      }

      $scope.guardarEvaluacionAnimal = function(){
        if($scope.evaluacionAnimal.idAnimal && $scope.evaluacionAnimal.observacion && $scope.evaluacionAnimal.calificacion && $scope.evaluacionAnimal.fechaEvaluacionAnimal){
            $http.post('api/evaluacionAnimales', JSON.stringify($scope.cuidador)).then(function(response){
                $scope.evaluacionAnimal = {};
                //Redireccion a la lista
                $state.go('evaluacionAnimales');
            }, function(error){
                console.log(error);
            });
        }
      };

      $scope.actualizarEvaluacionAnimal = function(){
         if($scope.evaluacionAnimal.idAnimal && $scope.evaluacionAnimal.observacion && $scope.evaluacionAnimal.calificacion && $scope.evaluacionAnimal.fechaEvaluacionAnimal){
             $http.put('api/evaluacionAnimales/'+id, JSON.stringify($scope.cuidador)).then(function(response){
                 $scope.evaluacionAnimal = {};
                 $state.go('evaluacionAnimales');
             }, function(error){
                console.log(error);
             });

         }
      };
}]);
