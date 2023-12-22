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

@ABIMarker(IAutoSuggestBoxAutomationPeer.ABI::class)
@Signature("{2f32c302-f99b-491d-9726-a5e181643efa}")
@Guid("2f32c302f99b491d9726a5e181643efa")
@WinRTInterface("2f32c302f99b491d9726a5e181643efa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBoxAutomationPeer.ByReference::class)
public interface IAutoSuggestBoxAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBoxAutomationPeer> {
    public override fun getValue() = ABI.makeIAutoSuggestBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBoxAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBoxAutomationPeer {
    public val __816565721_Ptr: Pointer?

    public val _816565721_VtblPtr: Pointer?
      get() = __816565721_Ptr?.getPointer(0)
  }

  public class IAutoSuggestBoxAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __816565721_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBoxAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f32c302f99b491d9726a5e181643efa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBoxAutomationPeer(ptr: Pointer?): WithDefault =
        IAutoSuggestBoxAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__816565721_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBoxAutomationPeer):
        Array<IAutoSuggestBoxAutomationPeer?> = (elements as
        Array<IAutoSuggestBoxAutomationPeer?>).castToImpl<IAutoSuggestBoxAutomationPeer,IAutoSuggestBoxAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBoxAutomationPeer?> =
        arrayOfNulls<IAutoSuggestBoxAutomationPeer_Impl>(size) as
        Array<IAutoSuggestBoxAutomationPeer?>
  }
}
