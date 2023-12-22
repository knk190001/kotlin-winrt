package Windows.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFontIcon2.ABI::class)
@Signature("{f6ebd84d-37e8-46ee-a574-41ad550482e0}")
@Guid("f6ebd84d37e846eea57441ad550482e0")
@WinRTInterface("f6ebd84d37e846eea57441ad550482e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontIcon2.ByReference::class)
public interface IFontIcon2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextScaleFactorEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsTextScaleFactorEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFontIcon2> {
    public override fun getValue() = ABI.makeIFontIcon2(pointer.getPointer(0))

    public fun setValue(value: IFontIcon2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontIcon2 {
    public val __468398894_Ptr: Pointer?

    public val _468398894_VtblPtr: Pointer?
      get() = __468398894_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextScaleFactorEnabled(): Boolean {
      val fnPtr = _468398894_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__468398894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsTextScaleFactorEnabled(value: Boolean): Unit {
      val fnPtr = _468398894_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__468398894_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFontIcon2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __468398894_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontIcon2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6ebd84d37e846eea57441ad550482e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontIcon2(ptr: Pointer?): WithDefault = IFontIcon2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontIcon2 {
      val address = segment.toRawLongValue()
      return makeIFontIcon2(Pointer(address))
    }

    public override fun toNative(obj: IFontIcon2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__468398894_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontIcon2): Array<IFontIcon2?> = (elements as
        Array<IFontIcon2?>).castToImpl<IFontIcon2,IFontIcon2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontIcon2?> = arrayOfNulls<IFontIcon2_Impl>(size)
        as Array<IFontIcon2?>
  }
}
