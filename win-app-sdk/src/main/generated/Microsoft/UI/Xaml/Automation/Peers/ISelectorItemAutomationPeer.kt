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

@ABIMarker(ISelectorItemAutomationPeer.ABI::class)
@Signature("{70b85e53-e684-5068-91b7-2d84fea8e9d7}")
@Guid("70b85e53e684506891b72d84fea8e9d7")
@WinRTInterface("70b85e53e684506891b72d84fea8e9d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectorItemAutomationPeer.ByReference::class)
public interface ISelectorItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectorItemAutomationPeer> {
    public override fun getValue() = ABI.makeISelectorItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ISelectorItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectorItemAutomationPeer {
    public val __1333457170_Ptr: Pointer?

    public val _1333457170_VtblPtr: Pointer?
      get() = __1333457170_Ptr?.getPointer(0)
  }

  public class ISelectorItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1333457170_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectorItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("70b85e53e684506891b72d84fea8e9d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectorItemAutomationPeer(ptr: Pointer?): WithDefault =
        ISelectorItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectorItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeISelectorItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ISelectorItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1333457170_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectorItemAutomationPeer):
        Array<ISelectorItemAutomationPeer?> = (elements as
        Array<ISelectorItemAutomationPeer?>).castToImpl<ISelectorItemAutomationPeer,ISelectorItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectorItemAutomationPeer?> =
        arrayOfNulls<ISelectorItemAutomationPeer_Impl>(size) as Array<ISelectorItemAutomationPeer?>
  }
}
