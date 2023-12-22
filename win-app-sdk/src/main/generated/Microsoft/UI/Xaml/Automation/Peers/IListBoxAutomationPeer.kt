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

@ABIMarker(IListBoxAutomationPeer.ABI::class)
@Signature("{2bc1ca3f-3617-53a8-94b9-bec91d573525}")
@Guid("2bc1ca3f361753a894b9bec91d573525")
@WinRTInterface("2bc1ca3f361753a894b9bec91d573525")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListBoxAutomationPeer.ByReference::class)
public interface IListBoxAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListBoxAutomationPeer> {
    public override fun getValue() = ABI.makeIListBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IListBoxAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListBoxAutomationPeer {
    public val __2139320509_Ptr: Pointer?

    public val _2139320509_VtblPtr: Pointer?
      get() = __2139320509_Ptr?.getPointer(0)
  }

  public class IListBoxAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2139320509_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListBoxAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2bc1ca3f361753a894b9bec91d573525")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListBoxAutomationPeer(ptr: Pointer?): WithDefault =
        IListBoxAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIListBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IListBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2139320509_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListBoxAutomationPeer): Array<IListBoxAutomationPeer?> =
        (elements as
        Array<IListBoxAutomationPeer?>).castToImpl<IListBoxAutomationPeer,IListBoxAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListBoxAutomationPeer?> =
        arrayOfNulls<IListBoxAutomationPeer_Impl>(size) as Array<IListBoxAutomationPeer?>
  }
}
