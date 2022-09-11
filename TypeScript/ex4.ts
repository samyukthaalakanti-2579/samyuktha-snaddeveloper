export { }
class Sample {
    private _firstName: string;
    public get firstName() : string {
        return this._firstName;
    }
    
    public set firstName(v: string){
        this._firstName = v;
    }
    private _lastName: string;
    public get lastName(): string {
        return this._lastName;
    }
    public set lastName(v: string) {
        this._lastName = v;
    }
}
let sampleObj = new Sample();
sampleObj.firstName ="Samyuktha";
sampleObj.lastName="Alakanti";

console.log(sampleObj.firstName);
console.log(sampleObj.lastName);