package Windows.Phone.Notification.Management

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IReminderNotificationTriggerDetails2.ABI::class)
@Signature("{e715f9c0-504d-4c0f-a6b3-bcb9722c6cdd}")
@Guid("e715f9c0504d4c0fa6b3bcb9722c6cdd")
@WinRTInterface("e715f9c0504d4c0fa6b3bcb9722c6cdd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IReminderNotificationTriggerDetails2.ByReference::class)
public interface IReminderNotificationTriggerDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InstanceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IReminderNotificationTriggerDetails2> {
    public override fun getValue() =
        ABI.makeIReminderNotificationTriggerDetails2(pointer.getPointer(0))

    public fun setValue(value: IReminderNotificationTriggerDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IReminderNotificationTriggerDetails2 {
    public val __771227517_Ptr: Pointer?

    public val _771227517_VtblPtr: Pointer?
      get() = __771227517_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InstanceId(): String? {
      val fnPtr = _771227517_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__771227517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IReminderNotificationTriggerDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __771227517_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IReminderNotificationTriggerDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e715f9c0504d4c0fa6b3bcb9722c6cdd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIReminderNotificationTriggerDetails2(ptr: Pointer?): WithDefault =
        IReminderNotificationTriggerDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IReminderNotificationTriggerDetails2 {
      val address = segment.toRawLongValue()
      return makeIReminderNotificationTriggerDetails2(Pointer(address))
    }

    public override fun toNative(obj: IReminderNotificationTriggerDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__771227517_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IReminderNotificationTriggerDetails2):
        Array<IReminderNotificationTriggerDetails2?> = (elements as
        Array<IReminderNotificationTriggerDetails2?>).castToImpl<IReminderNotificationTriggerDetails2,IReminderNotificationTriggerDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReminderNotificationTriggerDetails2?> =
        arrayOfNulls<IReminderNotificationTriggerDetails2_Impl>(size) as
        Array<IReminderNotificationTriggerDetails2?>
  }
}
