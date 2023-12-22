package Windows.Media.MediaProperties

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import Windows.Media.Core.TimedMetadataStreamDescriptor
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

@ABIMarker(IMediaEncodingProfile3.ABI::class)
@Signature("{ba6ebe88-7570-4e69-accf-5611ad015f88}")
@Guid("ba6ebe8875704e69accf5611ad015f88")
@WinRTInterface("ba6ebe8875704e69accf5611ad015f88")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingProfile3.ByReference::class)
public interface IMediaEncodingProfile3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetTimedMetadataTracks(value: IIterable<TimedMetadataStreamDescriptor?>?): Unit

  @InterfaceMethod(1)
  public fun GetTimedMetadataTracks(): IVector<TimedMetadataStreamDescriptor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingProfile3> {
    public override fun getValue() = ABI.makeIMediaEncodingProfile3(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingProfile3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingProfile3 {
    public val __1149765754_Ptr: Pointer?

    public val _1149765754_VtblPtr: Pointer?
      get() = __1149765754_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetTimedMetadataTracks(value: IIterable<TimedMetadataStreamDescriptor?>?):
        Unit {
      val fnPtr = _1149765754_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1149765754_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetTimedMetadataTracks(): IVector<TimedMetadataStreamDescriptor?>? {
      val fnPtr = _1149765754_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<TimedMetadataStreamDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1149765754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<TimedMetadataStreamDescriptor?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingProfile3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1149765754_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingProfile3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba6ebe8875704e69accf5611ad015f88")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingProfile3(ptr: Pointer?): WithDefault =
        IMediaEncodingProfile3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingProfile3 {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingProfile3(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingProfile3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1149765754_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingProfile3): Array<IMediaEncodingProfile3?> =
        (elements as
        Array<IMediaEncodingProfile3?>).castToImpl<IMediaEncodingProfile3,IMediaEncodingProfile3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingProfile3?> =
        arrayOfNulls<IMediaEncodingProfile3_Impl>(size) as Array<IMediaEncodingProfile3?>
  }
}
