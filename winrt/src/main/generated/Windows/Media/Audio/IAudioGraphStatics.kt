package Windows.Media.Audio

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IAudioGraphStatics.ABI::class)
@Signature("{76ec3132-e159-4ab7-a82a-17beb4b31e94}")
@Guid("76ec3132e1594ab7a82a17beb4b31e94")
@WinRTInterface("76ec3132e1594ab7a82a17beb4b31e94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioGraphStatics.ByReference::class)
public interface IAudioGraphStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAsync(settings: AudioGraphSettings?): IAsyncOperation<CreateAudioGraphResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioGraphStatics> {
    public override fun getValue() = ABI.makeIAudioGraphStatics(pointer.getPointer(0))

    public fun setValue(value: IAudioGraphStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioGraphStatics {
    public val __66156539_Ptr: Pointer?

    public val _66156539_VtblPtr: Pointer?
      get() = __66156539_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAsync(settings: AudioGraphSettings?):
        IAsyncOperation<CreateAudioGraphResult?>? {
      val fnPtr = _66156539_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateAudioGraphResult?>>()
      val hr = fn.invokeHR(arrayOf(__66156539_Ptr, marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateAudioGraphResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IAudioGraphStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __66156539_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioGraphStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76ec3132e1594ab7a82a17beb4b31e94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioGraphStatics(ptr: Pointer?): WithDefault = IAudioGraphStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioGraphStatics {
      val address = segment.toRawLongValue()
      return makeIAudioGraphStatics(Pointer(address))
    }

    public override fun toNative(obj: IAudioGraphStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__66156539_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioGraphStatics): Array<IAudioGraphStatics?> =
        (elements as
        Array<IAudioGraphStatics?>).castToImpl<IAudioGraphStatics,IAudioGraphStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioGraphStatics?> =
        arrayOfNulls<IAudioGraphStatics_Impl>(size) as Array<IAudioGraphStatics?>
  }
}
