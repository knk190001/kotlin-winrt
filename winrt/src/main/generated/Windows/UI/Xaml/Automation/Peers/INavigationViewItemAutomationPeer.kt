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

@ABIMarker(INavigationViewItemAutomationPeer.ABI::class)
@Signature("{309847a5-9971-4d8d-a81c-085c7086a1b9}")
@Guid("309847a599714d8da81c085c7086a1b9")
@WinRTInterface("309847a599714d8da81c085c7086a1b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemAutomationPeer.ByReference::class)
public interface INavigationViewItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemAutomationPeer> {
    public override fun getValue() =
        ABI.makeINavigationViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemAutomationPeer {
    public val __1991971203_Ptr: Pointer?

    public val _1991971203_VtblPtr: Pointer?
      get() = __1991971203_Ptr?.getPointer(0)
  }

  public class INavigationViewItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1991971203_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("309847a599714d8da81c085c7086a1b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemAutomationPeer(ptr: Pointer?): WithDefault =
        INavigationViewItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1991971203_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemAutomationPeer):
        Array<INavigationViewItemAutomationPeer?> = (elements as
        Array<INavigationViewItemAutomationPeer?>).castToImpl<INavigationViewItemAutomationPeer,INavigationViewItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemAutomationPeer?> =
        arrayOfNulls<INavigationViewItemAutomationPeer_Impl>(size) as
        Array<INavigationViewItemAutomationPeer?>
  }
}
