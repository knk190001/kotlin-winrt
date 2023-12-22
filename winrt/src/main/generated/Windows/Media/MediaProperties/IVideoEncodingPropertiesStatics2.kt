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

@ABIMarker(IVideoEncodingPropertiesStatics2.ABI::class)
@Signature("{cf1ebd5d-49fe-4d00-b59a-cfa4dfc51944}")
@Guid("cf1ebd5d49fe4d00b59acfa4dfc51944")
@WinRTInterface("cf1ebd5d49fe4d00b59acfa4dfc51944")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoEncodingPropertiesStatics2.ByReference::class)
public interface IVideoEncodingPropertiesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateHevc(): VideoEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoEncodingPropertiesStatics2> {
    public override fun getValue() = ABI.makeIVideoEncodingPropertiesStatics2(pointer.getPointer(0))

    public fun setValue(value: IVideoEncodingPropertiesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoEncodingPropertiesStatics2 {
    public val __790701575_Ptr: Pointer?

    public val _790701575_VtblPtr: Pointer?
      get() = __790701575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateHevc(): VideoEncodingProperties? {
      val fnPtr = _790701575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__790701575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IVideoEncodingPropertiesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __790701575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoEncodingPropertiesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf1ebd5d49fe4d00b59acfa4dfc51944")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoEncodingPropertiesStatics2(ptr: Pointer?): WithDefault =
        IVideoEncodingPropertiesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoEncodingPropertiesStatics2 {
      val address = segment.toRawLongValue()
      return makeIVideoEncodingPropertiesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IVideoEncodingPropertiesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__790701575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoEncodingPropertiesStatics2):
        Array<IVideoEncodingPropertiesStatics2?> = (elements as
        Array<IVideoEncodingPropertiesStatics2?>).castToImpl<IVideoEncodingPropertiesStatics2,IVideoEncodingPropertiesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoEncodingPropertiesStatics2?> =
        arrayOfNulls<IVideoEncodingPropertiesStatics2_Impl>(size) as
        Array<IVideoEncodingPropertiesStatics2?>
  }
}
