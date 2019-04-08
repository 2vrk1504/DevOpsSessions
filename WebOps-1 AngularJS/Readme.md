<div>
<h1>HTML</h1>
<li> <b>p</b> tag </li>
<li> <b>img</b> tag </li>
<li> <b>input</b> tag </li>
<li> <b>h1</b> tag </li>
<li> <b>h2</b> tag </li>
<li> <b>h3</b> tag </li>
<li> <b>h4</b> tag </li>
<li> <b>h5</b> tag </li>
<li> <b>h6</b> tag </li>
<li> <b>div</b> tag </li>

</div>
<div>
<h1>CSS</h1>
<p>For linking the css file:</p>
Use:< <code>
link rel="stylesheet" href="your_css_file_path" 
</code> />
<p>Some of the css properties are:</p>
<li>width</li>
<li>height</li>
<li>background-color</li>
<li>color</li>
<li>font-size</li>
<li>border-radius</li>
<li>border</li>
<li>padding</li>
<li>margin</li>
</div>

<div>
<h1>JavaScript</h1>
<p>Some functions</p>
<li>document.getElementById("id_name")</li>
<li>Console.log(whatever value you want to print it in browser console)</li>
</div>

<div>
<h1>Angular JS</h1>
<li>The ng-app directive tells AngularJS that this is the root element of the AngularJS application.
</li>
<li>All AngularJS applications must have a root element.
</li>
<li>You can only have one ng-app directive in your HTML document. If more than one ng-app directive appears, the first appearance will be used.
</li>
<li>
$scope is used to access variables that were initialised in html file.It is also used to initialize variables from js file.
</li>
<li>{{variable_name}} is used in html files to access variables declared with $scope in js file</li>
<li>ng-model="variable_name" is used to declare variables in html.It is given as an attribute for html element</li>
<div>
The general way of creating a controller
<p>
var x = angular.module("app_name",[])
</p>
<p>
x.controller("controller_name",function($scope){

//writing a new function
 $scope.functionname=function(params){
//your code goes here
}
})
</p>
</div>
<h4>Some angular event emitters</h4>
<li>ng-click="function_name()"</li>
<li>ng-change="function_name()"</li>


</div>
