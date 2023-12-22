package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.ToggleMenuFlyoutItem
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

@ABIMarker(IToggleMenuFlyoutItemAutomationPeerFactory.ABI::class)
@Signature("{94364b77-8f6c-4837-aae3-94d010d8d162}")
@Guid("94364b778f6c4837aae394d010d8d162")
@WinRTInterface("94364b778f6c4837aae394d010d8d162")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleMenuFlyoutItemAutomationPeerFactory.ByReference::class)
public interface IToggleMenuFlyoutItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ToggleMenuFlyoutItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ToggleMenuFlyoutItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleMenuFlyoutItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIToggleMenuFlyoutItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IToggleMenuFlyoutItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleMenuFlyoutItemAutomationPeerFactory {
    public val __1066894232_Ptr: Pointer?

    public val _1066894232_VtblPtr: Pointer?
      get() = __1066894232_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ToggleMenuFlyoutItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ToggleMenuFlyoutItemAutomationPeer? {
      val fnPtr = _1066894232_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToggleMenuFlyoutItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1066894232_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToggleMenuFlyoutItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IToggleMenuFlyoutItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1066894232_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleMenuFlyoutItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("94364b778f6c4837aae394d010d8d162")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleMenuFlyoutItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IToggleMenuFlyoutItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IToggleMenuFlyoutItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIToggleMenuFlyoutItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IToggleMenuFlyoutItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1066894232_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleMenuFlyoutItemAutomationPeerFactory):
        Array<IToggleMenuFlyoutItemAutomationPeerFactory?> = (elements as
        Array<IToggleMenuFlyoutItemAutomationPeerFactory?>).castToImpl<IToggleMenuFlyoutItemAutomationPeerFactory,IToggleMenuFlyoutItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleMenuFlyoutItemAutomationPeerFactory?> =
        arrayOfNulls<IToggleMenuFlyoutItemAutomationPeerFactory_Impl>(size) as
        Array<IToggleMenuFlyoutItemAutomationPeerFactory?>
  }
}
