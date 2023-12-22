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

@ABIMarker(ISliderAutomationPeer.ABI::class)
@Signature("{c321c95f-c917-5714-9d16-ad706e38926a}")
@Guid("c321c95fc91757149d16ad706e38926a")
@WinRTInterface("c321c95fc91757149d16ad706e38926a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISliderAutomationPeer.ByReference::class)
public interface ISliderAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISliderAutomationPeer> {
    public override fun getValue() = ABI.makeISliderAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ISliderAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISliderAutomationPeer {
    public val __338301891_Ptr: Pointer?

    public val _338301891_VtblPtr: Pointer?
      get() = __338301891_Ptr?.getPointer(0)
  }

  public class ISliderAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __338301891_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISliderAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c321c95fc91757149d16ad706e38926a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISliderAutomationPeer(ptr: Pointer?): WithDefault =
        ISliderAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISliderAutomationPeer {
      val address = segment.toRawLongValue()
      return makeISliderAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ISliderAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__338301891_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISliderAutomationPeer): Array<ISliderAutomationPeer?> =
        (elements as
        Array<ISliderAutomationPeer?>).castToImpl<ISliderAutomationPeer,ISliderAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISliderAutomationPeer?> =
        arrayOfNulls<ISliderAutomationPeer_Impl>(size) as Array<ISliderAutomationPeer?>
  }
}
