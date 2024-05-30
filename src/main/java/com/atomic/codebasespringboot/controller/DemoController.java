package com.atomic.codebasespringboot.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/demo")
@Tag(name = "Demo", description = "Demo API")

public class DemoController {

}
