package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.GridViewHeaderItem
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
@Signature("{2c80b4d2-ffc2-4157-88dd-59cd92e39715}")
@Guid("2c80b4d2ffc2415788dd59cd92e39715")
@WinRTInterface("2c80b4d2ffc2415788dd59cd92e39715")
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
    public val __585708046_Ptr: Pointer?

    public val _585708046_VtblPtr: Pointer?
      get() = __585708046_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: GridViewHeaderItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): GridViewHeaderItemAutomationPeer? {
      val fnPtr = _585708046_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridViewHeaderItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__585708046_Ptr, marshalToNative(owner),
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
    public override val __585708046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewHeaderItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c80b4d2ffc2415788dd59cd92e39715")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewHeaderItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IGridViewHeaderItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGridViewHeaderItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIGridViewHeaderItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IGridViewHeaderItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__585708046_Ptr))
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
