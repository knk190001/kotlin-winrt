package Windows.ApplicationModel.Appointments

import Windows.ApplicationModel.Appointments.IAppointmentStore.ABI.IID
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentStore2.ABI::class)
@Signature("{25c48c20-1c41-424f-8084-67c1cfe0a854}")
@Guid("25c48c201c41424f808467c1cfe0a854")
@WinRTInterface("25c48c201c41424f808467c1cfe0a854")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStore2.ByReference::class)
public interface IAppointmentStore2 : NativeMapped, IWinRTInterface, IAppointmentStore {
  @InterfaceMethod(0)
  public fun add_StoreChanged(pHandler: TypedEventHandler<AppointmentStore?,
      AppointmentStoreChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_StoreChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun CreateAppointmentCalendarAsync(name: String?, userDataAccountId: String?):
      IAsyncOperation<AppointmentCalendar?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStore2> {
    public override fun getValue() = ABI.makeIAppointmentStore2(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStore2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStore2, IAppointmentStore.WithDefault {
    public val __1799656869_Ptr: Pointer?

    public val _1799656869_VtblPtr: Pointer?
      get() = __1799656869_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_StoreChanged(pHandler: TypedEventHandler<AppointmentStore?,
        AppointmentStoreChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1799656869_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1799656869_Ptr, marshalToNative(pHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_StoreChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1799656869_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1799656869_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun CreateAppointmentCalendarAsync(name: String?, userDataAccountId: String?):
        IAsyncOperation<AppointmentCalendar?>? {
      val fnPtr = _1799656869_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppointmentCalendar?>>()
      val hr = fn.invokeHR(arrayOf(__1799656869_Ptr, marshalToNative(name),
          marshalToNative(userDataAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppointmentCalendar?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentStore2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAppointmentStore {
    public override val __773230547_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1799656869_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1799656869_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStore2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25c48c201c41424f808467c1cfe0a854")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStore2(ptr: Pointer?): WithDefault = IAppointmentStore2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentStore2 {
      val address = segment.toRawLongValue()
      return makeIAppointmentStore2(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStore2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1799656869_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStore2): Array<IAppointmentStore2?> =
        (elements as
        Array<IAppointmentStore2?>).castToImpl<IAppointmentStore2,IAppointmentStore2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStore2?> =
        arrayOfNulls<IAppointmentStore2_Impl>(size) as Array<IAppointmentStore2?>
  }
}
