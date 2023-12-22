package Windows.Media.SpeechSynthesis

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IInstalledVoicesStatic2.ABI::class)
@Signature("{64255f2e-358d-4058-be9a-fd3fcb423530}")
@Guid("64255f2e358d4058be9afd3fcb423530")
@WinRTInterface("64255f2e358d4058be9afd3fcb423530")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInstalledVoicesStatic2.ByReference::class)
public interface IInstalledVoicesStatic2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TrySetDefaultVoiceAsync(voice: VoiceInformation?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInstalledVoicesStatic2> {
    public override fun getValue() = ABI.makeIInstalledVoicesStatic2(pointer.getPointer(0))

    public fun setValue(value: IInstalledVoicesStatic2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInstalledVoicesStatic2 {
    public val __940186421_Ptr: Pointer?

    public val _940186421_VtblPtr: Pointer?
      get() = __940186421_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TrySetDefaultVoiceAsync(voice: VoiceInformation?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _940186421_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__940186421_Ptr, marshalToNative(voice), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IInstalledVoicesStatic2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __940186421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInstalledVoicesStatic2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64255f2e358d4058be9afd3fcb423530")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInstalledVoicesStatic2(ptr: Pointer?): WithDefault =
        IInstalledVoicesStatic2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInstalledVoicesStatic2 {
      val address = segment.toRawLongValue()
      return makeIInstalledVoicesStatic2(Pointer(address))
    }

    public override fun toNative(obj: IInstalledVoicesStatic2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__940186421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInstalledVoicesStatic2): Array<IInstalledVoicesStatic2?>
        = (elements as
        Array<IInstalledVoicesStatic2?>).castToImpl<IInstalledVoicesStatic2,IInstalledVoicesStatic2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInstalledVoicesStatic2?> =
        arrayOfNulls<IInstalledVoicesStatic2_Impl>(size) as Array<IInstalledVoicesStatic2?>
  }
}
