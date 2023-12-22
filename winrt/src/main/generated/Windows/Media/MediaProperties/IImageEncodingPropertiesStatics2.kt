package Windows.Media.MediaProperties

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

@ABIMarker(IImageEncodingPropertiesStatics2.ABI::class)
@Signature("{f6c25b29-3824-46b0-956e-501329e1be3c}")
@Guid("f6c25b29382446b0956e501329e1be3c")
@WinRTInterface("f6c25b29382446b0956e501329e1be3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageEncodingPropertiesStatics2.ByReference::class)
public interface IImageEncodingPropertiesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateUncompressed(format: MediaPixelFormat?): ImageEncodingProperties?

  @InterfaceMethod(1)
  public fun CreateBmp(): ImageEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageEncodingPropertiesStatics2> {
    public override fun getValue() = ABI.makeIImageEncodingPropertiesStatics2(pointer.getPointer(0))

    public fun setValue(value: IImageEncodingPropertiesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageEncodingPropertiesStatics2 {
    public val __1250517735_Ptr: Pointer?

    public val _1250517735_VtblPtr: Pointer?
      get() = __1250517735_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateUncompressed(format: MediaPixelFormat?): ImageEncodingProperties? {
      val fnPtr = _1250517735_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1250517735_Ptr, marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateBmp(): ImageEncodingProperties? {
      val fnPtr = _1250517735_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1250517735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IImageEncodingPropertiesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1250517735_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageEncodingPropertiesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6c25b29382446b0956e501329e1be3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageEncodingPropertiesStatics2(ptr: Pointer?): WithDefault =
        IImageEncodingPropertiesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageEncodingPropertiesStatics2 {
      val address = segment.toRawLongValue()
      return makeIImageEncodingPropertiesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IImageEncodingPropertiesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1250517735_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageEncodingPropertiesStatics2):
        Array<IImageEncodingPropertiesStatics2?> = (elements as
        Array<IImageEncodingPropertiesStatics2?>).castToImpl<IImageEncodingPropertiesStatics2,IImageEncodingPropertiesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageEncodingPropertiesStatics2?> =
        arrayOfNulls<IImageEncodingPropertiesStatics2_Impl>(size) as
        Array<IImageEncodingPropertiesStatics2?>
  }
}
