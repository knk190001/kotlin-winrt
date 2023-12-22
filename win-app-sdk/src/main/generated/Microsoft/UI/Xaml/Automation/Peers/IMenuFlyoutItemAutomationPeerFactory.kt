package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.MenuFlyoutItem
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

@ABIMarker(IMenuFlyoutItemAutomationPeerFactory.ABI::class)
@Signature("{fe125e46-7c1c-5a7c-98e0-c7aa3a00a6cd}")
@Guid("fe125e467c1c5a7c98e0c7aa3a00a6cd")
@WinRTInterface("fe125e467c1c5a7c98e0c7aa3a00a6cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutItemAutomationPeerFactory.ByReference::class)
public interface IMenuFlyoutItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: MenuFlyoutItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): MenuFlyoutItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIMenuFlyoutItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutItemAutomationPeerFactory {
    public val __55820033_Ptr: Pointer?

    public val _55820033_VtblPtr: Pointer?
      get() = __55820033_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: MenuFlyoutItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): MenuFlyoutItemAutomationPeer? {
      val fnPtr = _55820033_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuFlyoutItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__55820033_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuFlyoutItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __55820033_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe125e467c1c5a7c98e0c7aa3a00a6cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IMenuFlyoutItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__55820033_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutItemAutomationPeerFactory):
        Array<IMenuFlyoutItemAutomationPeerFactory?> = (elements as
        Array<IMenuFlyoutItemAutomationPeerFactory?>).castToImpl<IMenuFlyoutItemAutomationPeerFactory,IMenuFlyoutItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutItemAutomationPeerFactory?> =
        arrayOfNulls<IMenuFlyoutItemAutomationPeerFactory_Impl>(size) as
        Array<IMenuFlyoutItemAutomationPeerFactory?>
  }
}
