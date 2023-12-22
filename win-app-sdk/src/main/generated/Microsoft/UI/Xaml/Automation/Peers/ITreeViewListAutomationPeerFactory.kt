package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.TreeViewList
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

@ABIMarker(ITreeViewListAutomationPeerFactory.ABI::class)
@Signature("{51332d86-c414-5e7d-b57b-e479983c9e5d}")
@Guid("51332d86c4145e7db57be479983c9e5d")
@WinRTInterface("51332d86c4145e7db57be479983c9e5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewListAutomationPeerFactory.ByReference::class)
public interface ITreeViewListAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: TreeViewList?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): TreeViewListAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewListAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeITreeViewListAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ITreeViewListAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewListAutomationPeerFactory {
    public val __1252032141_Ptr: Pointer?

    public val _1252032141_VtblPtr: Pointer?
      get() = __1252032141_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: TreeViewList?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): TreeViewListAutomationPeer? {
      val fnPtr = _1252032141_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewListAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1252032141_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewListAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewListAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1252032141_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewListAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("51332d86c4145e7db57be479983c9e5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewListAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ITreeViewListAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewListAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeITreeViewListAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewListAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1252032141_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewListAutomationPeerFactory):
        Array<ITreeViewListAutomationPeerFactory?> = (elements as
        Array<ITreeViewListAutomationPeerFactory?>).castToImpl<ITreeViewListAutomationPeerFactory,ITreeViewListAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewListAutomationPeerFactory?> =
        arrayOfNulls<ITreeViewListAutomationPeerFactory_Impl>(size) as
        Array<ITreeViewListAutomationPeerFactory?>
  }
}
