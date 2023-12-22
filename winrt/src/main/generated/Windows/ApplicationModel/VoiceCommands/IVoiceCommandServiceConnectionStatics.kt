package Windows.ApplicationModel.VoiceCommands

import Windows.ApplicationModel.AppService.AppServiceTriggerDetails
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

@ABIMarker(IVoiceCommandServiceConnectionStatics.ABI::class)
@Signature("{370ebffb-2d34-42df-8770-074d0f334697}")
@Guid("370ebffb2d3442df8770074d0f334697")
@WinRTInterface("370ebffb2d3442df8770074d0f334697")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandServiceConnectionStatics.ByReference::class)
public interface IVoiceCommandServiceConnectionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromAppServiceTriggerDetails(triggerDetails: AppServiceTriggerDetails?):
      VoiceCommandServiceConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandServiceConnectionStatics> {
    public override fun getValue() =
        ABI.makeIVoiceCommandServiceConnectionStatics(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandServiceConnectionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandServiceConnectionStatics {
    public val __124408764_Ptr: Pointer?

    public val _124408764_VtblPtr: Pointer?
      get() = __124408764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromAppServiceTriggerDetails(triggerDetails: AppServiceTriggerDetails?):
        VoiceCommandServiceConnection? {
      val fnPtr = _124408764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoiceCommandServiceConnection>()
      val hr = fn.invokeHR(arrayOf(__124408764_Ptr, marshalToNative(triggerDetails), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoiceCommandServiceConnection>(result.getValue())
      return resultValue
    }
  }

  public class IVoiceCommandServiceConnectionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __124408764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandServiceConnectionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("370ebffb2d3442df8770074d0f334697")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandServiceConnectionStatics(ptr: Pointer?): WithDefault =
        IVoiceCommandServiceConnectionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandServiceConnectionStatics {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandServiceConnectionStatics(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandServiceConnectionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__124408764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandServiceConnectionStatics):
        Array<IVoiceCommandServiceConnectionStatics?> = (elements as
        Array<IVoiceCommandServiceConnectionStatics?>).castToImpl<IVoiceCommandServiceConnectionStatics,IVoiceCommandServiceConnectionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandServiceConnectionStatics?> =
        arrayOfNulls<IVoiceCommandServiceConnectionStatics_Impl>(size) as
        Array<IVoiceCommandServiceConnectionStatics?>
  }
}
