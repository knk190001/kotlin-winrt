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

@ABIMarker(IImageEncodingPropertiesStatics.ABI::class)
@Signature("{257c68dc-8b99-439e-aa59-913a36161297}")
@Guid("257c68dc8b99439eaa59913a36161297")
@WinRTInterface("257c68dc8b99439eaa59913a36161297")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageEncodingPropertiesStatics.ByReference::class)
public interface IImageEncodingPropertiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateJpeg(): ImageEncodingProperties?

  @InterfaceMethod(1)
  public fun CreatePng(): ImageEncodingProperties?

  @InterfaceMethod(2)
  public fun CreateJpegXR(): ImageEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageEncodingPropertiesStatics> {
    public override fun getValue() = ABI.makeIImageEncodingPropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: IImageEncodingPropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageEncodingPropertiesStatics {
    public val __1206586709_Ptr: Pointer?

    public val _1206586709_VtblPtr: Pointer?
      get() = __1206586709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateJpeg(): ImageEncodingProperties? {
      val fnPtr = _1206586709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1206586709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreatePng(): ImageEncodingProperties? {
      val fnPtr = _1206586709_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1206586709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateJpegXR(): ImageEncodingProperties? {
      val fnPtr = _1206586709_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1206586709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IImageEncodingPropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1206586709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageEncodingPropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("257c68dc8b99439eaa59913a36161297")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageEncodingPropertiesStatics(ptr: Pointer?): WithDefault =
        IImageEncodingPropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageEncodingPropertiesStatics {
      val address = segment.toRawLongValue()
      return makeIImageEncodingPropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IImageEncodingPropertiesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1206586709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageEncodingPropertiesStatics):
        Array<IImageEncodingPropertiesStatics?> = (elements as
        Array<IImageEncodingPropertiesStatics?>).castToImpl<IImageEncodingPropertiesStatics,IImageEncodingPropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageEncodingPropertiesStatics?> =
        arrayOfNulls<IImageEncodingPropertiesStatics_Impl>(size) as
        Array<IImageEncodingPropertiesStatics?>
  }
}
