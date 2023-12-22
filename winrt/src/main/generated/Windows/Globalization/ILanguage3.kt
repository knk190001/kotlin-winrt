package Windows.Globalization

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

@ABIMarker(ILanguage3.ABI::class)
@Signature("{c6af3d10-641a-5ba4-bb43-5e12aed75954}")
@Guid("c6af3d10641a5ba4bb435e12aed75954")
@WinRTInterface("c6af3d10641a5ba4bb435e12aed75954")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILanguage3.ByReference::class)
public interface ILanguage3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AbbreviatedName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILanguage3> {
    public override fun getValue() = ABI.makeILanguage3(pointer.getPointer(0))

    public fun setValue(value: ILanguage3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILanguage3 {
    public val __2119937288_Ptr: Pointer?

    public val _2119937288_VtblPtr: Pointer?
      get() = __2119937288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AbbreviatedName(): String? {
      val fnPtr = _2119937288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2119937288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ILanguage3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2119937288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILanguage3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6af3d10641a5ba4bb435e12aed75954")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILanguage3(ptr: Pointer?): WithDefault = ILanguage3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILanguage3 {
      val address = segment.toRawLongValue()
      return makeILanguage3(Pointer(address))
    }

    public override fun toNative(obj: ILanguage3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2119937288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILanguage3): Array<ILanguage3?> = (elements as
        Array<ILanguage3?>).castToImpl<ILanguage3,ILanguage3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILanguage3?> = arrayOfNulls<ILanguage3_Impl>(size)
        as Array<ILanguage3?>
  }
}
