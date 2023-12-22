package Windows.Devices.Input

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPenTailButtonClickedEventArgs.ABI::class)
@Signature("{5d2fb7b6-6ad3-5d3e-ab29-05ea2410e390}")
@Guid("5d2fb7b66ad35d3eab2905ea2410e390")
@WinRTInterface("5d2fb7b66ad35d3eab2905ea2410e390")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenTailButtonClickedEventArgs.ByReference::class)
public interface IPenTailButtonClickedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPenTailButtonClickedEventArgs> {
    public override fun getValue() = ABI.makeIPenTailButtonClickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPenTailButtonClickedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenTailButtonClickedEventArgs {
    public val __342994800_Ptr: Pointer?

    public val _342994800_VtblPtr: Pointer?
      get() = __342994800_Ptr?.getPointer(0)
  }

  public class IPenTailButtonClickedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __342994800_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenTailButtonClickedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d2fb7b66ad35d3eab2905ea2410e390")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenTailButtonClickedEventArgs(ptr: Pointer?): WithDefault =
        IPenTailButtonClickedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenTailButtonClickedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPenTailButtonClickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPenTailButtonClickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__342994800_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenTailButtonClickedEventArgs):
        Array<IPenTailButtonClickedEventArgs?> = (elements as
        Array<IPenTailButtonClickedEventArgs?>).castToImpl<IPenTailButtonClickedEventArgs,IPenTailButtonClickedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenTailButtonClickedEventArgs?> =
        arrayOfNulls<IPenTailButtonClickedEventArgs_Impl>(size) as
        Array<IPenTailButtonClickedEventArgs?>
  }
}
