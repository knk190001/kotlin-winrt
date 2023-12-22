package Windows.Media.Capture

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

@ABIMarker(IMediaCaptureInitializationSettings4.ABI::class)
@Signature("{f502a537-4cb7-4d28-95ed-4f9f012e0518}")
@Guid("f502a5374cb74d2895ed4f9f012e0518")
@WinRTInterface("f502a5374cb74d2895ed4f9f012e0518")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureInitializationSettings4.ByReference::class)
public interface IMediaCaptureInitializationSettings4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoProfile(): MediaCaptureVideoProfile?

  @InterfaceMethod(1)
  public fun put_VideoProfile(value: MediaCaptureVideoProfile?): Unit

  @InterfaceMethod(2)
  public fun get_PreviewMediaDescription(): MediaCaptureVideoProfileMediaDescription?

  @InterfaceMethod(3)
  public fun put_PreviewMediaDescription(value: MediaCaptureVideoProfileMediaDescription?): Unit

  @InterfaceMethod(4)
  public fun get_RecordMediaDescription(): MediaCaptureVideoProfileMediaDescription?

  @InterfaceMethod(5)
  public fun put_RecordMediaDescription(value: MediaCaptureVideoProfileMediaDescription?): Unit

  @InterfaceMethod(6)
  public fun get_PhotoMediaDescription(): MediaCaptureVideoProfileMediaDescription?

  @InterfaceMethod(7)
  public fun put_PhotoMediaDescription(value: MediaCaptureVideoProfileMediaDescription?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureInitializationSettings4> {
    public override fun getValue() =
        ABI.makeIMediaCaptureInitializationSettings4(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureInitializationSettings4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureInitializationSettings4 {
    public val __1794820023_Ptr: Pointer?

    public val _1794820023_VtblPtr: Pointer?
      get() = __1794820023_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoProfile(): MediaCaptureVideoProfile? {
      val fnPtr = _1794820023_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureVideoProfile>()
      val hr = fn.invokeHR(arrayOf(__1794820023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaCaptureVideoProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_VideoProfile(value: MediaCaptureVideoProfile?): Unit {
      val fnPtr = _1794820023_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794820023_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PreviewMediaDescription(): MediaCaptureVideoProfileMediaDescription? {
      val fnPtr = _1794820023_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureVideoProfileMediaDescription>()
      val hr = fn.invokeHR(arrayOf(__1794820023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaCaptureVideoProfileMediaDescription>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun put_PreviewMediaDescription(value: MediaCaptureVideoProfileMediaDescription?): Unit {
      val fnPtr = _1794820023_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794820023_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RecordMediaDescription(): MediaCaptureVideoProfileMediaDescription? {
      val fnPtr = _1794820023_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureVideoProfileMediaDescription>()
      val hr = fn.invokeHR(arrayOf(__1794820023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaCaptureVideoProfileMediaDescription>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override
        fun put_RecordMediaDescription(value: MediaCaptureVideoProfileMediaDescription?): Unit {
      val fnPtr = _1794820023_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794820023_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PhotoMediaDescription(): MediaCaptureVideoProfileMediaDescription? {
      val fnPtr = _1794820023_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureVideoProfileMediaDescription>()
      val hr = fn.invokeHR(arrayOf(__1794820023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaCaptureVideoProfileMediaDescription>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PhotoMediaDescription(value: MediaCaptureVideoProfileMediaDescription?):
        Unit {
      val fnPtr = _1794820023_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794820023_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaCaptureInitializationSettings4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1794820023_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureInitializationSettings4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f502a5374cb74d2895ed4f9f012e0518")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureInitializationSettings4(ptr: Pointer?): WithDefault =
        IMediaCaptureInitializationSettings4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureInitializationSettings4 {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureInitializationSettings4(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureInitializationSettings4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1794820023_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureInitializationSettings4):
        Array<IMediaCaptureInitializationSettings4?> = (elements as
        Array<IMediaCaptureInitializationSettings4?>).castToImpl<IMediaCaptureInitializationSettings4,IMediaCaptureInitializationSettings4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureInitializationSettings4?> =
        arrayOfNulls<IMediaCaptureInitializationSettings4_Impl>(size) as
        Array<IMediaCaptureInitializationSettings4?>
  }
}
