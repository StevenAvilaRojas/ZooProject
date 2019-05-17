var productoModule = angular.module('cuidadorModule');

productoModule.controller('caCuidadorCtrl', ['$scope', '$http', '$state', function($scope, $http, $state){
      var id = $state.params.id;
      
      $scope.cuidador = {};
      
      if(id){
        $http.get('api/cuidadores/'+id).then(function(response){
            $scope.cuidador = response.data;
        }, function(error){
            console.log(error);
        });
      }
            
      $scope.guardarCuidador = function(){
        if($scope.cuidador.nomCompleto && $scope.cuidador.numeroId && $scope.cuidador.tipoId && $scope.cuidador.fechaNacimiento && $scope.cuidador.celular ){
            $http.post('api/cuidadores', JSON.stringify($scope.cuidador)).then(function(response){
                $scope.cuidador = {};
                //Redireccion a la lista
                $state.go('cuidadores');
            }, function(error){
                console.log(error);
            });
        }
      };
      
      $scope.actualizarCuidador = function(){
         if($scope.cuidador.nomCompleto && $scope.cuidador.numeroId && $scope.cuidador.tipoId && $scope.cuidador.fechaNacimiento && $scope.cuidador.celular ){
             $http.put('api/cuidadores/'+id, JSON.stringify($scope.cuidador)).then(function(response){
                 $scope.cuidador = {};
                 $state.go('cuidadores');
             }, function(error){
                console.log(error); 
             });
             
         } 
      };
}]);


