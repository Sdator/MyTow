

$("main").wrap($("body"))
//把元素插入到某元素内
$("main").appendTo($("body"));

//提升层次
$("main").unwrap();

$("div[data-spm='content']").unwrap();


$("div[data-spm='content']").appendTo($("body"));

$("div[data-spm='content']~div")



$("body *").not('[data-spm="content"]').css("-webkit-mask", 'url() no-repeat')


$('[data-spm="content"]').parents();

// 有些网站比较绝会禁止你调用console.log函数。
// 可用以下方法恢复
// 原理是创建一个新的window框架，然后把原始框架对象中的console属性指向这个新框架中完好无损的console属性，达到一个修复作用。

(function () {
    var iframe = document.createElement('iframe')
    document.body.appendChild(iframe)
    window.console = iframe.contentWindow.console
}())




{
    const 所有祖先元素 = $('[data-spm="content"]').parents()
    const 祖先数量 = 所有祖先元素.length;
    console.log(所有祖先元素[祖先数量 - 3])

}

