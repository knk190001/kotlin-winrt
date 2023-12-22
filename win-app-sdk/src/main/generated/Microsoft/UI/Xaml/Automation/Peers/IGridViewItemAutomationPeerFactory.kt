package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.GridViewItem
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

@ABIMarker(IGridViewItemAutomationPeerFactory.ABI::class)
@Signature("{04735951-0f91-53f5-984b-75bf0ed41540}")
@Guid("047359510f9153f5984b75bf0ed41540")
@WinRTInterface("047359510f9153f5984b75bf0ed41540")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewItemAutomationPeerFactory.ByReference::class)
public interface IGridViewItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: GridViewItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): GridViewItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIGridViewItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IGridViewItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewItemAutomationPeerFactory {
    public val __993777520_Ptr: Pointer?

    public val _993777520_VtblPtr: Pointer?
      get() = __993777520_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: GridViewItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): GridViewItemAutomationPeer? {
      val fnPtr = _993777520_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridViewItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__993777520_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridViewItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IGridViewItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __993777520_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("047359510f9153f5984b75bf0ed41540")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IGridViewItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIGridViewItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IGridViewItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__993777520_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewItemAutomationPeerFactory):
        Array<IGridViewItemAutomationPeerFactory?> = (elements as
        Array<IGridViewItemAutomationPeerFactory?>).castToImpl<IGridViewItemAutomationPeerFactory,IGridViewItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewItemAutomationPeerFactory?> =
        arrayOfNulls<IGridViewItemAutomationPeerFactory_Impl>(size) as
        Array<IGridViewItemAutomationPeerFactory?>
  }
}
