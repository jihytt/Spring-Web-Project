package com.spring.recycle.util;

public class FundingCriteria {
		
		private int page;
		private int perPageNum; // 한 페이지에 출력될 개수
		private int rowStart;
		private int rowEnd;
		
		public FundingCriteria() {
			this.page = 1;
			this.perPageNum = 9;
		}
		
		public void setPage(int page) {
			if (page <= 0) {
				this.page = 1;
				return;
			}
			this.page = page;
		}
		
		public void setPerPageNum(int perPageNum) {
			if (perPageNum <= 0 || perPageNum > 100) {
				this.perPageNum = 9;
				return;
			}
			this.perPageNum = perPageNum;
		}
		
		public int getPage() {
			return page;
		}
		
		public int getPageStart() {
			return (this.page - 1) * perPageNum;
		}
		
		public int getPerPageNum() {
			return this.perPageNum;
		}
		
		public int getRowStart() {
			rowStart = ((page - 1) * perPageNum) + 1;
			return rowStart;
		}
		
		public int getRowEnd() {
			rowEnd = rowStart + perPageNum - 1;
			return rowEnd;
		}

		@Override
		public String toString() {
			return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ", rowStart=" + rowStart + ", rowEnd=" + rowEnd
					+ "]";
		}
		
}


	

