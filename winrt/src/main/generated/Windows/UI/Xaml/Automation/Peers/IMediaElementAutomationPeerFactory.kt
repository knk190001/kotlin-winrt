package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.MediaElement
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

@ABIMarker(IMediaElementAutomationPeerFactory.ABI::class)
@Signature("{b2ad3b28-7575-4173-9bc7-80367a164ed2}")
@Guid("b2ad3b28757541739bc780367a164ed2")
@WinRTInterface("b2ad3b28757541739bc780367a164ed2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaElementAutomationPeerFactory.ByReference::class)
public interface IMediaElementAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: MediaElement?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): MediaElementAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaElementAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIMediaElementAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaElementAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaElementAutomationPeerFactory {
    public val __1881018271_Ptr: Pointer?

    public val _1881018271_VtblPtr: Pointer?
      get() = __1881018271_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: MediaElement?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): MediaElementAutomationPeer? {
      val fnPtr = _1881018271_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaElementAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1881018271_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaElementAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IMediaElementAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1881018271_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaElementAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2ad3b28757541739bc780367a164ed2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaElementAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IMediaElementAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaElementAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIMediaElementAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaElementAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1881018271_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaElementAutomationPeerFactory):
        Array<IMediaElementAutomationPeerFactory?> = (elements as
        Array<IMediaElementAutomationPeerFactory?>).castToImpl<IMediaElementAutomationPeerFactory,IMediaElementAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaElementAutomationPeerFactory?> =
        arrayOfNulls<IMediaElementAutomationPeerFactory_Impl>(size) as
        Array<IMediaElementAutomationPeerFactory?>
  }
}
