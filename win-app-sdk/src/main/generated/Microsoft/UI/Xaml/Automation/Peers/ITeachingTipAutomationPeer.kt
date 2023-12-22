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

@ABIMarker(ITeachingTipAutomationPeer.ABI::class)
@Signature("{607994ec-a995-5b07-b535-8c913f0bc26c}")
@Guid("607994eca9955b07b5358c913f0bc26c")
@WinRTInterface("607994eca9955b07b5358c913f0bc26c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITeachingTipAutomationPeer.ByReference::class)
public interface ITeachingTipAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITeachingTipAutomationPeer> {
    public override fun getValue() = ABI.makeITeachingTipAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ITeachingTipAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITeachingTipAutomationPeer {
    public val __112485572_Ptr: Pointer?

    public val _112485572_VtblPtr: Pointer?
      get() = __112485572_Ptr?.getPointer(0)
  }

  public class ITeachingTipAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __112485572_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITeachingTipAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("607994eca9955b07b5358c913f0bc26c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITeachingTipAutomationPeer(ptr: Pointer?): WithDefault =
        ITeachingTipAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITeachingTipAutomationPeer {
      val address = segment.toRawLongValue()
      return makeITeachingTipAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ITeachingTipAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__112485572_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITeachingTipAutomationPeer):
        Array<ITeachingTipAutomationPeer?> = (elements as
        Array<ITeachingTipAutomationPeer?>).castToImpl<ITeachingTipAutomationPeer,ITeachingTipAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITeachingTipAutomationPeer?> =
        arrayOfNulls<ITeachingTipAutomationPeer_Impl>(size) as Array<ITeachingTipAutomationPeer?>
  }
}
