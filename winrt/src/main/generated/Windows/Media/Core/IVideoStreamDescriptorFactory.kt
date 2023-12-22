package Windows.Media.Core

import Windows.Media.MediaProperties.VideoEncodingProperties
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

@ABIMarker(IVideoStreamDescriptorFactory.ABI::class)
@Signature("{494ef6d1-bb75-43d2-9e5e-7b79a3afced4}")
@Guid("494ef6d1bb7543d29e5e7b79a3afced4")
@WinRTInterface("494ef6d1bb7543d29e5e7b79a3afced4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoStreamDescriptorFactory.ByReference::class)
public interface IVideoStreamDescriptorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(encodingProperties: VideoEncodingProperties?): VideoStreamDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoStreamDescriptorFactory> {
    public override fun getValue() = ABI.makeIVideoStreamDescriptorFactory(pointer.getPointer(0))

    public fun setValue(value: IVideoStreamDescriptorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoStreamDescriptorFactory {
    public val __219494059_Ptr: Pointer?

    public val _219494059_VtblPtr: Pointer?
      get() = __219494059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(encodingProperties: VideoEncodingProperties?):
        VideoStreamDescriptor? {
      val fnPtr = _219494059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoStreamDescriptor>()
      val hr = fn.invokeHR(arrayOf(__219494059_Ptr, marshalToNative(encodingProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoStreamDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class IVideoStreamDescriptorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __219494059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoStreamDescriptorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("494ef6d1bb7543d29e5e7b79a3afced4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoStreamDescriptorFactory(ptr: Pointer?): WithDefault =
        IVideoStreamDescriptorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoStreamDescriptorFactory {
      val address = segment.toRawLongValue()
      return makeIVideoStreamDescriptorFactory(Pointer(address))
    }

    public override fun toNative(obj: IVideoStreamDescriptorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__219494059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoStreamDescriptorFactory):
        Array<IVideoStreamDescriptorFactory?> = (elements as
        Array<IVideoStreamDescriptorFactory?>).castToImpl<IVideoStreamDescriptorFactory,IVideoStreamDescriptorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoStreamDescriptorFactory?> =
        arrayOfNulls<IVideoStreamDescriptorFactory_Impl>(size) as
        Array<IVideoStreamDescriptorFactory?>
  }
}
