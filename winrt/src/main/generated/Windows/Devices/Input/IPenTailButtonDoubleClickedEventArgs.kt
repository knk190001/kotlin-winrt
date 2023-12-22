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

@ABIMarker(IPenTailButtonDoubleClickedEventArgs.ABI::class)
@Signature("{846321a2-618a-5478-b04c-b358231da4a7}")
@Guid("846321a2618a5478b04cb358231da4a7")
@WinRTInterface("846321a2618a5478b04cb358231da4a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenTailButtonDoubleClickedEventArgs.ByReference::class)
public interface IPenTailButtonDoubleClickedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPenTailButtonDoubleClickedEventArgs> {
    public override fun getValue() =
        ABI.makeIPenTailButtonDoubleClickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPenTailButtonDoubleClickedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenTailButtonDoubleClickedEventArgs {
    public val __2089879169_Ptr: Pointer?

    public val _2089879169_VtblPtr: Pointer?
      get() = __2089879169_Ptr?.getPointer(0)
  }

  public class IPenTailButtonDoubleClickedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2089879169_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenTailButtonDoubleClickedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("846321a2618a5478b04cb358231da4a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenTailButtonDoubleClickedEventArgs(ptr: Pointer?): WithDefault =
        IPenTailButtonDoubleClickedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenTailButtonDoubleClickedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPenTailButtonDoubleClickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPenTailButtonDoubleClickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2089879169_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenTailButtonDoubleClickedEventArgs):
        Array<IPenTailButtonDoubleClickedEventArgs?> = (elements as
        Array<IPenTailButtonDoubleClickedEventArgs?>).castToImpl<IPenTailButtonDoubleClickedEventArgs,IPenTailButtonDoubleClickedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenTailButtonDoubleClickedEventArgs?> =
        arrayOfNulls<IPenTailButtonDoubleClickedEventArgs_Impl>(size) as
        Array<IPenTailButtonDoubleClickedEventArgs?>
  }
}
