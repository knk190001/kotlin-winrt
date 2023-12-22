package Windows.Phone.Notification.Management

import Windows.ApplicationModel.Appointments.Appointment
import Windows.Foundation.DateTime
import Windows.Phone.Notification.Management.IAccessoryNotificationTriggerDetails.ABI.IID
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

@ABIMarker(IReminderNotificationTriggerDetails.ABI::class)
@Signature("{5bddaa5d-9f61-4bf0-9feb-10502bc0b0c2}")
@Guid("5bddaa5d9f614bf09feb10502bc0b0c2")
@WinRTInterface("5bddaa5d9f614bf09feb10502bc0b0c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IReminderNotificationTriggerDetails.ByReference::class)
public interface IReminderNotificationTriggerDetails : NativeMapped, IWinRTInterface,
    IAccessoryNotificationTriggerDetails {
  @InterfaceMethod(0)
  public fun get_ReminderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Title(): String?

  @InterfaceMethod(2)
  public fun get_Description(): String?

  @InterfaceMethod(3)
  public fun get_Details(): String?

  @InterfaceMethod(4)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(5)
  public fun get_Appointment(): Appointment?

  @InterfaceMethod(6)
  public fun get_ReminderState(): ReminderState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IReminderNotificationTriggerDetails> {
    public override fun getValue() =
        ABI.makeIReminderNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IReminderNotificationTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IReminderNotificationTriggerDetails,
      IAccessoryNotificationTriggerDetails.WithDefault {
    public val __390763691_Ptr: Pointer?

    public val _390763691_VtblPtr: Pointer?
      get() = __390763691_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReminderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _390763691_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__390763691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Title(): String? {
      val fnPtr = _390763691_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__390763691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Description(): String? {
      val fnPtr = _390763691_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__390763691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Details(): String? {
      val fnPtr = _390763691_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__390763691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _390763691_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__390763691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Appointment(): Appointment? {
      val fnPtr = _390763691_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Appointment>()
      val hr = fn.invokeHR(arrayOf(__390763691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Appointment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ReminderState(): ReminderState? {
      val fnPtr = _390763691_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ReminderState>()
      val hr = fn.invokeHR(arrayOf(__390763691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ReminderState>(result.getValue())
      return resultValue
    }
  }

  public class IReminderNotificationTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IAccessoryNotificationTriggerDetails {
    public override val __1414915993_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_390763691_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __390763691_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IReminderNotificationTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bddaa5d9f614bf09feb10502bc0b0c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIReminderNotificationTriggerDetails(ptr: Pointer?): WithDefault =
        IReminderNotificationTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IReminderNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIReminderNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IReminderNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__390763691_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IReminderNotificationTriggerDetails):
        Array<IReminderNotificationTriggerDetails?> = (elements as
        Array<IReminderNotificationTriggerDetails?>).castToImpl<IReminderNotificationTriggerDetails,IReminderNotificationTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReminderNotificationTriggerDetails?> =
        arrayOfNulls<IReminderNotificationTriggerDetails_Impl>(size) as
        Array<IReminderNotificationTriggerDetails?>
  }
}
