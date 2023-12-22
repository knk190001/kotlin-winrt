package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(ITimePickerFlyoutPresenterStatics2.ABI::class)
@Signature("{aa5f0ddc-f2bb-53f2-a54d-b34acccf51e4}")
@Guid("aa5f0ddcf2bb53f2a54db34acccf51e4")
@WinRTInterface("aa5f0ddcf2bb53f2a54db34acccf51e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickerFlyoutPresenterStatics2.ByReference::class)
public interface ITimePickerFlyoutPresenterStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDefaultShadowEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickerFlyoutPresenterStatics2> {
    public override fun getValue() =
        ABI.makeITimePickerFlyoutPresenterStatics2(pointer.getPointer(0))

    public fun setValue(value: ITimePickerFlyoutPresenterStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickerFlyoutPresenterStatics2 {
    public val __97719875_Ptr: Pointer?

    public val _97719875_VtblPtr: Pointer?
      get() = __97719875_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDefaultShadowEnabledProperty(): DependencyProperty? {
      val fnPtr = _97719875_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__97719875_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITimePickerFlyoutPresenterStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __97719875_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickerFlyoutPresenterStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa5f0ddcf2bb53f2a54db34acccf51e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickerFlyoutPresenterStatics2(ptr: Pointer?): WithDefault =
        ITimePickerFlyoutPresenterStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePickerFlyoutPresenterStatics2 {
      val address = segment.toRawLongValue()
      return makeITimePickerFlyoutPresenterStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITimePickerFlyoutPresenterStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__97719875_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickerFlyoutPresenterStatics2):
        Array<ITimePickerFlyoutPresenterStatics2?> = (elements as
        Array<ITimePickerFlyoutPresenterStatics2?>).castToImpl<ITimePickerFlyoutPresenterStatics2,ITimePickerFlyoutPresenterStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickerFlyoutPresenterStatics2?> =
        arrayOfNulls<ITimePickerFlyoutPresenterStatics2_Impl>(size) as
        Array<ITimePickerFlyoutPresenterStatics2?>
  }
}
