import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BookListComponent } from './book-list/book-list.component';
import { CreateBookComponent } from "./create-book/create-book.component";
const routes: Routes = [{path:'books', component:BookListComponent},{path:'', redirectTo : 'books',pathMatch:'full'},{path:'create-book', component:CreateBookComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
