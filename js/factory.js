app.factory=("serverfactory",function($http){
    var object={
        callServer:function(searchImg,scope){
            var imageUrl="http://api.giphy.com/v1/gifs/search?q="+searchImg+"&api_key=dc6zaTOxFJmzC";
            $http.get(imageUrl).then(success,fail);//this is asynch call
            function success(data){
                scope.result=data;
            }
            function fail(er){
                scope.error=er;
            }
            
        }
    };
    return object;
});