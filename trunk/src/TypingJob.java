
public class TypingJob {
	int[] pages;
	int best_res = 99999999;
	
	// recursively caculate; 3^10
	public void do_it(int index, int p1, int p2, int p3) {
		if (index == pages.length) {
			int current = p2 > p1? p2: p1;
			current = p3 > current? p3: current;
			best_res = current < best_res? current: best_res;
			return;
		}
		do_it(index+1, p1+ pages[index], p2, p3);
		do_it(index+1, p1, p2+ pages[index], p3);
		do_it(index+1, p1, p2, p3 + pages[index]);
	}
	public int bestTime(int[] pages) { 
		this.pages = pages;
		do_it(1, pages[0], 0, 0);
		return best_res;
	}
}
