package Windows.Devices.Sms

import Windows.Devices.Sms.ISmsMessage.ABI.IID
import Windows.Foundation.Collections.IVectorView
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISmsTextMessage.ABI::class)
@Signature("{d61c904c-a495-487f-9a6f-971548c5bc9f}")
@Guid("d61c904ca495487f9a6f971548c5bc9f")
@WinRTInterface("d61c904ca495487f9a6f971548c5bc9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsTextMessage.ByReference::class)
public interface ISmsTextMessage : NativeMapped, IWinRTInterface, ISmsMessage {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_PartReferenceId(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_PartNumber(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_PartCount(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_To(): String?

  @InterfaceMethod(5)
  public fun put_To(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_From(): String?

  @InterfaceMethod(7)
  public fun put_From(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_Body(): String?

  @InterfaceMethod(9)
  public fun put_Body(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_Encoding(): SmsEncoding?

  @InterfaceMethod(11)
  public fun put_Encoding(value: SmsEncoding?): Unit

  @InterfaceMethod(12)
  public fun ToBinaryMessages(format: SmsDataFormat?): IVectorView<ISmsBinaryMessage?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsTextMessage> {
    public override fun getValue() = ABI.makeISmsTextMessage(pointer.getPointer(0))

    public fun setValue(value: ISmsTextMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsTextMessage, ISmsMessage.WithDefault {
    public val __132191091_Ptr: Pointer?

    public val _132191091_VtblPtr: Pointer?
      get() = __132191091_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _132191091_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PartReferenceId(): WinDef.UINT {
      val fnPtr = _132191091_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_PartNumber(): WinDef.UINT {
      val fnPtr = _132191091_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PartCount(): WinDef.UINT {
      val fnPtr = _132191091_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_To(): String? {
      val fnPtr = _132191091_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_To(value: String?): Unit {
      val fnPtr = _132191091_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_From(): String? {
      val fnPtr = _132191091_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_From(value: String?): Unit {
      val fnPtr = _132191091_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Body(): String? {
      val fnPtr = _132191091_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Body(value: String?): Unit {
      val fnPtr = _132191091_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Encoding(): SmsEncoding? {
      val fnPtr = _132191091_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsEncoding>()
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsEncoding>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Encoding(value: SmsEncoding?): Unit {
      val fnPtr = _132191091_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun ToBinaryMessages(format: SmsDataFormat?): IVectorView<ISmsBinaryMessage?>? {
      val fnPtr = _132191091_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ISmsBinaryMessage?>>()
      val hr = fn.invokeHR(arrayOf(__132191091_Ptr, marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ISmsBinaryMessage?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmsTextMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISmsMessage {
    public override val __1172998138_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_132191091_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __132191091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsTextMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d61c904ca495487f9a6f971548c5bc9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsTextMessage(ptr: Pointer?): WithDefault = ISmsTextMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsTextMessage {
      val address = segment.toRawLongValue()
      return makeISmsTextMessage(Pointer(address))
    }

    public override fun toNative(obj: ISmsTextMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__132191091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsTextMessage): Array<ISmsTextMessage?> = (elements as
        Array<ISmsTextMessage?>).castToImpl<ISmsTextMessage,ISmsTextMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsTextMessage?> =
        arrayOfNulls<ISmsTextMessage_Impl>(size) as Array<ISmsTextMessage?>
  }
}
