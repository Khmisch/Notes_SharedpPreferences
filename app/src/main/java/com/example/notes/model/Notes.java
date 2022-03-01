package com.example.notes.model;

public class Notes {
        private String note;
        private String date;

        public Notes(){

        }

        public Notes(String note,String date) {
            this.note = note;
            this.date = date;
        }

        public String getDate() {
            return date;
        }

    public void setDate(String date) {
        this.date = date;
    }

    // creating getter and setter methods.
        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

}
