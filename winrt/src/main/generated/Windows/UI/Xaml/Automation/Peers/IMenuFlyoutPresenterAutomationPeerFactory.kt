package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.MenuFlyoutPresenter
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

@ABIMarker(IMenuFlyoutPresenterAutomationPeerFactory.ABI::class)
@Signature("{07b5172d-761d-452b-9e6d-fa2a8be0ad26}")
@Guid("07b5172d761d452b9e6dfa2a8be0ad26")
@WinRTInterface("07b5172d761d452b9e6dfa2a8be0ad26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutPresenterAutomationPeerFactory.ByReference::class)
public interface IMenuFlyoutPresenterAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: MenuFlyoutPresenter?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): MenuFlyoutPresenterAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutPresenterAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIMenuFlyoutPresenterAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutPresenterAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutPresenterAutomationPeerFactory {
    public val __827712645_Ptr: Pointer?

    public val _827712645_VtblPtr: Pointer?
      get() = __827712645_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: MenuFlyoutPresenter?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): MenuFlyoutPresenterAutomationPeer? {
      val fnPtr = _827712645_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuFlyoutPresenterAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__827712645_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuFlyoutPresenterAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutPresenterAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __827712645_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutPresenterAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07b5172d761d452b9e6dfa2a8be0ad26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutPresenterAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IMenuFlyoutPresenterAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMenuFlyoutPresenterAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutPresenterAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutPresenterAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__827712645_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutPresenterAutomationPeerFactory):
        Array<IMenuFlyoutPresenterAutomationPeerFactory?> = (elements as
        Array<IMenuFlyoutPresenterAutomationPeerFactory?>).castToImpl<IMenuFlyoutPresenterAutomationPeerFactory,IMenuFlyoutPresenterAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutPresenterAutomationPeerFactory?> =
        arrayOfNulls<IMenuFlyoutPresenterAutomationPeerFactory_Impl>(size) as
        Array<IMenuFlyoutPresenterAutomationPeerFactory?>
  }
}
