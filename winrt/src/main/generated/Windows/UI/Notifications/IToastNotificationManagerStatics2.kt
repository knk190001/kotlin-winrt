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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToastNotificationManagerStatics2.ABI::class)
@Signature("{7ab93c52-0e48-4750-ba9d-1a4113981847}")
@Guid("7ab93c520e484750ba9d1a4113981847")
@WinRTInterface("7ab93c520e484750ba9d1a4113981847")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationManagerStatics2.ByReference::class)
public interface IToastNotificationManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_History(): ToastNotificationHistory?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationManagerStatics2> {
    public override fun getValue() =
        ABI.makeIToastNotificationManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationManagerStatics2 {
    public val __1744884024_Ptr: Pointer?

    public val _1744884024_VtblPtr: Pointer?
      get() = __1744884024_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_History(): ToastNotificationHistory? {
      val fnPtr = _1744884024_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotificationHistory>()
      val hr = fn.invokeHR(arrayOf(__1744884024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotificationHistory>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1744884024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ab93c520e484750ba9d1a4113981847")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationManagerStatics2(ptr: Pointer?): WithDefault =
        IToastNotificationManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIToastNotificationManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1744884024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerStatics2):
        Array<IToastNotificationManagerStatics2?> = (elements as
        Array<IToastNotificationManagerStatics2?>).castToImpl<IToastNotificationManagerStatics2,IToastNotificationManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerStatics2?> =
        arrayOfNulls<IToastNotificationManagerStatics2_Impl>(size) as
        Array<IToastNotificationManagerStatics2?>
  }
}
