package Windows.Media.MediaProperties

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import Windows.Media.Core.AudioStreamDescriptor
import Windows.Media.Core.VideoStreamDescriptor
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

@ABIMarker(IMediaEncodingProfile2.ABI::class)
@Signature("{349b3e0a-4035-488e-9877-85632865ed10}")
@Guid("349b3e0a4035488e987785632865ed10")
@WinRTInterface("349b3e0a4035488e987785632865ed10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingProfile2.ByReference::class)
public interface IMediaEncodingProfile2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetAudioTracks(value: IIterable<AudioStreamDescriptor?>?): Unit

  @InterfaceMethod(1)
  public fun GetAudioTracks(): IVector<AudioStreamDescriptor?>?

  @InterfaceMethod(2)
  public fun SetVideoTracks(value: IIterable<VideoStreamDescriptor?>?): Unit

  @InterfaceMethod(3)
  public fun GetVideoTracks(): IVector<VideoStreamDescriptor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingProfile2> {
    public override fun getValue() = ABI.makeIMediaEncodingProfile2(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingProfile2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingProfile2 {
    public val __1149765753_Ptr: Pointer?

    public val _1149765753_VtblPtr: Pointer?
      get() = __1149765753_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetAudioTracks(value: IIterable<AudioStreamDescriptor?>?): Unit {
      val fnPtr = _1149765753_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1149765753_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetAudioTracks(): IVector<AudioStreamDescriptor?>? {
      val fnPtr = _1149765753_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AudioStreamDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1149765753_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AudioStreamDescriptor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetVideoTracks(value: IIterable<VideoStreamDescriptor?>?): Unit {
      val fnPtr = _1149765753_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1149765753_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetVideoTracks(): IVector<VideoStreamDescriptor?>? {
      val fnPtr = _1149765753_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VideoStreamDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1149765753_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VideoStreamDescriptor?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingProfile2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1149765753_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingProfile2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("349b3e0a4035488e987785632865ed10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingProfile2(ptr: Pointer?): WithDefault =
        IMediaEncodingProfile2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingProfile2 {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingProfile2(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingProfile2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1149765753_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingProfile2): Array<IMediaEncodingProfile2?> =
        (elements as
        Array<IMediaEncodingProfile2?>).castToImpl<IMediaEncodingProfile2,IMediaEncodingProfile2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingProfile2?> =
        arrayOfNulls<IMediaEncodingProfile2_Impl>(size) as Array<IMediaEncodingProfile2?>
  }
}
