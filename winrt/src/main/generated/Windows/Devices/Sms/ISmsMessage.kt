package Windows.Devices.Sms

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISmsMessage.ABI::class)
@Signature("{ed3c5e28-6984-4b07-811d-8d5906ed3cea}")
@Guid("ed3c5e2869844b07811d8d5906ed3cea")
@WinRTInterface("ed3c5e2869844b07811d8d5906ed3cea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsMessage.ByReference::class)
public interface ISmsMessage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_MessageClass(): SmsMessageClass?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISmsMessage> {
    public override fun getValue() = ABI.makeISmsMessage(pointer.getPointer(0))

    public fun setValue(value: ISmsMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsMessage {
    public val __1172998138_Ptr: Pointer?

    public val _1172998138_VtblPtr: Pointer?
      get() = __1172998138_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _1172998138_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1172998138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MessageClass(): SmsMessageClass? {
      val fnPtr = _1172998138_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsMessageClass>()
      val hr = fn.invokeHR(arrayOf(__1172998138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsMessageClass>(result.getValue())
      return resultValue
    }
  }

  public class ISmsMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1172998138_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed3c5e2869844b07811d8d5906ed3cea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsMessage(ptr: Pointer?): WithDefault = ISmsMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsMessage {
      val address = segment.toRawLongValue()
      return makeISmsMessage(Pointer(address))
    }

    public override fun toNative(obj: ISmsMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1172998138_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsMessage): Array<ISmsMessage?> = (elements as
        Array<ISmsMessage?>).castToImpl<ISmsMessage,ISmsMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsMessage?> =
        arrayOfNulls<ISmsMessage_Impl>(size) as Array<ISmsMessage?>
  }
}
