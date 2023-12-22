package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.Primitives.ToggleButton
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

@ABIMarker(IToggleButtonAutomationPeerFactory.ABI::class)
@Signature("{c9218cc4-ad4b-4d03-a6a4-7d59e6360004}")
@Guid("c9218cc4ad4b4d03a6a47d59e6360004")
@WinRTInterface("c9218cc4ad4b4d03a6a47d59e6360004")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleButtonAutomationPeerFactory.ByReference::class)
public interface IToggleButtonAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ToggleButton?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ToggleButtonAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleButtonAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIToggleButtonAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IToggleButtonAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleButtonAutomationPeerFactory {
    public val __1420003341_Ptr: Pointer?

    public val _1420003341_VtblPtr: Pointer?
      get() = __1420003341_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ToggleButton?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ToggleButtonAutomationPeer? {
      val fnPtr = _1420003341_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToggleButtonAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1420003341_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToggleButtonAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IToggleButtonAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1420003341_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleButtonAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9218cc4ad4b4d03a6a47d59e6360004")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleButtonAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IToggleButtonAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleButtonAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIToggleButtonAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IToggleButtonAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1420003341_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleButtonAutomationPeerFactory):
        Array<IToggleButtonAutomationPeerFactory?> = (elements as
        Array<IToggleButtonAutomationPeerFactory?>).castToImpl<IToggleButtonAutomationPeerFactory,IToggleButtonAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleButtonAutomationPeerFactory?> =
        arrayOfNulls<IToggleButtonAutomationPeerFactory_Impl>(size) as
        Array<IToggleButtonAutomationPeerFactory?>
  }
}
