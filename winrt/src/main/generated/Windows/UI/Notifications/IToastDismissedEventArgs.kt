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

@ABIMarker(IToastDismissedEventArgs.ABI::class)
@Signature("{3f89d935-d9cb-4538-a0f0-ffe7659938f8}")
@Guid("3f89d935d9cb4538a0f0ffe7659938f8")
@WinRTInterface("3f89d935d9cb4538a0f0ffe7659938f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastDismissedEventArgs.ByReference::class)
public interface IToastDismissedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): ToastDismissalReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastDismissedEventArgs> {
    public override fun getValue() = ABI.makeIToastDismissedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IToastDismissedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastDismissedEventArgs {
    public val __1824126971_Ptr: Pointer?

    public val _1824126971_VtblPtr: Pointer?
      get() = __1824126971_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): ToastDismissalReason? {
      val fnPtr = _1824126971_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastDismissalReason>()
      val hr = fn.invokeHR(arrayOf(__1824126971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastDismissalReason>(result.getValue())
      return resultValue
    }
  }

  public class IToastDismissedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1824126971_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastDismissedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f89d935d9cb4538a0f0ffe7659938f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastDismissedEventArgs(ptr: Pointer?): WithDefault =
        IToastDismissedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastDismissedEventArgs {
      val address = segment.toRawLongValue()
      return makeIToastDismissedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IToastDismissedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1824126971_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastDismissedEventArgs):
        Array<IToastDismissedEventArgs?> = (elements as
        Array<IToastDismissedEventArgs?>).castToImpl<IToastDismissedEventArgs,IToastDismissedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastDismissedEventArgs?> =
        arrayOfNulls<IToastDismissedEventArgs_Impl>(size) as Array<IToastDismissedEventArgs?>
  }
}
