// ==UserScript==
// @name                csdn瘦身
// @author              絕版大叔丶
// @namespace           https://github.com/Sdator/MyCode/tree/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4
// @icon                https://avatars3.githubusercontent.com/u/17621623?s=40&v=4
// @version             1.5
// @match               *://blog.csdn.net/*
// @description         删除csdn所有广告，保留主题内容
// @updateURL           https://github.com/Sdator/MyCode/raw/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4/csdn%E7%98%A6%E8%BA%AB.user.js
// @downloadURL         https://github.com/Sdator/MyCode/raw/master/Js/%E6%9A%B4%E5%8A%9B%E7%8C%B4/csdn%E7%98%A6%E8%BA%AB.user.js
// @run-at              document-end
// ==/UserScript==


$(() => {
    const 纸 = `url(data:image/gif;base64,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)`
    const 鸟 = `url(data:image/gif;base64,R0lGODlhyABmAdUGAIdLOv///yMfIKxlWo5LMeWkxf////eTHsyDi+abtXk5EtKjwrx0cp1YRn8/HN2Tp9SLmHdLLYdFJndlVLVsZpZRO6VfUMR7fvHq5tjCuHZyaLqThIxTQayuse7v8JOVmJ9tWz85N4VKNuHi47OJeYiKjJ+hpKx/bnx+gIFFLcmqncGekXBOQdC1qsqEkfSiq+mQWsR/iPWce45uabBTM7hmM6Karq6inVVMSZJOOK1fGa5tZdh/KXI0BfGnytXV1SH5BAEAAAYALAAAAADIAGYBAAb/QINwSCwaj8ikcslsOp/QqHRKrVqv2Kx2y+16v+CweEwum8/otHrNbrvf8Lgc7fMt5vg8ulD36f+AWHxFfT4FBYGJik11iAaGhX2Oi5R5kkR8dUKRkZWeeJ2PfaKchZ+nb6Wqq6itZZmrsapDC6aut1iyuqUGtba4wFSwu8SRjr7ByUzDxc1+m43K0kXMzsVDw9Pa1da72KHa293jhXfh2uTpz+fS3Ore7Mru7/Dxt/P09fao+Pmyk/tw9fNXCGDAWwSdGTz4KaE1hq0kOSQGkVItc0MmxlpYcQ0fjhk1EdFYCmPHVCKPwAK4K0G+k3AKIgFnYOAAfyBhlqE58pcv/1kEEurcGctkyFE1iTl4IHRomIFGqw3s0wNBPmROw+gj1Q1B1ZdIs3rZxZIcg68JjYq1opCeBbRp1175SVIVAbhN5ToxVldWD7xNOamVO5UgU04Q/vbllHPt4kg3OZ3t8fiSXkKVC1ko9VZB5nWXuX72EZSThB6lK4dOOrqQhFJ/K4y+3JoT5Uhee0SevbowwduFBvxlUBu03tGJOd0FnHl1a6+cFCguTrs29EKJe7yu3bii712HiV0AXofC3wbUHSccQJyY8EgN/lKoPVjsd1UJFLTX9b6Qg79WFReWeuo0oEB4sfRXxwN/kVdcfTrdV0pi6PFH3njaCZjSSaUgQv8XOf8hqMoADmj212YCdrePLKx181aFCabmw2k97JfiUCQl5pksA8jYoIg3wiShUj1cwGNque2oIU/eORQfjCOmJlwPsi1pWVZD+nBBAy71cVaJMfZRwV+7LaliOB1m6UMDDkDQB4M9uLlKj338x1yQFSWUgAQSdOnDfzZyQqcPcPbgp5UbMpRQYlX6MCaUgqKIIZiIytSkP+YZ6YNwMgoa2ZSNVvoLRGoqByaGCUa2XJmiZvVhNw8ocFN2cpYyQGR2aoromQflc8GBPgA4500JNFjrrmIRVEFQ0rEa3E25OVipU6Vykl+PPaBo603mZSiqpRwmNJ50nT7rw1uofcv/CUwTjenttqSROS0pvJ5TbSmxTgevnfMh2hEzJk3U7aHmNhjgkgy9yliLBJ12MGQNFPowd4ou6ZW2kBEQrYb1BlMpm1FiKO1oEKJpZayB1tHjlNtR3JHCo5FYCgESTFnuYnIJeK1yusXWGrWICndsvKv+LMQheVaaX8t13GWnszhzVbGowpW5nHy8cdUxLt/mB1eDwvYltWjGrfhxDw50CfadBB3ykBEl83Oyz8GCPbEuQ2s0yUrTILocBdH+BaQsKWsEzajA3EvPZPqt7cwFg2e2NSCK01PsX9KB7Uy/CN+jrrtrj7zKA4XX1grMS062tpK7UECwgKigvuTla9+8/0qoS8btRiZGqeta6LZPyHmlkxOV6FGiogt28JxYELmZoIBbhOytidwg85Fgr2H0iDNcaaHXi4fxt7rTQRP1GoaO+yoN5O2vJXz5zjPYUFvLOrJ/yL/L1fLqwgCkrYIfK8iGKOX1TxYVKB3+5MAiTFBtbfUrRLFe9y3uDfBwQYOgLijANN/FwTeT+NaUGhTBPtRMf2VTQzeQZ6URDkcWDHKflT44DgJqyIVs6wMF7jevmKDQGTi8WyQksL7msDCFa/ghENcmxDf1YHhZ44X3pAcG9CkxOEyMhXme95gpXqOKV1yi3WIhAUqFMRLlm8IZxWiwVRQLgGcsnhMq9y3Q/f9Fhj44i67WiEQvWPGM/BNdHcZEQSWaj4+rCKQb30UMKHKMDHS0kiJVcZbxxSIBFcBjer4QSb85ThXxaaK1JCDKcTwAAqhMZSFn8YU/InKSpZAOMfZUwmJAgAEW4AAAdsnLXjZgBzHgYhqj4MpXfhIxVCJGA5gHAS76wAUD6KU0p9lLDjBgcBhBgRoRqY7MYU4V5nEkZ4C1CggAgAM7cMGhEsAAXVLzne8cwNBsgIIJnJOY3HxH7VQxplLWYTzilKA0OcCeC+iSAyAAgTvhSU0LgMACuxzABXYA0V5qIAr51OfyVCFLGCpAez5YaC9BoAIMBOCkAcCACkDA0HOS4Af/KD3pD0ggUl5qEwoZVcc+OcEg7d1Fk33YgTQbkIGYGjUAGajoNDdg0qOeFAMbmKYUcpqOnUZiPJaMhHmyiq9e7qCpHdBACARAVhyYwAMpPcFAixoAD5hgAmQlqwY6cNIMLJQDU6XqOKxqIgX6ID8KWCUn3LkDmeIgBCzgJQtwIIAQmOCkat0lB2AagA6EALGKZSwOYPoDm+ZVr87ITvh4psn41DISMQBAA0zaAQHgYKgb2ABcUZDSBuxyBSdFgQASO9LYMpauK7jnZ0FbjMAl0zaCJFQPAusMDrQgAD9w7S4XGwINNLWyAnhsBgAAgpN+YLfTvewNYqoBAcDUAjfF/yhxm2FcZ3mFeaYNbQNOethdMpaslEXpYUcQAAs8dwTSBcBYG2tUAOMgACqYwDbXS4z2csI8EWQQc5thAdy2NrH3JStaYzoDAZQAwbkVwC4HLIAJHHWsRcUrThnMXg1GYkx7hE8P4HhJABS1vLuMK1npilIMcMC1MZUuC3QsAP6itAVD/jAIZrAXFjvDwZGQTiEv50xOuAAAJ70sAIas4xDweAT2HCtKMyDdDJeVrXYFQIkDsAEVL8HJ1sAhqxJjRq2myxkMwHIAGgsAMxO5zAIYM3hJ/GfwrjmqUehkGOUMmRmvAlDWyPNJ+exnIr+WsYJ+LaH/nNhDA2C433qAYP/TgUMonibGfdBRN/Js0rECYAYf+EClB31gmUq3BB8owaxz/GESfFq98rMAUMcRxELAqZAvWjUAnqvbGcQUrl3mdUzHituTeuDPrx0yXVm64h9aANXvKHYf3lLEOvxn2KW4MgmQKgANPJvIGC5yAEhg0u8+1tpEDsGID4wB4TJhjQ3wq4uy2AfplI7O40jAOU1a3gnEFtplna4APnDSBuDWA4ydwQZIYObX9lkARY0qk/+tijv4rgE0HkcgDzaZQm6VHNHcQFsZy9st13zItGUzD2pg0h+M9eY3FwBdfQyA8FRBfg2owKiLsfI6OdouRSKHOQEAUw/AFbO9ZOyHocv/gwMcQObQ1aw0WXBZHgsVY0c3hqIj3Sd6NH1TYbPWctURzcmetAOMvexl281WDIDA6wfgQbU9IOvG6j0EKDByZI8lDGMczUoXaNM7Aumm7ARvPOUuRgIOmt8RZOADJsjAhqHbgBoA/gA5OEFMf9CBD3SArZDdZaCowKTnIAgCEhA4oVapyD3dcRVv0b0uHuBOejs1pVEFQNcBb1sLwP6oSY0oGqfAjOlZ5wIXYMAFEoBJrhYioPECm+91E4u7VHkXEFjoDlSQgfZnQAWR3eXpD1ADXjZgA+5vPwlsu0sLEIz2P/QAFNAAA7AsguV/qkAjDUIj2IM2/kB8LcVLpud1/zxAAxG4SzvASsCmRAgQHwogShdQP6HzF223Cl6Rcs6QAByUAhdIA8tXAzkQgSLgAA0gRAsWRg8QX6WQHxQ0gjlUHjVCDwPgTQogAhFIA/RXARGYAsszNDd4RghAM4NzQsi1NpnXB/GBbpdkR3/BghHIAzHYUky4Onv0hGvEAA7gLAYCJCMIbkPEQ9YQH2BThBcIAGG4hCMoJwCYTwnAJg9zFgAUOnBoGyClRaFjhHWYiABgJ2CTNnKkVwjgABqzIHFXB+qDN+RHDl4DNl6oiIk4ggNAcnD2V2NCAEbyH50SOqelR6QWOp7oiWM4h4wwiv8kHQ7AL4UQOv4Ed+e3Cv8K+BcO8IqeOIIX9Wa0uCD8M2F1AzbDdhfpQDsNEozCmIiM2CAKZozHqDIbZYnHFAuSmA7GhTbTmIix2CARIIrZ6AMQwIjzEY678HTjEI7SOI4yGDrniI3p+Fdy+ESq8xfa4xWnFQvySI91aI/4mI910I98pQrjsYsCGTrzSJAMZZBJgJCloJCjlSBxgn7CxgkDKZEtRZEqYZG2MoLaMyayoII0ODjgA4wgGZJrwwLoSJIzAjy6UEaxwAAKQEqx4E0u+ZLwFDrXqAQ0WQjhqD13Zi1jclpcqABA+U7l+BezWJRNs5A8BY/YcYvohpFPSU3ViDYzWZQKiT0AiRgKoHT/s+STPYCIXclLajmUM0GVUbaNcxKEhQCIzrCPXdiWvCQCobMEa4dIdoQ9oXSXdtkMLemUfLmIMdlkcplHdAl1tXIWwscZa8OWXbk6D1A+gYmDkQkbwHEW4KcLm/iTXfmVu6Eij1kH3sQ8cJKQWNkN1rOWXemXYNNBhgCYiECVV1NnV+WAZ1GIsqCXigmU1agAMmQUxUSLBqSRBHAWJagO42eaEhmVChQwq/l9mpNIDYKc/lCaPdCJ9GibJHRBmJGdgdOTDVKZtuST4imMIuCTcDSVZwQBXJIPgSNDhXKFUleN7+mJ1eh99BlGOumQ79hGpTApS5dwv/ifdViNuneQ/2EUH+wZC2NkmYepEQbkoC3FiJK3C1GRU74XkH7RIAFFIwYKjh6KmQwVnw2CgMSAnVQFAQanDgoINbTTi++Ahg3ihUmXAw0QgxUQpEGaOQSgoyChV91SofOTib85dxrBAAggIgwgAQqwfKfHAw0wf14HA1TUbTnlLlo4MxlZCHIonNagPJJIgIADA1xKgW96AC/wpVCwnF0jHcroDFdzM0/jEBAwgL+4Nlg6f4N6ejCAAIg6ABTgAmyRUxiCpoVwNbgpWik6fCTig2sTp4EXpzpAAA0AOMfzBKDlLiSaPdtpIlD6Dh3YiAR4K646AMtEAIUKeLPqdSogRRsoopkzpv99wD+cYCco2GBXowAdqQtuyqUy8KYy8A3dE5aGY0O+4o/WwD8PI1puSAwP0JsMsKB98AIvIAMy4K1zKq7h6q2N0CFgShI9QRLuMppkiqB1gC6+WQw5GI1M2jZSEEkc0ZkLgqfcWpXrWQiZ432XNISYMwD/6hDDdJ7qQJSLMSXBaqrlCZuCYw2R1yD3CTtVoDiAqYkI4KqAAyQJYCcpyj+7YSeQmq3Xw6sJIUcMSw5KoDikwybLVQEUMJnAyK38UxrRwp4JMEIK4K4agRVZkCZ9sAD94LCGwUHAWIN/Qje6sLMAm6cCyYhoKSou6z1GgA9KOxEPcKloo4AE26u3qSX/GNsSoOMAlZoZC2sE5UANDeRFi8EAgZShUKc5jHitOuRNMKoubQs30eBAsSC3n4EAgSpwqtidMNSba1sZWduxg4tBGqKTYONXgni2c8K3Ceu4hzQq/Kp5BqRAmBp1E6KAaou1bYCrzGox3lQ6o+snpOBCfQs9brAwSPC5pKmAcISp20EEuNedertJHsEkuBujQsACmJuLPlgBADEBYHO1HpS6v1C8G5EEyHseucmNIwiXEdCdGcgdVvS3WgALL2s61ruANjAEmFqMzmuOJVAcBiEVcDAI1tc5SOBN92gAmCoE3WuNbmtEp2CnBPEEGgA294ip/Ys5xbiuAEwJVtIx/9Uok6NrjiOZNYrQQ07QvtY4wT0Al7QgvH8gwHoTBRy8NhUJwnqgLlFwvSXswUfURZ4gwg4RBRrMwc5aF7GjNxRBwiUskxIaNZUwwtBKp0vwlT64wCf8GUE8w3C7CnLEwqN7w0AMCDKsukfQrFRQwz6Yv0lMEpPwE4rQSdjIBRzswv+Lw54jE0PSGPSrBRyMxElwDDVkQ+ywQmhgw6BmxQwcuOFQGI9rBQnsg41nngz7x4kAon1UBoEsktSngf8rvqewFWugxY0pCEwSLrkJM29AyWBjxqshBUhbvolcBgW8v58MBtXwBlF8yk+BxWewyqw8BoZsBQgcywFRy7ZsD/+Y6sm5rAy73MvxYMrAfA7CPMzaUMzGLA0+qADJHA5b3MzHPIJcDM3B4IO8TM2oYM3Y7MvEuM3JIMjeXM0jGM7i/JfkjAvgfM6uIM3qfAvs3M6t8M7wfArbO8/ZLJT2TM/4nM+eMM783M/m/M+U4M8CvQgEXdCBUMomjNCJwMkM3dCM/NB5QMnTLNFzQNEW/QeL3MEZrQcbfc0dvQYfHdJ4MNIkLQcHfdKqHNAqvdIL3dIuDTYwDQcpPdNqUNM2fccsndNooNAyzdNqgNFAnQZCPdRnUNRGrcgRndRisNE+zNRkYNJQPQZGDNJTnQX1fNVikNVaDQZc3dVe0M1g/QX/OD3WWL3TZp0FPt0gad0FDt3WW/DWcJ0Fcj3XV1DXdl0FG90DeY0Fe93XV/DXgK3XZT3YTSDYhi0F6ZzYULDYjO0Ejv3YTBDZkq0ElF3ZSHDZmG0Emr3ZRNDZni0ERxzalv3VpF0EPvjUp43a8rzanw3ano3Mrq2/sL3ZatkgcOzae83Rsz0Eu13Rq/3bve3bsh3cxX3au90DuX3anPwXVl3Zzd0Dqu3a0Q3cpB3dfD3c2D3cBoDdy03ao/vckj261h3ao+sA3D3B6Q3Lsz3B4s3Y7j3cE1zem43H7a3evf3G+R3f903e+33e/83ep13Cs43d/rvaBv4X0+3ZCd4DbPT92A2e3chdwhJO2sm9Nt8t2UaszQNO4Q+e2BQOlh1O4ae91vgd2hHu3BYe4rzt2RuOy7HN4h8O2Czu4Che4zOe11DcwqR92wJu2xT+3oB94Qre2xrw4gog5BDOAhHQ5BOQ4dwd5VI+5eocBAA7)`
        //设置背景
    $("body").css("background-image", 鸟 + "," + 纸)
        //模拟点击
    $("a.btn-readmore").click()
        //移除相关广告无用元素
        //顶部广告 新增
        //aside左边栏目
        //选取.blog-content-box后面的所有div兄弟元素   底部栏目
        //顶部栏目
    $('#article_content>a,[ID^=kp_box_],.pulllog-box,a[href^="https://h5.youzan.com"],.blog-content-box~div,div.csdn-side-toolbar').remove()
        //举报按钮 垃圾奖杯
    $('aside,.recommend-right,.tool-box,#reportContent,#adContent').wrap($("<div></div>")).parent().css("-webkit-mask", 'url() no-repeat')
})