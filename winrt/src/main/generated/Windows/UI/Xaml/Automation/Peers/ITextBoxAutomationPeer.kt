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

@ABIMarker(ITextBoxAutomationPeer.ABI::class)
@Signature("{3a4f1ca0-5e5d-4d26-9067-e740bf657a9f}")
@Guid("3a4f1ca05e5d4d269067e740bf657a9f")
@WinRTInterface("3a4f1ca05e5d4d269067e740bf657a9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxAutomationPeer.ByReference::class)
public interface ITextBoxAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxAutomationPeer> {
    public override fun getValue() = ABI.makeITextBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ITextBoxAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxAutomationPeer {
    public val __1696725087_Ptr: Pointer?

    public val _1696725087_VtblPtr: Pointer?
      get() = __1696725087_Ptr?.getPointer(0)
  }

  public class ITextBoxAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1696725087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a4f1ca05e5d4d269067e740bf657a9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxAutomationPeer(ptr: Pointer?): WithDefault =
        ITextBoxAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return makeITextBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1696725087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxAutomationPeer): Array<ITextBoxAutomationPeer?> =
        (elements as
        Array<ITextBoxAutomationPeer?>).castToImpl<ITextBoxAutomationPeer,ITextBoxAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxAutomationPeer?> =
        arrayOfNulls<ITextBoxAutomationPeer_Impl>(size) as Array<ITextBoxAutomationPeer?>
  }
}
