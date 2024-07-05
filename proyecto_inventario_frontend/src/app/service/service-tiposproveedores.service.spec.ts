import { TestBed } from '@angular/core/testing';

import { ServiceTiposproveedoresService } from './service-tiposproveedores.service';

describe('ServiceTiposproveedoresService', () => {
  let service: ServiceTiposproveedoresService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceTiposproveedoresService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
