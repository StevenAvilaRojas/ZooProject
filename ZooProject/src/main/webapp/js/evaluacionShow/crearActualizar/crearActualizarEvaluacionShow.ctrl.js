var evaluacionShowModule = angular.module('evaluacionShowModule');

evaluacionShowModule.controller('caEvaluacionShowCtrl', ['$scope', '$http', '$state', function($scope, $http, $state){
      var id = $state.params.id;

      $scope.evaluacionShow = {};

      if(id){
        $http.get('api/evaluacionShows/'+id).then(function(response){
            $scope.evaluacionShow = response.data;
        }, function(error){
            console.log(error);
        });
      }

      $scope.guardarEvaluacionShow = function(){
        if($scope.evaluacionShow.calificacion && $scope.evaluacionShow.idShow && $scope.evaluacionShow.observacion && $scope.evaluacionShow.fecha){
            $http.post('api/evaluacionShows', JSON.stringify($scope.cuidador)).then(function(response){
                $scope.evaluacionShow = {};
                //Redireccion a la lista
                $state.go('evaluacionShows');
            }, function(error){
                console.log(error);
            });
        }
      };

      $scope.actualizarEvaluacionShow = function(){
         if($scope.evaluacionShow.calificacion && $scope.evaluacionShow.idShow && $scope.evaluacionShow.observacion && $scope.evaluacionShow.fecha){
             $http.put('api/evaluacionShows/'+id, JSON.stringify($scope.cuidador)).then(function(response){
                 $scope.evaluacionShow = {};
                 $state.go('evaluacionShows');
             }, function(error){
                console.log(error);
             });

         }
      };
}]);
