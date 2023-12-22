package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.Primitives.ColorSpectrum
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

@ABIMarker(IColorSpectrumAutomationPeerFactory.ABI::class)
@Signature("{cfccae7e-fe0f-5c9c-9d1a-69e20e0232cf}")
@Guid("cfccae7efe0f5c9c9d1a69e20e0232cf")
@WinRTInterface("cfccae7efe0f5c9c9d1a69e20e0232cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorSpectrumAutomationPeerFactory.ByReference::class)
public interface IColorSpectrumAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ColorSpectrum?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ColorSpectrumAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorSpectrumAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIColorSpectrumAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IColorSpectrumAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorSpectrumAutomationPeerFactory {
    public val __47893600_Ptr: Pointer?

    public val _47893600_VtblPtr: Pointer?
      get() = __47893600_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ColorSpectrum?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ColorSpectrumAutomationPeer? {
      val fnPtr = _47893600_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorSpectrumAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__47893600_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorSpectrumAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IColorSpectrumAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __47893600_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorSpectrumAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfccae7efe0f5c9c9d1a69e20e0232cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorSpectrumAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IColorSpectrumAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorSpectrumAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIColorSpectrumAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IColorSpectrumAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__47893600_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorSpectrumAutomationPeerFactory):
        Array<IColorSpectrumAutomationPeerFactory?> = (elements as
        Array<IColorSpectrumAutomationPeerFactory?>).castToImpl<IColorSpectrumAutomationPeerFactory,IColorSpectrumAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorSpectrumAutomationPeerFactory?> =
        arrayOfNulls<IColorSpectrumAutomationPeerFactory_Impl>(size) as
        Array<IColorSpectrumAutomationPeerFactory?>
  }
}
