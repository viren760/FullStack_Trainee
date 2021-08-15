import { Employee } from './Employee';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError } from 'rxjs/operators';
import { throwError} from 'rxjs'; 
import { Observable } from 'rxjs';

@Injectable()
export class EmployeeService {
  
  private _url:string="/assets/data/employee1.json"

  constructor(private http: HttpClient) { }

  getEmployees():Observable<Employee[]>{
  return this.http.get<Employee[]>(this._url)
       .pipe(catchError(this.errorHandler)) 
  }

  errorHandler(error :HttpErrorResponse){
    if(error instanceof HttpErrorResponse){
     
    }else{
      
    }
    return throwError(error.message);
  }

}
