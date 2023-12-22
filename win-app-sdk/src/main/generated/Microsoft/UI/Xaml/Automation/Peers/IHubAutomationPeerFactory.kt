package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.Hub
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

@ABIMarker(IHubAutomationPeerFactory.ABI::class)
@Signature("{c1b1f1cf-3926-56c9-b690-530c8bc78806}")
@Guid("c1b1f1cf392656c9b690530c8bc78806")
@WinRTInterface("c1b1f1cf392656c9b690530c8bc78806")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHubAutomationPeerFactory.ByReference::class)
public interface IHubAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: Hub?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): HubAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHubAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIHubAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IHubAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHubAutomationPeerFactory {
    public val __1479897569_Ptr: Pointer?

    public val _1479897569_VtblPtr: Pointer?
      get() = __1479897569_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: Hub?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): HubAutomationPeer? {
      val fnPtr = _1479897569_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HubAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1479897569_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HubAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IHubAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1479897569_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHubAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1b1f1cf392656c9b690530c8bc78806")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHubAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IHubAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHubAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIHubAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IHubAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1479897569_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHubAutomationPeerFactory):
        Array<IHubAutomationPeerFactory?> = (elements as
        Array<IHubAutomationPeerFactory?>).castToImpl<IHubAutomationPeerFactory,IHubAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHubAutomationPeerFactory?> =
        arrayOfNulls<IHubAutomationPeerFactory_Impl>(size) as Array<IHubAutomationPeerFactory?>
  }
}
