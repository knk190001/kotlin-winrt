package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IDatePickerFlyoutPresenter.ABI::class)
@Signature("{1adfda34-60f5-501b-b8e2-73a49cad6712}")
@Guid("1adfda3460f5501bb8e273a49cad6712")
@WinRTInterface("1adfda3460f5501bb8e273a49cad6712")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyoutPresenter.ByReference::class)
public interface IDatePickerFlyoutPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDefaultShadowEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsDefaultShadowEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyoutPresenter> {
    public override fun getValue() = ABI.makeIDatePickerFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyoutPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyoutPresenter {
    public val __207729270_Ptr: Pointer?

    public val _207729270_VtblPtr: Pointer?
      get() = __207729270_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDefaultShadowEnabled(): Boolean {
      val fnPtr = _207729270_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__207729270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsDefaultShadowEnabled(value: Boolean): Unit {
      val fnPtr = _207729270_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__207729270_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDatePickerFlyoutPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __207729270_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyoutPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1adfda3460f5501bb8e273a49cad6712")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyoutPresenter(ptr: Pointer?): WithDefault =
        IDatePickerFlyoutPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFlyoutPresenter {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__207729270_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyoutPresenter):
        Array<IDatePickerFlyoutPresenter?> = (elements as
        Array<IDatePickerFlyoutPresenter?>).castToImpl<IDatePickerFlyoutPresenter,IDatePickerFlyoutPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyoutPresenter?> =
        arrayOfNulls<IDatePickerFlyoutPresenter_Impl>(size) as Array<IDatePickerFlyoutPresenter?>
  }
}
