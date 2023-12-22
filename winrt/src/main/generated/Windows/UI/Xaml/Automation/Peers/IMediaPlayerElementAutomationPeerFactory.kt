package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.MediaPlayerElement
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

@ABIMarker(IMediaPlayerElementAutomationPeerFactory.ABI::class)
@Signature("{08848077-82af-4d19-b170-282a9e0e7f37}")
@Guid("0884807782af4d19b170282a9e0e7f37")
@WinRTInterface("0884807782af4d19b170282a9e0e7f37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerElementAutomationPeerFactory.ByReference::class)
public interface IMediaPlayerElementAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: MediaPlayerElement?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): MediaPlayerElementAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerElementAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIMediaPlayerElementAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerElementAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerElementAutomationPeerFactory {
    public val __628984546_Ptr: Pointer?

    public val _628984546_VtblPtr: Pointer?
      get() = __628984546_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: MediaPlayerElement?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): MediaPlayerElementAutomationPeer? {
      val fnPtr = _628984546_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayerElementAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__628984546_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayerElementAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlayerElementAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __628984546_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerElementAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0884807782af4d19b170282a9e0e7f37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerElementAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IMediaPlayerElementAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaPlayerElementAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerElementAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerElementAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__628984546_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerElementAutomationPeerFactory):
        Array<IMediaPlayerElementAutomationPeerFactory?> = (elements as
        Array<IMediaPlayerElementAutomationPeerFactory?>).castToImpl<IMediaPlayerElementAutomationPeerFactory,IMediaPlayerElementAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerElementAutomationPeerFactory?> =
        arrayOfNulls<IMediaPlayerElementAutomationPeerFactory_Impl>(size) as
        Array<IMediaPlayerElementAutomationPeerFactory?>
  }
}
