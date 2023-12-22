package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.AutoSuggestBox
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IAutoSuggestBoxAutomationPeerFactory.ABI::class)
@Signature("{80046849-18e7-4475-b362-4bbd53d24562}")
@Guid("8004684918e74475b3624bbd53d24562")
@WinRTInterface("8004684918e74475b3624bbd53d24562")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBoxAutomationPeerFactory.ByReference::class)
public interface IAutoSuggestBoxAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(owner: AutoSuggestBox?): AutoSuggestBoxAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBoxAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIAutoSuggestBoxAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBoxAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBoxAutomationPeerFactory {
    public val __94294813_Ptr: Pointer?

    public val _94294813_VtblPtr: Pointer?
      get() = __94294813_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(owner: AutoSuggestBox?):
        AutoSuggestBoxAutomationPeer? {
      val fnPtr = _94294813_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutoSuggestBoxAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__94294813_Ptr, marshalToNative(owner), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutoSuggestBoxAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IAutoSuggestBoxAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __94294813_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBoxAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8004684918e74475b3624bbd53d24562")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBoxAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IAutoSuggestBoxAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBoxAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBoxAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBoxAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__94294813_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBoxAutomationPeerFactory):
        Array<IAutoSuggestBoxAutomationPeerFactory?> = (elements as
        Array<IAutoSuggestBoxAutomationPeerFactory?>).castToImpl<IAutoSuggestBoxAutomationPeerFactory,IAutoSuggestBoxAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBoxAutomationPeerFactory?> =
        arrayOfNulls<IAutoSuggestBoxAutomationPeerFactory_Impl>(size) as
        Array<IAutoSuggestBoxAutomationPeerFactory?>
  }
}
