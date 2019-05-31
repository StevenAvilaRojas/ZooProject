var alimentoModule = angular.module('alimentoModule');

alimentoModule.controller('caAlimentoCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        var id = $state.params.id;

        $scope.alimento = {};

        if (id) {
            $http.get('api/alimentos/' + id).then(function (response) {
                $scope.alimento = response.data;
            }, function (error) {
                console.log(error);
            });
        }

        $scope.guardarAlimento = function () {
            if ($scope.alimento.tipoAnimal && $scope.alimento.tipoAlimento && $scope.alimento.horaAlimento) {
                $http.post('api/alimentos', JSON.stringify($scope.alimento)).then(function (response) {
                    $scope.alimento = {};
                    //Redireccion a la lista
                    $state.go('alimentos');
                }, function (error) {
                    console.log(error);
                });
            }
        };

        $scope.actualizarAlimento = function () {
            if ($scope.alimento.tipoAnimal && $scope.alimento.tipoAlimento && $scope.alimento.horaAlimento) {
                $http.post('api/alimentos', JSON.stringify($scope.alimento)).then(function (response) {
                    $scope.alimento = {};
                    //Redireccion a la lista
                    $state.go('alimentos');
                }, function (error) {
                    console.log(error);
                });
            }
        };
    }]);


