package Windows.Media.Ocr

import Windows.Foundation.Rect
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

@ABIMarker(IOcrWord.ABI::class)
@Signature("{3c2a477a-5cd9-3525-ba2a-23d1e0a68a1d}")
@Guid("3c2a477a5cd93525ba2a23d1e0a68a1d")
@WinRTInterface("3c2a477a5cd93525ba2a23d1e0a68a1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOcrWord.ByReference::class)
public interface IOcrWord : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BoundingRect(): Rect?

  @InterfaceMethod(1)
  public fun get_Text(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IOcrWord> {
    public override fun getValue() = ABI.makeIOcrWord(pointer.getPointer(0))

    public fun setValue(value: IOcrWord_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOcrWord {
    public val __1658830280_Ptr: Pointer?

    public val _1658830280_VtblPtr: Pointer?
      get() = __1658830280_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BoundingRect(): Rect? {
      val fnPtr = _1658830280_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1658830280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Text(): String? {
      val fnPtr = _1658830280_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1658830280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IOcrWord_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1658830280_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOcrWord, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c2a477a5cd93525ba2a23d1e0a68a1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOcrWord(ptr: Pointer?): WithDefault = IOcrWord_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOcrWord {
      val address = segment.toRawLongValue()
      return makeIOcrWord(Pointer(address))
    }

    public override fun toNative(obj: IOcrWord): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1658830280_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOcrWord): Array<IOcrWord?> = (elements as
        Array<IOcrWord?>).castToImpl<IOcrWord,IOcrWord_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOcrWord?> = arrayOfNulls<IOcrWord_Impl>(size) as
        Array<IOcrWord?>
  }
}
