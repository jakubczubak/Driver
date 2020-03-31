insert into category(name) values("safe driving");
insert into category(name) values("good practices");
insert into category(name) values("bad practices");

insert into advice(title, content) values("Lorem ipsum", "Adipiscing diam donec adipiscing tristique risus nec. Dignissim suspendisse in est ante. Vestibulum morbi blandit cursus risus at ultrices mi tempus imperdiet. Praesent elementum facilisis leo vel. Et malesuada fames ac turpis egestas. Lectus quam id leo in. Sit amet luctus venenatis lectus magna fringilla urna. Aliquam purus sit amet luctus venenatis lectus. Quis viverra nibh cras pulvinar mattis nunc sed. Id consectetur purus ut faucibus pulvinar elementum. Eget aliquet nibh praesent tristique magna sit amet purus.");
insert into advice(title, content) values("Volutpat ac tincidunt vitae semper", "Quis auctor elit sed vulputate. Accumsan lacus vel facilisis volutpat est velit egestas. Purus semper eget duis at tellus at urna condimentum. Purus ut faucibus pulvinar elementum integer enim neque. Maecenas pharetra convallis posuere morbi leo urna molestie at. Nec nam aliquam sem et. Posuere lorem ipsum dolor sit amet consectetur. Eu scelerisque felis imperdiet proin fermentum. Donec ultrices tincidunt arcu non sodales. Ipsum faucibus vitae aliquet nec ullamcorper. Lorem mollis aliquam ut porttitor leo a diam sollicitudin tempor.");
insert into advice(title, content) values("Molestie at elementum eu facilisis", "Massa enim nec dui nunc mattis enim ut tellus elementum. Risus nullam eget felis eget nunc lobortis. Euismod in pellentesque massa placerat duis ultricies lacus sed turpis. Venenatis urna cursus eget nunc scelerisque viverra mauris. Ac ut consequat semper viverra nam libero. Ut enim blandit volutpat maecenas volutpat blandit aliquam etiam erat. Arcu felis bibendum ut tristique et egestas. Sociis natoque penatibus et magnis dis parturient montes. Amet consectetur adipiscing elit ut aliquam purus sit amet. In vitae turpis massa sed.");

insert into advice_category(advice_id, category_id) values (1,1);
insert into advice_category(advice_id, category_id) values (1,2);
insert into advice_category(advice_id, category_id) values (2,2);
insert into advice_category(advice_id, category_id) values (2,3);
insert into advice_category(advice_id, category_id) values (3,3);
insert into advice_category(advice_id, category_id) values (3,1);