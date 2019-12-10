// ==UserScript==
// @name                女孩HHH
// @author              絕版大叔丶
// @namespace           https://github.com/Sdator/MyCode/tree/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4
// @icon                https://avatars3.githubusercontent.com/u/17621623?s=40&v=4
// @version             1.2
// @match               *://home.twofei.com:7890/*
// @description         学习
// @updateURL           https://github.com/Sdator/MyCode/raw/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4/女孩HHH.user.js
// @downloadURL         https://github.com/Sdator/MyCode/raw/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4/女孩HHH.user.js
// @run-at              document-end
// @grant               GM_addStyle
// @require             https://cdnjs.loli.net/ajax/libs/jquery/3.4.1/jquery.js
// @contributionAmount  10软妹
// ==/UserScript==

let css = `

body {
/*background: rgba(0,0,0,1);*/
padding:0;
margin:0;
}


#img{
    background-color: rgba(255,255,255,0.8);
    display: flex;
    flex-direction: column;
    min-height: 100vh;
  background: rgba(0,0,0,1);
}


#show{
  background-color: rgba(0,0,0,0.8);
  flex: 1 0 768px;
}



#imgs {
    box-shadow: 0 0 10px -6px black;
    padding: 10px;
    z-index: 1;
    display: flex;
    justify-content: center;
    flex: 1;
/*background: rgba(255,255,255,0.2);*/
}


img{
    transition: transform 0.2s linear;
    transform: scale(1.0);
    margin: 10px;
  
}

img:hover {
    transform: scale(1.2);
}


/*
#imgs:after{

  content: '';
  filter:blur(5px);
  position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
/*background-color: rgba(255,255,255,0.8);*/
    z-index: -1;
flex-direction:row;
}

*/

`



GM_addStyle(css)


$(() => {

  $("<div id='img'>").prependTo("body")
  $("<div id='imgs'>").prependTo("#img")
  $("<div id='show'>").prependTo("#img")

    $("[href$='.jpg']").each(function () {
        let url = window.location.href + $(this).attr("href")
        $("<img>", {
            click: function () {
                $(this).css({
                    // "align-self": "flex-start",
                });
            },
            mouseover: function () {
                let css = $(this).css("background")      
                $("#show").css("background", css)
  

              
            },
            mouseout: function () {

            },
            style: `height:100px;width:100px;background:url(${url});background-size:contain;background-repeat:no-repeat;background-position:center`
        }).appendTo("#imgs");
    })

})