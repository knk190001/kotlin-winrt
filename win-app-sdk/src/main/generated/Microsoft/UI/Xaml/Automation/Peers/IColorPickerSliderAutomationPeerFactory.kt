package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.Primitives.ColorPickerSlider
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

@ABIMarker(IColorPickerSliderAutomationPeerFactory.ABI::class)
@Signature("{e5f9093f-5e2c-5148-b5d1-1cda4eb86913}")
@Guid("e5f9093f5e2c5148b5d11cda4eb86913")
@WinRTInterface("e5f9093f5e2c5148b5d11cda4eb86913")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorPickerSliderAutomationPeerFactory.ByReference::class)
public interface IColorPickerSliderAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ColorPickerSlider?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ColorPickerSliderAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorPickerSliderAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIColorPickerSliderAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IColorPickerSliderAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorPickerSliderAutomationPeerFactory {
    public val __1058319330_Ptr: Pointer?

    public val _1058319330_VtblPtr: Pointer?
      get() = __1058319330_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ColorPickerSlider?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ColorPickerSliderAutomationPeer? {
      val fnPtr = _1058319330_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorPickerSliderAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1058319330_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorPickerSliderAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IColorPickerSliderAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1058319330_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorPickerSliderAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5f9093f5e2c5148b5d11cda4eb86913")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorPickerSliderAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IColorPickerSliderAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IColorPickerSliderAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIColorPickerSliderAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IColorPickerSliderAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1058319330_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorPickerSliderAutomationPeerFactory):
        Array<IColorPickerSliderAutomationPeerFactory?> = (elements as
        Array<IColorPickerSliderAutomationPeerFactory?>).castToImpl<IColorPickerSliderAutomationPeerFactory,IColorPickerSliderAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorPickerSliderAutomationPeerFactory?> =
        arrayOfNulls<IColorPickerSliderAutomationPeerFactory_Impl>(size) as
        Array<IColorPickerSliderAutomationPeerFactory?>
  }
}
