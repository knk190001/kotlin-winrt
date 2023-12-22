package Windows.Media.Playback

import Windows.Media.Core.IMediaSource
import Windows.Media.Protection.MediaProtectionManager
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IMediaPlayerSource.ABI::class)
@Signature("{bd4f8897-1423-4c3e-82c5-0fb1af94f715}")
@Guid("bd4f889714234c3e82c50fb1af94f715")
@WinRTInterface("bd4f889714234c3e82c50fb1af94f715")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerSource.ByReference::class)
public interface IMediaPlayerSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProtectionManager(): MediaProtectionManager?

  @InterfaceMethod(1)
  public fun put_ProtectionManager(value: MediaProtectionManager?): Unit

  @InterfaceMethod(2)
  public fun SetFileSource(`file`: IStorageFile?): Unit

  @InterfaceMethod(3)
  public fun SetStreamSource(stream: IRandomAccessStream?): Unit

  @InterfaceMethod(4)
  public fun SetMediaSource(source: IMediaSource?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerSource> {
    public override fun getValue() = ABI.makeIMediaPlayerSource(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerSource {
    public val __411108569_Ptr: Pointer?

    public val _411108569_VtblPtr: Pointer?
      get() = __411108569_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProtectionManager(): MediaProtectionManager? {
      val fnPtr = _411108569_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaProtectionManager>()
      val hr = fn.invokeHR(arrayOf(__411108569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaProtectionManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ProtectionManager(value: MediaProtectionManager?): Unit {
      val fnPtr = _411108569_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__411108569_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetFileSource(`file`: IStorageFile?): Unit {
      val fnPtr = _411108569_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__411108569_Ptr, marshalToNative(file),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetStreamSource(stream: IRandomAccessStream?): Unit {
      val fnPtr = _411108569_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__411108569_Ptr, marshalToNative(stream),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetMediaSource(source: IMediaSource?): Unit {
      val fnPtr = _411108569_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__411108569_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlayerSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __411108569_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd4f889714234c3e82c50fb1af94f715")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerSource(ptr: Pointer?): WithDefault = IMediaPlayerSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerSource {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerSource(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__411108569_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerSource): Array<IMediaPlayerSource?> =
        (elements as
        Array<IMediaPlayerSource?>).castToImpl<IMediaPlayerSource,IMediaPlayerSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerSource?> =
        arrayOfNulls<IMediaPlayerSource_Impl>(size) as Array<IMediaPlayerSource?>
  }
}
