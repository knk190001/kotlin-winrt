package Windows.Media.Playback

import Windows.Media.MediaPlaybackType
import Windows.Media.MusicDisplayProperties
import Windows.Media.VideoDisplayProperties
import Windows.Storage.Streams.RandomAccessStreamReference
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

@ABIMarker(IMediaItemDisplayProperties.ABI::class)
@Signature("{1e3c1b48-7097-4384-a217-c1291dfa8c16}")
@Guid("1e3c1b4870974384a217c1291dfa8c16")
@WinRTInterface("1e3c1b4870974384a217c1291dfa8c16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaItemDisplayProperties.ByReference::class)
public interface IMediaItemDisplayProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): MediaPlaybackType?

  @InterfaceMethod(1)
  public fun put_Type(value: MediaPlaybackType?): Unit

  @InterfaceMethod(2)
  public fun get_MusicProperties(): MusicDisplayProperties?

  @InterfaceMethod(3)
  public fun get_VideoProperties(): VideoDisplayProperties?

  @InterfaceMethod(4)
  public fun get_Thumbnail(): RandomAccessStreamReference?

  @InterfaceMethod(5)
  public fun put_Thumbnail(value: RandomAccessStreamReference?): Unit

  @InterfaceMethod(6)
  public fun ClearAll(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaItemDisplayProperties> {
    public override fun getValue() = ABI.makeIMediaItemDisplayProperties(pointer.getPointer(0))

    public fun setValue(value: IMediaItemDisplayProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaItemDisplayProperties {
    public val __1379475543_Ptr: Pointer?

    public val _1379475543_VtblPtr: Pointer?
      get() = __1379475543_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): MediaPlaybackType? {
      val fnPtr = _1379475543_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackType>()
      val hr = fn.invokeHR(arrayOf(__1379475543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Type(value: MediaPlaybackType?): Unit {
      val fnPtr = _1379475543_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1379475543_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MusicProperties(): MusicDisplayProperties? {
      val fnPtr = _1379475543_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MusicDisplayProperties>()
      val hr = fn.invokeHR(arrayOf(__1379475543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MusicDisplayProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_VideoProperties(): VideoDisplayProperties? {
      val fnPtr = _1379475543_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoDisplayProperties>()
      val hr = fn.invokeHR(arrayOf(__1379475543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoDisplayProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Thumbnail(): RandomAccessStreamReference? {
      val fnPtr = _1379475543_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1379475543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Thumbnail(value: RandomAccessStreamReference?): Unit {
      val fnPtr = _1379475543_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1379475543_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun ClearAll(): Unit {
      val fnPtr = _1379475543_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1379475543_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaItemDisplayProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1379475543_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaItemDisplayProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e3c1b4870974384a217c1291dfa8c16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaItemDisplayProperties(ptr: Pointer?): WithDefault =
        IMediaItemDisplayProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaItemDisplayProperties {
      val address = segment.toRawLongValue()
      return makeIMediaItemDisplayProperties(Pointer(address))
    }

    public override fun toNative(obj: IMediaItemDisplayProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1379475543_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaItemDisplayProperties):
        Array<IMediaItemDisplayProperties?> = (elements as
        Array<IMediaItemDisplayProperties?>).castToImpl<IMediaItemDisplayProperties,IMediaItemDisplayProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaItemDisplayProperties?> =
        arrayOfNulls<IMediaItemDisplayProperties_Impl>(size) as Array<IMediaItemDisplayProperties?>
  }
}
