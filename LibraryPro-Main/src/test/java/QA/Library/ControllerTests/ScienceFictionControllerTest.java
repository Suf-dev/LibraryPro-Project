
	
	
	
//	private ObjectMapper mapper = new ObjectMapper();
	
//	private ScienceFiction testScifi;
	
//	private ScienceFiction testWithScifiId;
	
//	private ScienceFiction testId;
	
	
//	@Before
//	public void init() {
//		this.repo.deleteAll();
//		//this.testId = new ScienceFiction(1,"Steel Man", "Mark Jacob", "12/05/2013", "JENF64646");
//		this.testScifi = new ScienceFiction("Steel Man", "Mark Jacob", "12/05/2013", "JENF64646");
//		this.testWithScifiId = this.repo.save(this.testScifi);
//	}
    
//	@Test 
//	public void testInsert() throws Exception{
//		MockHttpServletRequestBuilder mockRequest = 
//				MockMvcRequestBuilders.request(HttpMethod.POST, "/insert");
//
//	    mockRequest.contentType(MediaType.APPLICATION_JSON)
//	    	.content(this.mapper.writeValueAsString(testScifi))
//	    		.accept(MediaType.APPLICATION_JSON);
//	    	
//		    ResultMatcher matchStatus = MockMvcResultMatchers.status().isCreated();
//
//	    	ResultMatcher matchContent = MockMvcResultMatchers.content()
//	    	 		.json(this.mapper.writeValueAsString(testWithScifiId));
//	    	 
//	    this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);
//	}

	
//	@Test
//	public void testReadById() throws Exception {
//		MockHttpServletRequestBuilder mockRequest = 
//				MockMvcRequestBuilders.request(HttpMethod.POST, "/");
//	  
//		
//		
//		this.mock.perform( MockMvcRequestBuilders
//	      .get("/readbyid/{a}", 1)
//	      .accept(MediaType.APPLICATION_JSON)
//	      .andDo(print())
//	      .andExpect(status().isOk())
//	      .andExpect(MockMvcResultMatchers.jsonPath("$.sid").value(1));
//	}
	
//-------------------------------------------------------------------------------------------------
	
	
//	@PostMapping("/insert")
//	public ScienceFiction insert(@RequestBody ScienceFiction scifi) {
//		return serv.insert(scifi);
//	}
//---------------------------------------------------------------------------------------------------
//	
	;

//
//
//	}
////	
//	@Test 
//	public void testReadId() throws Exception{
//		Optional<ScienceFiction> expectOptional = Optional.ofNullable(new ScienceFiction(28,"Robots", "Sam Paul", "19/02/2011", "IDJ6554654"));
//		when(serv.readByid(28)).thenReturn(expectOptional);
//		assertEquals(control.readByid(28), (expectOptional));
//
//		
//	}
//	
//	
//// ------------------------------------------------------------------------------------------------------
	

//	
//	
////	@GetMapping("/viewAll")
////	public ResponseEntity<List<ScienceFiction>> readAll(){
////		List<ScienceFiction> read = serv.readAll();
////		return ResponseEntity.ok(read);
////	}
//	
//	
//	
//	
//	
//	
//	
//	
//// ------------------------------------------------------------------------------------------------------
//
//	@Test
//	public void testReadAll() throws Exception{
//		
//		List<ScienceFiction> shelf = new ArrayList<ScienceFiction>();
//		
//		shelf.add(new ScienceFiction("Robots", "Sam Paul", "19/02/2011", "IDJ6554654"));
//		shelf.add(new ScienceFiction("Steel Man", "Mark Jacob", "12/05/2013", "JENF64646"));
//		shelf.add(new ScienceFiction("Electro Fan", "John Adams", "22/01/2001", "65454654654"));
//		
//		when(serv.readAll()).thenReturn((List<ScienceFiction>) shelf);
//		assertEquals(control.readAll(), (shelf));
//
//		
//		
//		

//	
	
	
	
	









	
	
		
		
		
		
		
//		MockHttpServletRequestBuilder mockRequest = 
//				MockMvcRequestBuilders.request(HttpMethod.GET, "/readbyid/28");
//		
////		ScienceFiction expectObject = new ScienceFiction(28, "Graphics", "Tom Hilton", "02/05/1914", "6464654LJWEQN");
//		
//		
//
//	    mockRequest.contentType(MediaType.APPLICATION_JSON)
//	    	.content(this.mapper.writeValueAsString(""))
//	    		.accept(MediaType.APPLICATION_JSON);
//	    	
//		    ResultMatcher matchStatus = MockMvcResultMatchers.status().isOk();
//
//	    	ResultMatcher matchContent = MockMvcResultMatchers.content()
//	    	 		.json(this.mapper.writeValueAsString(expectObject));
//	    	 
//	    this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);
//	
	
	
	
	
	
	
	
		
//	}
//	
//	@Test 
//	public void testViewAll() throws Exception{
//		MockHttpServletRequestBuilder mockRequest = 
//				MockMvcRequestBuilders.request(HttpMethod.GET, "/viewAll");
//
//	    mockRequest.contentType(MediaType.APPLICATION_JSON)
//	    	.content(this.mapper.writeValueAsString(testScifi))
//	    		.accept(MediaType.APPLICATION_JSON);
//	    	
//		    ResultMatcher matchStatus = MockMvcResultMatchers.status().isOk();
//
//	    	ResultMatcher matchContent = MockMvcResultMatchers.content()
//	    	 		.json(this.mapper.writeValueAsString(testWithScifiId));
//	    	 
//	    this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);
//		
//	}
//	
	
//	@Test 
//	public void testViewAll() throws Exception{
//		MockHttpServletRequestBuilder mockRequest = 
//				MockMvcRequestBuilders.request(HttpMethod.GET, "/viewAll");
//
//	    mockRequest.accept(MediaType.APPLICATION_JSON);
//	    	
//		    ResultMatcher matchStatus = MockMvcResultMatchers.status().isOk();
//
//	    	ResultMatcher matchContent = MockMvcResultMatchers.jsonPath("$.viewAll").exists();
//	    	
//	    	ResultMatcher matchCon = MockMvcResultMatchers.jsonPath("$.viewAll[*].testWithScifiId").isNotEmpty();
//	    	 
//	    this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent).andExpect(matchCon);
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	


