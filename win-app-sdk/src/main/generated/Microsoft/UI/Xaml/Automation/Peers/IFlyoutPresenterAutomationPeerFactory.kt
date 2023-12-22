package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.FlyoutPresenter
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

@ABIMarker(IFlyoutPresenterAutomationPeerFactory.ABI::class)
@Signature("{e529e586-7aa3-50a6-b17e-678b54fee127}")
@Guid("e529e5867aa350a6b17e678b54fee127")
@WinRTInterface("e529e5867aa350a6b17e678b54fee127")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutPresenterAutomationPeerFactory.ByReference::class)
public interface IFlyoutPresenterAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: FlyoutPresenter?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): FlyoutPresenterAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutPresenterAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIFlyoutPresenterAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IFlyoutPresenterAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutPresenterAutomationPeerFactory {
    public val __1610150233_Ptr: Pointer?

    public val _1610150233_VtblPtr: Pointer?
      get() = __1610150233_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: FlyoutPresenter?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): FlyoutPresenterAutomationPeer? {
      val fnPtr = _1610150233_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutPresenterAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1610150233_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutPresenterAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IFlyoutPresenterAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1610150233_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutPresenterAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e529e5867aa350a6b17e678b54fee127")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutPresenterAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IFlyoutPresenterAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutPresenterAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIFlyoutPresenterAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutPresenterAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1610150233_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutPresenterAutomationPeerFactory):
        Array<IFlyoutPresenterAutomationPeerFactory?> = (elements as
        Array<IFlyoutPresenterAutomationPeerFactory?>).castToImpl<IFlyoutPresenterAutomationPeerFactory,IFlyoutPresenterAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutPresenterAutomationPeerFactory?> =
        arrayOfNulls<IFlyoutPresenterAutomationPeerFactory_Impl>(size) as
        Array<IFlyoutPresenterAutomationPeerFactory?>
  }
}
