package Windows.UI.Xaml.Input

import Windows.UI.Core.CorePhysicalKeyStatus
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
import kotlin.Boolean
import kotlin.Char
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICharacterReceivedRoutedEventArgs.ABI::class)
@Signature("{7849fd82-48e4-444d-9419-93ab8892c107}")
@Guid("7849fd8248e4444d941993ab8892c107")
@WinRTInterface("7849fd8248e4444d941993ab8892c107")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICharacterReceivedRoutedEventArgs.ByReference::class)
public interface ICharacterReceivedRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Character(): Char

  @InterfaceMethod(1)
  public fun get_KeyStatus(): CorePhysicalKeyStatus?

  @InterfaceMethod(2)
  public fun get_Handled(): Boolean

  @InterfaceMethod(3)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICharacterReceivedRoutedEventArgs> {
    public override fun getValue() =
        ABI.makeICharacterReceivedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICharacterReceivedRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICharacterReceivedRoutedEventArgs {
    public val __2051273448_Ptr: Pointer?

    public val _2051273448_VtblPtr: Pointer?
      get() = __2051273448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Character(): Char {
      val fnPtr = _2051273448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Char>()
      val hr = fn.invokeHR(arrayOf(__2051273448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Char>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_KeyStatus(): CorePhysicalKeyStatus? {
      val fnPtr = _2051273448_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CorePhysicalKeyStatus>()
      val hr = fn.invokeHR(arrayOf(__2051273448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CorePhysicalKeyStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Handled(): Boolean {
      val fnPtr = _2051273448_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2051273448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _2051273448_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2051273448_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICharacterReceivedRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2051273448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICharacterReceivedRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7849fd8248e4444d941993ab8892c107")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICharacterReceivedRoutedEventArgs(ptr: Pointer?): WithDefault =
        ICharacterReceivedRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICharacterReceivedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeICharacterReceivedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICharacterReceivedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2051273448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICharacterReceivedRoutedEventArgs):
        Array<ICharacterReceivedRoutedEventArgs?> = (elements as
        Array<ICharacterReceivedRoutedEventArgs?>).castToImpl<ICharacterReceivedRoutedEventArgs,ICharacterReceivedRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICharacterReceivedRoutedEventArgs?> =
        arrayOfNulls<ICharacterReceivedRoutedEventArgs_Impl>(size) as
        Array<ICharacterReceivedRoutedEventArgs?>
  }
}
