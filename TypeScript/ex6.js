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
var BaseClass = /** @class */ (function () {
    function BaseClass(x) {
        this.a = x;
    }
    BaseClass.prototype.getValue = function () {
        return this.a;
    };
    return BaseClass;
}());
var DerivedClass = /** @class */ (function (_super) {
    __extends(DerivedClass, _super);
    function DerivedClass(y) {
        var _this = _super.call(this, 100) || this;
        _this.b = y;
        return _this;
    }
    DerivedClass.prototype.showData = function () {
        console.log(_super.prototype.getValue.call(this));
        console.log(this.b);
    };
    return DerivedClass;
}(BaseClass));
var derivedObj = new DerivedClass(200);
derivedObj.showData();
