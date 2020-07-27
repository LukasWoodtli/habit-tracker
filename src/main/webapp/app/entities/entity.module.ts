import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'points',
        loadChildren: () => import('./points/points.module').then(m => m.HabitTrackerPointsModule),
      },
      {
        path: 'weight',
        loadChildren: () => import('./weight/weight.module').then(m => m.HabitTrackerWeightModule),
      },
      {
        path: 'preferences',
        loadChildren: () => import('./preferences/preferences.module').then(m => m.HabitTrackerPreferencesModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class HabitTrackerEntityModule {}
