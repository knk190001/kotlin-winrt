package Windows.UI.Xaml.Media.Imaging

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

@ABIMarker(ISvgImageSourceStatics.ABI::class)
@Signature("{9c6638ce-bed1-4aab-acbb-d3e2185d315a}")
@Guid("9c6638cebed14aabacbbd3e2185d315a")
@WinRTInterface("9c6638cebed14aabacbbd3e2185d315a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISvgImageSourceStatics.ByReference::class)
public interface ISvgImageSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UriSourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_RasterizePixelWidthProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_RasterizePixelHeightProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISvgImageSourceStatics> {
    public override fun getValue() = ABI.makeISvgImageSourceStatics(pointer.getPointer(0))

    public fun setValue(value: ISvgImageSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISvgImageSourceStatics {
    public val __1764236641_Ptr: Pointer?

    public val _1764236641_VtblPtr: Pointer?
      get() = __1764236641_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UriSourceProperty(): DependencyProperty? {
      val fnPtr = _1764236641_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1764236641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RasterizePixelWidthProperty(): DependencyProperty? {
      val fnPtr = _1764236641_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1764236641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RasterizePixelHeightProperty(): DependencyProperty? {
      val fnPtr = _1764236641_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1764236641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISvgImageSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1764236641_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISvgImageSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c6638cebed14aabacbbd3e2185d315a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISvgImageSourceStatics(ptr: Pointer?): WithDefault =
        ISvgImageSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISvgImageSourceStatics {
      val address = segment.toRawLongValue()
      return makeISvgImageSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: ISvgImageSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1764236641_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISvgImageSourceStatics): Array<ISvgImageSourceStatics?> =
        (elements as
        Array<ISvgImageSourceStatics?>).castToImpl<ISvgImageSourceStatics,ISvgImageSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISvgImageSourceStatics?> =
        arrayOfNulls<ISvgImageSourceStatics_Impl>(size) as Array<ISvgImageSourceStatics?>
  }
}
