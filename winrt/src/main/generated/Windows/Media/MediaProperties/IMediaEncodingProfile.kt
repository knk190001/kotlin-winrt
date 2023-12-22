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

@ABIMarker(IMediaEncodingProfile.ABI::class)
@Signature("{e7dbf5a8-1db9-4783-876b-3dfe12acfdb3}")
@Guid("e7dbf5a81db94783876b3dfe12acfdb3")
@WinRTInterface("e7dbf5a81db94783876b3dfe12acfdb3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingProfile.ByReference::class)
public interface IMediaEncodingProfile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Audio(value: AudioEncodingProperties?): Unit

  @InterfaceMethod(1)
  public fun get_Audio(): AudioEncodingProperties?

  @InterfaceMethod(2)
  public fun put_Video(value: VideoEncodingProperties?): Unit

  @InterfaceMethod(3)
  public fun get_Video(): VideoEncodingProperties?

  @InterfaceMethod(4)
  public fun put_Container(value: ContainerEncodingProperties?): Unit

  @InterfaceMethod(5)
  public fun get_Container(): ContainerEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingProfile> {
    public override fun getValue() = ABI.makeIMediaEncodingProfile(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingProfile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingProfile {
    public val __868373209_Ptr: Pointer?

    public val _868373209_VtblPtr: Pointer?
      get() = __868373209_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Audio(value: AudioEncodingProperties?): Unit {
      val fnPtr = _868373209_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__868373209_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Audio(): AudioEncodingProperties? {
      val fnPtr = _868373209_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__868373209_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Video(value: VideoEncodingProperties?): Unit {
      val fnPtr = _868373209_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__868373209_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Video(): VideoEncodingProperties? {
      val fnPtr = _868373209_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__868373209_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Container(value: ContainerEncodingProperties?): Unit {
      val fnPtr = _868373209_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__868373209_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Container(): ContainerEncodingProperties? {
      val fnPtr = _868373209_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContainerEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__868373209_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContainerEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingProfile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __868373209_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingProfile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7dbf5a81db94783876b3dfe12acfdb3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingProfile(ptr: Pointer?): WithDefault =
        IMediaEncodingProfile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingProfile {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingProfile(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__868373209_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingProfile): Array<IMediaEncodingProfile?> =
        (elements as
        Array<IMediaEncodingProfile?>).castToImpl<IMediaEncodingProfile,IMediaEncodingProfile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingProfile?> =
        arrayOfNulls<IMediaEncodingProfile_Impl>(size) as Array<IMediaEncodingProfile?>
  }
}
