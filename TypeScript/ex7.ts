export { }
interface  IInter {
    getData();
    showData();
}

class Test implements IInter {
    private firstName: string;
    private lastName: string;

    getData() {
        this.firstName="Samyuktha";
        this.lastName="Alakanti";
    }
    showData() {
        console.log(this.firstName);
        console.log(this.lastName);
    }
}
    let obj: IInter;
    obj = new Test();
    obj.getData();
    obj.showData();
    
    interface IEmployee{
        empNumber :number;
        empName: string;
        empSalary: number;
        empAddress?: string;
    }
let employee = {} as IEmployee;
let employees = [] as IEmployee[];

        
    
