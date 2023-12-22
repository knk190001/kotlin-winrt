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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAudioEncodingPropertiesStatics2.ABI::class)
@Signature("{7489316f-77a0-433d-8ed5-4040280e8665}")
@Guid("7489316f77a0433d8ed54040280e8665")
@WinRTInterface("7489316f77a0433d8ed54040280e8665")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioEncodingPropertiesStatics2.ByReference::class)
public interface IAudioEncodingPropertiesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAlac(
    sampleRate: WinDef.UINT,
    channelCount: WinDef.UINT,
    bitsPerSample: WinDef.UINT
  ): AudioEncodingProperties?

  @InterfaceMethod(1)
  public fun CreateFlac(
    sampleRate: WinDef.UINT,
    channelCount: WinDef.UINT,
    bitsPerSample: WinDef.UINT
  ): AudioEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioEncodingPropertiesStatics2> {
    public override fun getValue() = ABI.makeIAudioEncodingPropertiesStatics2(pointer.getPointer(0))

    public fun setValue(value: IAudioEncodingPropertiesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioEncodingPropertiesStatics2 {
    public val __1130684834_Ptr: Pointer?

    public val _1130684834_VtblPtr: Pointer?
      get() = __1130684834_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAlac(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitsPerSample: WinDef.UINT
    ): AudioEncodingProperties? {
      val fnPtr = _1130684834_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1130684834_Ptr, sampleRate, channelCount, bitsPerSample,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFlac(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitsPerSample: WinDef.UINT
    ): AudioEncodingProperties? {
      val fnPtr = _1130684834_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1130684834_Ptr, sampleRate, channelCount, bitsPerSample,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IAudioEncodingPropertiesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1130684834_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioEncodingPropertiesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7489316f77a0433d8ed54040280e8665")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioEncodingPropertiesStatics2(ptr: Pointer?): WithDefault =
        IAudioEncodingPropertiesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioEncodingPropertiesStatics2 {
      val address = segment.toRawLongValue()
      return makeIAudioEncodingPropertiesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAudioEncodingPropertiesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1130684834_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioEncodingPropertiesStatics2):
        Array<IAudioEncodingPropertiesStatics2?> = (elements as
        Array<IAudioEncodingPropertiesStatics2?>).castToImpl<IAudioEncodingPropertiesStatics2,IAudioEncodingPropertiesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioEncodingPropertiesStatics2?> =
        arrayOfNulls<IAudioEncodingPropertiesStatics2_Impl>(size) as
        Array<IAudioEncodingPropertiesStatics2?>
  }
}
