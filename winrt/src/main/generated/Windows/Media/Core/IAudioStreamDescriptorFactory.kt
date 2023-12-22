package Windows.Media.Core

import Windows.Media.MediaProperties.AudioEncodingProperties
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

@ABIMarker(IAudioStreamDescriptorFactory.ABI::class)
@Signature("{4a86ce9e-4cb1-4380-8e0c-83504b7f5bf3}")
@Guid("4a86ce9e4cb143808e0c83504b7f5bf3")
@WinRTInterface("4a86ce9e4cb143808e0c83504b7f5bf3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioStreamDescriptorFactory.ByReference::class)
public interface IAudioStreamDescriptorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(encodingProperties: AudioEncodingProperties?): AudioStreamDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioStreamDescriptorFactory> {
    public override fun getValue() = ABI.makeIAudioStreamDescriptorFactory(pointer.getPointer(0))

    public fun setValue(value: IAudioStreamDescriptorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioStreamDescriptorFactory {
    public val __229430374_Ptr: Pointer?

    public val _229430374_VtblPtr: Pointer?
      get() = __229430374_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(encodingProperties: AudioEncodingProperties?):
        AudioStreamDescriptor? {
      val fnPtr = _229430374_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioStreamDescriptor>()
      val hr = fn.invokeHR(arrayOf(__229430374_Ptr, marshalToNative(encodingProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioStreamDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class IAudioStreamDescriptorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __229430374_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioStreamDescriptorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a86ce9e4cb143808e0c83504b7f5bf3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioStreamDescriptorFactory(ptr: Pointer?): WithDefault =
        IAudioStreamDescriptorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioStreamDescriptorFactory {
      val address = segment.toRawLongValue()
      return makeIAudioStreamDescriptorFactory(Pointer(address))
    }

    public override fun toNative(obj: IAudioStreamDescriptorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__229430374_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioStreamDescriptorFactory):
        Array<IAudioStreamDescriptorFactory?> = (elements as
        Array<IAudioStreamDescriptorFactory?>).castToImpl<IAudioStreamDescriptorFactory,IAudioStreamDescriptorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioStreamDescriptorFactory?> =
        arrayOfNulls<IAudioStreamDescriptorFactory_Impl>(size) as
        Array<IAudioStreamDescriptorFactory?>
  }
}
