package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Child;
import com.example.demo.Service.ApiService;
@RestController
public class ApiController {

@Autowired

ApiService s;

@PostMapping("/addDetail")

public Child addInfo(@RequestBody Child c)

{

return s.saveDetails(c);

}

@GetMapping("/showDetail")

public List<Child> fetchDetails()

{

return s.getDetails();

}

@GetMapping("/product/{field}")

public List<Child> getWithSort(@PathVariable String field)

{

return s.getSorted(field);

}

@GetMapping("/product/{offset}/{pageSize}")

public List<Child> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize)

{

return s.getWithPagination(offset,pageSize);

}
@PutMapping("/updateDetail")

public Child updateInfo(@RequestBody Child st1)

{

return s.updateDetails(st1);

}

@DeleteMapping("/deleteDetail/{p}")

public String deleteInfo(@PathVariable("kid") int sid)

{

s.deleteDetails(sid);

return "Deleted details";

}

}
