package Microsoft.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IRoutedEventArgs.ABI::class)
@Signature("{0908c407-1c7d-5de3-9c50-d971c62ec8ec}")
@Guid("0908c4071c7d5de39c50d971c62ec8ec")
@WinRTInterface("0908c4071c7d5de39c50d971c62ec8ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRoutedEventArgs.ByReference::class)
public interface IRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OriginalSource(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRoutedEventArgs> {
    public override fun getValue() = ABI.makeIRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRoutedEventArgs {
    public val __1430837643_Ptr: Pointer?

    public val _1430837643_VtblPtr: Pointer?
      get() = __1430837643_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OriginalSource(): IUnknown? {
      val fnPtr = _1430837643_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1430837643_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1430837643_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0908c4071c7d5de39c50d971c62ec8ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRoutedEventArgs(ptr: Pointer?): WithDefault = IRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1430837643_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRoutedEventArgs): Array<IRoutedEventArgs?> = (elements as
        Array<IRoutedEventArgs?>).castToImpl<IRoutedEventArgs,IRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRoutedEventArgs?> =
        arrayOfNulls<IRoutedEventArgs_Impl>(size) as Array<IRoutedEventArgs?>
  }
}
