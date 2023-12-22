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

@ABIMarker(IListViewHeaderItemAutomationPeer.ABI::class)
@Signature("{0293eaca-f7de-5a0d-9beb-79dc1ac4a7de}")
@Guid("0293eacaf7de5a0d9beb79dc1ac4a7de")
@WinRTInterface("0293eacaf7de5a0d9beb79dc1ac4a7de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewHeaderItemAutomationPeer.ByReference::class)
public interface IListViewHeaderItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewHeaderItemAutomationPeer> {
    public override fun getValue() =
        ABI.makeIListViewHeaderItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IListViewHeaderItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewHeaderItemAutomationPeer {
    public val __1599550303_Ptr: Pointer?

    public val _1599550303_VtblPtr: Pointer?
      get() = __1599550303_Ptr?.getPointer(0)
  }

  public class IListViewHeaderItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1599550303_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewHeaderItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0293eacaf7de5a0d9beb79dc1ac4a7de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewHeaderItemAutomationPeer(ptr: Pointer?): WithDefault =
        IListViewHeaderItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewHeaderItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIListViewHeaderItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IListViewHeaderItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1599550303_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewHeaderItemAutomationPeer):
        Array<IListViewHeaderItemAutomationPeer?> = (elements as
        Array<IListViewHeaderItemAutomationPeer?>).castToImpl<IListViewHeaderItemAutomationPeer,IListViewHeaderItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewHeaderItemAutomationPeer?> =
        arrayOfNulls<IListViewHeaderItemAutomationPeer_Impl>(size) as
        Array<IListViewHeaderItemAutomationPeer?>
  }
}
