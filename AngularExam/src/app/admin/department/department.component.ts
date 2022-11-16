import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs/internal/Subscription';
import { HttpService } from 'src/app/service/http.service';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit,OnDestroy {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  
 
  ngOnDestroy(): void {
  }
}