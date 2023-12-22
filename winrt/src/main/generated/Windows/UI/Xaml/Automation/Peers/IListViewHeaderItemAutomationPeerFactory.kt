package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.ListViewHeaderItem
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

@ABIMarker(IListViewHeaderItemAutomationPeerFactory.ABI::class)
@Signature("{07668694-2ca5-4be4-a8b9-592d48f76087}")
@Guid("076686942ca54be4a8b9592d48f76087")
@WinRTInterface("076686942ca54be4a8b9592d48f76087")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewHeaderItemAutomationPeerFactory.ByReference::class)
public interface IListViewHeaderItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ListViewHeaderItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ListViewHeaderItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewHeaderItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIListViewHeaderItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IListViewHeaderItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewHeaderItemAutomationPeerFactory {
    public val __1400353354_Ptr: Pointer?

    public val _1400353354_VtblPtr: Pointer?
      get() = __1400353354_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ListViewHeaderItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ListViewHeaderItemAutomationPeer? {
      val fnPtr = _1400353354_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewHeaderItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1400353354_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewHeaderItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IListViewHeaderItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1400353354_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewHeaderItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("076686942ca54be4a8b9592d48f76087")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewHeaderItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IListViewHeaderItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IListViewHeaderItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIListViewHeaderItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IListViewHeaderItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1400353354_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewHeaderItemAutomationPeerFactory):
        Array<IListViewHeaderItemAutomationPeerFactory?> = (elements as
        Array<IListViewHeaderItemAutomationPeerFactory?>).castToImpl<IListViewHeaderItemAutomationPeerFactory,IListViewHeaderItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewHeaderItemAutomationPeerFactory?> =
        arrayOfNulls<IListViewHeaderItemAutomationPeerFactory_Impl>(size) as
        Array<IListViewHeaderItemAutomationPeerFactory?>
  }
}
