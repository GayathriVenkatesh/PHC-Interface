import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import { UserService } from './service/user.service';
import { PatientService } from './service/patient.service';
import { PatientTableComponent } from './patient-table/patient-table.component';
import { FollowupService } from './service/followup.service';
import { FollowupTableComponent } from './followup-table/followup-table.component';

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    PatientTableComponent,
    UserFormComponent,
    FollowupTableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserService, PatientService, FollowupService],
  bootstrap: [AppComponent]
})
export class AppModule { }