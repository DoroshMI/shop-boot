var app = angular.module('testApp', ['ngRoute']);

app.config(function ($routeProvider, $locationProvider) {
    $routeProvider.when('/', {
        templateUrl : '/html/index.html'
    });

    $routeProvider.when('/test', {
        templateUrl : '/templates/html/test.html'
    });

    $routeProvider.when('/user', {
        templateUrl : '/templates/html/user.html'
    });



    $routeProvider.when('/ticket', {
        templateUrl : '/html/index.html'
    });
    $routeProvider.when('/ticket/view', {
        templateUrl : '/html/view.html'
    });
    $locationProvider.html5Mode(true);
});

