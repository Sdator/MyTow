export default class Add {
    constructor(x, y) {
        return () => [...arguments].reduce(function (a, b) {

            return a + b
        })

    }
    test(a, b) {
        return a * b
    }

}

let num = new Add(12, 34)
console.log(num(), 1111)





    //     let test = new Proxy(Add,{
    //         get(target, name) {
    //             console.log(444444)
    //             return 'Hello, ' + name;
    //         },
    //         apply(target, thisBinding, args) {
    //             console.log(222222)
    //             return args[0];
    //         },
    //         construct(target, args) {
    //             return ()=>args.reduce(function(a, b) {
    //                 return a + b
    //             })
    //         }

    //     })

    //     console.log(Reflect.toString.call(t))