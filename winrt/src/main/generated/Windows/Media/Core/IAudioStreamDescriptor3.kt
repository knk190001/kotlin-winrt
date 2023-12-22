package Windows.Media.Core

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

@ABIMarker(IAudioStreamDescriptor3.ABI::class)
@Signature("{4d220da1-8e83-44ef-8973-2f63e993f36b}")
@Guid("4d220da18e8344ef89732f63e993f36b")
@WinRTInterface("4d220da18e8344ef89732f63e993f36b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioStreamDescriptor3.ByReference::class)
public interface IAudioStreamDescriptor3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Copy(): AudioStreamDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioStreamDescriptor3> {
    public override fun getValue() = ABI.makeIAudioStreamDescriptor3(pointer.getPointer(0))

    public fun setValue(value: IAudioStreamDescriptor3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioStreamDescriptor3 {
    public val __178575645_Ptr: Pointer?

    public val _178575645_VtblPtr: Pointer?
      get() = __178575645_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Copy(): AudioStreamDescriptor? {
      val fnPtr = _178575645_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioStreamDescriptor>()
      val hr = fn.invokeHR(arrayOf(__178575645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioStreamDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class IAudioStreamDescriptor3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __178575645_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioStreamDescriptor3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d220da18e8344ef89732f63e993f36b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioStreamDescriptor3(ptr: Pointer?): WithDefault =
        IAudioStreamDescriptor3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioStreamDescriptor3 {
      val address = segment.toRawLongValue()
      return makeIAudioStreamDescriptor3(Pointer(address))
    }

    public override fun toNative(obj: IAudioStreamDescriptor3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__178575645_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioStreamDescriptor3): Array<IAudioStreamDescriptor3?>
        = (elements as
        Array<IAudioStreamDescriptor3?>).castToImpl<IAudioStreamDescriptor3,IAudioStreamDescriptor3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioStreamDescriptor3?> =
        arrayOfNulls<IAudioStreamDescriptor3_Impl>(size) as Array<IAudioStreamDescriptor3?>
  }
}
