package Windows.ApplicationModel.VoiceCommands

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

@ABIMarker(IVoiceCommandDisambiguationResult.ABI::class)
@Signature("{ecc68cfe-c9ac-45df-a8ea-feea08ef9c5e}")
@Guid("ecc68cfec9ac45dfa8eafeea08ef9c5e")
@WinRTInterface("ecc68cfec9ac45dfa8eafeea08ef9c5e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandDisambiguationResult.ByReference::class)
public interface IVoiceCommandDisambiguationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedItem(): VoiceCommandContentTile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandDisambiguationResult> {
    public override fun getValue() =
        ABI.makeIVoiceCommandDisambiguationResult(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandDisambiguationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandDisambiguationResult {
    public val __1877832491_Ptr: Pointer?

    public val _1877832491_VtblPtr: Pointer?
      get() = __1877832491_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedItem(): VoiceCommandContentTile? {
      val fnPtr = _1877832491_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoiceCommandContentTile>()
      val hr = fn.invokeHR(arrayOf(__1877832491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoiceCommandContentTile>(result.getValue())
      return resultValue
    }
  }

  public class IVoiceCommandDisambiguationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1877832491_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandDisambiguationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ecc68cfec9ac45dfa8eafeea08ef9c5e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandDisambiguationResult(ptr: Pointer?): WithDefault =
        IVoiceCommandDisambiguationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandDisambiguationResult {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandDisambiguationResult(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandDisambiguationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1877832491_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandDisambiguationResult):
        Array<IVoiceCommandDisambiguationResult?> = (elements as
        Array<IVoiceCommandDisambiguationResult?>).castToImpl<IVoiceCommandDisambiguationResult,IVoiceCommandDisambiguationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandDisambiguationResult?> =
        arrayOfNulls<IVoiceCommandDisambiguationResult_Impl>(size) as
        Array<IVoiceCommandDisambiguationResult?>
  }
}
