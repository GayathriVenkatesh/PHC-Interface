import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import { PatientTableComponent } from './patient-table/patient-table.component';
import { BrowserModule } from '@angular/platform-browser';
import { PatientDetailsComponent } from './patient-details/patient-details.component';
import { FollowupTableComponent } from './followup-table/followup-table.component';

const routes: Routes = [
  { path: 'users', component: UserListComponent },
  { path: 'patients', component: PatientTableComponent },
  { path: 'patient/:rchId', component: PatientDetailsComponent },
  { path: 'adduser', component: UserFormComponent },
  { path: 'followup-list', component: FollowupTableComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes), BrowserModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }