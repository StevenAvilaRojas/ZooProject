var ubicacionModule = angular.module('ubicacionModule');

ubicacionModule.controller('caUbicacionCtrl', ['$scope', '$http', '$state', function($scope, $http, $state){
      var id = $state.params.id;
      
      $scope.ubicacion = {};
      
      if(id){
        $http.get('api/ubicaciones/'+id).then(function(response){
            $scope.ubicacion = response.data;
        }, function(error){
            console.log(error);
        });
      }
            
      $scope.guardarUbicacion = function(){
        if($scope.ubicacion.idUbicacion && $scope.ubicacion.ocupado ){
            $http.post('api/ubicaciones', JSON.stringify($scope.ubicacion)).then(function(response){
                $scope.ubicacion = {};
                //Redireccion a la lista
                $state.go('ubicaciones');
            }, function(error){
                console.log(error);
            });
        }
      };
      
      $scope.actualizarUbicacion = function(){
         if($scope.ubicacion.idUbicacion  && $scope.ubicacion.ocupado ){
             $http.put('api/ubicaciones/'+id, JSON.stringify($scope.ubicacion)).then(function(response){
                 $scope.ubicacion = {};
                 $state.go('ubicaciones');
             }, function(error){
                console.log(error); 
             });
             
         } 
      };
}]);


