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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioEncodingProperties3.ABI::class)
@Signature("{87600341-748c-4f8d-b0fd-10caf08ff087}")
@Guid("87600341748c4f8db0fd10caf08ff087")
@WinRTInterface("87600341748c4f8db0fd10caf08ff087")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioEncodingProperties3.ByReference::class)
public interface IAudioEncodingProperties3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Copy(): AudioEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioEncodingProperties3> {
    public override fun getValue() = ABI.makeIAudioEncodingProperties3(pointer.getPointer(0))

    public fun setValue(value: IAudioEncodingProperties3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioEncodingProperties3 {
    public val __695179938_Ptr: Pointer?

    public val _695179938_VtblPtr: Pointer?
      get() = __695179938_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Copy(): AudioEncodingProperties? {
      val fnPtr = _695179938_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__695179938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IAudioEncodingProperties3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __695179938_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioEncodingProperties3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87600341748c4f8db0fd10caf08ff087")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioEncodingProperties3(ptr: Pointer?): WithDefault =
        IAudioEncodingProperties3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioEncodingProperties3 {
      val address = segment.toRawLongValue()
      return makeIAudioEncodingProperties3(Pointer(address))
    }

    public override fun toNative(obj: IAudioEncodingProperties3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__695179938_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioEncodingProperties3):
        Array<IAudioEncodingProperties3?> = (elements as
        Array<IAudioEncodingProperties3?>).castToImpl<IAudioEncodingProperties3,IAudioEncodingProperties3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioEncodingProperties3?> =
        arrayOfNulls<IAudioEncodingProperties3_Impl>(size) as Array<IAudioEncodingProperties3?>
  }
}
