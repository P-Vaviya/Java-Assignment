class Time{
    private int hr=5, min=0, sec=5;

    Time(int sec){

        if((sec + this.sec) >= 60){

            while((sec + this.sec)>=60){

                sec -= 60;
                this.min += 1;

                if(min >= 60){
                    this.min -= 60;
                    this.hr += 1;
                }

            }
        }




        if(sec < 60){
            if((sec + this.sec) >= 60){

            while(sec>=60){

                this.sec += sec;
                this.sec -= 60;
                this.min += 1;

                if(min >= 60){
                    this.min -= 60;
                    this.hr += 1;
                }

            }
        }

        else{
            this.sec += sec;
        }
        }

        System.out.println(this.hr + " : " + this.min + " : " + this.sec);
    }

    public static void main(String[] args){
        Time t = new Time(3660);

    }
}