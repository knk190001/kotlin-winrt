package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.MediaTransportControls
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaTransportControlsAutomationPeerFactory.ABI::class)
@Signature("{77f281e1-cb51-5360-b74e-6fe4f8ee5028}")
@Guid("77f281e1cb515360b74e6fe4f8ee5028")
@WinRTInterface("77f281e1cb515360b74e6fe4f8ee5028")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTransportControlsAutomationPeerFactory.ByReference::class)
public interface IMediaTransportControlsAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: MediaTransportControls?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): MediaTransportControlsAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTransportControlsAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIMediaTransportControlsAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaTransportControlsAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTransportControlsAutomationPeerFactory {
    public val __1047704499_Ptr: Pointer?

    public val _1047704499_VtblPtr: Pointer?
      get() = __1047704499_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: MediaTransportControls?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): MediaTransportControlsAutomationPeer? {
      val fnPtr = _1047704499_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaTransportControlsAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1047704499_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaTransportControlsAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IMediaTransportControlsAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1047704499_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTransportControlsAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77f281e1cb515360b74e6fe4f8ee5028")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTransportControlsAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IMediaTransportControlsAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaTransportControlsAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIMediaTransportControlsAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaTransportControlsAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1047704499_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTransportControlsAutomationPeerFactory):
        Array<IMediaTransportControlsAutomationPeerFactory?> = (elements as
        Array<IMediaTransportControlsAutomationPeerFactory?>).castToImpl<IMediaTransportControlsAutomationPeerFactory,IMediaTransportControlsAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTransportControlsAutomationPeerFactory?> =
        arrayOfNulls<IMediaTransportControlsAutomationPeerFactory_Impl>(size) as
        Array<IMediaTransportControlsAutomationPeerFactory?>
  }
}
