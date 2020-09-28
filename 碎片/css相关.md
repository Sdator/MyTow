background-clip 用来判bai断 background 是否包含 border 区域。而 background-origin
用来决定 background-position 计算的du参考位置。



background-size: contain;   固定大小 跟随元素变小       多出会重复

background-size: cover;     大小跟随元素变化        保证单张图


返回一个样式表列对象
document.styleSheets


样式表列
StyleSheetList
    属性
        样式表
        CSSStyleSheet
    方法


CSSStyleSheet   样式表
    方法
        insertRule  插入样式 插入的地方是 cssRules 属性 内部的 CSSRuleList 对象


样式条目列
CSSRuleList
    样式
    CSSStyleRule





[].slice.call(document.styleSheets)
    .reduce(function (prev, styleSheet) {
        if (styleSheet.cssRules) {
            return prev +
                [].slice.call(styleSheet.cssRules)
                    .reduce(function (prev, cssRule) {
                        return prev + cssRule.cssText;
                    }, '');
        } else {
            return prev;
        }
    }, '');