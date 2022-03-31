package com.training.pms.model;


	@Entity
	public class Book {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int bookId;

		@Column(name = "book_name")
		private String bookName;

		@OneToMany(fetch = FetchType.EAGER, mappedBy="book", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("book")
		private List<Story> storyList = new ArrayList<>();

		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public List<Story> getStoryList() {
			return storyList;
		}

		public void setStoryList(List<Story> storyList) {
			this.storyList = storyList;
		}		

	}
	public class Book {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int bookId;

		@Column(name = "book_name")
		private String bookName;

		@OneToMany(fetch = FetchType.EAGER, mappedBy="book", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("book")
		private List<Story> storyList = new ArrayList<>();

		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public List<Story> getStoryList() {
			return storyList;
		}

		public void setStoryList(List<Story> storyList) {
			this.storyList = storyList;
		}		

	}