package Microsoft.UI.Xaml.Automation.Peers

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

@ABIMarker(IListBoxItemDataAutomationPeerFactory.ABI::class)
@Signature("{2ce97068-5280-5bec-8ba5-785c58986dcf}")
@Guid("2ce9706852805bec8ba5785c58986dcf")
@WinRTInterface("2ce9706852805bec8ba5785c58986dcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListBoxItemDataAutomationPeerFactory.ByReference::class)
public interface IListBoxItemDataAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithParentAndItem(
    item: IUnknown?,
    parent: ListBoxAutomationPeer?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ListBoxItemDataAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListBoxItemDataAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIListBoxItemDataAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IListBoxItemDataAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListBoxItemDataAutomationPeerFactory {
    public val __755908842_Ptr: Pointer?

    public val _755908842_VtblPtr: Pointer?
      get() = __755908842_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithParentAndItem(
      item: IUnknown?,
      parent: ListBoxAutomationPeer?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ListBoxItemDataAutomationPeer? {
      val fnPtr = _755908842_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListBoxItemDataAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__755908842_Ptr, marshalToNative(item), marshalToNative(parent),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListBoxItemDataAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IListBoxItemDataAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __755908842_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListBoxItemDataAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ce9706852805bec8ba5785c58986dcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListBoxItemDataAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IListBoxItemDataAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListBoxItemDataAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIListBoxItemDataAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IListBoxItemDataAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__755908842_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListBoxItemDataAutomationPeerFactory):
        Array<IListBoxItemDataAutomationPeerFactory?> = (elements as
        Array<IListBoxItemDataAutomationPeerFactory?>).castToImpl<IListBoxItemDataAutomationPeerFactory,IListBoxItemDataAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListBoxItemDataAutomationPeerFactory?> =
        arrayOfNulls<IListBoxItemDataAutomationPeerFactory_Impl>(size) as
        Array<IListBoxItemDataAutomationPeerFactory?>
  }
}
