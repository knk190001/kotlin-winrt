package Windows.UI.Xaml

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

@ABIMarker(IMediaFailedRoutedEventArgs.ABI::class)
@Signature("{46d1fa8d-5149-4153-ba3c-b03e64ee531e}")
@Guid("46d1fa8d51494153ba3cb03e64ee531e")
@WinRTInterface("46d1fa8d51494153ba3cb03e64ee531e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFailedRoutedEventArgs.ByReference::class)
public interface IMediaFailedRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ErrorTrace(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFailedRoutedEventArgs> {
    public override fun getValue() = ABI.makeIMediaFailedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaFailedRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFailedRoutedEventArgs {
    public val __1566117395_Ptr: Pointer?

    public val _1566117395_VtblPtr: Pointer?
      get() = __1566117395_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ErrorTrace(): String? {
      val fnPtr = _1566117395_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1566117395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFailedRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1566117395_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFailedRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("46d1fa8d51494153ba3cb03e64ee531e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFailedRoutedEventArgs(ptr: Pointer?): WithDefault =
        IMediaFailedRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFailedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaFailedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaFailedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1566117395_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFailedRoutedEventArgs):
        Array<IMediaFailedRoutedEventArgs?> = (elements as
        Array<IMediaFailedRoutedEventArgs?>).castToImpl<IMediaFailedRoutedEventArgs,IMediaFailedRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFailedRoutedEventArgs?> =
        arrayOfNulls<IMediaFailedRoutedEventArgs_Impl>(size) as Array<IMediaFailedRoutedEventArgs?>
  }
}
