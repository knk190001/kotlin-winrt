package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.ToggleSwitch
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

@ABIMarker(IToggleSwitchAutomationPeerFactory.ABI::class)
@Signature("{03f5e3e4-4b61-5dcf-afdc-fd23041a0374}")
@Guid("03f5e3e44b615dcfafdcfd23041a0374")
@WinRTInterface("03f5e3e44b615dcfafdcfd23041a0374")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleSwitchAutomationPeerFactory.ByReference::class)
public interface IToggleSwitchAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ToggleSwitch?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ToggleSwitchAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleSwitchAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIToggleSwitchAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IToggleSwitchAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleSwitchAutomationPeerFactory {
    public val __2068613094_Ptr: Pointer?

    public val _2068613094_VtblPtr: Pointer?
      get() = __2068613094_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ToggleSwitch?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ToggleSwitchAutomationPeer? {
      val fnPtr = _2068613094_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToggleSwitchAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__2068613094_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToggleSwitchAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IToggleSwitchAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2068613094_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleSwitchAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03f5e3e44b615dcfafdcfd23041a0374")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleSwitchAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IToggleSwitchAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleSwitchAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIToggleSwitchAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IToggleSwitchAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2068613094_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleSwitchAutomationPeerFactory):
        Array<IToggleSwitchAutomationPeerFactory?> = (elements as
        Array<IToggleSwitchAutomationPeerFactory?>).castToImpl<IToggleSwitchAutomationPeerFactory,IToggleSwitchAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleSwitchAutomationPeerFactory?> =
        arrayOfNulls<IToggleSwitchAutomationPeerFactory_Impl>(size) as
        Array<IToggleSwitchAutomationPeerFactory?>
  }
}
