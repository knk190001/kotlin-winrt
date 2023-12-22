package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.ToggleSplitButton
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

@ABIMarker(IToggleSplitButtonAutomationPeerFactory.ABI::class)
@Signature("{61c214a5-605b-5e98-b85d-e3121d23edaa}")
@Guid("61c214a5605b5e98b85de3121d23edaa")
@WinRTInterface("61c214a5605b5e98b85de3121d23edaa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleSplitButtonAutomationPeerFactory.ByReference::class)
public interface IToggleSplitButtonAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: ToggleSplitButton?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ToggleSplitButtonAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleSplitButtonAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIToggleSplitButtonAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IToggleSplitButtonAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleSplitButtonAutomationPeerFactory {
    public val __2097473212_Ptr: Pointer?

    public val _2097473212_VtblPtr: Pointer?
      get() = __2097473212_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: ToggleSplitButton?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ToggleSplitButtonAutomationPeer? {
      val fnPtr = _2097473212_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToggleSplitButtonAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__2097473212_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToggleSplitButtonAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IToggleSplitButtonAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2097473212_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleSplitButtonAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61c214a5605b5e98b85de3121d23edaa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleSplitButtonAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IToggleSplitButtonAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IToggleSplitButtonAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIToggleSplitButtonAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IToggleSplitButtonAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2097473212_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleSplitButtonAutomationPeerFactory):
        Array<IToggleSplitButtonAutomationPeerFactory?> = (elements as
        Array<IToggleSplitButtonAutomationPeerFactory?>).castToImpl<IToggleSplitButtonAutomationPeerFactory,IToggleSplitButtonAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleSplitButtonAutomationPeerFactory?> =
        arrayOfNulls<IToggleSplitButtonAutomationPeerFactory_Impl>(size) as
        Array<IToggleSplitButtonAutomationPeerFactory?>
  }
}
