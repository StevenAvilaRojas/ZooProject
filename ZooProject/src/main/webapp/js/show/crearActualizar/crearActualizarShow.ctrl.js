var showModule = angular.module('showModule');

showModule.controller('caShowCtrl', ['$scope', '$http', '$state', function($scope, $http, $state){
      var id = $state.params.id;
      
      $scope.show = {};
      
      if(id){
        $http.get('api/shows/'+id).then(function(response){
            $scope.show = response.data;
        }, function(error){
            console.log(error);
        });
      }
            
      $scope.guardarShow = function(){
        if($scope.show.idUbicacion && $scope.show.horaInicio && $scope.show.horaFin && $scope.show.animales && $scope.show.nombre){
            $http.post('api/shows', JSON.stringify($scope.show)).then(function(response){
                $scope.show = {};
                //Redireccion a la lista
                $state.go('shows');
            }, function(error){
                console.log(error);
            });
        }
      };
      
      $scope.actualizarShow = function(){
         if($scope.show.idUbicacion && $scope.show.horaInicio && $scope.show.horaFin && $scope.show.animales && $scope.show.nombre){
             $http.put('api/shows/'+id, JSON.stringify($scope.show)).then(function(response){
                 $scope.show = {};
                 $state.go('shows');
             }, function(error){
                console.log(error); 
             });
             
         } 
      };
}]);


