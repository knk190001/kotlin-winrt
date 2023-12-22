package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.ComboBoxItem
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

@ABIMarker(IComboBoxItemAutomationPeerFactory.ABI::class)
@Signature("{ead9d22d-112b-550e-8cac-760614f979aa}")
@Guid("ead9d22d112b550e8cac760614f979aa")
@WinRTInterface("ead9d22d112b550e8cac760614f979aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxItemAutomationPeerFactory.ByReference::class)
public interface IComboBoxItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ComboBoxItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ComboBoxItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIComboBoxItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IComboBoxItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxItemAutomationPeerFactory {
    public val __521629310_Ptr: Pointer?

    public val _521629310_VtblPtr: Pointer?
      get() = __521629310_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ComboBoxItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ComboBoxItemAutomationPeer? {
      val fnPtr = _521629310_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ComboBoxItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__521629310_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ComboBoxItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IComboBoxItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __521629310_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ead9d22d112b550e8cac760614f979aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IComboBoxItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIComboBoxItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__521629310_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxItemAutomationPeerFactory):
        Array<IComboBoxItemAutomationPeerFactory?> = (elements as
        Array<IComboBoxItemAutomationPeerFactory?>).castToImpl<IComboBoxItemAutomationPeerFactory,IComboBoxItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxItemAutomationPeerFactory?> =
        arrayOfNulls<IComboBoxItemAutomationPeerFactory_Impl>(size) as
        Array<IComboBoxItemAutomationPeerFactory?>
  }
}
