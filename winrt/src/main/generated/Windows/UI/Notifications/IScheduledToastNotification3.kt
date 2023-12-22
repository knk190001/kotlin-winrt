package Windows.UI.Notifications

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

@ABIMarker(IScheduledToastNotification3.ABI::class)
@Signature("{98429e8b-bd32-4a3b-9d15-22aea49462a1}")
@Guid("98429e8bbd324a3b9d1522aea49462a1")
@WinRTInterface("98429e8bbd324a3b9d1522aea49462a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScheduledToastNotification3.ByReference::class)
public interface IScheduledToastNotification3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NotificationMirroring(): NotificationMirroring?

  @InterfaceMethod(1)
  public fun put_NotificationMirroring(value: NotificationMirroring?): Unit

  @InterfaceMethod(2)
  public fun get_RemoteId(): String?

  @InterfaceMethod(3)
  public fun put_RemoteId(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScheduledToastNotification3> {
    public override fun getValue() = ABI.makeIScheduledToastNotification3(pointer.getPointer(0))

    public fun setValue(value: IScheduledToastNotification3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScheduledToastNotification3 {
    public val __1189128482_Ptr: Pointer?

    public val _1189128482_VtblPtr: Pointer?
      get() = __1189128482_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NotificationMirroring(): NotificationMirroring? {
      val fnPtr = _1189128482_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationMirroring>()
      val hr = fn.invokeHR(arrayOf(__1189128482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationMirroring>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_NotificationMirroring(value: NotificationMirroring?): Unit {
      val fnPtr = _1189128482_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189128482_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RemoteId(): String? {
      val fnPtr = _1189128482_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1189128482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _1189128482_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189128482_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScheduledToastNotification3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1189128482_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScheduledToastNotification3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("98429e8bbd324a3b9d1522aea49462a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScheduledToastNotification3(ptr: Pointer?): WithDefault =
        IScheduledToastNotification3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScheduledToastNotification3 {
      val address = segment.toRawLongValue()
      return makeIScheduledToastNotification3(Pointer(address))
    }

    public override fun toNative(obj: IScheduledToastNotification3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1189128482_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledToastNotification3):
        Array<IScheduledToastNotification3?> = (elements as
        Array<IScheduledToastNotification3?>).castToImpl<IScheduledToastNotification3,IScheduledToastNotification3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledToastNotification3?> =
        arrayOfNulls<IScheduledToastNotification3_Impl>(size) as
        Array<IScheduledToastNotification3?>
  }
}
