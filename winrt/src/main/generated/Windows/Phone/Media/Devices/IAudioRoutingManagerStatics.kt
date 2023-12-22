package Windows.Phone.Media.Devices

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

@ABIMarker(IAudioRoutingManagerStatics.ABI::class)
@Signature("{977fb2a4-5590-4a6f-adde-6a3d0ad58250}")
@Guid("977fb2a455904a6fadde6a3d0ad58250")
@WinRTInterface("977fb2a455904a6fadde6a3d0ad58250")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioRoutingManagerStatics.ByReference::class)
public interface IAudioRoutingManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): AudioRoutingManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioRoutingManagerStatics> {
    public override fun getValue() = ABI.makeIAudioRoutingManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAudioRoutingManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioRoutingManagerStatics {
    public val __1114507831_Ptr: Pointer?

    public val _1114507831_VtblPtr: Pointer?
      get() = __1114507831_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): AudioRoutingManager? {
      val fnPtr = _1114507831_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioRoutingManager>()
      val hr = fn.invokeHR(arrayOf(__1114507831_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioRoutingManager>(result.getValue())
      return resultValue
    }
  }

  public class IAudioRoutingManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1114507831_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioRoutingManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("977fb2a455904a6fadde6a3d0ad58250")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioRoutingManagerStatics(ptr: Pointer?): WithDefault =
        IAudioRoutingManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioRoutingManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAudioRoutingManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAudioRoutingManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1114507831_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioRoutingManagerStatics):
        Array<IAudioRoutingManagerStatics?> = (elements as
        Array<IAudioRoutingManagerStatics?>).castToImpl<IAudioRoutingManagerStatics,IAudioRoutingManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioRoutingManagerStatics?> =
        arrayOfNulls<IAudioRoutingManagerStatics_Impl>(size) as Array<IAudioRoutingManagerStatics?>
  }
}
