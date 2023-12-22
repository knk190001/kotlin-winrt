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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmsStatusMessage.ABI::class)
@Signature("{e6d28342-b70b-4677-9379-c9783fdff8f4}")
@Guid("e6d28342b70b46779379c9783fdff8f4")
@WinRTInterface("e6d28342b70b46779379c9783fdff8f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsStatusMessage.ByReference::class)
public interface ISmsStatusMessage : NativeMapped, IWinRTInterface, ISmsMessageBase {
  @InterfaceMethod(0)
  public fun get_To(): String?

  @InterfaceMethod(1)
  public fun get_From(): String?

  @InterfaceMethod(2)
  public fun get_Body(): String?

  @InterfaceMethod(3)
  public fun get_Status(): Int

  @InterfaceMethod(4)
  public fun get_MessageReferenceNumber(): Int

  @InterfaceMethod(5)
  public fun get_ServiceCenterTimestamp(): DateTime?

  @InterfaceMethod(6)
  public fun get_DischargeTime(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsStatusMessage> {
    public override fun getValue() = ABI.makeISmsStatusMessage(pointer.getPointer(0))

    public fun setValue(value: ISmsStatusMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsStatusMessage, ISmsMessageBase.WithDefault {
    public val __2019809640_Ptr: Pointer?

    public val _2019809640_VtblPtr: Pointer?
      get() = __2019809640_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_To(): String? {
      val fnPtr = _2019809640_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2019809640_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_From(): String? {
      val fnPtr = _2019809640_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2019809640_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Body(): String? {
      val fnPtr = _2019809640_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2019809640_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Status(): Int {
      val fnPtr = _2019809640_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2019809640_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_MessageReferenceNumber(): Int {
      val fnPtr = _2019809640_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2019809640_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_ServiceCenterTimestamp(): DateTime? {
      val fnPtr = _2019809640_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2019809640_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DischargeTime(): DateTime? {
      val fnPtr = _2019809640_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2019809640_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class ISmsStatusMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISmsMessageBase {
    public override val __1120832021_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2019809640_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2019809640_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsStatusMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6d28342b70b46779379c9783fdff8f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsStatusMessage(ptr: Pointer?): WithDefault = ISmsStatusMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsStatusMessage {
      val address = segment.toRawLongValue()
      return makeISmsStatusMessage(Pointer(address))
    }

    public override fun toNative(obj: ISmsStatusMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2019809640_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsStatusMessage): Array<ISmsStatusMessage?> = (elements
        as Array<ISmsStatusMessage?>).castToImpl<ISmsStatusMessage,ISmsStatusMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsStatusMessage?> =
        arrayOfNulls<ISmsStatusMessage_Impl>(size) as Array<ISmsStatusMessage?>
  }
}
