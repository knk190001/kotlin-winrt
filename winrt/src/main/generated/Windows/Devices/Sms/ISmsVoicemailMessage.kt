package Windows.Devices.Sms

import Windows.Devices.Sms.ISmsMessageBase.ABI.IID
import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ISmsVoicemailMessage.ABI::class)
@Signature("{271aa0a6-95b1-44ff-bcb8-b8fdd7e08bc3}")
@Guid("271aa0a695b144ffbcb8b8fdd7e08bc3")
@WinRTInterface("271aa0a695b144ffbcb8b8fdd7e08bc3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsVoicemailMessage.ByReference::class)
public interface ISmsVoicemailMessage : NativeMapped, IWinRTInterface, ISmsMessageBase {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_To(): String?

  @InterfaceMethod(2)
  public fun get_Body(): String?

  @InterfaceMethod(3)
  public fun get_MessageCount(): IReference<Int>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsVoicemailMessage> {
    public override fun getValue() = ABI.makeISmsVoicemailMessage(pointer.getPointer(0))

    public fun setValue(value: ISmsVoicemailMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsVoicemailMessage, ISmsMessageBase.WithDefault {
    public val __876639413_Ptr: Pointer?

    public val _876639413_VtblPtr: Pointer?
      get() = __876639413_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _876639413_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__876639413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_To(): String? {
      val fnPtr = _876639413_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__876639413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Body(): String? {
      val fnPtr = _876639413_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__876639413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MessageCount(): IReference<Int>? {
      val fnPtr = _876639413_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__876639413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }
  }

  public class ISmsVoicemailMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISmsMessageBase {
    public override val __1120832021_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_876639413_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __876639413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsVoicemailMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("271aa0a695b144ffbcb8b8fdd7e08bc3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsVoicemailMessage(ptr: Pointer?): WithDefault = ISmsVoicemailMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsVoicemailMessage {
      val address = segment.toRawLongValue()
      return makeISmsVoicemailMessage(Pointer(address))
    }

    public override fun toNative(obj: ISmsVoicemailMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__876639413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsVoicemailMessage): Array<ISmsVoicemailMessage?> =
        (elements as
        Array<ISmsVoicemailMessage?>).castToImpl<ISmsVoicemailMessage,ISmsVoicemailMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsVoicemailMessage?> =
        arrayOfNulls<ISmsVoicemailMessage_Impl>(size) as Array<ISmsVoicemailMessage?>
  }
}
