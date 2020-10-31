import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from "rxjs";
import { Book } from './book';
@Injectable({
  providedIn: 'root'
})
export class BookService {
  private homeURL="http://localhost:8080/books";
  private baseURL="http://localhost:8080/employees";
  constructor(private httpClient:HttpClient) { }
    
  getBookList(): Observable<Book[]> {
      console.log(this.httpClient.get<Book[]>("http://localhost:8080/books"));
      return this.httpClient.get<Book[]>("http://localhost:8080/books");
  }
  createBook(book:Book): Observable<Object>{
    
    return this.httpClient.post("http://localhost:8080/addbook", book);
  }
  updateBook(id: number, book: Book): Observable<Object>{
    return this.httpClient.put("http://localhost:8080/updatebook", book);
  }
  getBookById(id: number): Observable<Book>{
  
    return this.httpClient.get<Book>(`${this.homeURL}/${id}`);
  }
  deleteBook(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
}
