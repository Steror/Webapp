import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CarService {
  public API = '//localhost:8080/cars';

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get(this.API);
  }

  get(id: string) {
    return this.http.get(this.API + '/' + id);
  }

  save(car: any): Observable<any> {
    let result: Observable<any>;
    if (car.id) {
      result = this.http.put(this.API, car);
    } else {
      result = this.http.post(this.API, car);
    }
    return result;
    }

  remove(id) {
    return this.http.delete(this.API + '/' + id);
  }
}
