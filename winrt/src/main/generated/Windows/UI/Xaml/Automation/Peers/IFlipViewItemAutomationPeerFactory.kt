package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.FlipViewItem
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

@ABIMarker(IFlipViewItemAutomationPeerFactory.ABI::class)
@Signature("{69109356-d0e5-4c10-a09c-ad0bf1b0cb01}")
@Guid("69109356d0e54c10a09cad0bf1b0cb01")
@WinRTInterface("69109356d0e54c10a09cad0bf1b0cb01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipViewItemAutomationPeerFactory.ByReference::class)
public interface IFlipViewItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: FlipViewItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): FlipViewItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlipViewItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIFlipViewItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IFlipViewItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipViewItemAutomationPeerFactory {
    public val __796996076_Ptr: Pointer?

    public val _796996076_VtblPtr: Pointer?
      get() = __796996076_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: FlipViewItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): FlipViewItemAutomationPeer? {
      val fnPtr = _796996076_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlipViewItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__796996076_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlipViewItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IFlipViewItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __796996076_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipViewItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69109356d0e54c10a09cad0bf1b0cb01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipViewItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IFlipViewItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipViewItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIFlipViewItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IFlipViewItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__796996076_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipViewItemAutomationPeerFactory):
        Array<IFlipViewItemAutomationPeerFactory?> = (elements as
        Array<IFlipViewItemAutomationPeerFactory?>).castToImpl<IFlipViewItemAutomationPeerFactory,IFlipViewItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipViewItemAutomationPeerFactory?> =
        arrayOfNulls<IFlipViewItemAutomationPeerFactory_Impl>(size) as
        Array<IFlipViewItemAutomationPeerFactory?>
  }
}
