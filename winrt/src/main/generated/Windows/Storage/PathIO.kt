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

@ABIMarker(PathIO.ABI::class)
@WinRTByReference(brClass = PathIO.ByReference::class)
public class PathIO(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PathIO> {
    public override fun getValue() = PathIO(pointer.getPointer(0))

    public fun setValue(value: PathIO): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PathIO, MemoryAddress> {
    public val IPathIOStatics_Instance: IPathIOStatics by lazy {
      createIPathIOStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPathIOStatics(): IPathIOStatics {
      val refiid = Guid.REFIID(IPathIOStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.PathIO".toHandle(),refiid,interfacePtr)
      val result = IPathIOStatics.ABI.makeIPathIOStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PathIO {
      val address = segment.toRawLongValue()
      return PathIO(Pointer(address))
    }

    public override fun toNative(obj: PathIO): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ReadTextAsync(absolutePath: String) =
        ABI.IPathIOStatics_Instance.ReadTextAsync(absolutePath)

    public fun ReadTextAsync(absolutePath: String, encoding: UnicodeEncoding) =
        ABI.IPathIOStatics_Instance.ReadTextAsync(absolutePath, encoding)

    public fun WriteTextAsync(absolutePath: String, contents: String) =
        ABI.IPathIOStatics_Instance.WriteTextAsync(absolutePath, contents)

    public fun WriteTextAsync(
      absolutePath: String,
      contents: String,
      encoding: UnicodeEncoding
    ) = ABI.IPathIOStatics_Instance.WriteTextAsync(absolutePath, contents, encoding)

    public fun AppendTextAsync(absolutePath: String, contents: String) =
        ABI.IPathIOStatics_Instance.AppendTextAsync(absolutePath, contents)

    public fun AppendTextAsync(
      absolutePath: String,
      contents: String,
      encoding: UnicodeEncoding
    ) = ABI.IPathIOStatics_Instance.AppendTextAsync(absolutePath, contents, encoding)

    public fun ReadLinesAsync(absolutePath: String) =
        ABI.IPathIOStatics_Instance.ReadLinesAsync(absolutePath)

    public fun ReadLinesAsync(absolutePath: String, encoding: UnicodeEncoding) =
        ABI.IPathIOStatics_Instance.ReadLinesAsync(absolutePath, encoding)

    public fun WriteLinesAsync(absolutePath: String, lines: IIterable<String?>) =
        ABI.IPathIOStatics_Instance.WriteLinesAsync(absolutePath, lines)

    public fun WriteLinesAsync(
      absolutePath: String,
      lines: IIterable<String?>,
      encoding: UnicodeEncoding
    ) = ABI.IPathIOStatics_Instance.WriteLinesAsync(absolutePath, lines, encoding)

    public fun AppendLinesAsync(absolutePath: String, lines: IIterable<String?>) =
        ABI.IPathIOStatics_Instance.AppendLinesAsync(absolutePath, lines)

    public fun AppendLinesAsync(
      absolutePath: String,
      lines: IIterable<String?>,
      encoding: UnicodeEncoding
    ) = ABI.IPathIOStatics_Instance.AppendLinesAsync(absolutePath, lines, encoding)

    public fun ReadBufferAsync(absolutePath: String) =
        ABI.IPathIOStatics_Instance.ReadBufferAsync(absolutePath)

    public fun WriteBufferAsync(absolutePath: String, buffer: IBuffer) =
        ABI.IPathIOStatics_Instance.WriteBufferAsync(absolutePath, buffer)

    public fun WriteBytesAsync(absolutePath: String, buffer: Array<Byte>) =
        ABI.IPathIOStatics_Instance.WriteBytesAsync(absolutePath, buffer)
  }
}
