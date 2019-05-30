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
        if($scope.show.nomCompleto && $scope.show.numeroId && $scope.show.tipoId && $scope.show.fechaNacimiento && $scope.show.celular ){
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
         if($scope.show.nomCompleto && $scope.show.numeroId && $scope.show.tipoId && $scope.show.fechaNacimiento && $scope.show.celular ){
             $http.put('api/shows/'+id, JSON.stringify($scope.show)).then(function(response){
                 $scope.show = {};
                 $state.go('shows');
             }, function(error){
                console.log(error); 
             });
             
         } 
      };
}]);


