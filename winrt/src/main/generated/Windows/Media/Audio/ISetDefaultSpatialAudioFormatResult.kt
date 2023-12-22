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

@ABIMarker(ISetDefaultSpatialAudioFormatResult.ABI::class)
@Signature("{1c2aa511-1400-5e70-9ea9-ae151241e8ea}")
@Guid("1c2aa51114005e709ea9ae151241e8ea")
@WinRTInterface("1c2aa51114005e709ea9ae151241e8ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISetDefaultSpatialAudioFormatResult.ByReference::class)
public interface ISetDefaultSpatialAudioFormatResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): SetDefaultSpatialAudioFormatStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISetDefaultSpatialAudioFormatResult> {
    public override fun getValue() =
        ABI.makeISetDefaultSpatialAudioFormatResult(pointer.getPointer(0))

    public fun setValue(value: ISetDefaultSpatialAudioFormatResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISetDefaultSpatialAudioFormatResult {
    public val __685281171_Ptr: Pointer?

    public val _685281171_VtblPtr: Pointer?
      get() = __685281171_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): SetDefaultSpatialAudioFormatStatus? {
      val fnPtr = _685281171_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SetDefaultSpatialAudioFormatStatus>()
      val hr = fn.invokeHR(arrayOf(__685281171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SetDefaultSpatialAudioFormatStatus>(result.getValue())
      return resultValue
    }
  }

  public class ISetDefaultSpatialAudioFormatResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __685281171_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISetDefaultSpatialAudioFormatResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c2aa51114005e709ea9ae151241e8ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISetDefaultSpatialAudioFormatResult(ptr: Pointer?): WithDefault =
        ISetDefaultSpatialAudioFormatResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISetDefaultSpatialAudioFormatResult {
      val address = segment.toRawLongValue()
      return makeISetDefaultSpatialAudioFormatResult(Pointer(address))
    }

    public override fun toNative(obj: ISetDefaultSpatialAudioFormatResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__685281171_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISetDefaultSpatialAudioFormatResult):
        Array<ISetDefaultSpatialAudioFormatResult?> = (elements as
        Array<ISetDefaultSpatialAudioFormatResult?>).castToImpl<ISetDefaultSpatialAudioFormatResult,ISetDefaultSpatialAudioFormatResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISetDefaultSpatialAudioFormatResult?> =
        arrayOfNulls<ISetDefaultSpatialAudioFormatResult_Impl>(size) as
        Array<ISetDefaultSpatialAudioFormatResult?>
  }
}
