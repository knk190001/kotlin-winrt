package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.Hub
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
@Signature("{c762d43f-79dd-43ee-8777-8d08b39aa065}")
@Guid("c762d43f79dd43ee87778d08b39aa065")
@WinRTInterface("c762d43f79dd43ee87778d08b39aa065")
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
    public val __485132404_Ptr: Pointer?

    public val _485132404_VtblPtr: Pointer?
      get() = __485132404_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: Hub?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): HubAutomationPeer? {
      val fnPtr = _485132404_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HubAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__485132404_Ptr, marshalToNative(owner),
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
    public override val __485132404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHubAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c762d43f79dd43ee87778d08b39aa065")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHubAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IHubAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHubAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIHubAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IHubAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__485132404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHubAutomationPeerFactory):
        Array<IHubAutomationPeerFactory?> = (elements as
        Array<IHubAutomationPeerFactory?>).castToImpl<IHubAutomationPeerFactory,IHubAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHubAutomationPeerFactory?> =
        arrayOfNulls<IHubAutomationPeerFactory_Impl>(size) as Array<IHubAutomationPeerFactory?>
  }
}
