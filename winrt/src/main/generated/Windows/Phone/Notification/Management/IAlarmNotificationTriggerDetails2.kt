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

@ABIMarker(IAlarmNotificationTriggerDetails2.ABI::class)
@Signature("{cf16e06a-7155-40fe-a9c2-7bd2127ef853}")
@Guid("cf16e06a715540fea9c27bd2127ef853")
@WinRTInterface("cf16e06a715540fea9c27bd2127ef853")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAlarmNotificationTriggerDetails2.ByReference::class)
public interface IAlarmNotificationTriggerDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InstanceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAlarmNotificationTriggerDetails2> {
    public override fun getValue() =
        ABI.makeIAlarmNotificationTriggerDetails2(pointer.getPointer(0))

    public fun setValue(value: IAlarmNotificationTriggerDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAlarmNotificationTriggerDetails2 {
    public val __341461018_Ptr: Pointer?

    public val _341461018_VtblPtr: Pointer?
      get() = __341461018_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InstanceId(): String? {
      val fnPtr = _341461018_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__341461018_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAlarmNotificationTriggerDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __341461018_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAlarmNotificationTriggerDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf16e06a715540fea9c27bd2127ef853")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAlarmNotificationTriggerDetails2(ptr: Pointer?): WithDefault =
        IAlarmNotificationTriggerDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAlarmNotificationTriggerDetails2 {
      val address = segment.toRawLongValue()
      return makeIAlarmNotificationTriggerDetails2(Pointer(address))
    }

    public override fun toNative(obj: IAlarmNotificationTriggerDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__341461018_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAlarmNotificationTriggerDetails2):
        Array<IAlarmNotificationTriggerDetails2?> = (elements as
        Array<IAlarmNotificationTriggerDetails2?>).castToImpl<IAlarmNotificationTriggerDetails2,IAlarmNotificationTriggerDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAlarmNotificationTriggerDetails2?> =
        arrayOfNulls<IAlarmNotificationTriggerDetails2_Impl>(size) as
        Array<IAlarmNotificationTriggerDetails2?>
  }
}
