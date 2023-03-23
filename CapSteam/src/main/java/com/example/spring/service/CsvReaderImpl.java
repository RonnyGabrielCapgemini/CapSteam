package com.example.spring.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseDouble;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.Token;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import com.example.spring.model.Juego;
import com.example.spring.repository.JuegoDAO;

@Service
public class CsvReaderImpl implements CsvReader{

	@Autowired
	JuegoDAO juegoDao;
	
	@Override
	public void loadData() throws IOException {
		String fileName = "csv/vgsales.csv";
		
		ICsvBeanReader beanReader = null;
		
        try {
            beanReader = new CsvBeanReader(new FileReader(fileName), CsvPreference.STANDARD_PREFERENCE);
            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = getProcessors();

            Juego juego;
            while ((juego = beanReader.read(Juego.class, header, processors)) != null) {
            	System.out.println(juego.getRank());
            	System.out.println("---- "+juego);
               juegoDao.save(juego);
               System.out.println("-----------");
            }
        } finally {
            if (beanReader != null) {
                beanReader.close();
            }
        }
    }

    private static CellProcessor[] getProcessors(){
        return new CellProcessor[] {
                new ParseInt(),
                new Optional(),
                new Optional(),
                new Token("N/A", 0, new ParseInt()),
                new Optional(),
                new Optional(),
                new ParseDouble(),
                new ParseDouble(),
                new ParseDouble(),
                new ParseDouble(),
                new ParseDouble(),
                };
		
	}
	
}
