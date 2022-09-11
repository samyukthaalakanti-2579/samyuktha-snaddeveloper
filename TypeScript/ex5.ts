export{ }

class Sample{
    private a = 100;
    protected b = 200;
    public showData() {
        console.log(this.a);
        console.log(this.b);
    }
}
class Sample1 extends Sample {
 c: number;
 public cal()
 {
    this.c=100 + this.b;
 }
 public show(): void {
     this.showData();
     console.log(this.c);
 }
}
let sampleObj = new Sample1();
sampleObj.show();