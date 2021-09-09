import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './data';

@Injectable({
  providedIn: 'root'
})
export class TestServiceService {

  private list=[1,2,3,4,5];

  constructor(private http: HttpClient) { }

  getData(): Observable<Employee[]> {
    return this.http.get<Employee[]>("http://localhost:8080/employees");
  }

  postData(data: Employee){
    return this.http.post<Employee>("http://localhost:8080/rest/employee", data);
  }

}
