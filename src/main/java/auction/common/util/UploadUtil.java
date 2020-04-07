package auction.common.util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;

import org.codehaus.jackson.format.DataFormatDetector;
import org.springframework.web.multipart.MultipartFile;

/**
 * Upload 관련 Class
 * @author User
 *
 */
public class UploadUtil extends CommonCodes {
	
	private File file = null;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);

	public boolean fileUpload(MultipartFile mFile, String extensionType) throws IllegalStateException, IOException{
		if(mFile == null || "".equals(mFile))
			return false;
		
		boolean result = true;
		String originNm = "";
		String fileNm = "";
		String toDay = "";
		String originalFileExtension = "";

		try {
			originNm = mFile.getOriginalFilename();
			originalFileExtension = originNm.substring(originNm.lastIndexOf("."));
		} catch (Exception e) { 
			e.printStackTrace();
		}

		// 확장자저장형식에 따라 거른다.
		if("img".equals(extensionType)){
			for(String e : extensionArr[0]){}
		} else if("doc".equals(extensionType)){
			for(String e : extensionArr[1]){
				if(!e.equals(originalFileExtension)){}
			}
		}
		
		fileNm = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension;
		toDay = dateFormat.format(System.currentTimeMillis());
		
		file = new File(fileDownPath+"\\"+toDay+"\\"+ fileNm);
		if(!file.exists()){ file.mkdirs(); }
		mFile.transferTo(file);

		file = null;
		mFile = null;
		return true;
	}
	
}
