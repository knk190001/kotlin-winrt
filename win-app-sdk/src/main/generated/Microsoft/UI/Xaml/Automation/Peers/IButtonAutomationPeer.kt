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

@ABIMarker(IButtonAutomationPeer.ABI::class)
@Signature("{a3a2e96b-8a2d-50bf-9b3d-dfbc4653f5a6}")
@Guid("a3a2e96b8a2d50bf9b3ddfbc4653f5a6")
@WinRTInterface("a3a2e96b8a2d50bf9b3ddfbc4653f5a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IButtonAutomationPeer.ByReference::class)
public interface IButtonAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IButtonAutomationPeer> {
    public override fun getValue() = ABI.makeIButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IButtonAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IButtonAutomationPeer {
    public val __1438926642_Ptr: Pointer?

    public val _1438926642_VtblPtr: Pointer?
      get() = __1438926642_Ptr?.getPointer(0)
  }

  public class IButtonAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1438926642_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IButtonAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3a2e96b8a2d50bf9b3ddfbc4653f5a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIButtonAutomationPeer(ptr: Pointer?): WithDefault =
        IButtonAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1438926642_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IButtonAutomationPeer): Array<IButtonAutomationPeer?> =
        (elements as
        Array<IButtonAutomationPeer?>).castToImpl<IButtonAutomationPeer,IButtonAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IButtonAutomationPeer?> =
        arrayOfNulls<IButtonAutomationPeer_Impl>(size) as Array<IButtonAutomationPeer?>
  }
}
