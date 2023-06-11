package com.example.re.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.re.entity.AddressBook;
import com.example.re.mapper.AddressBookMapper;
import com.example.re.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
