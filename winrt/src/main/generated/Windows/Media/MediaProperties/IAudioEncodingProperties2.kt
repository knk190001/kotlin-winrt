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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioEncodingProperties2.ABI::class)
@Signature("{c45d54da-80bd-4c23-80d5-72d4a181e894}")
@Guid("c45d54da80bd4c2380d572d4a181e894")
@WinRTInterface("c45d54da80bd4c2380d572d4a181e894")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioEncodingProperties2.ByReference::class)
public interface IAudioEncodingProperties2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSpatial(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioEncodingProperties2> {
    public override fun getValue() = ABI.makeIAudioEncodingProperties2(pointer.getPointer(0))

    public fun setValue(value: IAudioEncodingProperties2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioEncodingProperties2 {
    public val __695179939_Ptr: Pointer?

    public val _695179939_VtblPtr: Pointer?
      get() = __695179939_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSpatial(): Boolean {
      val fnPtr = _695179939_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__695179939_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAudioEncodingProperties2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __695179939_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioEncodingProperties2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c45d54da80bd4c2380d572d4a181e894")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioEncodingProperties2(ptr: Pointer?): WithDefault =
        IAudioEncodingProperties2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioEncodingProperties2 {
      val address = segment.toRawLongValue()
      return makeIAudioEncodingProperties2(Pointer(address))
    }

    public override fun toNative(obj: IAudioEncodingProperties2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__695179939_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioEncodingProperties2):
        Array<IAudioEncodingProperties2?> = (elements as
        Array<IAudioEncodingProperties2?>).castToImpl<IAudioEncodingProperties2,IAudioEncodingProperties2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioEncodingProperties2?> =
        arrayOfNulls<IAudioEncodingProperties2_Impl>(size) as Array<IAudioEncodingProperties2?>
  }
}
