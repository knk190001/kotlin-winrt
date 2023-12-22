package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ISwapChainBackgroundPanelFactory.ABI::class)
@Signature("{83abaa33-6d13-5b13-8e92-ea95579b6ff3}")
@Guid("83abaa336d135b138e92ea95579b6ff3")
@WinRTInterface("83abaa336d135b138e92ea95579b6ff3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwapChainBackgroundPanelFactory.ByReference::class)
public interface ISwapChainBackgroundPanelFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      SwapChainBackgroundPanel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwapChainBackgroundPanelFactory> {
    public override fun getValue() = ABI.makeISwapChainBackgroundPanelFactory(pointer.getPointer(0))

    public fun setValue(value: ISwapChainBackgroundPanelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwapChainBackgroundPanelFactory {
    public val __1665253019_Ptr: Pointer?

    public val _1665253019_VtblPtr: Pointer?
      get() = __1665253019_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        SwapChainBackgroundPanel? {
      val fnPtr = _1665253019_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwapChainBackgroundPanel>()
      val hr = fn.invokeHR(arrayOf(__1665253019_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwapChainBackgroundPanel>(result.getValue())
      return resultValue
    }
  }

  public class ISwapChainBackgroundPanelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1665253019_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwapChainBackgroundPanelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83abaa336d135b138e92ea95579b6ff3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwapChainBackgroundPanelFactory(ptr: Pointer?): WithDefault =
        ISwapChainBackgroundPanelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwapChainBackgroundPanelFactory {
      val address = segment.toRawLongValue()
      return makeISwapChainBackgroundPanelFactory(Pointer(address))
    }

    public override fun toNative(obj: ISwapChainBackgroundPanelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1665253019_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwapChainBackgroundPanelFactory):
        Array<ISwapChainBackgroundPanelFactory?> = (elements as
        Array<ISwapChainBackgroundPanelFactory?>).castToImpl<ISwapChainBackgroundPanelFactory,ISwapChainBackgroundPanelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwapChainBackgroundPanelFactory?> =
        arrayOfNulls<ISwapChainBackgroundPanelFactory_Impl>(size) as
        Array<ISwapChainBackgroundPanelFactory?>
  }
}
