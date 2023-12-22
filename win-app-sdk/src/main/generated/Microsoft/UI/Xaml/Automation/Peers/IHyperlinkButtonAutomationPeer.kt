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

@ABIMarker(IHyperlinkButtonAutomationPeer.ABI::class)
@Signature("{6a770ab2-02d0-59ba-a28e-3dfba1f10dd8}")
@Guid("6a770ab202d059baa28e3dfba1f10dd8")
@WinRTInterface("6a770ab202d059baa28e3dfba1f10dd8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlinkButtonAutomationPeer.ByReference::class)
public interface IHyperlinkButtonAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHyperlinkButtonAutomationPeer> {
    public override fun getValue() = ABI.makeIHyperlinkButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IHyperlinkButtonAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlinkButtonAutomationPeer {
    public val __35072494_Ptr: Pointer?

    public val _35072494_VtblPtr: Pointer?
      get() = __35072494_Ptr?.getPointer(0)
  }

  public class IHyperlinkButtonAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __35072494_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlinkButtonAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a770ab202d059baa28e3dfba1f10dd8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlinkButtonAutomationPeer(ptr: Pointer?): WithDefault =
        IHyperlinkButtonAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlinkButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIHyperlinkButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IHyperlinkButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__35072494_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlinkButtonAutomationPeer):
        Array<IHyperlinkButtonAutomationPeer?> = (elements as
        Array<IHyperlinkButtonAutomationPeer?>).castToImpl<IHyperlinkButtonAutomationPeer,IHyperlinkButtonAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlinkButtonAutomationPeer?> =
        arrayOfNulls<IHyperlinkButtonAutomationPeer_Impl>(size) as
        Array<IHyperlinkButtonAutomationPeer?>
  }
}
