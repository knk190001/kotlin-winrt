package Microsoft.UI.Xaml.Automation.Peers

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

@ABIMarker(IListBoxItemDataAutomationPeer.ABI::class)
@Signature("{2b81660f-46dc-5765-b10a-2269d12eba42}")
@Guid("2b81660f46dc5765b10a2269d12eba42")
@WinRTInterface("2b81660f46dc5765b10a2269d12eba42")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListBoxItemDataAutomationPeer.ByReference::class)
public interface IListBoxItemDataAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListBoxItemDataAutomationPeer> {
    public override fun getValue() = ABI.makeIListBoxItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IListBoxItemDataAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListBoxItemDataAutomationPeer {
    public val __594315264_Ptr: Pointer?

    public val _594315264_VtblPtr: Pointer?
      get() = __594315264_Ptr?.getPointer(0)
  }

  public class IListBoxItemDataAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __594315264_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListBoxItemDataAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b81660f46dc5765b10a2269d12eba42")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListBoxItemDataAutomationPeer(ptr: Pointer?): WithDefault =
        IListBoxItemDataAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListBoxItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIListBoxItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IListBoxItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__594315264_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListBoxItemDataAutomationPeer):
        Array<IListBoxItemDataAutomationPeer?> = (elements as
        Array<IListBoxItemDataAutomationPeer?>).castToImpl<IListBoxItemDataAutomationPeer,IListBoxItemDataAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListBoxItemDataAutomationPeer?> =
        arrayOfNulls<IListBoxItemDataAutomationPeer_Impl>(size) as
        Array<IListBoxItemDataAutomationPeer?>
  }
}
