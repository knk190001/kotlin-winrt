package Windows.UI.Xaml.Controls

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

@ABIMarker(IHandwritingPanelOpenedEventArgs.ABI::class)
@Signature("{fc15b16d-9f15-47b0-b97a-94a68cc61345}")
@Guid("fc15b16d9f1547b0b97a94a68cc61345")
@WinRTInterface("fc15b16d9f1547b0b97a94a68cc61345")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHandwritingPanelOpenedEventArgs.ByReference::class)
public interface IHandwritingPanelOpenedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHandwritingPanelOpenedEventArgs> {
    public override fun getValue() = ABI.makeIHandwritingPanelOpenedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHandwritingPanelOpenedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHandwritingPanelOpenedEventArgs {
    public val __899757851_Ptr: Pointer?

    public val _899757851_VtblPtr: Pointer?
      get() = __899757851_Ptr?.getPointer(0)
  }

  public class IHandwritingPanelOpenedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __899757851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHandwritingPanelOpenedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc15b16d9f1547b0b97a94a68cc61345")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHandwritingPanelOpenedEventArgs(ptr: Pointer?): WithDefault =
        IHandwritingPanelOpenedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHandwritingPanelOpenedEventArgs {
      val address = segment.toRawLongValue()
      return makeIHandwritingPanelOpenedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHandwritingPanelOpenedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__899757851_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHandwritingPanelOpenedEventArgs):
        Array<IHandwritingPanelOpenedEventArgs?> = (elements as
        Array<IHandwritingPanelOpenedEventArgs?>).castToImpl<IHandwritingPanelOpenedEventArgs,IHandwritingPanelOpenedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHandwritingPanelOpenedEventArgs?> =
        arrayOfNulls<IHandwritingPanelOpenedEventArgs_Impl>(size) as
        Array<IHandwritingPanelOpenedEventArgs?>
  }
}
