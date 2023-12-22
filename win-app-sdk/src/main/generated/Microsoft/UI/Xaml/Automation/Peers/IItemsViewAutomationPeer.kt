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

@ABIMarker(IItemsViewAutomationPeer.ABI::class)
@Signature("{d456ad6d-18d5-51ae-a44e-95671f848184}")
@Guid("d456ad6d18d551aea44e95671f848184")
@WinRTInterface("d456ad6d18d551aea44e95671f848184")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsViewAutomationPeer.ByReference::class)
public interface IItemsViewAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsViewAutomationPeer> {
    public override fun getValue() = ABI.makeIItemsViewAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IItemsViewAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsViewAutomationPeer {
    public val __352964549_Ptr: Pointer?

    public val _352964549_VtblPtr: Pointer?
      get() = __352964549_Ptr?.getPointer(0)
  }

  public class IItemsViewAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __352964549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsViewAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d456ad6d18d551aea44e95671f848184")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsViewAutomationPeer(ptr: Pointer?): WithDefault =
        IItemsViewAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsViewAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIItemsViewAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IItemsViewAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__352964549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsViewAutomationPeer):
        Array<IItemsViewAutomationPeer?> = (elements as
        Array<IItemsViewAutomationPeer?>).castToImpl<IItemsViewAutomationPeer,IItemsViewAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsViewAutomationPeer?> =
        arrayOfNulls<IItemsViewAutomationPeer_Impl>(size) as Array<IItemsViewAutomationPeer?>
  }
}
