package Windows.Phone.Notification.Management

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

@ABIMarker(IAlarmNotificationTriggerDetails.ABI::class)
@Signature("{38f5fa30-c738-4da2-908c-775d83c36abb}")
@Guid("38f5fa30c7384da2908c775d83c36abb")
@WinRTInterface("38f5fa30c7384da2908c775d83c36abb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAlarmNotificationTriggerDetails.ByReference::class)
public interface IAlarmNotificationTriggerDetails : NativeMapped, IWinRTInterface,
    IAccessoryNotificationTriggerDetails {
  @InterfaceMethod(0)
  public fun get_AlarmId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Title(): String?

  @InterfaceMethod(2)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(3)
  public fun get_ReminderState(): ReminderState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAlarmNotificationTriggerDetails> {
    public override fun getValue() = ABI.makeIAlarmNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IAlarmNotificationTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAlarmNotificationTriggerDetails,
      IAccessoryNotificationTriggerDetails.WithDefault {
    public val __2067195112_Ptr: Pointer?

    public val _2067195112_VtblPtr: Pointer?
      get() = __2067195112_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlarmId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _2067195112_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__2067195112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Title(): String? {
      val fnPtr = _2067195112_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2067195112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _2067195112_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2067195112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ReminderState(): ReminderState? {
      val fnPtr = _2067195112_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ReminderState>()
      val hr = fn.invokeHR(arrayOf(__2067195112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ReminderState>(result.getValue())
      return resultValue
    }
  }

  public class IAlarmNotificationTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IAccessoryNotificationTriggerDetails {
    public override val __1414915993_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2067195112_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2067195112_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAlarmNotificationTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38f5fa30c7384da2908c775d83c36abb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAlarmNotificationTriggerDetails(ptr: Pointer?): WithDefault =
        IAlarmNotificationTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAlarmNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIAlarmNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IAlarmNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2067195112_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAlarmNotificationTriggerDetails):
        Array<IAlarmNotificationTriggerDetails?> = (elements as
        Array<IAlarmNotificationTriggerDetails?>).castToImpl<IAlarmNotificationTriggerDetails,IAlarmNotificationTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAlarmNotificationTriggerDetails?> =
        arrayOfNulls<IAlarmNotificationTriggerDetails_Impl>(size) as
        Array<IAlarmNotificationTriggerDetails?>
  }
}
