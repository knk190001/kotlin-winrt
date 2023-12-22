package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.AppBarToggleButton
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

@ABIMarker(IAppBarToggleButtonAutomationPeerFactory.ABI::class)
@Signature("{3cb5ef43-ae92-5452-92e9-cd0ccca26891}")
@Guid("3cb5ef43ae92545292e9cd0ccca26891")
@WinRTInterface("3cb5ef43ae92545292e9cd0ccca26891")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButtonAutomationPeerFactory.ByReference::class)
public interface IAppBarToggleButtonAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: AppBarToggleButton?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): AppBarToggleButtonAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButtonAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIAppBarToggleButtonAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButtonAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButtonAutomationPeerFactory {
    public val __1480624938_Ptr: Pointer?

    public val _1480624938_VtblPtr: Pointer?
      get() = __1480624938_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: AppBarToggleButton?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): AppBarToggleButtonAutomationPeer? {
      val fnPtr = _1480624938_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarToggleButtonAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1480624938_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarToggleButtonAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarToggleButtonAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1480624938_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButtonAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3cb5ef43ae92545292e9cd0ccca26891")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButtonAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IAppBarToggleButtonAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBarToggleButtonAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButtonAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButtonAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1480624938_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButtonAutomationPeerFactory):
        Array<IAppBarToggleButtonAutomationPeerFactory?> = (elements as
        Array<IAppBarToggleButtonAutomationPeerFactory?>).castToImpl<IAppBarToggleButtonAutomationPeerFactory,IAppBarToggleButtonAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButtonAutomationPeerFactory?> =
        arrayOfNulls<IAppBarToggleButtonAutomationPeerFactory_Impl>(size) as
        Array<IAppBarToggleButtonAutomationPeerFactory?>
  }
}
