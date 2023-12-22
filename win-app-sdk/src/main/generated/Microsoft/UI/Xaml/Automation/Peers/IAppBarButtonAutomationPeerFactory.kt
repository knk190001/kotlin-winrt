package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.AppBarButton
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

@ABIMarker(IAppBarButtonAutomationPeerFactory.ABI::class)
@Signature("{6f611433-7e50-5e2e-b192-d6a285962c74}")
@Guid("6f6114337e505e2eb192d6a285962c74")
@WinRTInterface("6f6114337e505e2eb192d6a285962c74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarButtonAutomationPeerFactory.ByReference::class)
public interface IAppBarButtonAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: AppBarButton?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): AppBarButtonAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarButtonAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIAppBarButtonAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IAppBarButtonAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarButtonAutomationPeerFactory {
    public val __1096202506_Ptr: Pointer?

    public val _1096202506_VtblPtr: Pointer?
      get() = __1096202506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: AppBarButton?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): AppBarButtonAutomationPeer? {
      val fnPtr = _1096202506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarButtonAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1096202506_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarButtonAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarButtonAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1096202506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarButtonAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f6114337e505e2eb192d6a285962c74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarButtonAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IAppBarButtonAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarButtonAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIAppBarButtonAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppBarButtonAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1096202506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarButtonAutomationPeerFactory):
        Array<IAppBarButtonAutomationPeerFactory?> = (elements as
        Array<IAppBarButtonAutomationPeerFactory?>).castToImpl<IAppBarButtonAutomationPeerFactory,IAppBarButtonAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarButtonAutomationPeerFactory?> =
        arrayOfNulls<IAppBarButtonAutomationPeerFactory_Impl>(size) as
        Array<IAppBarButtonAutomationPeerFactory?>
  }
}
