package com.example.dell.myapplication;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView view = (WebView) findViewById(R.id.webView);
        WebSettings setting = view.getSettings();
        setting.setLoadWithOverviewMode(true);
        String data = "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P><P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "<P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P><P>Trong cả tuần, chúng ta dường như không thể có thời gian để đọc những tin tức yêu thích về ngành nghề của bạn, mở một cuốn\n" +
                " sách mới hoặc ngồi xuống và nghe tin tức. Thực tế là phần lớn người Mỹ thậm chí còn không có đủ thời gian để ngủ. Vậy bạn phải \n" +
                " làm thế nào? Lời khuyên của Taylor là hãy để dành những việc đó cho cuối tuần, kèm thêm một chai sâm panh và biến nó thành một ngày thư giãn.\n" +
                " Nếu có nhiều thời gian, Taylor sẽ xem thêm phim tài liệu. Những hoạt động này đều mang lại lợi ích cho quá trình phát triển chuyên nghiệp của anh.\n" +
                "</P>\n" +
                "hahah";
        view.loadData(data, "text/html; charset=UTF-8", null);



    }
}
