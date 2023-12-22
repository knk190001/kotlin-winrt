package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.ListBoxItem
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

@ABIMarker(IListBoxItemAutomationPeerFactory.ABI::class)
@Signature("{509f9dd8-b0aa-443f-a110-41209af44f1c}")
@Guid("509f9dd8b0aa443fa11041209af44f1c")
@WinRTInterface("509f9dd8b0aa443fa11041209af44f1c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListBoxItemAutomationPeerFactory.ByReference::class)
public interface IListBoxItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ListBoxItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ListBoxItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListBoxItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIListBoxItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IListBoxItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListBoxItemAutomationPeerFactory {
    public val __708657481_Ptr: Pointer?

    public val _708657481_VtblPtr: Pointer?
      get() = __708657481_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ListBoxItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ListBoxItemAutomationPeer? {
      val fnPtr = _708657481_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListBoxItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__708657481_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListBoxItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IListBoxItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __708657481_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListBoxItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("509f9dd8b0aa443fa11041209af44f1c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListBoxItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IListBoxItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListBoxItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIListBoxItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IListBoxItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__708657481_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListBoxItemAutomationPeerFactory):
        Array<IListBoxItemAutomationPeerFactory?> = (elements as
        Array<IListBoxItemAutomationPeerFactory?>).castToImpl<IListBoxItemAutomationPeerFactory,IListBoxItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListBoxItemAutomationPeerFactory?> =
        arrayOfNulls<IListBoxItemAutomationPeerFactory_Impl>(size) as
        Array<IListBoxItemAutomationPeerFactory?>
  }
}
