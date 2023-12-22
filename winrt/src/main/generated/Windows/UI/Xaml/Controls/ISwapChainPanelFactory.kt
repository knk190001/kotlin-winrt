package Windows.UI.Xaml.Controls

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

@ABIMarker(ISwapChainPanelFactory.ABI::class)
@Signature("{f38f8d7f-1a48-49cb-86d2-10eaaaf6fd70}")
@Guid("f38f8d7f1a4849cb86d210eaaaf6fd70")
@WinRTInterface("f38f8d7f1a4849cb86d210eaaaf6fd70")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwapChainPanelFactory.ByReference::class)
public interface ISwapChainPanelFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): SwapChainPanel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwapChainPanelFactory> {
    public override fun getValue() = ABI.makeISwapChainPanelFactory(pointer.getPointer(0))

    public fun setValue(value: ISwapChainPanelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwapChainPanelFactory {
    public val __994179032_Ptr: Pointer?

    public val _994179032_VtblPtr: Pointer?
      get() = __994179032_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        SwapChainPanel? {
      val fnPtr = _994179032_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwapChainPanel>()
      val hr = fn.invokeHR(arrayOf(__994179032_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwapChainPanel>(result.getValue())
      return resultValue
    }
  }

  public class ISwapChainPanelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __994179032_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwapChainPanelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f38f8d7f1a4849cb86d210eaaaf6fd70")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwapChainPanelFactory(ptr: Pointer?): WithDefault =
        ISwapChainPanelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwapChainPanelFactory {
      val address = segment.toRawLongValue()
      return makeISwapChainPanelFactory(Pointer(address))
    }

    public override fun toNative(obj: ISwapChainPanelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__994179032_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwapChainPanelFactory): Array<ISwapChainPanelFactory?> =
        (elements as
        Array<ISwapChainPanelFactory?>).castToImpl<ISwapChainPanelFactory,ISwapChainPanelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwapChainPanelFactory?> =
        arrayOfNulls<ISwapChainPanelFactory_Impl>(size) as Array<ISwapChainPanelFactory?>
  }
}
