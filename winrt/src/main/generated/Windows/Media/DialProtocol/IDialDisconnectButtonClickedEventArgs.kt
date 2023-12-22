package Windows.Media.DialProtocol

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

@ABIMarker(IDialDisconnectButtonClickedEventArgs.ABI::class)
@Signature("{52765152-9c81-4e55-adc2-0ebe99cde3b6}")
@Guid("527651529c814e55adc20ebe99cde3b6")
@WinRTInterface("527651529c814e55adc20ebe99cde3b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialDisconnectButtonClickedEventArgs.ByReference::class)
public interface IDialDisconnectButtonClickedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Device(): DialDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDialDisconnectButtonClickedEventArgs> {
    public override fun getValue() =
        ABI.makeIDialDisconnectButtonClickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDialDisconnectButtonClickedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialDisconnectButtonClickedEventArgs {
    public val __509358790_Ptr: Pointer?

    public val _509358790_VtblPtr: Pointer?
      get() = __509358790_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Device(): DialDevice? {
      val fnPtr = _509358790_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DialDevice>()
      val hr = fn.invokeHR(arrayOf(__509358790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DialDevice>(result.getValue())
      return resultValue
    }
  }

  public class IDialDisconnectButtonClickedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __509358790_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialDisconnectButtonClickedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("527651529c814e55adc20ebe99cde3b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialDisconnectButtonClickedEventArgs(ptr: Pointer?): WithDefault =
        IDialDisconnectButtonClickedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialDisconnectButtonClickedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDialDisconnectButtonClickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDialDisconnectButtonClickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__509358790_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialDisconnectButtonClickedEventArgs):
        Array<IDialDisconnectButtonClickedEventArgs?> = (elements as
        Array<IDialDisconnectButtonClickedEventArgs?>).castToImpl<IDialDisconnectButtonClickedEventArgs,IDialDisconnectButtonClickedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialDisconnectButtonClickedEventArgs?> =
        arrayOfNulls<IDialDisconnectButtonClickedEventArgs_Impl>(size) as
        Array<IDialDisconnectButtonClickedEventArgs?>
  }
}
