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

@ABIMarker(ICaptureElementAutomationPeer.ABI::class)
@Signature("{dcc44ee0-fa45-45c6-8bb7-320d808f5958}")
@Guid("dcc44ee0fa4545c68bb7320d808f5958")
@WinRTInterface("dcc44ee0fa4545c68bb7320d808f5958")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICaptureElementAutomationPeer.ByReference::class)
public interface ICaptureElementAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICaptureElementAutomationPeer> {
    public override fun getValue() = ABI.makeICaptureElementAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ICaptureElementAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICaptureElementAutomationPeer {
    public val __415853639_Ptr: Pointer?

    public val _415853639_VtblPtr: Pointer?
      get() = __415853639_Ptr?.getPointer(0)
  }

  public class ICaptureElementAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __415853639_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICaptureElementAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dcc44ee0fa4545c68bb7320d808f5958")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICaptureElementAutomationPeer(ptr: Pointer?): WithDefault =
        ICaptureElementAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICaptureElementAutomationPeer {
      val address = segment.toRawLongValue()
      return makeICaptureElementAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ICaptureElementAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__415853639_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICaptureElementAutomationPeer):
        Array<ICaptureElementAutomationPeer?> = (elements as
        Array<ICaptureElementAutomationPeer?>).castToImpl<ICaptureElementAutomationPeer,ICaptureElementAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICaptureElementAutomationPeer?> =
        arrayOfNulls<ICaptureElementAutomationPeer_Impl>(size) as
        Array<ICaptureElementAutomationPeer?>
  }
}
