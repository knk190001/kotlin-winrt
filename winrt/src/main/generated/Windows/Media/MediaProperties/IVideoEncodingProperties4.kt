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

@ABIMarker(IVideoEncodingProperties4.ABI::class)
@Signature("{724ef014-c10c-40f2-9d72-3ee13b45fa8e}")
@Guid("724ef014c10c40f29d723ee13b45fa8e")
@WinRTInterface("724ef014c10c40f29d723ee13b45fa8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoEncodingProperties4.ByReference::class)
public interface IVideoEncodingProperties4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SphericalVideoFrameFormat(): SphericalVideoFrameFormat?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoEncodingProperties4> {
    public override fun getValue() = ABI.makeIVideoEncodingProperties4(pointer.getPointer(0))

    public fun setValue(value: IVideoEncodingProperties4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoEncodingProperties4 {
    public val __705029990_Ptr: Pointer?

    public val _705029990_VtblPtr: Pointer?
      get() = __705029990_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SphericalVideoFrameFormat(): SphericalVideoFrameFormat? {
      val fnPtr = _705029990_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SphericalVideoFrameFormat>()
      val hr = fn.invokeHR(arrayOf(__705029990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SphericalVideoFrameFormat>(result.getValue())
      return resultValue
    }
  }

  public class IVideoEncodingProperties4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __705029990_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoEncodingProperties4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("724ef014c10c40f29d723ee13b45fa8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoEncodingProperties4(ptr: Pointer?): WithDefault =
        IVideoEncodingProperties4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoEncodingProperties4 {
      val address = segment.toRawLongValue()
      return makeIVideoEncodingProperties4(Pointer(address))
    }

    public override fun toNative(obj: IVideoEncodingProperties4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__705029990_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoEncodingProperties4):
        Array<IVideoEncodingProperties4?> = (elements as
        Array<IVideoEncodingProperties4?>).castToImpl<IVideoEncodingProperties4,IVideoEncodingProperties4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoEncodingProperties4?> =
        arrayOfNulls<IVideoEncodingProperties4_Impl>(size) as Array<IVideoEncodingProperties4?>
  }
}
