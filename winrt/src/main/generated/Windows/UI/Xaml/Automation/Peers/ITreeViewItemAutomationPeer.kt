package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(ITreeViewItemAutomationPeer.ABI::class)
@Signature("{2331d648-b617-437f-920c-71d450503e65}")
@Guid("2331d648b617437f920c71d450503e65")
@WinRTInterface("2331d648b617437f920c71d450503e65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewItemAutomationPeer.ByReference::class)
public interface ITreeViewItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewItemAutomationPeer> {
    public override fun getValue() = ABI.makeITreeViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ITreeViewItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewItemAutomationPeer {
    public val __898195833_Ptr: Pointer?

    public val _898195833_VtblPtr: Pointer?
      get() = __898195833_Ptr?.getPointer(0)
  }

  public class ITreeViewItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __898195833_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2331d648b617437f920c71d450503e65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewItemAutomationPeer(ptr: Pointer?): WithDefault =
        ITreeViewItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeITreeViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__898195833_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewItemAutomationPeer):
        Array<ITreeViewItemAutomationPeer?> = (elements as
        Array<ITreeViewItemAutomationPeer?>).castToImpl<ITreeViewItemAutomationPeer,ITreeViewItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewItemAutomationPeer?> =
        arrayOfNulls<ITreeViewItemAutomationPeer_Impl>(size) as Array<ITreeViewItemAutomationPeer?>
  }
}
