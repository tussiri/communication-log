import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'My First Angular Application';
  name = "Tumaini Ussiri";
  itemList: string[] = ['My first website', 'Web Development Project', 'Test with code Pen'];
  rectangle = {
    length: 5,
    width:6,
    area: function () {
      return this.length * this.width;
    }
  }
}
