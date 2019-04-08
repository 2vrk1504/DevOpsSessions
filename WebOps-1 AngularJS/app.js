var app = angular.module('firstapp', ['ngRoute']);

app.controller('myCtrl', function($scope) {
    $scope.electronicmail=/^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/;
    $scope.namepattern=/^[a-zA-Z]{1,}$/;
    $scope.mobilepattern = /^[8-9]{6,10}$/;
    $scope.passwordpattern=/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[#$^+=!*()@%&]).{8,}$/;
 
    
    $scope.changename = function(){
        console.log($scope.email)
        
    }
    var p = document.getElementById("inp") //not important
    var q = angular.element(p) //not important 
    $scope.emailisvalid = false
    $scope.passisvalid = false;
    $scope.cpassisvalid = false;
    console.log(q)
    $scope.emailchange=function(){
        if($scope.email.match($scope.electronicmail)){
            $scope.emailisvalid = true;
            console.log("validating email")
            console.log($scope.emailisvalid)
        }else{
            $scope.emailisvalid = false;
            console.log($scope.emailisvalid)
        }
    }

    $scope.passchange=function(){
            if($scope.pass.match($scope.passwordpattern)){
                $scope.passisvalid = true
            }else{
                $scope.passisvalid = false
            }
    }

    $scope.cpasschange=function(){

        if($scope.cpass == $scope.pass){
            $scope.cpassisvalid = true;
        }else{
            $scope.cpassisvalid = false;
        }

    }

    $scope.submit=function(){

        if($scope.emailisvalid && $scope.cpassisvalid && $scope.passisvalid){
            //submit the form  details
            alert("Form is valid")
        }else{
            alert("One of the fields is invalid")
        }


    }
});

