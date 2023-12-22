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

@ABIMarker(ICalendarDatePickerStatics2.ABI::class)
@Signature("{30206b58-a2f6-4a00-8d13-33c46b6b8e0d}")
@Guid("30206b58a2f64a008d1333c46b6b8e0d")
@WinRTInterface("30206b58a2f64a008d1333c46b6b8e0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarDatePickerStatics2.ByReference::class)
public interface ICalendarDatePickerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LightDismissOverlayModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarDatePickerStatics2> {
    public override fun getValue() = ABI.makeICalendarDatePickerStatics2(pointer.getPointer(0))

    public fun setValue(value: ICalendarDatePickerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarDatePickerStatics2 {
    public val __383352835_Ptr: Pointer?

    public val _383352835_VtblPtr: Pointer?
      get() = __383352835_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LightDismissOverlayModeProperty(): DependencyProperty? {
      val fnPtr = _383352835_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__383352835_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarDatePickerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __383352835_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarDatePickerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30206b58a2f64a008d1333c46b6b8e0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarDatePickerStatics2(ptr: Pointer?): WithDefault =
        ICalendarDatePickerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarDatePickerStatics2 {
      val address = segment.toRawLongValue()
      return makeICalendarDatePickerStatics2(Pointer(address))
    }

    public override fun toNative(obj: ICalendarDatePickerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__383352835_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarDatePickerStatics2):
        Array<ICalendarDatePickerStatics2?> = (elements as
        Array<ICalendarDatePickerStatics2?>).castToImpl<ICalendarDatePickerStatics2,ICalendarDatePickerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarDatePickerStatics2?> =
        arrayOfNulls<ICalendarDatePickerStatics2_Impl>(size) as Array<ICalendarDatePickerStatics2?>
  }
}
