package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.FrameworkElement
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

@ABIMarker(IFrameworkElementAutomationPeerFactory.ABI::class)
@Signature("{1682c3f8-238d-5c7e-a5a5-08cc3c10ac7c}")
@Guid("1682c3f8238d5c7ea5a508cc3c10ac7c")
@WinRTInterface("1682c3f8238d5c7ea5a508cc3c10ac7c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementAutomationPeerFactory.ByReference::class)
public interface IFrameworkElementAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: FrameworkElement?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): FrameworkElementAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIFrameworkElementAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementAutomationPeerFactory {
    public val __1393232816_Ptr: Pointer?

    public val _1393232816_VtblPtr: Pointer?
      get() = __1393232816_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: FrameworkElement?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): FrameworkElementAutomationPeer? {
      val fnPtr = _1393232816_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameworkElementAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1393232816_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameworkElementAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IFrameworkElementAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1393232816_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1682c3f8238d5c7ea5a508cc3c10ac7c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IFrameworkElementAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1393232816_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementAutomationPeerFactory):
        Array<IFrameworkElementAutomationPeerFactory?> = (elements as
        Array<IFrameworkElementAutomationPeerFactory?>).castToImpl<IFrameworkElementAutomationPeerFactory,IFrameworkElementAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementAutomationPeerFactory?> =
        arrayOfNulls<IFrameworkElementAutomationPeerFactory_Impl>(size) as
        Array<IFrameworkElementAutomationPeerFactory?>
  }
}
