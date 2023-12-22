package Windows.Media.Audio

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

@ABIMarker(ISpatialAudioDeviceConfigurationStatics.ABI::class)
@Signature("{3ec37f7b-936d-4e04-9728-2827d9f758c4}")
@Guid("3ec37f7b936d4e0497282827d9f758c4")
@WinRTInterface("3ec37f7b936d4e0497282827d9f758c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAudioDeviceConfigurationStatics.ByReference::class)
public interface ISpatialAudioDeviceConfigurationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForDeviceId(deviceId: String?): SpatialAudioDeviceConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAudioDeviceConfigurationStatics> {
    public override fun getValue() =
        ABI.makeISpatialAudioDeviceConfigurationStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialAudioDeviceConfigurationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAudioDeviceConfigurationStatics {
    public val __2144580799_Ptr: Pointer?

    public val _2144580799_VtblPtr: Pointer?
      get() = __2144580799_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForDeviceId(deviceId: String?): SpatialAudioDeviceConfiguration? {
      val fnPtr = _2144580799_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialAudioDeviceConfiguration>()
      val hr = fn.invokeHR(arrayOf(__2144580799_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialAudioDeviceConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialAudioDeviceConfigurationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2144580799_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAudioDeviceConfigurationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ec37f7b936d4e0497282827d9f758c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAudioDeviceConfigurationStatics(ptr: Pointer?): WithDefault =
        ISpatialAudioDeviceConfigurationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpatialAudioDeviceConfigurationStatics {
      val address = segment.toRawLongValue()
      return makeISpatialAudioDeviceConfigurationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAudioDeviceConfigurationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2144580799_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAudioDeviceConfigurationStatics):
        Array<ISpatialAudioDeviceConfigurationStatics?> = (elements as
        Array<ISpatialAudioDeviceConfigurationStatics?>).castToImpl<ISpatialAudioDeviceConfigurationStatics,ISpatialAudioDeviceConfigurationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAudioDeviceConfigurationStatics?> =
        arrayOfNulls<ISpatialAudioDeviceConfigurationStatics_Impl>(size) as
        Array<ISpatialAudioDeviceConfigurationStatics?>
  }
}
