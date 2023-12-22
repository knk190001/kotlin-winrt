package Windows.UI.Xaml.Controls

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

@ABIMarker(ISplitButtonAutomationPeer.ABI::class)
@Signature("{c46a58b8-3828-5c36-aa13-f79f02c12f34}")
@Guid("c46a58b838285c36aa13f79f02c12f34")
@WinRTInterface("c46a58b838285c36aa13f79f02c12f34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitButtonAutomationPeer.ByReference::class)
public interface ISplitButtonAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitButtonAutomationPeer> {
    public override fun getValue() = ABI.makeISplitButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ISplitButtonAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitButtonAutomationPeer {
    public val __1750006647_Ptr: Pointer?

    public val _1750006647_VtblPtr: Pointer?
      get() = __1750006647_Ptr?.getPointer(0)
  }

  public class ISplitButtonAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1750006647_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitButtonAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c46a58b838285c36aa13f79f02c12f34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitButtonAutomationPeer(ptr: Pointer?): WithDefault =
        ISplitButtonAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return makeISplitButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ISplitButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1750006647_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitButtonAutomationPeer):
        Array<ISplitButtonAutomationPeer?> = (elements as
        Array<ISplitButtonAutomationPeer?>).castToImpl<ISplitButtonAutomationPeer,ISplitButtonAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitButtonAutomationPeer?> =
        arrayOfNulls<ISplitButtonAutomationPeer_Impl>(size) as Array<ISplitButtonAutomationPeer?>
  }
}
