package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.FlipViewItem
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
@Signature("{aa3b880f-62cb-5878-8f0b-7b3548c65080}")
@Guid("aa3b880f62cb58788f0b7b3548c65080")
@WinRTInterface("aa3b880f62cb58788f0b7b3548c65080")
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
    public val __501414089_Ptr: Pointer?

    public val _501414089_VtblPtr: Pointer?
      get() = __501414089_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: FlipViewItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): FlipViewItemAutomationPeer? {
      val fnPtr = _501414089_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlipViewItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__501414089_Ptr, marshalToNative(owner),
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
    public override val __501414089_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipViewItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa3b880f62cb58788f0b7b3548c65080")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipViewItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IFlipViewItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipViewItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIFlipViewItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IFlipViewItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__501414089_Ptr))
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
