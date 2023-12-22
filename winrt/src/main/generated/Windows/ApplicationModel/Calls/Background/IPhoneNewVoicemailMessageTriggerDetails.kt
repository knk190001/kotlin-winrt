package Windows.ApplicationModel.Calls.Background

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

@ABIMarker(IPhoneNewVoicemailMessageTriggerDetails.ABI::class)
@Signature("{13a8c01b-b831-48d3-8ba9-8d22a6580dcf}")
@Guid("13a8c01bb83148d38ba98d22a6580dcf")
@WinRTInterface("13a8c01bb83148d38ba98d22a6580dcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneNewVoicemailMessageTriggerDetails.ByReference::class)
public interface IPhoneNewVoicemailMessageTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_VoicemailCount(): Int

  @InterfaceMethod(2)
  public fun get_OperatorMessage(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneNewVoicemailMessageTriggerDetails> {
    public override fun getValue() =
        ABI.makeIPhoneNewVoicemailMessageTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IPhoneNewVoicemailMessageTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneNewVoicemailMessageTriggerDetails {
    public val __1192189550_Ptr: Pointer?

    public val _1192189550_VtblPtr: Pointer?
      get() = __1192189550_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1192189550_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1192189550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VoicemailCount(): Int {
      val fnPtr = _1192189550_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1192189550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_OperatorMessage(): String? {
      val fnPtr = _1192189550_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1192189550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneNewVoicemailMessageTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1192189550_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneNewVoicemailMessageTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("13a8c01bb83148d38ba98d22a6580dcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneNewVoicemailMessageTriggerDetails(ptr: Pointer?): WithDefault =
        IPhoneNewVoicemailMessageTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPhoneNewVoicemailMessageTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIPhoneNewVoicemailMessageTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IPhoneNewVoicemailMessageTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1192189550_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneNewVoicemailMessageTriggerDetails):
        Array<IPhoneNewVoicemailMessageTriggerDetails?> = (elements as
        Array<IPhoneNewVoicemailMessageTriggerDetails?>).castToImpl<IPhoneNewVoicemailMessageTriggerDetails,IPhoneNewVoicemailMessageTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneNewVoicemailMessageTriggerDetails?> =
        arrayOfNulls<IPhoneNewVoicemailMessageTriggerDetails_Impl>(size) as
        Array<IPhoneNewVoicemailMessageTriggerDetails?>
  }
}
