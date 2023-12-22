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

@ABIMarker(ITreeViewItemDataAutomationPeerFactory.ABI::class)
@Signature("{07fc8e59-55a2-58ab-8921-91e57ddf119f}")
@Guid("07fc8e5955a258ab892191e57ddf119f")
@WinRTInterface("07fc8e5955a258ab892191e57ddf119f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewItemDataAutomationPeerFactory.ByReference::class)
public interface ITreeViewItemDataAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    item: IUnknown?,
    parent: TreeViewListAutomationPeer?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): TreeViewItemDataAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewItemDataAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeITreeViewItemDataAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ITreeViewItemDataAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewItemDataAutomationPeerFactory {
    public val __1433326126_Ptr: Pointer?

    public val _1433326126_VtblPtr: Pointer?
      get() = __1433326126_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      item: IUnknown?,
      parent: TreeViewListAutomationPeer?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): TreeViewItemDataAutomationPeer? {
      val fnPtr = _1433326126_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewItemDataAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1433326126_Ptr, marshalToNative(item), marshalToNative(parent),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewItemDataAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewItemDataAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1433326126_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewItemDataAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07fc8e5955a258ab892191e57ddf119f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewItemDataAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ITreeViewItemDataAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewItemDataAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeITreeViewItemDataAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewItemDataAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1433326126_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewItemDataAutomationPeerFactory):
        Array<ITreeViewItemDataAutomationPeerFactory?> = (elements as
        Array<ITreeViewItemDataAutomationPeerFactory?>).castToImpl<ITreeViewItemDataAutomationPeerFactory,ITreeViewItemDataAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewItemDataAutomationPeerFactory?> =
        arrayOfNulls<ITreeViewItemDataAutomationPeerFactory_Impl>(size) as
        Array<ITreeViewItemDataAutomationPeerFactory?>
  }
}
