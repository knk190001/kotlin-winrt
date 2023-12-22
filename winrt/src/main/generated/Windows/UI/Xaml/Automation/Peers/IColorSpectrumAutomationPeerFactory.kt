package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.Primitives.ColorSpectrum
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
@Signature("{0ac400e1-b743-4496-837a-8889e6ac6497}")
@Guid("0ac400e1b7434496837a8889e6ac6497")
@WinRTInterface("0ac400e1b7434496837a8889e6ac6497")
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
    public val __1548115851_Ptr: Pointer?

    public val _1548115851_VtblPtr: Pointer?
      get() = __1548115851_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ColorSpectrum?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ColorSpectrumAutomationPeer? {
      val fnPtr = _1548115851_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorSpectrumAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1548115851_Ptr, marshalToNative(owner),
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
    public override val __1548115851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorSpectrumAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ac400e1b7434496837a8889e6ac6497")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorSpectrumAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IColorSpectrumAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorSpectrumAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIColorSpectrumAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IColorSpectrumAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1548115851_Ptr))
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
