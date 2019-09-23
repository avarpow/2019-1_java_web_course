package stockseller;

public class StockSeller {
    int[] price;
    int len;

    public StockSeller(int[] price) {
        len = price.length;
        this.price = price.clone();
    }
    
    public String MaxProfit1() {
        int maxx = 0;
        if (this.len == 0 || this.len == 1)
            maxx = 0;
        else {
            int base = this.price[0];
            for (int i = 0; i < len; i++) {
                for (int j = i; j < len; j++) {
                    if (this.price[j] - this.price[i] > maxx) {
                        maxx = this.price[j] - this.price[i];
                    }
                }
            }
        }
        return "" + maxx;
    }

    public String MaxProfit2() {
        int profit = 0;
        if (this.len == 0 || this.len==1)
            profit = 0;
        else {
            int base = this.price[0];
            for (int i = 1; i < this.len; i++) {
                if (this.price[i] < this.price[i - 1]) {
                    profit = profit + max(0, this.price[i - 1] - base);
                    base = this.price[i];
                }
            }
            profit = profit + max(0, this.price[this.len - 1] - base);
        }
        return "" + profit;
    }

    public String MaxProfit3() {
        int maxx = 0;
        
        if (this.len == 0 || this.len==1)
            maxx = 0;
        else {  
            for (int i = 1; i < this.len - 1; i++) {
                int max1 = 0, max2 = 0;
                for (int j = 0; j < i; j++) {
                    for (int k = j; k < i; k++) {
                        if (this.price[k] - this.price[j] > max1) {
                            max1 = this.price[k] - this.price[j];
                        }
                    }
                }
                for (int j = i; j < this.len; j++) {
                    for (int k = j; k < this.len; k++) {
                        if (this.price[k] - this.price[j] > max2) {
                            max2 = this.price[k] - this.price[j];
                        }
                    }
                }
                maxx = max(maxx, max1 + max2);
            }
        }

        return "" + maxx;
    }

    public int max(int a,int b){
        if(a<b)return b;
        else return a;
    }
    
}