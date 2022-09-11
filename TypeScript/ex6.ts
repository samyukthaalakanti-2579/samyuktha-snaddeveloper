export{ }

class BaseClass {
    private a: number;
    public constructor(x: number){
        this.a =x;
    }
    public getValue() {
        return this.a;
    }
}
class DerivedClass extends BaseClass{
    private b: number;

    public constructor(y: number){
        super(100);
        this.b = y;
    }
public showData() {
    console.log(super.getValue());
    console.log(this.b);
}
}
let derivedObj = new DerivedClass(200);
derivedObj.showData();