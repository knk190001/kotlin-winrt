package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.Slider
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

@ABIMarker(ISliderAutomationPeerFactory.ABI::class)
@Signature("{81459943-902a-5fe3-9c75-0f8b11f42658}")
@Guid("81459943902a5fe39c750f8b11f42658")
@WinRTInterface("81459943902a5fe39c750f8b11f42658")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISliderAutomationPeerFactory.ByReference::class)
public interface ISliderAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: Slider?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): SliderAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISliderAutomationPeerFactory> {
    public override fun getValue() = ABI.makeISliderAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ISliderAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISliderAutomationPeerFactory {
    public val __2102129139_Ptr: Pointer?

    public val _2102129139_VtblPtr: Pointer?
      get() = __2102129139_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: Slider?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): SliderAutomationPeer? {
      val fnPtr = _2102129139_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SliderAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__2102129139_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SliderAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ISliderAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2102129139_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISliderAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81459943902a5fe39c750f8b11f42658")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISliderAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ISliderAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISliderAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeISliderAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISliderAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2102129139_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISliderAutomationPeerFactory):
        Array<ISliderAutomationPeerFactory?> = (elements as
        Array<ISliderAutomationPeerFactory?>).castToImpl<ISliderAutomationPeerFactory,ISliderAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISliderAutomationPeerFactory?> =
        arrayOfNulls<ISliderAutomationPeerFactory_Impl>(size) as
        Array<ISliderAutomationPeerFactory?>
  }
}
