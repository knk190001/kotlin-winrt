package Windows.ApplicationModel.Appointments

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentStoreNotificationTriggerDetails.ABI::class)
@Signature("{9b33cb11-c301-421e-afef-047ecfa76adb}")
@Guid("9b33cb11c301421eafef047ecfa76adb")
@WinRTInterface("9b33cb11c301421eafef047ecfa76adb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStoreNotificationTriggerDetails.ByReference::class)
public interface IAppointmentStoreNotificationTriggerDetails : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStoreNotificationTriggerDetails> {
    public override fun getValue() =
        ABI.makeIAppointmentStoreNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStoreNotificationTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStoreNotificationTriggerDetails {
    public val __523390654_Ptr: Pointer?

    public val _523390654_VtblPtr: Pointer?
      get() = __523390654_Ptr?.getPointer(0)
  }

  public class IAppointmentStoreNotificationTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __523390654_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStoreNotificationTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b33cb11c301421eafef047ecfa76adb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStoreNotificationTriggerDetails(ptr: Pointer?): WithDefault =
        IAppointmentStoreNotificationTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentStoreNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIAppointmentStoreNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStoreNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__523390654_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStoreNotificationTriggerDetails):
        Array<IAppointmentStoreNotificationTriggerDetails?> = (elements as
        Array<IAppointmentStoreNotificationTriggerDetails?>).castToImpl<IAppointmentStoreNotificationTriggerDetails,IAppointmentStoreNotificationTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStoreNotificationTriggerDetails?> =
        arrayOfNulls<IAppointmentStoreNotificationTriggerDetails_Impl>(size) as
        Array<IAppointmentStoreNotificationTriggerDetails?>
  }
}
