package Microsoft.UI.Xaml.Media

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

@ABIMarker(ILoadedImageSourceLoadCompletedEventArgs.ABI::class)
@Signature("{4121bb7c-48e8-542d-b950-3ea7e709c0d6}")
@Guid("4121bb7c48e8542db9503ea7e709c0d6")
@WinRTInterface("4121bb7c48e8542db9503ea7e709c0d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoadedImageSourceLoadCompletedEventArgs.ByReference::class)
public interface ILoadedImageSourceLoadCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): LoadedImageSourceLoadStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoadedImageSourceLoadCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeILoadedImageSourceLoadCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILoadedImageSourceLoadCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoadedImageSourceLoadCompletedEventArgs {
    public val __344246222_Ptr: Pointer?

    public val _344246222_VtblPtr: Pointer?
      get() = __344246222_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): LoadedImageSourceLoadStatus? {
      val fnPtr = _344246222_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoadedImageSourceLoadStatus>()
      val hr = fn.invokeHR(arrayOf(__344246222_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoadedImageSourceLoadStatus>(result.getValue())
      return resultValue
    }
  }

  public class ILoadedImageSourceLoadCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __344246222_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoadedImageSourceLoadCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4121bb7c48e8542db9503ea7e709c0d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoadedImageSourceLoadCompletedEventArgs(ptr: Pointer?): WithDefault =
        ILoadedImageSourceLoadCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ILoadedImageSourceLoadCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeILoadedImageSourceLoadCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILoadedImageSourceLoadCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__344246222_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoadedImageSourceLoadCompletedEventArgs):
        Array<ILoadedImageSourceLoadCompletedEventArgs?> = (elements as
        Array<ILoadedImageSourceLoadCompletedEventArgs?>).castToImpl<ILoadedImageSourceLoadCompletedEventArgs,ILoadedImageSourceLoadCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoadedImageSourceLoadCompletedEventArgs?> =
        arrayOfNulls<ILoadedImageSourceLoadCompletedEventArgs_Impl>(size) as
        Array<ILoadedImageSourceLoadCompletedEventArgs?>
  }
}
