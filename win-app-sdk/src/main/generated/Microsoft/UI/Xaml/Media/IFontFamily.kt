package Microsoft.UI.Xaml.Media

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

@ABIMarker(IFontFamily.ABI::class)
@Signature("{18fa5bc1-7294-527c-bb02-b213e0b3a2a3}")
@Guid("18fa5bc17294527cbb02b213e0b3a2a3")
@WinRTInterface("18fa5bc17294527cbb02b213e0b3a2a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontFamily.ByReference::class)
public interface IFontFamily : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFontFamily> {
    public override fun getValue() = ABI.makeIFontFamily(pointer.getPointer(0))

    public fun setValue(value: IFontFamily_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontFamily {
    public val __1416443004_Ptr: Pointer?

    public val _1416443004_VtblPtr: Pointer?
      get() = __1416443004_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): String? {
      val fnPtr = _1416443004_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1416443004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IFontFamily_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1416443004_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontFamily, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18fa5bc17294527cbb02b213e0b3a2a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontFamily(ptr: Pointer?): WithDefault = IFontFamily_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontFamily {
      val address = segment.toRawLongValue()
      return makeIFontFamily(Pointer(address))
    }

    public override fun toNative(obj: IFontFamily): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1416443004_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontFamily): Array<IFontFamily?> = (elements as
        Array<IFontFamily?>).castToImpl<IFontFamily,IFontFamily_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontFamily?> =
        arrayOfNulls<IFontFamily_Impl>(size) as Array<IFontFamily?>
  }
}
