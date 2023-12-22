package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.ListViewItem
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

@ABIMarker(IListViewItemAutomationPeerFactory.ABI::class)
@Signature("{d6625ba7-1ae3-58b1-af12-e5cd5afc17ff}")
@Guid("d6625ba71ae358b1af12e5cd5afc17ff")
@WinRTInterface("d6625ba71ae358b1af12e5cd5afc17ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemAutomationPeerFactory.ByReference::class)
public interface IListViewItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ListViewItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ListViewItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIListViewItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IListViewItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemAutomationPeerFactory {
    public val __1277895224_Ptr: Pointer?

    public val _1277895224_VtblPtr: Pointer?
      get() = __1277895224_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ListViewItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ListViewItemAutomationPeer? {
      val fnPtr = _1277895224_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1277895224_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IListViewItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1277895224_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d6625ba71ae358b1af12e5cd5afc17ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IListViewItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIListViewItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1277895224_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemAutomationPeerFactory):
        Array<IListViewItemAutomationPeerFactory?> = (elements as
        Array<IListViewItemAutomationPeerFactory?>).castToImpl<IListViewItemAutomationPeerFactory,IListViewItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemAutomationPeerFactory?> =
        arrayOfNulls<IListViewItemAutomationPeerFactory_Impl>(size) as
        Array<IListViewItemAutomationPeerFactory?>
  }
}
