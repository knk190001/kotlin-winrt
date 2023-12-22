package Windows.UI.Notifications

import Windows.System.User
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

@ABIMarker(IToastNotificationManagerStatics4.ABI::class)
@Signature("{8f993fd3-e516-45fb-8130-398e93fa52c3}")
@Guid("8f993fd3e51645fb8130398e93fa52c3")
@WinRTInterface("8f993fd3e51645fb8130398e93fa52c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationManagerStatics4.ByReference::class)
public interface IToastNotificationManagerStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUser(user: User?): ToastNotificationManagerForUser?

  @InterfaceMethod(1)
  public fun ConfigureNotificationMirroring(value: NotificationMirroring?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationManagerStatics4> {
    public override fun getValue() =
        ABI.makeIToastNotificationManagerStatics4(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationManagerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationManagerStatics4 {
    public val __1744884026_Ptr: Pointer?

    public val _1744884026_VtblPtr: Pointer?
      get() = __1744884026_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUser(user: User?): ToastNotificationManagerForUser? {
      val fnPtr = _1744884026_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotificationManagerForUser>()
      val hr = fn.invokeHR(arrayOf(__1744884026_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotificationManagerForUser>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ConfigureNotificationMirroring(value: NotificationMirroring?): Unit {
      val fnPtr = _1744884026_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1744884026_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToastNotificationManagerStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1744884026_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationManagerStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f993fd3e51645fb8130398e93fa52c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationManagerStatics4(ptr: Pointer?): WithDefault =
        IToastNotificationManagerStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationManagerStatics4 {
      val address = segment.toRawLongValue()
      return makeIToastNotificationManagerStatics4(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationManagerStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1744884026_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerStatics4):
        Array<IToastNotificationManagerStatics4?> = (elements as
        Array<IToastNotificationManagerStatics4?>).castToImpl<IToastNotificationManagerStatics4,IToastNotificationManagerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerStatics4?> =
        arrayOfNulls<IToastNotificationManagerStatics4_Impl>(size) as
        Array<IToastNotificationManagerStatics4?>
  }
}
