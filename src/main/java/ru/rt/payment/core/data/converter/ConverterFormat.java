package ru.rt.payment.core.data.converter;


import ru.rt.payment.core.data.FileType;

// Для различных форматов данных требуется соответсвующий алгоритм для конвертации и сжатия данных в байты.
// Поэтому каждый формат(JSON, PNG, JPEG, XML) могут обрабатываться по разному
// Классы имплементирующий данный интерфейс, могут использоваться в класс производных от типа RequestConverter and ResponseConverter
public interface ConverterFormat {
    byte[] convertToByte();

    FileType convertFromByte(byte[] bytes);
}
