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

@ABIMarker(IAudioEncodingPropertiesStatics.ABI::class)
@Signature("{0cad332c-ebe9-4527-b36d-e42a13cf38db}")
@Guid("0cad332cebe94527b36de42a13cf38db")
@WinRTInterface("0cad332cebe94527b36de42a13cf38db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioEncodingPropertiesStatics.ByReference::class)
public interface IAudioEncodingPropertiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAac(
    sampleRate: WinDef.UINT,
    channelCount: WinDef.UINT,
    bitrate: WinDef.UINT
  ): AudioEncodingProperties?

  @InterfaceMethod(1)
  public fun CreateAacAdts(
    sampleRate: WinDef.UINT,
    channelCount: WinDef.UINT,
    bitrate: WinDef.UINT
  ): AudioEncodingProperties?

  @InterfaceMethod(2)
  public fun CreateMp3(
    sampleRate: WinDef.UINT,
    channelCount: WinDef.UINT,
    bitrate: WinDef.UINT
  ): AudioEncodingProperties?

  @InterfaceMethod(3)
  public fun CreatePcm(
    sampleRate: WinDef.UINT,
    channelCount: WinDef.UINT,
    bitsPerSample: WinDef.UINT
  ): AudioEncodingProperties?

  @InterfaceMethod(4)
  public fun CreateWma(
    sampleRate: WinDef.UINT,
    channelCount: WinDef.UINT,
    bitrate: WinDef.UINT
  ): AudioEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioEncodingPropertiesStatics> {
    public override fun getValue() = ABI.makeIAudioEncodingPropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: IAudioEncodingPropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioEncodingPropertiesStatics {
    public val __1421947024_Ptr: Pointer?

    public val _1421947024_VtblPtr: Pointer?
      get() = __1421947024_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAac(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitrate: WinDef.UINT
    ): AudioEncodingProperties? {
      val fnPtr = _1421947024_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1421947024_Ptr, sampleRate, channelCount, bitrate, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateAacAdts(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitrate: WinDef.UINT
    ): AudioEncodingProperties? {
      val fnPtr = _1421947024_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1421947024_Ptr, sampleRate, channelCount, bitrate, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateMp3(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitrate: WinDef.UINT
    ): AudioEncodingProperties? {
      val fnPtr = _1421947024_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1421947024_Ptr, sampleRate, channelCount, bitrate, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreatePcm(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitsPerSample: WinDef.UINT
    ): AudioEncodingProperties? {
      val fnPtr = _1421947024_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1421947024_Ptr, sampleRate, channelCount, bitsPerSample,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateWma(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitrate: WinDef.UINT
    ): AudioEncodingProperties? {
      val fnPtr = _1421947024_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1421947024_Ptr, sampleRate, channelCount, bitrate, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IAudioEncodingPropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1421947024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioEncodingPropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0cad332cebe94527b36de42a13cf38db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioEncodingPropertiesStatics(ptr: Pointer?): WithDefault =
        IAudioEncodingPropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioEncodingPropertiesStatics {
      val address = segment.toRawLongValue()
      return makeIAudioEncodingPropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IAudioEncodingPropertiesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1421947024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioEncodingPropertiesStatics):
        Array<IAudioEncodingPropertiesStatics?> = (elements as
        Array<IAudioEncodingPropertiesStatics?>).castToImpl<IAudioEncodingPropertiesStatics,IAudioEncodingPropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioEncodingPropertiesStatics?> =
        arrayOfNulls<IAudioEncodingPropertiesStatics_Impl>(size) as
        Array<IAudioEncodingPropertiesStatics?>
  }
}
