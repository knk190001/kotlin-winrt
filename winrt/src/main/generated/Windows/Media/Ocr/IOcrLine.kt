package Windows.Media.Ocr

import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IOcrLine.ABI::class)
@Signature("{0043a16f-e31f-3a24-899c-d444bd088124}")
@Guid("0043a16fe31f3a24899cd444bd088124")
@WinRTInterface("0043a16fe31f3a24899cd444bd088124")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOcrLine.ByReference::class)
public interface IOcrLine : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Words(): IVectorView<OcrWord?>?

  @InterfaceMethod(1)
  public fun get_Text(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IOcrLine> {
    public override fun getValue() = ABI.makeIOcrLine(pointer.getPointer(0))

    public fun setValue(value: IOcrLine_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOcrLine {
    public val __1658496690_Ptr: Pointer?

    public val _1658496690_VtblPtr: Pointer?
      get() = __1658496690_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Words(): IVectorView<OcrWord?>? {
      val fnPtr = _1658496690_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<OcrWord?>>()
      val hr = fn.invokeHR(arrayOf(__1658496690_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<OcrWord?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Text(): String? {
      val fnPtr = _1658496690_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1658496690_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IOcrLine_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1658496690_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOcrLine, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0043a16fe31f3a24899cd444bd088124")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOcrLine(ptr: Pointer?): WithDefault = IOcrLine_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOcrLine {
      val address = segment.toRawLongValue()
      return makeIOcrLine(Pointer(address))
    }

    public override fun toNative(obj: IOcrLine): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1658496690_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOcrLine): Array<IOcrLine?> = (elements as
        Array<IOcrLine?>).castToImpl<IOcrLine,IOcrLine_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOcrLine?> = arrayOfNulls<IOcrLine_Impl>(size) as
        Array<IOcrLine?>
  }
}
