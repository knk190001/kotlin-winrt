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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialAudioFormatConfigurationStatics.ABI::class)
@Signature("{2b5fef71-67c9-4e5f-a35b-41680711f8c7}")
@Guid("2b5fef7167c94e5fa35b41680711f8c7")
@WinRTInterface("2b5fef7167c94e5fa35b41680711f8c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAudioFormatConfigurationStatics.ByReference::class)
public interface ISpatialAudioFormatConfigurationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): SpatialAudioFormatConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAudioFormatConfigurationStatics> {
    public override fun getValue() =
        ABI.makeISpatialAudioFormatConfigurationStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialAudioFormatConfigurationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAudioFormatConfigurationStatics {
    public val __1777044512_Ptr: Pointer?

    public val _1777044512_VtblPtr: Pointer?
      get() = __1777044512_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): SpatialAudioFormatConfiguration? {
      val fnPtr = _1777044512_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialAudioFormatConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1777044512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialAudioFormatConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialAudioFormatConfigurationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1777044512_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAudioFormatConfigurationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b5fef7167c94e5fa35b41680711f8c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAudioFormatConfigurationStatics(ptr: Pointer?): WithDefault =
        ISpatialAudioFormatConfigurationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpatialAudioFormatConfigurationStatics {
      val address = segment.toRawLongValue()
      return makeISpatialAudioFormatConfigurationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAudioFormatConfigurationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1777044512_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAudioFormatConfigurationStatics):
        Array<ISpatialAudioFormatConfigurationStatics?> = (elements as
        Array<ISpatialAudioFormatConfigurationStatics?>).castToImpl<ISpatialAudioFormatConfigurationStatics,ISpatialAudioFormatConfigurationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAudioFormatConfigurationStatics?> =
        arrayOfNulls<ISpatialAudioFormatConfigurationStatics_Impl>(size) as
        Array<ISpatialAudioFormatConfigurationStatics?>
  }
}
