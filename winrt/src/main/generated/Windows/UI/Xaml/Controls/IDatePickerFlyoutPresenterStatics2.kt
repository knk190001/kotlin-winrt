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

@ABIMarker(IDatePickerFlyoutPresenterStatics2.ABI::class)
@Signature("{4dc0c49e-1f8e-5966-bbdb-215750c73aba}")
@Guid("4dc0c49e1f8e5966bbdb215750c73aba")
@WinRTInterface("4dc0c49e1f8e5966bbdb215750c73aba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyoutPresenterStatics2.ByReference::class)
public interface IDatePickerFlyoutPresenterStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDefaultShadowEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyoutPresenterStatics2> {
    public override fun getValue() =
        ABI.makeIDatePickerFlyoutPresenterStatics2(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyoutPresenterStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyoutPresenterStatics2 {
    public val __2033373442_Ptr: Pointer?

    public val _2033373442_VtblPtr: Pointer?
      get() = __2033373442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDefaultShadowEnabledProperty(): DependencyProperty? {
      val fnPtr = _2033373442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2033373442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickerFlyoutPresenterStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2033373442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyoutPresenterStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4dc0c49e1f8e5966bbdb215750c73aba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyoutPresenterStatics2(ptr: Pointer?): WithDefault =
        IDatePickerFlyoutPresenterStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFlyoutPresenterStatics2 {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyoutPresenterStatics2(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyoutPresenterStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2033373442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyoutPresenterStatics2):
        Array<IDatePickerFlyoutPresenterStatics2?> = (elements as
        Array<IDatePickerFlyoutPresenterStatics2?>).castToImpl<IDatePickerFlyoutPresenterStatics2,IDatePickerFlyoutPresenterStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyoutPresenterStatics2?> =
        arrayOfNulls<IDatePickerFlyoutPresenterStatics2_Impl>(size) as
        Array<IDatePickerFlyoutPresenterStatics2?>
  }
}
