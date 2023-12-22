package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.NavigationViewItem
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

@ABIMarker(INavigationViewItemAutomationPeerFactory.ABI::class)
@Signature("{890516d0-5a62-528b-8873-4f7140b40489}")
@Guid("890516d05a62528b88734f7140b40489")
@WinRTInterface("890516d05a62528b88734f7140b40489")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemAutomationPeerFactory.ByReference::class)
public interface INavigationViewItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: NavigationViewItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): NavigationViewItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeINavigationViewItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemAutomationPeerFactory {
    public val __1408144066_Ptr: Pointer?

    public val _1408144066_VtblPtr: Pointer?
      get() = __1408144066_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: NavigationViewItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): NavigationViewItemAutomationPeer? {
      val fnPtr = _1408144066_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1408144066_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1408144066_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("890516d05a62528b88734f7140b40489")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        INavigationViewItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INavigationViewItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1408144066_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemAutomationPeerFactory):
        Array<INavigationViewItemAutomationPeerFactory?> = (elements as
        Array<INavigationViewItemAutomationPeerFactory?>).castToImpl<INavigationViewItemAutomationPeerFactory,INavigationViewItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemAutomationPeerFactory?> =
        arrayOfNulls<INavigationViewItemAutomationPeerFactory_Impl>(size) as
        Array<INavigationViewItemAutomationPeerFactory?>
  }
}
