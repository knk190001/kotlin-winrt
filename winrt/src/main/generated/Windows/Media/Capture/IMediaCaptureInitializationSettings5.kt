package Windows.Media.Capture

import Windows.Media.Capture.Frames.MediaFrameSourceGroup
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

@ABIMarker(IMediaCaptureInitializationSettings5.ABI::class)
@Signature("{d5a2e3b8-2626-4e94-b7b3-5308a0f64b1a}")
@Guid("d5a2e3b826264e94b7b35308a0f64b1a")
@WinRTInterface("d5a2e3b826264e94b7b35308a0f64b1a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureInitializationSettings5.ByReference::class)
public interface IMediaCaptureInitializationSettings5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceGroup(): MediaFrameSourceGroup?

  @InterfaceMethod(1)
  public fun put_SourceGroup(value: MediaFrameSourceGroup?): Unit

  @InterfaceMethod(2)
  public fun get_SharingMode(): MediaCaptureSharingMode?

  @InterfaceMethod(3)
  public fun put_SharingMode(value: MediaCaptureSharingMode?): Unit

  @InterfaceMethod(4)
  public fun get_MemoryPreference(): MediaCaptureMemoryPreference?

  @InterfaceMethod(5)
  public fun put_MemoryPreference(value: MediaCaptureMemoryPreference?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureInitializationSettings5> {
    public override fun getValue() =
        ABI.makeIMediaCaptureInitializationSettings5(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureInitializationSettings5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureInitializationSettings5 {
    public val __1794820024_Ptr: Pointer?

    public val _1794820024_VtblPtr: Pointer?
      get() = __1794820024_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceGroup(): MediaFrameSourceGroup? {
      val fnPtr = _1794820024_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameSourceGroup>()
      val hr = fn.invokeHR(arrayOf(__1794820024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameSourceGroup>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SourceGroup(value: MediaFrameSourceGroup?): Unit {
      val fnPtr = _1794820024_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794820024_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SharingMode(): MediaCaptureSharingMode? {
      val fnPtr = _1794820024_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureSharingMode>()
      val hr = fn.invokeHR(arrayOf(__1794820024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaCaptureSharingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SharingMode(value: MediaCaptureSharingMode?): Unit {
      val fnPtr = _1794820024_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794820024_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MemoryPreference(): MediaCaptureMemoryPreference? {
      val fnPtr = _1794820024_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureMemoryPreference>()
      val hr = fn.invokeHR(arrayOf(__1794820024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaCaptureMemoryPreference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_MemoryPreference(value: MediaCaptureMemoryPreference?): Unit {
      val fnPtr = _1794820024_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794820024_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaCaptureInitializationSettings5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1794820024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureInitializationSettings5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5a2e3b826264e94b7b35308a0f64b1a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureInitializationSettings5(ptr: Pointer?): WithDefault =
        IMediaCaptureInitializationSettings5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureInitializationSettings5 {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureInitializationSettings5(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureInitializationSettings5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1794820024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureInitializationSettings5):
        Array<IMediaCaptureInitializationSettings5?> = (elements as
        Array<IMediaCaptureInitializationSettings5?>).castToImpl<IMediaCaptureInitializationSettings5,IMediaCaptureInitializationSettings5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureInitializationSettings5?> =
        arrayOfNulls<IMediaCaptureInitializationSettings5_Impl>(size) as
        Array<IMediaCaptureInitializationSettings5?>
  }
}
