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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioGraphSettings2.ABI::class)
@Signature("{72919787-4dab-46e3-b4c9-d8e1a2636062}")
@Guid("729197874dab46e3b4c9d8e1a2636062")
@WinRTInterface("729197874dab46e3b4c9d8e1a2636062")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioGraphSettings2.ByReference::class)
public interface IAudioGraphSettings2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_MaxPlaybackSpeedFactor(value: Double): Unit

  @InterfaceMethod(1)
  public fun get_MaxPlaybackSpeedFactor(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioGraphSettings2> {
    public override fun getValue() = ABI.makeIAudioGraphSettings2(pointer.getPointer(0))

    public fun setValue(value: IAudioGraphSettings2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioGraphSettings2 {
    public val __158744751_Ptr: Pointer?

    public val _158744751_VtblPtr: Pointer?
      get() = __158744751_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_MaxPlaybackSpeedFactor(value: Double): Unit {
      val fnPtr = _158744751_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158744751_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_MaxPlaybackSpeedFactor(): Double {
      val fnPtr = _158744751_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__158744751_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IAudioGraphSettings2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __158744751_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioGraphSettings2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("729197874dab46e3b4c9d8e1a2636062")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioGraphSettings2(ptr: Pointer?): WithDefault = IAudioGraphSettings2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioGraphSettings2 {
      val address = segment.toRawLongValue()
      return makeIAudioGraphSettings2(Pointer(address))
    }

    public override fun toNative(obj: IAudioGraphSettings2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__158744751_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioGraphSettings2): Array<IAudioGraphSettings2?> =
        (elements as
        Array<IAudioGraphSettings2?>).castToImpl<IAudioGraphSettings2,IAudioGraphSettings2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioGraphSettings2?> =
        arrayOfNulls<IAudioGraphSettings2_Impl>(size) as Array<IAudioGraphSettings2?>
  }
}
