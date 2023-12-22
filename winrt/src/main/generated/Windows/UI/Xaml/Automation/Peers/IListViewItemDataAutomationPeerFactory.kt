package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(IListViewItemDataAutomationPeerFactory.ABI::class)
@Signature("{d0db12bb-d715-4523-acc0-1e1072d8e32b}")
@Guid("d0db12bbd7154523acc01e1072d8e32b")
@WinRTInterface("d0db12bbd7154523acc01e1072d8e32b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemDataAutomationPeerFactory.ByReference::class)
public interface IListViewItemDataAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithParentAndItem(
    item: IUnknown?,
    parent: ListViewBaseAutomationPeer?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ListViewItemDataAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemDataAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIListViewItemDataAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IListViewItemDataAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemDataAutomationPeerFactory {
    public val __2122814215_Ptr: Pointer?

    public val _2122814215_VtblPtr: Pointer?
      get() = __2122814215_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithParentAndItem(
      item: IUnknown?,
      parent: ListViewBaseAutomationPeer?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ListViewItemDataAutomationPeer? {
      val fnPtr = _2122814215_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewItemDataAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__2122814215_Ptr, marshalToNative(item), marshalToNative(parent),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewItemDataAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IListViewItemDataAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2122814215_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemDataAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0db12bbd7154523acc01e1072d8e32b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemDataAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IListViewItemDataAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemDataAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIListViewItemDataAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemDataAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2122814215_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemDataAutomationPeerFactory):
        Array<IListViewItemDataAutomationPeerFactory?> = (elements as
        Array<IListViewItemDataAutomationPeerFactory?>).castToImpl<IListViewItemDataAutomationPeerFactory,IListViewItemDataAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemDataAutomationPeerFactory?> =
        arrayOfNulls<IListViewItemDataAutomationPeerFactory_Impl>(size) as
        Array<IListViewItemDataAutomationPeerFactory?>
  }
}
