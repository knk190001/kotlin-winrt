package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.FlipView
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

@ABIMarker(IFlipViewAutomationPeerFactory.ABI::class)
@Signature("{e73c7f75-ed47-522a-8a27-45feda1031f0}")
@Guid("e73c7f75ed47522a8a2745feda1031f0")
@WinRTInterface("e73c7f75ed47522a8a2745feda1031f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipViewAutomationPeerFactory.ByReference::class)
public interface IFlipViewAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: FlipView?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): FlipViewAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlipViewAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIFlipViewAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IFlipViewAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipViewAutomationPeerFactory {
    public val __697653148_Ptr: Pointer?

    public val _697653148_VtblPtr: Pointer?
      get() = __697653148_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: FlipView?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): FlipViewAutomationPeer? {
      val fnPtr = _697653148_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlipViewAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__697653148_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlipViewAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IFlipViewAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __697653148_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipViewAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e73c7f75ed47522a8a2745feda1031f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipViewAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IFlipViewAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipViewAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIFlipViewAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IFlipViewAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__697653148_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipViewAutomationPeerFactory):
        Array<IFlipViewAutomationPeerFactory?> = (elements as
        Array<IFlipViewAutomationPeerFactory?>).castToImpl<IFlipViewAutomationPeerFactory,IFlipViewAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipViewAutomationPeerFactory?> =
        arrayOfNulls<IFlipViewAutomationPeerFactory_Impl>(size) as
        Array<IFlipViewAutomationPeerFactory?>
  }
}
