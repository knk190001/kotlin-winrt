package Windows.Devices.Sms

import Windows.Devices.Sms.ISmsMessageBase.ABI.IID
import Windows.Foundation.DateTime
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmsTextMessage2.ABI::class)
@Signature("{22a0d893-4555-4755-b5a1-e7fd84955f8d}")
@Guid("22a0d89345554755b5a1e7fd84955f8d")
@WinRTInterface("22a0d89345554755b5a1e7fd84955f8d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsTextMessage2.ByReference::class)
public interface ISmsTextMessage2 : NativeMapped, IWinRTInterface, ISmsMessageBase {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_To(): String?

  @InterfaceMethod(2)
  public fun put_To(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_From(): String?

  @InterfaceMethod(4)
  public fun get_Body(): String?

  @InterfaceMethod(5)
  public fun put_Body(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_Encoding(): SmsEncoding?

  @InterfaceMethod(7)
  public fun put_Encoding(value: SmsEncoding?): Unit

  @InterfaceMethod(8)
  public fun get_CallbackNumber(): String?

  @InterfaceMethod(9)
  public fun put_CallbackNumber(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_IsDeliveryNotificationEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsDeliveryNotificationEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_RetryAttemptCount(): Int

  @InterfaceMethod(13)
  public fun put_RetryAttemptCount(value: Int): Unit

  @InterfaceMethod(14)
  public fun get_TeleserviceId(): Int

  @InterfaceMethod(15)
  public fun get_ProtocolId(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsTextMessage2> {
    public override fun getValue() = ABI.makeISmsTextMessage2(pointer.getPointer(0))

    public fun setValue(value: ISmsTextMessage2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsTextMessage2, ISmsMessageBase.WithDefault {
    public val __197043525_Ptr: Pointer?

    public val _197043525_VtblPtr: Pointer?
      get() = __197043525_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _197043525_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_To(): String? {
      val fnPtr = _197043525_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_To(value: String?): Unit {
      val fnPtr = _197043525_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_From(): String? {
      val fnPtr = _197043525_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Body(): String? {
      val fnPtr = _197043525_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Body(value: String?): Unit {
      val fnPtr = _197043525_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Encoding(): SmsEncoding? {
      val fnPtr = _197043525_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsEncoding>()
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsEncoding>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Encoding(value: SmsEncoding?): Unit {
      val fnPtr = _197043525_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_CallbackNumber(): String? {
      val fnPtr = _197043525_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_CallbackNumber(value: String?): Unit {
      val fnPtr = _197043525_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsDeliveryNotificationEnabled(): Boolean {
      val fnPtr = _197043525_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsDeliveryNotificationEnabled(value: Boolean): Unit {
      val fnPtr = _197043525_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_RetryAttemptCount(): Int {
      val fnPtr = _197043525_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_RetryAttemptCount(value: Int): Unit {
      val fnPtr = _197043525_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TeleserviceId(): Int {
      val fnPtr = _197043525_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_ProtocolId(): Int {
      val fnPtr = _197043525_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__197043525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ISmsTextMessage2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISmsMessageBase {
    public override val __1120832021_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_197043525_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __197043525_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsTextMessage2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22a0d89345554755b5a1e7fd84955f8d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsTextMessage2(ptr: Pointer?): WithDefault = ISmsTextMessage2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsTextMessage2 {
      val address = segment.toRawLongValue()
      return makeISmsTextMessage2(Pointer(address))
    }

    public override fun toNative(obj: ISmsTextMessage2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__197043525_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsTextMessage2): Array<ISmsTextMessage2?> = (elements as
        Array<ISmsTextMessage2?>).castToImpl<ISmsTextMessage2,ISmsTextMessage2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsTextMessage2?> =
        arrayOfNulls<ISmsTextMessage2_Impl>(size) as Array<ISmsTextMessage2?>
  }
}
