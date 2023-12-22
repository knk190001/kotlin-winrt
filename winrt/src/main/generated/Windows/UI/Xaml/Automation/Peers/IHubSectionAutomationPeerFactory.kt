package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.HubSection
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

@ABIMarker(IHubSectionAutomationPeerFactory.ABI::class)
@Signature("{c68e27e8-17ec-4329-91ae-2d0b2339d498}")
@Guid("c68e27e817ec432991ae2d0b2339d498")
@WinRTInterface("c68e27e817ec432991ae2d0b2339d498")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHubSectionAutomationPeerFactory.ByReference::class)
public interface IHubSectionAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: HubSection?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): HubSectionAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHubSectionAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIHubSectionAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IHubSectionAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHubSectionAutomationPeerFactory {
    public val __843845545_Ptr: Pointer?

    public val _843845545_VtblPtr: Pointer?
      get() = __843845545_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: HubSection?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): HubSectionAutomationPeer? {
      val fnPtr = _843845545_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HubSectionAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__843845545_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HubSectionAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IHubSectionAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __843845545_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHubSectionAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c68e27e817ec432991ae2d0b2339d498")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHubSectionAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IHubSectionAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHubSectionAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIHubSectionAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IHubSectionAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__843845545_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHubSectionAutomationPeerFactory):
        Array<IHubSectionAutomationPeerFactory?> = (elements as
        Array<IHubSectionAutomationPeerFactory?>).castToImpl<IHubSectionAutomationPeerFactory,IHubSectionAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHubSectionAutomationPeerFactory?> =
        arrayOfNulls<IHubSectionAutomationPeerFactory_Impl>(size) as
        Array<IHubSectionAutomationPeerFactory?>
  }
}
