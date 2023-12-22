package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(ISwapChainPanelStatics.ABI::class)
@Signature("{f89c0297-eea8-498c-99c4-257e3660df7e}")
@Guid("f89c0297eea8498c99c4257e3660df7e")
@WinRTInterface("f89c0297eea8498c99c4257e3660df7e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwapChainPanelStatics.ByReference::class)
public interface ISwapChainPanelStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CompositionScaleXProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CompositionScaleYProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwapChainPanelStatics> {
    public override fun getValue() = ABI.makeISwapChainPanelStatics(pointer.getPointer(0))

    public fun setValue(value: ISwapChainPanelStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwapChainPanelStatics {
    public val __188925587_Ptr: Pointer?

    public val _188925587_VtblPtr: Pointer?
      get() = __188925587_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CompositionScaleXProperty(): DependencyProperty? {
      val fnPtr = _188925587_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__188925587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CompositionScaleYProperty(): DependencyProperty? {
      val fnPtr = _188925587_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__188925587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISwapChainPanelStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __188925587_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwapChainPanelStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f89c0297eea8498c99c4257e3660df7e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwapChainPanelStatics(ptr: Pointer?): WithDefault =
        ISwapChainPanelStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwapChainPanelStatics {
      val address = segment.toRawLongValue()
      return makeISwapChainPanelStatics(Pointer(address))
    }

    public override fun toNative(obj: ISwapChainPanelStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__188925587_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwapChainPanelStatics): Array<ISwapChainPanelStatics?> =
        (elements as
        Array<ISwapChainPanelStatics?>).castToImpl<ISwapChainPanelStatics,ISwapChainPanelStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwapChainPanelStatics?> =
        arrayOfNulls<ISwapChainPanelStatics_Impl>(size) as Array<ISwapChainPanelStatics?>
  }
}
