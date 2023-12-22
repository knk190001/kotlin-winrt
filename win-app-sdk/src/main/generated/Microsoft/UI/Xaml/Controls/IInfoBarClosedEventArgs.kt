package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IInfoBarClosedEventArgs.ABI::class)
@Signature("{593af0b3-bded-53da-8f56-80ed3c64322c}")
@Guid("593af0b3bded53da8f5680ed3c64322c")
@WinRTInterface("593af0b3bded53da8f5680ed3c64322c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBarClosedEventArgs.ByReference::class)
public interface IInfoBarClosedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): InfoBarCloseReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBarClosedEventArgs> {
    public override fun getValue() = ABI.makeIInfoBarClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IInfoBarClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBarClosedEventArgs {
    public val __856037939_Ptr: Pointer?

    public val _856037939_VtblPtr: Pointer?
      get() = __856037939_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): InfoBarCloseReason? {
      val fnPtr = _856037939_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBarCloseReason>()
      val hr = fn.invokeHR(arrayOf(__856037939_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBarCloseReason>(result.getValue())
      return resultValue
    }
  }

  public class IInfoBarClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __856037939_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBarClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("593af0b3bded53da8f5680ed3c64322c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBarClosedEventArgs(ptr: Pointer?): WithDefault =
        IInfoBarClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBarClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIInfoBarClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IInfoBarClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__856037939_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBarClosedEventArgs): Array<IInfoBarClosedEventArgs?>
        = (elements as
        Array<IInfoBarClosedEventArgs?>).castToImpl<IInfoBarClosedEventArgs,IInfoBarClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBarClosedEventArgs?> =
        arrayOfNulls<IInfoBarClosedEventArgs_Impl>(size) as Array<IInfoBarClosedEventArgs?>
  }
}
