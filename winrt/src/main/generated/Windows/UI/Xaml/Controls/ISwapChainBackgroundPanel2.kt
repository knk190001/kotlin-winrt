package Windows.UI.Xaml.Controls

import Windows.UI.Core.CoreIndependentInputSource
import Windows.UI.Core.CoreInputDeviceTypes
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

@ABIMarker(ISwapChainBackgroundPanel2.ABI::class)
@Signature("{21e672f2-2592-4c38-870f-28fbcf52c095}")
@Guid("21e672f225924c38870f28fbcf52c095")
@WinRTInterface("21e672f225924c38870f28fbcf52c095")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwapChainBackgroundPanel2.ByReference::class)
public interface ISwapChainBackgroundPanel2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCoreIndependentInputSource(deviceTypes: CoreInputDeviceTypes?):
      CoreIndependentInputSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwapChainBackgroundPanel2> {
    public override fun getValue() = ABI.makeISwapChainBackgroundPanel2(pointer.getPointer(0))

    public fun setValue(value: ISwapChainBackgroundPanel2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwapChainBackgroundPanel2 {
    public val __759044590_Ptr: Pointer?

    public val _759044590_VtblPtr: Pointer?
      get() = __759044590_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCoreIndependentInputSource(deviceTypes: CoreInputDeviceTypes?):
        CoreIndependentInputSource? {
      val fnPtr = _759044590_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreIndependentInputSource>()
      val hr = fn.invokeHR(arrayOf(__759044590_Ptr, marshalToNative(deviceTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreIndependentInputSource>(result.getValue())
      return resultValue
    }
  }

  public class ISwapChainBackgroundPanel2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __759044590_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwapChainBackgroundPanel2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("21e672f225924c38870f28fbcf52c095")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwapChainBackgroundPanel2(ptr: Pointer?): WithDefault =
        ISwapChainBackgroundPanel2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwapChainBackgroundPanel2 {
      val address = segment.toRawLongValue()
      return makeISwapChainBackgroundPanel2(Pointer(address))
    }

    public override fun toNative(obj: ISwapChainBackgroundPanel2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__759044590_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwapChainBackgroundPanel2):
        Array<ISwapChainBackgroundPanel2?> = (elements as
        Array<ISwapChainBackgroundPanel2?>).castToImpl<ISwapChainBackgroundPanel2,ISwapChainBackgroundPanel2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwapChainBackgroundPanel2?> =
        arrayOfNulls<ISwapChainBackgroundPanel2_Impl>(size) as Array<ISwapChainBackgroundPanel2?>
  }
}
