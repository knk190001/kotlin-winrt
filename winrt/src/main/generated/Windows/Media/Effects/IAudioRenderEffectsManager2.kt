package Windows.Media.Effects

import Windows.Storage.Streams.IRandomAccessStreamWithContentType
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioRenderEffectsManager2.ABI::class)
@Signature("{a844cd09-5ecc-44b3-bb4e-1db07287139c}")
@Guid("a844cd095ecc44b3bb4e1db07287139c")
@WinRTInterface("a844cd095ecc44b3bb4e1db07287139c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioRenderEffectsManager2.ByReference::class)
public interface IAudioRenderEffectsManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EffectsProviderThumbnail(): IRandomAccessStreamWithContentType?

  @InterfaceMethod(1)
  public fun get_EffectsProviderSettingsLabel(): String?

  @InterfaceMethod(2)
  public fun ShowSettingsUI(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioRenderEffectsManager2> {
    public override fun getValue() = ABI.makeIAudioRenderEffectsManager2(pointer.getPointer(0))

    public fun setValue(value: IAudioRenderEffectsManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioRenderEffectsManager2 {
    public val __2028956983_Ptr: Pointer?

    public val _2028956983_VtblPtr: Pointer?
      get() = __2028956983_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EffectsProviderThumbnail(): IRandomAccessStreamWithContentType? {
      val fnPtr = _2028956983_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamWithContentType>()
      val hr = fn.invokeHR(arrayOf(__2028956983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamWithContentType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EffectsProviderSettingsLabel(): String? {
      val fnPtr = _2028956983_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2028956983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ShowSettingsUI(): Unit {
      val fnPtr = _2028956983_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2028956983_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAudioRenderEffectsManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2028956983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioRenderEffectsManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a844cd095ecc44b3bb4e1db07287139c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioRenderEffectsManager2(ptr: Pointer?): WithDefault =
        IAudioRenderEffectsManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioRenderEffectsManager2 {
      val address = segment.toRawLongValue()
      return makeIAudioRenderEffectsManager2(Pointer(address))
    }

    public override fun toNative(obj: IAudioRenderEffectsManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2028956983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioRenderEffectsManager2):
        Array<IAudioRenderEffectsManager2?> = (elements as
        Array<IAudioRenderEffectsManager2?>).castToImpl<IAudioRenderEffectsManager2,IAudioRenderEffectsManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioRenderEffectsManager2?> =
        arrayOfNulls<IAudioRenderEffectsManager2_Impl>(size) as Array<IAudioRenderEffectsManager2?>
  }
}
