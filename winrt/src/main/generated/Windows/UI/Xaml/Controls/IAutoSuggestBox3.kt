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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutoSuggestBox3.ABI::class)
@Signature("{9bbbfcef-f32d-402e-9009-05bdbaf6336e}")
@Guid("9bbbfceff32d402e900905bdbaf6336e")
@WinRTInterface("9bbbfceff32d402e900905bdbaf6336e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBox3.ByReference::class)
public interface IAutoSuggestBox3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LightDismissOverlayMode(): LightDismissOverlayMode?

  @InterfaceMethod(1)
  public fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBox3> {
    public override fun getValue() = ABI.makeIAutoSuggestBox3(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBox3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBox3 {
    public val __1925569697_Ptr: Pointer?

    public val _1925569697_VtblPtr: Pointer?
      get() = __1925569697_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LightDismissOverlayMode(): LightDismissOverlayMode? {
      val fnPtr = _1925569697_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightDismissOverlayMode>()
      val hr = fn.invokeHR(arrayOf(__1925569697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightDismissOverlayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit {
      val fnPtr = _1925569697_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925569697_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutoSuggestBox3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1925569697_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBox3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9bbbfceff32d402e900905bdbaf6336e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBox3(ptr: Pointer?): WithDefault = IAutoSuggestBox3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBox3 {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBox3(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBox3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1925569697_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBox3): Array<IAutoSuggestBox3?> = (elements as
        Array<IAutoSuggestBox3?>).castToImpl<IAutoSuggestBox3,IAutoSuggestBox3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBox3?> =
        arrayOfNulls<IAutoSuggestBox3_Impl>(size) as Array<IAutoSuggestBox3?>
  }
}
