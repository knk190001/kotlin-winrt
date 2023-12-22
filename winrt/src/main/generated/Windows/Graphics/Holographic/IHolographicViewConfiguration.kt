package Windows.Graphics.Holographic

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Size
import Windows.Graphics.DirectX.DirectXPixelFormat
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHolographicViewConfiguration.ABI::class)
@Signature("{5c1de6e6-67e9-5004-b02c-67a3a122b576}")
@Guid("5c1de6e667e95004b02c67a3a122b576")
@WinRTInterface("5c1de6e667e95004b02c67a3a122b576")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicViewConfiguration.ByReference::class)
public interface IHolographicViewConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NativeRenderTargetSize(): Size?

  @InterfaceMethod(1)
  public fun get_RenderTargetSize(): Size?

  @InterfaceMethod(2)
  public fun RequestRenderTargetSize(size: Size?): Size?

  @InterfaceMethod(3)
  public fun get_SupportedPixelFormats(): IVectorView<DirectXPixelFormat?>?

  @InterfaceMethod(4)
  public fun get_PixelFormat(): DirectXPixelFormat?

  @InterfaceMethod(5)
  public fun put_PixelFormat(value: DirectXPixelFormat?): Unit

  @InterfaceMethod(6)
  public fun get_IsStereo(): Boolean

  @InterfaceMethod(7)
  public fun get_RefreshRate(): Double

  @InterfaceMethod(8)
  public fun get_Kind(): HolographicViewConfigurationKind?

  @InterfaceMethod(9)
  public fun get_Display(): HolographicDisplay?

  @InterfaceMethod(10)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicViewConfiguration> {
    public override fun getValue() = ABI.makeIHolographicViewConfiguration(pointer.getPointer(0))

    public fun setValue(value: IHolographicViewConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicViewConfiguration {
    public val __1958667498_Ptr: Pointer?

    public val _1958667498_VtblPtr: Pointer?
      get() = __1958667498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NativeRenderTargetSize(): Size? {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RenderTargetSize(): Size? {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestRenderTargetSize(size: Size?): Size? {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr, marshalToNative(size), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SupportedPixelFormats(): IVectorView<DirectXPixelFormat?>? {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DirectXPixelFormat?>>()
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DirectXPixelFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PixelFormat(): DirectXPixelFormat? {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PixelFormat(value: DirectXPixelFormat?): Unit {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsStereo(): Boolean {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_RefreshRate(): Double {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_Kind(): HolographicViewConfigurationKind? {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicViewConfigurationKind>()
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicViewConfigurationKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Display(): HolographicDisplay? {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicDisplay>()
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicDisplay>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _1958667498_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1958667498_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicViewConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1958667498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicViewConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c1de6e667e95004b02c67a3a122b576")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicViewConfiguration(ptr: Pointer?): WithDefault =
        IHolographicViewConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicViewConfiguration {
      val address = segment.toRawLongValue()
      return makeIHolographicViewConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IHolographicViewConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1958667498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicViewConfiguration):
        Array<IHolographicViewConfiguration?> = (elements as
        Array<IHolographicViewConfiguration?>).castToImpl<IHolographicViewConfiguration,IHolographicViewConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicViewConfiguration?> =
        arrayOfNulls<IHolographicViewConfiguration_Impl>(size) as
        Array<IHolographicViewConfiguration?>
  }
}
