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

@ABIMarker(ITextBlockAutomationPeer.ABI::class)
@Signature("{29521960-2ef2-5d15-bf6a-cf585ef8a571}")
@Guid("295219602ef25d15bf6acf585ef8a571")
@WinRTInterface("295219602ef25d15bf6acf585ef8a571")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBlockAutomationPeer.ByReference::class)
public interface ITextBlockAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBlockAutomationPeer> {
    public override fun getValue() = ABI.makeITextBlockAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ITextBlockAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBlockAutomationPeer {
    public val __276553258_Ptr: Pointer?

    public val _276553258_VtblPtr: Pointer?
      get() = __276553258_Ptr?.getPointer(0)
  }

  public class ITextBlockAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __276553258_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBlockAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("295219602ef25d15bf6acf585ef8a571")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBlockAutomationPeer(ptr: Pointer?): WithDefault =
        ITextBlockAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBlockAutomationPeer {
      val address = segment.toRawLongValue()
      return makeITextBlockAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ITextBlockAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__276553258_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBlockAutomationPeer):
        Array<ITextBlockAutomationPeer?> = (elements as
        Array<ITextBlockAutomationPeer?>).castToImpl<ITextBlockAutomationPeer,ITextBlockAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBlockAutomationPeer?> =
        arrayOfNulls<ITextBlockAutomationPeer_Impl>(size) as Array<ITextBlockAutomationPeer?>
  }
}
