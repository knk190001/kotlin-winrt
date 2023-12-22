package Windows.UI.Xaml.Media

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

@ABIMarker(IRateChangedRoutedEventArgs.ABI::class)
@Signature("{9016aa6f-3ca8-4c80-8e2f-8851a68f131f}")
@Guid("9016aa6f3ca84c808e2f8851a68f131f")
@WinRTInterface("9016aa6f3ca84c808e2f8851a68f131f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRateChangedRoutedEventArgs.ByReference::class)
public interface IRateChangedRoutedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRateChangedRoutedEventArgs> {
    public override fun getValue() = ABI.makeIRateChangedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRateChangedRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRateChangedRoutedEventArgs {
    public val __806564796_Ptr: Pointer?

    public val _806564796_VtblPtr: Pointer?
      get() = __806564796_Ptr?.getPointer(0)
  }

  public class IRateChangedRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __806564796_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRateChangedRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9016aa6f3ca84c808e2f8851a68f131f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRateChangedRoutedEventArgs(ptr: Pointer?): WithDefault =
        IRateChangedRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRateChangedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRateChangedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRateChangedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__806564796_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRateChangedRoutedEventArgs):
        Array<IRateChangedRoutedEventArgs?> = (elements as
        Array<IRateChangedRoutedEventArgs?>).castToImpl<IRateChangedRoutedEventArgs,IRateChangedRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRateChangedRoutedEventArgs?> =
        arrayOfNulls<IRateChangedRoutedEventArgs_Impl>(size) as Array<IRateChangedRoutedEventArgs?>
  }
}
