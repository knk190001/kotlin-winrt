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

@ABIMarker(IImageEncodingPropertiesStatics3.ABI::class)
@Signature("{48f4814d-a2ff-48dc-8ea0-e90680663656}")
@Guid("48f4814da2ff48dc8ea0e90680663656")
@WinRTInterface("48f4814da2ff48dc8ea0e90680663656")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageEncodingPropertiesStatics3.ByReference::class)
public interface IImageEncodingPropertiesStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateHeif(): ImageEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageEncodingPropertiesStatics3> {
    public override fun getValue() = ABI.makeIImageEncodingPropertiesStatics3(pointer.getPointer(0))

    public fun setValue(value: IImageEncodingPropertiesStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageEncodingPropertiesStatics3 {
    public val __1250517736_Ptr: Pointer?

    public val _1250517736_VtblPtr: Pointer?
      get() = __1250517736_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateHeif(): ImageEncodingProperties? {
      val fnPtr = _1250517736_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1250517736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IImageEncodingPropertiesStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1250517736_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageEncodingPropertiesStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48f4814da2ff48dc8ea0e90680663656")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageEncodingPropertiesStatics3(ptr: Pointer?): WithDefault =
        IImageEncodingPropertiesStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageEncodingPropertiesStatics3 {
      val address = segment.toRawLongValue()
      return makeIImageEncodingPropertiesStatics3(Pointer(address))
    }

    public override fun toNative(obj: IImageEncodingPropertiesStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1250517736_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageEncodingPropertiesStatics3):
        Array<IImageEncodingPropertiesStatics3?> = (elements as
        Array<IImageEncodingPropertiesStatics3?>).castToImpl<IImageEncodingPropertiesStatics3,IImageEncodingPropertiesStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageEncodingPropertiesStatics3?> =
        arrayOfNulls<IImageEncodingPropertiesStatics3_Impl>(size) as
        Array<IImageEncodingPropertiesStatics3?>
  }
}
