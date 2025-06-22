package com.example.firstproject.controller;

import com.example.firstproject.domain.Member;
import com.example.firstproject.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {
    @@ -13,4 +19,26 @@ public class MemberController {
        public MemberController(MemberService memberService) {
            this.memberService = memberService;
        }

        @GetMapping("/members/new")
        public String createForm() {
            return "members/createMemberForm";
        }

        @PostMapping
        public String create(MemberForm form) {
            Member member = new Member();
            member.setName(form.getName());

            memberService.join(member);

            return "redirect:/";
        }

        @GetMapping("/members")
        public String list(Model model) {
            List<Member> members = memberService.findMembers();
            model.addAttribute("members", members);
            return "members/memberList";
        }
    }

    public class MemberForm {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }