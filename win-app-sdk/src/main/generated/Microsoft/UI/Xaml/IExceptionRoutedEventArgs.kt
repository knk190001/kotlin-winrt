package Microsoft.UI.Xaml

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

@ABIMarker(IExceptionRoutedEventArgs.ABI::class)
@Signature("{e8bcb6d2-d3f5-5393-a84f-dfcd44a2df34}")
@Guid("e8bcb6d2d3f55393a84fdfcd44a2df34")
@WinRTInterface("e8bcb6d2d3f55393a84fdfcd44a2df34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExceptionRoutedEventArgs.ByReference::class)
public interface IExceptionRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ErrorMessage(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExceptionRoutedEventArgs> {
    public override fun getValue() = ABI.makeIExceptionRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IExceptionRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExceptionRoutedEventArgs {
    public val __222873748_Ptr: Pointer?

    public val _222873748_VtblPtr: Pointer?
      get() = __222873748_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ErrorMessage(): String? {
      val fnPtr = _222873748_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__222873748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IExceptionRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __222873748_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExceptionRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8bcb6d2d3f55393a84fdfcd44a2df34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExceptionRoutedEventArgs(ptr: Pointer?): WithDefault =
        IExceptionRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExceptionRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIExceptionRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IExceptionRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__222873748_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExceptionRoutedEventArgs):
        Array<IExceptionRoutedEventArgs?> = (elements as
        Array<IExceptionRoutedEventArgs?>).castToImpl<IExceptionRoutedEventArgs,IExceptionRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExceptionRoutedEventArgs?> =
        arrayOfNulls<IExceptionRoutedEventArgs_Impl>(size) as Array<IExceptionRoutedEventArgs?>
  }
}
