public static void reservation(String gun, int aracNo) {

        /* Java uygulamasında bir ana yöntem oluşturmanızı sağlayan araçtır. Programın temel yöntemidir ve diğerlerini çağırır.
        Değerleri döndüremez ve karmaşık komut satırı işleme için parametreleri kabul eder.*/
        Araba_Rezervasyon rezervasyon = new Araba_Rezervasyon();
        if (aracNo == 1) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesi1) {
                    pazartesi1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!sali1) {
                    sali1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsamba1) {
                    carsamba1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembe1) {
                    persembe1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cuma1) {
                    cuma1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesi1) {
                    cumartesi1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazar1) {
                    pazar1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            }
        }
        if (aracNo == 2) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesi2) {
                    pazartesi2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!sali2) {
                    sali2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsamba2) {
                    carsamba2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembe2) {
                    persembe2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cuma2) {
                    cuma2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesi2) {
                    cumartesi2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazar2) {
                    pazar2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            }
        }
        if (aracNo == 3) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesi3) {
                    pazartesi3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!sali3) {
                    sali3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsamba3) {
                    carsamba3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembe3) {
                    persembe3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cuma3) {
                    cuma3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesi3) {
                    cumartesi3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazar3) {
                    pazar3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            }
        }
        if (aracNo == 4) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesi4) {
                    pazartesi4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!sali4) {
                    sali4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsamba4) {
                    carsamba4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembe4) {
                    persembe4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cuma4) {
                    cuma4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesi4) {
                    cumartesi4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazar4) {
                    pazar4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            }
        }
        if (aracNo == 5) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesiVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesiVip1) {
                    pazartesiVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (saliVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!saliVip1) {
                    saliVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsambaVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsambaVip1) {
                    carsambaVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembeVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembeVip1) {
                    persembeVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cumaVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumaVip1) {
                    cumaVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesiVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesiVip1) {
                    cumartesiVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazarVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazarVip1) {
                    pazarVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            }
        }
        if (aracNo == 6) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesiVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesiVip2) {
                    pazartesiVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (saliVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!saliVip2) {
                    saliVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsambaVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsambaVip2) {
                    carsambaVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembeVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembeVip2) {
                    persembeVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cumaVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumaVip2) {
                    cumaVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesiVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesiVip2) {
                    cumartesiVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            }
            else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazarVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                }
                else if (!pazarVip2) {
                    pazarVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            }
        }
    }
