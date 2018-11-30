import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IUser } from './user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private url:string = "http://localhost:8080/user/all";

  constructor(private http: HttpClient) { }

  getUsers():Observable<IUser[]>{
    return this.http.get<IUser[]>(this.url);  
  }
}
