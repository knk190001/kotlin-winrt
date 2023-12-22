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

@ABIMarker(IAccessoryManager3.ABI::class)
@Signature("{81f75137-edc7-47e0-b2f7-7e577c833f7d}")
@Guid("81f75137edc747e0b2f77e577c833f7d")
@WinRTInterface("81f75137edc747e0b2f77e577c833f7d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccessoryManager3.ByReference::class)
public interface IAccessoryManager3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SnoozeAlarmByInstanceId(instanceId: String?): Unit

  @InterfaceMethod(1)
  public fun DismissAlarmByInstanceId(instanceId: String?): Unit

  @InterfaceMethod(2)
  public fun SnoozeReminderByInstanceId(instanceId: String?): Unit

  @InterfaceMethod(3)
  public fun DismissReminderByInstanceId(instanceId: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccessoryManager3> {
    public override fun getValue() = ABI.makeIAccessoryManager3(pointer.getPointer(0))

    public fun setValue(value: IAccessoryManager3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccessoryManager3 {
    public val __586339446_Ptr: Pointer?

    public val _586339446_VtblPtr: Pointer?
      get() = __586339446_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SnoozeAlarmByInstanceId(instanceId: String?): Unit {
      val fnPtr = _586339446_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339446_Ptr, marshalToNative(instanceId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun DismissAlarmByInstanceId(instanceId: String?): Unit {
      val fnPtr = _586339446_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339446_Ptr, marshalToNative(instanceId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SnoozeReminderByInstanceId(instanceId: String?): Unit {
      val fnPtr = _586339446_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339446_Ptr, marshalToNative(instanceId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun DismissReminderByInstanceId(instanceId: String?): Unit {
      val fnPtr = _586339446_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339446_Ptr, marshalToNative(instanceId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAccessoryManager3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __586339446_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccessoryManager3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81f75137edc747e0b2f77e577c833f7d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccessoryManager3(ptr: Pointer?): WithDefault = IAccessoryManager3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccessoryManager3 {
      val address = segment.toRawLongValue()
      return makeIAccessoryManager3(Pointer(address))
    }

    public override fun toNative(obj: IAccessoryManager3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__586339446_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccessoryManager3): Array<IAccessoryManager3?> =
        (elements as
        Array<IAccessoryManager3?>).castToImpl<IAccessoryManager3,IAccessoryManager3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccessoryManager3?> =
        arrayOfNulls<IAccessoryManager3_Impl>(size) as Array<IAccessoryManager3?>
  }
}
