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

@ABIMarker(IMediaEncodingProfileStatics3.ABI::class)
@Signature("{90dac5aa-cf76-4294-a9ed-1a1420f51f6b}")
@Guid("90dac5aacf764294a9ed1a1420f51f6b")
@WinRTInterface("90dac5aacf764294a9ed1a1420f51f6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingProfileStatics3.ByReference::class)
public interface IMediaEncodingProfileStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAlac(quality: AudioEncodingQuality?): MediaEncodingProfile?

  @InterfaceMethod(1)
  public fun CreateFlac(quality: AudioEncodingQuality?): MediaEncodingProfile?

  @InterfaceMethod(2)
  public fun CreateHevc(quality: VideoEncodingQuality?): MediaEncodingProfile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingProfileStatics3> {
    public override fun getValue() = ABI.makeIMediaEncodingProfileStatics3(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingProfileStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingProfileStatics3 {
    public val __1036044039_Ptr: Pointer?

    public val _1036044039_VtblPtr: Pointer?
      get() = __1036044039_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAlac(quality: AudioEncodingQuality?): MediaEncodingProfile? {
      val fnPtr = _1036044039_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__1036044039_Ptr, marshalToNative(quality), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFlac(quality: AudioEncodingQuality?): MediaEncodingProfile? {
      val fnPtr = _1036044039_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__1036044039_Ptr, marshalToNative(quality), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateHevc(quality: VideoEncodingQuality?): MediaEncodingProfile? {
      val fnPtr = _1036044039_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__1036044039_Ptr, marshalToNative(quality), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingProfileStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1036044039_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingProfileStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90dac5aacf764294a9ed1a1420f51f6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingProfileStatics3(ptr: Pointer?): WithDefault =
        IMediaEncodingProfileStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingProfileStatics3 {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingProfileStatics3(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingProfileStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1036044039_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingProfileStatics3):
        Array<IMediaEncodingProfileStatics3?> = (elements as
        Array<IMediaEncodingProfileStatics3?>).castToImpl<IMediaEncodingProfileStatics3,IMediaEncodingProfileStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingProfileStatics3?> =
        arrayOfNulls<IMediaEncodingProfileStatics3_Impl>(size) as
        Array<IMediaEncodingProfileStatics3?>
  }
}
