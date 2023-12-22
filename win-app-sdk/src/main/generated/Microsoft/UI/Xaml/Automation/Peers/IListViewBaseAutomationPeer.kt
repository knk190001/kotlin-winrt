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

@ABIMarker(IListViewBaseAutomationPeer.ABI::class)
@Signature("{ad9a395c-5a96-5331-9636-ee4c53184986}")
@Guid("ad9a395c5a9653319636ee4c53184986")
@WinRTInterface("ad9a395c5a9653319636ee4c53184986")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBaseAutomationPeer.ByReference::class)
public interface IListViewBaseAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewBaseAutomationPeer> {
    public override fun getValue() = ABI.makeIListViewBaseAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IListViewBaseAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBaseAutomationPeer {
    public val __1267562064_Ptr: Pointer?

    public val _1267562064_VtblPtr: Pointer?
      get() = __1267562064_Ptr?.getPointer(0)
  }

  public class IListViewBaseAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1267562064_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBaseAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad9a395c5a9653319636ee4c53184986")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBaseAutomationPeer(ptr: Pointer?): WithDefault =
        IListViewBaseAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBaseAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIListViewBaseAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IListViewBaseAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1267562064_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBaseAutomationPeer):
        Array<IListViewBaseAutomationPeer?> = (elements as
        Array<IListViewBaseAutomationPeer?>).castToImpl<IListViewBaseAutomationPeer,IListViewBaseAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBaseAutomationPeer?> =
        arrayOfNulls<IListViewBaseAutomationPeer_Impl>(size) as Array<IListViewBaseAutomationPeer?>
  }
}
