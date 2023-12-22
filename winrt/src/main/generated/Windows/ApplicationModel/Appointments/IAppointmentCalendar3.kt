package Windows.ApplicationModel.Appointments

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IAppointmentCalendar3.ABI::class)
@Signature("{eb23d22b-a685-42ae-8495-b3119adb4167}")
@Guid("eb23d22ba68542ae8495b3119adb4167")
@WinRTInterface("eb23d22ba68542ae8495b3119adb4167")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendar3.ByReference::class)
public interface IAppointmentCalendar3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RegisterSyncManagerAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendar3> {
    public override fun getValue() = ABI.makeIAppointmentCalendar3(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendar3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendar3 {
    public val __872046081_Ptr: Pointer?

    public val _872046081_VtblPtr: Pointer?
      get() = __872046081_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RegisterSyncManagerAsync(): IAsyncAction? {
      val fnPtr = _872046081_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__872046081_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentCalendar3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __872046081_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendar3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb23d22ba68542ae8495b3119adb4167")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendar3(ptr: Pointer?): WithDefault =
        IAppointmentCalendar3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentCalendar3 {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendar3(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendar3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__872046081_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendar3): Array<IAppointmentCalendar3?> =
        (elements as
        Array<IAppointmentCalendar3?>).castToImpl<IAppointmentCalendar3,IAppointmentCalendar3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentCalendar3?> =
        arrayOfNulls<IAppointmentCalendar3_Impl>(size) as Array<IAppointmentCalendar3?>
  }
}
