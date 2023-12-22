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

@ABIMarker(IListViewBaseHeaderItemAutomationPeer.ABI::class)
@Signature("{623314d2-c7f1-5003-9560-07d420a33a2a}")
@Guid("623314d2c7f15003956007d420a33a2a")
@WinRTInterface("623314d2c7f15003956007d420a33a2a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBaseHeaderItemAutomationPeer.ByReference::class)
public interface IListViewBaseHeaderItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewBaseHeaderItemAutomationPeer> {
    public override fun getValue() =
        ABI.makeIListViewBaseHeaderItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IListViewBaseHeaderItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBaseHeaderItemAutomationPeer {
    public val __1745135536_Ptr: Pointer?

    public val _1745135536_VtblPtr: Pointer?
      get() = __1745135536_Ptr?.getPointer(0)
  }

  public class IListViewBaseHeaderItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1745135536_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBaseHeaderItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("623314d2c7f15003956007d420a33a2a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBaseHeaderItemAutomationPeer(ptr: Pointer?): WithDefault =
        IListViewBaseHeaderItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBaseHeaderItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIListViewBaseHeaderItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IListViewBaseHeaderItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1745135536_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBaseHeaderItemAutomationPeer):
        Array<IListViewBaseHeaderItemAutomationPeer?> = (elements as
        Array<IListViewBaseHeaderItemAutomationPeer?>).castToImpl<IListViewBaseHeaderItemAutomationPeer,IListViewBaseHeaderItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBaseHeaderItemAutomationPeer?> =
        arrayOfNulls<IListViewBaseHeaderItemAutomationPeer_Impl>(size) as
        Array<IListViewBaseHeaderItemAutomationPeer?>
  }
}
