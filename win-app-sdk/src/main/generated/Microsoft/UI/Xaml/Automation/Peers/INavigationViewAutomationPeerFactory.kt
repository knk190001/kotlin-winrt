package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.NavigationView
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

@ABIMarker(INavigationViewAutomationPeerFactory.ABI::class)
@Signature("{75075b03-a2f7-5869-b23c-63cbe5acc43a}")
@Guid("75075b03a2f75869b23c63cbe5acc43a")
@WinRTInterface("75075b03a2f75869b23c63cbe5acc43a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewAutomationPeerFactory.ByReference::class)
public interface INavigationViewAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: NavigationView?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): NavigationViewAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeINavigationViewAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: INavigationViewAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewAutomationPeerFactory {
    public val __102312427_Ptr: Pointer?

    public val _102312427_VtblPtr: Pointer?
      get() = __102312427_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: NavigationView?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): NavigationViewAutomationPeer? {
      val fnPtr = _102312427_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__102312427_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __102312427_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75075b03a2f75869b23c63cbe5acc43a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewAutomationPeerFactory(ptr: Pointer?): WithDefault =
        INavigationViewAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeINavigationViewAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__102312427_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewAutomationPeerFactory):
        Array<INavigationViewAutomationPeerFactory?> = (elements as
        Array<INavigationViewAutomationPeerFactory?>).castToImpl<INavigationViewAutomationPeerFactory,INavigationViewAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewAutomationPeerFactory?> =
        arrayOfNulls<INavigationViewAutomationPeerFactory_Impl>(size) as
        Array<INavigationViewAutomationPeerFactory?>
  }
}
