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

@ABIMarker(IScrollViewerAutomationPeer.ABI::class)
@Signature("{d985f259-1b09-4e88-88fd-421750dc6b45}")
@Guid("d985f2591b094e8888fd421750dc6b45")
@WinRTInterface("d985f2591b094e8888fd421750dc6b45")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewerAutomationPeer.ByReference::class)
public interface IScrollViewerAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollViewerAutomationPeer> {
    public override fun getValue() = ABI.makeIScrollViewerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IScrollViewerAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewerAutomationPeer {
    public val __763072272_Ptr: Pointer?

    public val _763072272_VtblPtr: Pointer?
      get() = __763072272_Ptr?.getPointer(0)
  }

  public class IScrollViewerAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __763072272_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewerAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d985f2591b094e8888fd421750dc6b45")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewerAutomationPeer(ptr: Pointer?): WithDefault =
        IScrollViewerAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewerAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIScrollViewerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__763072272_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewerAutomationPeer):
        Array<IScrollViewerAutomationPeer?> = (elements as
        Array<IScrollViewerAutomationPeer?>).castToImpl<IScrollViewerAutomationPeer,IScrollViewerAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewerAutomationPeer?> =
        arrayOfNulls<IScrollViewerAutomationPeer_Impl>(size) as Array<IScrollViewerAutomationPeer?>
  }
}
