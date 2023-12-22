package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.TreeViewItem
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

@ABIMarker(ITreeViewItemAutomationPeerFactory.ABI::class)
@Signature("{73d388bf-1d01-4159-82c0-2b2996dbfdce}")
@Guid("73d388bf1d01415982c02b2996dbfdce")
@WinRTInterface("73d388bf1d01415982c02b2996dbfdce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewItemAutomationPeerFactory.ByReference::class)
public interface ITreeViewItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: TreeViewItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): TreeViewItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeITreeViewItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ITreeViewItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewItemAutomationPeerFactory {
    public val __2007100285_Ptr: Pointer?

    public val _2007100285_VtblPtr: Pointer?
      get() = __2007100285_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: TreeViewItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): TreeViewItemAutomationPeer? {
      val fnPtr = _2007100285_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__2007100285_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2007100285_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("73d388bf1d01415982c02b2996dbfdce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ITreeViewItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeITreeViewItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2007100285_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewItemAutomationPeerFactory):
        Array<ITreeViewItemAutomationPeerFactory?> = (elements as
        Array<ITreeViewItemAutomationPeerFactory?>).castToImpl<ITreeViewItemAutomationPeerFactory,ITreeViewItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewItemAutomationPeerFactory?> =
        arrayOfNulls<ITreeViewItemAutomationPeerFactory_Impl>(size) as
        Array<ITreeViewItemAutomationPeerFactory?>
  }
}
