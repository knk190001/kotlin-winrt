package Windows.Storage

import Windows.Foundation.Collections.IIterable
import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.UnicodeEncoding
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Byte
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FileIO.ABI::class)
@WinRTByReference(brClass = FileIO.ByReference::class)
public class FileIO(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FileIO> {
    public override fun getValue() = FileIO(pointer.getPointer(0))

    public fun setValue(value: FileIO): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileIO, MemoryAddress> {
    public val IFileIOStatics_Instance: IFileIOStatics by lazy {
      createIFileIOStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFileIOStatics(): IFileIOStatics {
      val refiid = Guid.REFIID(IFileIOStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.FileIO".toHandle(),refiid,interfacePtr)
      val result = IFileIOStatics.ABI.makeIFileIOStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FileIO {
      val address = segment.toRawLongValue()
      return FileIO(Pointer(address))
    }

    public override fun toNative(obj: FileIO): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ReadTextAsync(`file`: IStorageFile) = ABI.IFileIOStatics_Instance.ReadTextAsync(file)

    public fun ReadTextAsync(`file`: IStorageFile, encoding: UnicodeEncoding) =
        ABI.IFileIOStatics_Instance.ReadTextAsync(file, encoding)

    public fun WriteTextAsync(`file`: IStorageFile, contents: String) =
        ABI.IFileIOStatics_Instance.WriteTextAsync(file, contents)

    public fun WriteTextAsync(
      `file`: IStorageFile,
      contents: String,
      encoding: UnicodeEncoding
    ) = ABI.IFileIOStatics_Instance.WriteTextAsync(file, contents, encoding)

    public fun AppendTextAsync(`file`: IStorageFile, contents: String) =
        ABI.IFileIOStatics_Instance.AppendTextAsync(file, contents)

    public fun AppendTextAsync(
      `file`: IStorageFile,
      contents: String,
      encoding: UnicodeEncoding
    ) = ABI.IFileIOStatics_Instance.AppendTextAsync(file, contents, encoding)

    public fun ReadLinesAsync(`file`: IStorageFile) =
        ABI.IFileIOStatics_Instance.ReadLinesAsync(file)

    public fun ReadLinesAsync(`file`: IStorageFile, encoding: UnicodeEncoding) =
        ABI.IFileIOStatics_Instance.ReadLinesAsync(file, encoding)

    public fun WriteLinesAsync(`file`: IStorageFile, lines: IIterable<String?>) =
        ABI.IFileIOStatics_Instance.WriteLinesAsync(file, lines)

    public fun WriteLinesAsync(
      `file`: IStorageFile,
      lines: IIterable<String?>,
      encoding: UnicodeEncoding
    ) = ABI.IFileIOStatics_Instance.WriteLinesAsync(file, lines, encoding)

    public fun AppendLinesAsync(`file`: IStorageFile, lines: IIterable<String?>) =
        ABI.IFileIOStatics_Instance.AppendLinesAsync(file, lines)

    public fun AppendLinesAsync(
      `file`: IStorageFile,
      lines: IIterable<String?>,
      encoding: UnicodeEncoding
    ) = ABI.IFileIOStatics_Instance.AppendLinesAsync(file, lines, encoding)

    public fun ReadBufferAsync(`file`: IStorageFile) =
        ABI.IFileIOStatics_Instance.ReadBufferAsync(file)

    public fun WriteBufferAsync(`file`: IStorageFile, buffer: IBuffer) =
        ABI.IFileIOStatics_Instance.WriteBufferAsync(file, buffer)

    public fun WriteBytesAsync(`file`: IStorageFile, buffer: Array<Byte>) =
        ABI.IFileIOStatics_Instance.WriteBytesAsync(file, buffer)
  }
}
