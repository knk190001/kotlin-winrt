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

@ABIMarker(ICalendarDatePicker2.ABI::class)
@Signature("{b216c159-2411-4a60-a7aa-27416b49481e}")
@Guid("b216c15924114a60a7aa27416b49481e")
@WinRTInterface("b216c15924114a60a7aa27416b49481e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarDatePicker2.ByReference::class)
public interface ICalendarDatePicker2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LightDismissOverlayMode(): LightDismissOverlayMode?

  @InterfaceMethod(1)
  public fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarDatePicker2> {
    public override fun getValue() = ABI.makeICalendarDatePicker2(pointer.getPointer(0))

    public fun setValue(value: ICalendarDatePicker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarDatePicker2 {
    public val __649904668_Ptr: Pointer?

    public val _649904668_VtblPtr: Pointer?
      get() = __649904668_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LightDismissOverlayMode(): LightDismissOverlayMode? {
      val fnPtr = _649904668_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightDismissOverlayMode>()
      val hr = fn.invokeHR(arrayOf(__649904668_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightDismissOverlayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit {
      val fnPtr = _649904668_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__649904668_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICalendarDatePicker2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __649904668_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarDatePicker2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b216c15924114a60a7aa27416b49481e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarDatePicker2(ptr: Pointer?): WithDefault = ICalendarDatePicker2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarDatePicker2 {
      val address = segment.toRawLongValue()
      return makeICalendarDatePicker2(Pointer(address))
    }

    public override fun toNative(obj: ICalendarDatePicker2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__649904668_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarDatePicker2): Array<ICalendarDatePicker2?> =
        (elements as
        Array<ICalendarDatePicker2?>).castToImpl<ICalendarDatePicker2,ICalendarDatePicker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarDatePicker2?> =
        arrayOfNulls<ICalendarDatePicker2_Impl>(size) as Array<ICalendarDatePicker2?>
  }
}
