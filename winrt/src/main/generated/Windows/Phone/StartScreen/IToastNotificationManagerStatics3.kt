package Windows.Phone.StartScreen

import Windows.UI.Notifications.ToastNotifier
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

@ABIMarker(IToastNotificationManagerStatics3.ABI::class)
@Signature("{2717f54b-50df-4455-8e6e-41e0fc8e13ce}")
@Guid("2717f54b50df44558e6e41e0fc8e13ce")
@WinRTInterface("2717f54b50df44558e6e41e0fc8e13ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationManagerStatics3.ByReference::class)
public interface IToastNotificationManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateToastNotifierForSecondaryTile(tileId: String?): ToastNotifier?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationManagerStatics3> {
    public override fun getValue() =
        ABI.makeIToastNotificationManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationManagerStatics3 {
    public val __1848838737_Ptr: Pointer?

    public val _1848838737_VtblPtr: Pointer?
      get() = __1848838737_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateToastNotifierForSecondaryTile(tileId: String?): ToastNotifier? {
      val fnPtr = _1848838737_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotifier>()
      val hr = fn.invokeHR(arrayOf(__1848838737_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotifier>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1848838737_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2717f54b50df44558e6e41e0fc8e13ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationManagerStatics3(ptr: Pointer?): WithDefault =
        IToastNotificationManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIToastNotificationManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1848838737_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerStatics3):
        Array<IToastNotificationManagerStatics3?> = (elements as
        Array<IToastNotificationManagerStatics3?>).castToImpl<IToastNotificationManagerStatics3,IToastNotificationManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerStatics3?> =
        arrayOfNulls<IToastNotificationManagerStatics3_Impl>(size) as
        Array<IToastNotificationManagerStatics3?>
  }
}
