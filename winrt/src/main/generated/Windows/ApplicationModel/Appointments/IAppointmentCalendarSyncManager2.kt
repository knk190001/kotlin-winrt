package Windows.ApplicationModel.Appointments

import Windows.Foundation.DateTime
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

@ABIMarker(IAppointmentCalendarSyncManager2.ABI::class)
@Signature("{647528ad-0d29-4c7c-aaa7-bf996805537c}")
@Guid("647528ad0d294c7caaa7bf996805537c")
@WinRTInterface("647528ad0d294c7caaa7bf996805537c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentCalendarSyncManager2.ByReference::class)
public interface IAppointmentCalendarSyncManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Status(value: AppointmentCalendarSyncStatus?): Unit

  @InterfaceMethod(1)
  public fun put_LastSuccessfulSyncTime(value: DateTime?): Unit

  @InterfaceMethod(2)
  public fun put_LastAttemptedSyncTime(value: DateTime?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentCalendarSyncManager2> {
    public override fun getValue() = ABI.makeIAppointmentCalendarSyncManager2(pointer.getPointer(0))

    public fun setValue(value: IAppointmentCalendarSyncManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentCalendarSyncManager2 {
    public val __1572242290_Ptr: Pointer?

    public val _1572242290_VtblPtr: Pointer?
      get() = __1572242290_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Status(value: AppointmentCalendarSyncStatus?): Unit {
      val fnPtr = _1572242290_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1572242290_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun put_LastSuccessfulSyncTime(value: DateTime?): Unit {
      val fnPtr = _1572242290_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1572242290_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun put_LastAttemptedSyncTime(value: DateTime?): Unit {
      val fnPtr = _1572242290_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1572242290_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppointmentCalendarSyncManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1572242290_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentCalendarSyncManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("647528ad0d294c7caaa7bf996805537c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentCalendarSyncManager2(ptr: Pointer?): WithDefault =
        IAppointmentCalendarSyncManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentCalendarSyncManager2 {
      val address = segment.toRawLongValue()
      return makeIAppointmentCalendarSyncManager2(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentCalendarSyncManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1572242290_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentCalendarSyncManager2):
        Array<IAppointmentCalendarSyncManager2?> = (elements as
        Array<IAppointmentCalendarSyncManager2?>).castToImpl<IAppointmentCalendarSyncManager2,IAppointmentCalendarSyncManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentCalendarSyncManager2?> =
        arrayOfNulls<IAppointmentCalendarSyncManager2_Impl>(size) as
        Array<IAppointmentCalendarSyncManager2?>
  }
}
