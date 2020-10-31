import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from "rxjs";
import { Book } from './book';
@Injectable({
  providedIn: 'root'
})
export class BookService {
  private homeURL="http://localhost:8080/books";
  constructor(private httpClient:HttpClient) { }
    
  getBookList(): Observable<Book[]> {
      console.log(this.httpClient.get<Book[]>("http://localhost:8080/books"));
      return this.httpClient.get<Book[]>("http://localhost:8080/books");
  }
  createBook(book:Book): Observable<Object>{
    
    return this.httpClient.post("http://localhost:8080/addbook", book);
  }
}
