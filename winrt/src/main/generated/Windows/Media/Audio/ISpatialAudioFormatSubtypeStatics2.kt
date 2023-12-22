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

@ABIMarker(ISpatialAudioFormatSubtypeStatics2.ABI::class)
@Signature("{4565e6cb-d95b-5621-b6af-0e8849c57c80}")
@Guid("4565e6cbd95b5621b6af0e8849c57c80")
@WinRTInterface("4565e6cbd95b5621b6af0e8849c57c80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAudioFormatSubtypeStatics2.ByReference::class)
public interface ISpatialAudioFormatSubtypeStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DTSXForHomeTheater(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAudioFormatSubtypeStatics2> {
    public override fun getValue() =
        ABI.makeISpatialAudioFormatSubtypeStatics2(pointer.getPointer(0))

    public fun setValue(value: ISpatialAudioFormatSubtypeStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAudioFormatSubtypeStatics2 {
    public val __175344662_Ptr: Pointer?

    public val _175344662_VtblPtr: Pointer?
      get() = __175344662_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DTSXForHomeTheater(): String? {
      val fnPtr = _175344662_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__175344662_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialAudioFormatSubtypeStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __175344662_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAudioFormatSubtypeStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4565e6cbd95b5621b6af0e8849c57c80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAudioFormatSubtypeStatics2(ptr: Pointer?): WithDefault =
        ISpatialAudioFormatSubtypeStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialAudioFormatSubtypeStatics2 {
      val address = segment.toRawLongValue()
      return makeISpatialAudioFormatSubtypeStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAudioFormatSubtypeStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__175344662_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAudioFormatSubtypeStatics2):
        Array<ISpatialAudioFormatSubtypeStatics2?> = (elements as
        Array<ISpatialAudioFormatSubtypeStatics2?>).castToImpl<ISpatialAudioFormatSubtypeStatics2,ISpatialAudioFormatSubtypeStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAudioFormatSubtypeStatics2?> =
        arrayOfNulls<ISpatialAudioFormatSubtypeStatics2_Impl>(size) as
        Array<ISpatialAudioFormatSubtypeStatics2?>
  }
}
