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

@ABIMarker(ICalendarDatePickerStatics3.ABI::class)
@Signature("{b188741d-cf69-568c-9707-baaaec2b64db}")
@Guid("b188741dcf69568c9707baaaec2b64db")
@WinRTInterface("b188741dcf69568c9707baaaec2b64db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarDatePickerStatics3.ByReference::class)
public interface ICalendarDatePickerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DescriptionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarDatePickerStatics3> {
    public override fun getValue() = ABI.makeICalendarDatePickerStatics3(pointer.getPointer(0))

    public fun setValue(value: ICalendarDatePickerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarDatePickerStatics3 {
    public val __383352836_Ptr: Pointer?

    public val _383352836_VtblPtr: Pointer?
      get() = __383352836_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DescriptionProperty(): DependencyProperty? {
      val fnPtr = _383352836_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__383352836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarDatePickerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __383352836_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarDatePickerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b188741dcf69568c9707baaaec2b64db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarDatePickerStatics3(ptr: Pointer?): WithDefault =
        ICalendarDatePickerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarDatePickerStatics3 {
      val address = segment.toRawLongValue()
      return makeICalendarDatePickerStatics3(Pointer(address))
    }

    public override fun toNative(obj: ICalendarDatePickerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__383352836_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarDatePickerStatics3):
        Array<ICalendarDatePickerStatics3?> = (elements as
        Array<ICalendarDatePickerStatics3?>).castToImpl<ICalendarDatePickerStatics3,ICalendarDatePickerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarDatePickerStatics3?> =
        arrayOfNulls<ICalendarDatePickerStatics3_Impl>(size) as Array<ICalendarDatePickerStatics3?>
  }
}
