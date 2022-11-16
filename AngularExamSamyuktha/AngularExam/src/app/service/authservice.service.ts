import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AuthserviceService {
  ApiUrl = environment.ApiUrl;

  constructor(private http: HttpClient) {}
  public loginpost(url: string, object: any) {
    return this.http.post(`${this.ApiUrl}${url}`, object);
  }
}