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

@ABIMarker(IMediaEncodingProfileStatics2.ABI::class)
@Signature("{ce8de74f-6af4-4288-8fe2-79adf1f79a43}")
@Guid("ce8de74f6af442888fe279adf1f79a43")
@WinRTInterface("ce8de74f6af442888fe279adf1f79a43")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingProfileStatics2.ByReference::class)
public interface IMediaEncodingProfileStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWav(quality: AudioEncodingQuality?): MediaEncodingProfile?

  @InterfaceMethod(1)
  public fun CreateAvi(quality: VideoEncodingQuality?): MediaEncodingProfile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingProfileStatics2> {
    public override fun getValue() = ABI.makeIMediaEncodingProfileStatics2(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingProfileStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingProfileStatics2 {
    public val __1036044038_Ptr: Pointer?

    public val _1036044038_VtblPtr: Pointer?
      get() = __1036044038_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWav(quality: AudioEncodingQuality?): MediaEncodingProfile? {
      val fnPtr = _1036044038_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__1036044038_Ptr, marshalToNative(quality), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateAvi(quality: VideoEncodingQuality?): MediaEncodingProfile? {
      val fnPtr = _1036044038_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__1036044038_Ptr, marshalToNative(quality), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingProfileStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1036044038_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingProfileStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce8de74f6af442888fe279adf1f79a43")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingProfileStatics2(ptr: Pointer?): WithDefault =
        IMediaEncodingProfileStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingProfileStatics2 {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingProfileStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingProfileStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1036044038_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingProfileStatics2):
        Array<IMediaEncodingProfileStatics2?> = (elements as
        Array<IMediaEncodingProfileStatics2?>).castToImpl<IMediaEncodingProfileStatics2,IMediaEncodingProfileStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingProfileStatics2?> =
        arrayOfNulls<IMediaEncodingProfileStatics2_Impl>(size) as
        Array<IMediaEncodingProfileStatics2?>
  }
}
