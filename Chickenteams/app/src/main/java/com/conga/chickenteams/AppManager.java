package com.conga.chickenteams;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class AppManager {
        protected String id;
        protected String content;
        protected ArrayList<AppManager> list = new ArrayList<AppManager>() ;// 1 list các đối tượng appmanager
        protected ArrayList<String> listTag = new ArrayList<String>();
        protected Scanner sc = new Scanner(System.in);

        public AppManager() {

        }

        public AppManager(String id, String content) {
            this.id = id;
            this.content = content;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String inputId() {
            System.out.println("Input id:");
            return sc.nextLine();
        }

        public String inputContent() {
            System.out.println("Input content:");
            return sc.nextLine();
        }

        public ArrayList<AppManager> getList() {
            return list;
        }

        public void setList(ArrayList<AppManager> list) {
            this.list = list;
        }

        // add một đối tượng appmanager vào list
        /*
         * Hiện tại hàm này chúng t đang làm bị một lỗi là null poiter exception, các
         * bạn xem và sửa nhé
         */
        public abstract void add();
        // thay doi noi dung cua doi tuong
        public abstract void edit(String id);

        public boolean favorite(boolean mark) {
            if(mark) return true;
            return false;
        }

        // show đối tượng ra ngoài màn hình
        public abstract void show();
}
