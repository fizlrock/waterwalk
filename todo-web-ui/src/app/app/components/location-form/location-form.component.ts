
import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA, MatDialogModule } from '@angular/material/dialog';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { CommonModule } from '@angular/common';
import { WaterwalkService } from '../../services/waterwalk.service';

@Component({
  selector: 'app-location-form',
  imports: [MatButtonModule, MatInputModule, CommonModule, MatDialogModule, ReactiveFormsModule],
  templateUrl: './location-form.component.html',
  styleUrl: './location-form.component.scss'
})
export class LocationFormComponent {

  entityForm: FormGroup;
  constructor(
    private fb: FormBuilder,
    private dialogRef: MatDialogRef<LocationFormComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { name: string; description: string } | null
  ) {

    this.entityForm = this.fb.group({
      name: ['', Validators.required],
      description: ['']
    });
    if (data) {
      this.entityForm.patchValue(data);
    }

  }
  save() {

    if (this.entityForm.valid) {
      this.dialogRef.close(this.entityForm.value);
    }

  }

  cancel() {
    this.dialogRef.close();
  }
}


