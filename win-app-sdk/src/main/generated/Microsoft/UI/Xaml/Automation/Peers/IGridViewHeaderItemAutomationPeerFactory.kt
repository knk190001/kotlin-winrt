package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.GridViewHeaderItem
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

@ABIMarker(IGridViewHeaderItemAutomationPeerFactory.ABI::class)
@Signature("{6161999a-e042-5d9b-aa38-9fe1296bfb01}")
@Guid("6161999ae0425d9baa389fe1296bfb01")
@WinRTInterface("6161999ae0425d9baa389fe1296bfb01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewHeaderItemAutomationPeerFactory.ByReference::class)
public interface IGridViewHeaderItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: GridViewHeaderItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): GridViewHeaderItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewHeaderItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIGridViewHeaderItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IGridViewHeaderItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewHeaderItemAutomationPeerFactory {
    public val __30261507_Ptr: Pointer?

    public val _30261507_VtblPtr: Pointer?
      get() = __30261507_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: GridViewHeaderItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): GridViewHeaderItemAutomationPeer? {
      val fnPtr = _30261507_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridViewHeaderItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__30261507_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridViewHeaderItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IGridViewHeaderItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __30261507_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewHeaderItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6161999ae0425d9baa389fe1296bfb01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewHeaderItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IGridViewHeaderItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGridViewHeaderItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIGridViewHeaderItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IGridViewHeaderItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__30261507_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewHeaderItemAutomationPeerFactory):
        Array<IGridViewHeaderItemAutomationPeerFactory?> = (elements as
        Array<IGridViewHeaderItemAutomationPeerFactory?>).castToImpl<IGridViewHeaderItemAutomationPeerFactory,IGridViewHeaderItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewHeaderItemAutomationPeerFactory?> =
        arrayOfNulls<IGridViewHeaderItemAutomationPeerFactory_Impl>(size) as
        Array<IGridViewHeaderItemAutomationPeerFactory?>
  }
}
