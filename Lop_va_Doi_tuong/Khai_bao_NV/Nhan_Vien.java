package Lop_va_Doi_tuong.Khai_bao_NV;

public class Nhan_Vien {

        private String ten;
        private String gioitinh;
        private String ngsinh;
        private String diachi;
        private String mathue;
        private String ngky;

        public Nhan_Vien() {
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public void setGioitinh(String gioitinh) {
            this.gioitinh = gioitinh;
        }

        public void setNgsinh(String ngsinh) {
            this.ngsinh = ngsinh;
        }

        public void setDiachi(String diachi) {
            this.diachi = diachi;
        }

        public void setMathue(String mathue) {
            this.mathue = mathue;
        }

        public void setNgky(String ngky) {
            this.ngky = ngky;
        }

        public void show() {
            System.out.printf("00001 %s %s %s %s %s %s", ten, gioitinh, ngsinh, diachi, mathue, ngky);
        }
    }
