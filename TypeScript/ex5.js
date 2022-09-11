"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Sample = /** @class */ (function () {
    function Sample() {
        this.a = 100;
        this.b = 200;
    }
    Sample.prototype.showData = function () {
        console.log(this.a);
        console.log(this.b);
    };
    return Sample;
}());
var Sample1 = /** @class */ (function (_super) {
    __extends(Sample1, _super);
    function Sample1() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Sample1.prototype.cal = function () {
        this.c = 100 + this.b;
    };
    Sample1.prototype.show = function () {
        this.showData();
        console.log(this.c);
    };
    return Sample1;
}(Sample));
var sampleObj = new Sample1();
sampleObj.show();
