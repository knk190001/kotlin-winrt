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

@ABIMarker(IGridViewAutomationPeer.ABI::class)
@Signature("{7870992f-3328-53c2-b412-2914438975b4}")
@Guid("7870992f332853c2b4122914438975b4")
@WinRTInterface("7870992f332853c2b4122914438975b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewAutomationPeer.ByReference::class)
public interface IGridViewAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewAutomationPeer> {
    public override fun getValue() = ABI.makeIGridViewAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IGridViewAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewAutomationPeer {
    public val __862886951_Ptr: Pointer?

    public val _862886951_VtblPtr: Pointer?
      get() = __862886951_Ptr?.getPointer(0)
  }

  public class IGridViewAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __862886951_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7870992f332853c2b4122914438975b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewAutomationPeer(ptr: Pointer?): WithDefault =
        IGridViewAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIGridViewAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IGridViewAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__862886951_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewAutomationPeer): Array<IGridViewAutomationPeer?>
        = (elements as
        Array<IGridViewAutomationPeer?>).castToImpl<IGridViewAutomationPeer,IGridViewAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewAutomationPeer?> =
        arrayOfNulls<IGridViewAutomationPeer_Impl>(size) as Array<IGridViewAutomationPeer?>
  }
}
