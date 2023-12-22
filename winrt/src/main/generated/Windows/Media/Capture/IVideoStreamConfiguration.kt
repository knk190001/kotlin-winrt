package Windows.Media.Capture

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

@ABIMarker(IVideoStreamConfiguration.ABI::class)
@Signature("{d8770a6f-4390-4b5e-ad3e-0f8af0963490}")
@Guid("d8770a6f43904b5ead3e0f8af0963490")
@WinRTInterface("d8770a6f43904b5ead3e0f8af0963490")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoStreamConfiguration.ByReference::class)
public interface IVideoStreamConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InputProperties(): VideoEncodingProperties?

  @InterfaceMethod(1)
  public fun get_OutputProperties(): VideoEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoStreamConfiguration> {
    public override fun getValue() = ABI.makeIVideoStreamConfiguration(pointer.getPointer(0))

    public fun setValue(value: IVideoStreamConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoStreamConfiguration {
    public val __560403635_Ptr: Pointer?

    public val _560403635_VtblPtr: Pointer?
      get() = __560403635_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InputProperties(): VideoEncodingProperties? {
      val fnPtr = _560403635_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__560403635_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OutputProperties(): VideoEncodingProperties? {
      val fnPtr = _560403635_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__560403635_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IVideoStreamConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __560403635_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoStreamConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d8770a6f43904b5ead3e0f8af0963490")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoStreamConfiguration(ptr: Pointer?): WithDefault =
        IVideoStreamConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoStreamConfiguration {
      val address = segment.toRawLongValue()
      return makeIVideoStreamConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IVideoStreamConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__560403635_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoStreamConfiguration):
        Array<IVideoStreamConfiguration?> = (elements as
        Array<IVideoStreamConfiguration?>).castToImpl<IVideoStreamConfiguration,IVideoStreamConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoStreamConfiguration?> =
        arrayOfNulls<IVideoStreamConfiguration_Impl>(size) as Array<IVideoStreamConfiguration?>
  }
}
