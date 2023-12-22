package Windows.Media.Capture

import Windows.Media.Core.IMediaSource
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

@ABIMarker(IMediaCaptureInitializationSettings3.ABI::class)
@Signature("{4160519d-be48-4730-8104-0cf6e9e97948}")
@Guid("4160519dbe48473081040cf6e9e97948")
@WinRTInterface("4160519dbe48473081040cf6e9e97948")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureInitializationSettings3.ByReference::class)
public interface IMediaCaptureInitializationSettings3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_AudioSource(value: IMediaSource?): Unit

  @InterfaceMethod(1)
  public fun get_AudioSource(): IMediaSource?

  @InterfaceMethod(2)
  public fun put_VideoSource(value: IMediaSource?): Unit

  @InterfaceMethod(3)
  public fun get_VideoSource(): IMediaSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureInitializationSettings3> {
    public override fun getValue() =
        ABI.makeIMediaCaptureInitializationSettings3(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureInitializationSettings3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureInitializationSettings3 {
    public val __1794820022_Ptr: Pointer?

    public val _1794820022_VtblPtr: Pointer?
      get() = __1794820022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_AudioSource(value: IMediaSource?): Unit {
      val fnPtr = _1794820022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794820022_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_AudioSource(): IMediaSource? {
      val fnPtr = _1794820022_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMediaSource>()
      val hr = fn.invokeHR(arrayOf(__1794820022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_VideoSource(value: IMediaSource?): Unit {
      val fnPtr = _1794820022_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794820022_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_VideoSource(): IMediaSource? {
      val fnPtr = _1794820022_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMediaSource>()
      val hr = fn.invokeHR(arrayOf(__1794820022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMediaSource>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureInitializationSettings3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1794820022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureInitializationSettings3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4160519dbe48473081040cf6e9e97948")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureInitializationSettings3(ptr: Pointer?): WithDefault =
        IMediaCaptureInitializationSettings3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureInitializationSettings3 {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureInitializationSettings3(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureInitializationSettings3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1794820022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureInitializationSettings3):
        Array<IMediaCaptureInitializationSettings3?> = (elements as
        Array<IMediaCaptureInitializationSettings3?>).castToImpl<IMediaCaptureInitializationSettings3,IMediaCaptureInitializationSettings3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureInitializationSettings3?> =
        arrayOfNulls<IMediaCaptureInitializationSettings3_Impl>(size) as
        Array<IMediaCaptureInitializationSettings3?>
  }
}
