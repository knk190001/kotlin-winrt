package Windows.Media.Audio

import Windows.Media.Render.AudioRenderCategory
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

@ABIMarker(IAudioGraphSettingsFactory.ABI::class)
@Signature("{a5d91cc6-c2eb-4a61-a214-1d66d75f83da}")
@Guid("a5d91cc6c2eb4a61a2141d66d75f83da")
@WinRTInterface("a5d91cc6c2eb4a61a2141d66d75f83da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioGraphSettingsFactory.ByReference::class)
public interface IAudioGraphSettingsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(audioRenderCategory: AudioRenderCategory?): AudioGraphSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioGraphSettingsFactory> {
    public override fun getValue() = ABI.makeIAudioGraphSettingsFactory(pointer.getPointer(0))

    public fun setValue(value: IAudioGraphSettingsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioGraphSettingsFactory {
    public val __508884903_Ptr: Pointer?

    public val _508884903_VtblPtr: Pointer?
      get() = __508884903_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(audioRenderCategory: AudioRenderCategory?): AudioGraphSettings? {
      val fnPtr = _508884903_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioGraphSettings>()
      val hr = fn.invokeHR(arrayOf(__508884903_Ptr, marshalToNative(audioRenderCategory), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioGraphSettings>(result.getValue())
      return resultValue
    }
  }

  public class IAudioGraphSettingsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __508884903_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioGraphSettingsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a5d91cc6c2eb4a61a2141d66d75f83da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioGraphSettingsFactory(ptr: Pointer?): WithDefault =
        IAudioGraphSettingsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioGraphSettingsFactory {
      val address = segment.toRawLongValue()
      return makeIAudioGraphSettingsFactory(Pointer(address))
    }

    public override fun toNative(obj: IAudioGraphSettingsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__508884903_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioGraphSettingsFactory):
        Array<IAudioGraphSettingsFactory?> = (elements as
        Array<IAudioGraphSettingsFactory?>).castToImpl<IAudioGraphSettingsFactory,IAudioGraphSettingsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioGraphSettingsFactory?> =
        arrayOfNulls<IAudioGraphSettingsFactory_Impl>(size) as Array<IAudioGraphSettingsFactory?>
  }
}
