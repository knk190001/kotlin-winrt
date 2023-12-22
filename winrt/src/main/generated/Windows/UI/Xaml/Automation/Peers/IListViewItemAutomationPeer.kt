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

@ABIMarker(IListViewItemAutomationPeer.ABI::class)
@Signature("{ca114e70-a16d-4d09-a1cf-1856ef98a9ec}")
@Guid("ca114e70a16d4d09a1cf1856ef98a9ec")
@WinRTInterface("ca114e70a16d4d09a1cf1856ef98a9ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemAutomationPeer.ByReference::class)
public interface IListViewItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemAutomationPeer> {
    public override fun getValue() = ABI.makeIListViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IListViewItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemAutomationPeer {
    public val __922164103_Ptr: Pointer?

    public val _922164103_VtblPtr: Pointer?
      get() = __922164103_Ptr?.getPointer(0)
  }

  public class IListViewItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __922164103_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca114e70a16d4d09a1cf1856ef98a9ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemAutomationPeer(ptr: Pointer?): WithDefault =
        IListViewItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIListViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__922164103_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemAutomationPeer):
        Array<IListViewItemAutomationPeer?> = (elements as
        Array<IListViewItemAutomationPeer?>).castToImpl<IListViewItemAutomationPeer,IListViewItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemAutomationPeer?> =
        arrayOfNulls<IListViewItemAutomationPeer_Impl>(size) as Array<IListViewItemAutomationPeer?>
  }
}
