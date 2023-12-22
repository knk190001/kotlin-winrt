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

@ABIMarker(IProgressBarAutomationPeer.ABI::class)
@Signature("{93f48f86-d840-4fb6-ac2f-5f779b854b0d}")
@Guid("93f48f86d8404fb6ac2f5f779b854b0d")
@WinRTInterface("93f48f86d8404fb6ac2f5f779b854b0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressBarAutomationPeer.ByReference::class)
public interface IProgressBarAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProgressBarAutomationPeer> {
    public override fun getValue() = ABI.makeIProgressBarAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IProgressBarAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressBarAutomationPeer {
    public val __797382567_Ptr: Pointer?

    public val _797382567_VtblPtr: Pointer?
      get() = __797382567_Ptr?.getPointer(0)
  }

  public class IProgressBarAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __797382567_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressBarAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93f48f86d8404fb6ac2f5f779b854b0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressBarAutomationPeer(ptr: Pointer?): WithDefault =
        IProgressBarAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressBarAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIProgressBarAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IProgressBarAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__797382567_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressBarAutomationPeer):
        Array<IProgressBarAutomationPeer?> = (elements as
        Array<IProgressBarAutomationPeer?>).castToImpl<IProgressBarAutomationPeer,IProgressBarAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressBarAutomationPeer?> =
        arrayOfNulls<IProgressBarAutomationPeer_Impl>(size) as Array<IProgressBarAutomationPeer?>
  }
}
