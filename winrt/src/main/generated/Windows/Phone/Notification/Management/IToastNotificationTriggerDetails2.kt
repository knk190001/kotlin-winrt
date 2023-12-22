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

@ABIMarker(IToastNotificationTriggerDetails2.ABI::class)
@Signature("{3e0479dd-cac4-4f60-afa3-b925d9d83c93}")
@Guid("3e0479ddcac44f60afa3b925d9d83c93")
@WinRTInterface("3e0479ddcac44f60afa3b925d9d83c93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationTriggerDetails2.ByReference::class)
public interface IToastNotificationTriggerDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InstanceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationTriggerDetails2> {
    public override fun getValue() =
        ABI.makeIToastNotificationTriggerDetails2(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationTriggerDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationTriggerDetails2 {
    public val __766539396_Ptr: Pointer?

    public val _766539396_VtblPtr: Pointer?
      get() = __766539396_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InstanceId(): String? {
      val fnPtr = _766539396_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__766539396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationTriggerDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __766539396_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationTriggerDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3e0479ddcac44f60afa3b925d9d83c93")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationTriggerDetails2(ptr: Pointer?): WithDefault =
        IToastNotificationTriggerDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationTriggerDetails2 {
      val address = segment.toRawLongValue()
      return makeIToastNotificationTriggerDetails2(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationTriggerDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__766539396_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationTriggerDetails2):
        Array<IToastNotificationTriggerDetails2?> = (elements as
        Array<IToastNotificationTriggerDetails2?>).castToImpl<IToastNotificationTriggerDetails2,IToastNotificationTriggerDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationTriggerDetails2?> =
        arrayOfNulls<IToastNotificationTriggerDetails2_Impl>(size) as
        Array<IToastNotificationTriggerDetails2?>
  }
}
