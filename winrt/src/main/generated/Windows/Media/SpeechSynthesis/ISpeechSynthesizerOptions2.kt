package Windows.Media.SpeechSynthesis

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpeechSynthesizerOptions2.ABI::class)
@Signature("{1cbef60e-119c-4bed-b118-d250c3a25793}")
@Guid("1cbef60e119c4bedb118d250c3a25793")
@WinRTInterface("1cbef60e119c4bedb118d250c3a25793")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechSynthesizerOptions2.ByReference::class)
public interface ISpeechSynthesizerOptions2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AudioVolume(): Double

  @InterfaceMethod(1)
  public fun put_AudioVolume(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_SpeakingRate(): Double

  @InterfaceMethod(3)
  public fun put_SpeakingRate(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_AudioPitch(): Double

  @InterfaceMethod(5)
  public fun put_AudioPitch(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechSynthesizerOptions2> {
    public override fun getValue() = ABI.makeISpeechSynthesizerOptions2(pointer.getPointer(0))

    public fun setValue(value: ISpeechSynthesizerOptions2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechSynthesizerOptions2 {
    public val __88056466_Ptr: Pointer?

    public val _88056466_VtblPtr: Pointer?
      get() = __88056466_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioVolume(): Double {
      val fnPtr = _88056466_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__88056466_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AudioVolume(value: Double): Unit {
      val fnPtr = _88056466_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__88056466_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SpeakingRate(): Double {
      val fnPtr = _88056466_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__88056466_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_SpeakingRate(value: Double): Unit {
      val fnPtr = _88056466_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__88056466_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AudioPitch(): Double {
      val fnPtr = _88056466_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__88056466_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AudioPitch(value: Double): Unit {
      val fnPtr = _88056466_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__88056466_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpeechSynthesizerOptions2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __88056466_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechSynthesizerOptions2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1cbef60e119c4bedb118d250c3a25793")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechSynthesizerOptions2(ptr: Pointer?): WithDefault =
        ISpeechSynthesizerOptions2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechSynthesizerOptions2 {
      val address = segment.toRawLongValue()
      return makeISpeechSynthesizerOptions2(Pointer(address))
    }

    public override fun toNative(obj: ISpeechSynthesizerOptions2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__88056466_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechSynthesizerOptions2):
        Array<ISpeechSynthesizerOptions2?> = (elements as
        Array<ISpeechSynthesizerOptions2?>).castToImpl<ISpeechSynthesizerOptions2,ISpeechSynthesizerOptions2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechSynthesizerOptions2?> =
        arrayOfNulls<ISpeechSynthesizerOptions2_Impl>(size) as Array<ISpeechSynthesizerOptions2?>
  }
}
