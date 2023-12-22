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

@ABIMarker(IListViewItemDataAutomationPeer.ABI::class)
@Signature("{15a8d7fd-d7a5-4a6c-963c-6f7ce464671a}")
@Guid("15a8d7fdd7a54a6c963c6f7ce464671a")
@WinRTInterface("15a8d7fdd7a54a6c963c6f7ce464671a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemDataAutomationPeer.ByReference::class)
public interface IListViewItemDataAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemDataAutomationPeer> {
    public override fun getValue() = ABI.makeIListViewItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IListViewItemDataAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemDataAutomationPeer {
    public val __612417839_Ptr: Pointer?

    public val _612417839_VtblPtr: Pointer?
      get() = __612417839_Ptr?.getPointer(0)
  }

  public class IListViewItemDataAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __612417839_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemDataAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("15a8d7fdd7a54a6c963c6f7ce464671a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemDataAutomationPeer(ptr: Pointer?): WithDefault =
        IListViewItemDataAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIListViewItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__612417839_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemDataAutomationPeer):
        Array<IListViewItemDataAutomationPeer?> = (elements as
        Array<IListViewItemDataAutomationPeer?>).castToImpl<IListViewItemDataAutomationPeer,IListViewItemDataAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemDataAutomationPeer?> =
        arrayOfNulls<IListViewItemDataAutomationPeer_Impl>(size) as
        Array<IListViewItemDataAutomationPeer?>
  }
}
