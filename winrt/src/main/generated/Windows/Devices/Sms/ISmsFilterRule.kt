package Windows.Devices.Sms

import Windows.Foundation.Collections.IVector
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

@ABIMarker(ISmsFilterRule.ABI::class)
@Signature("{40e32fae-b049-4fbc-afe9-e2a610eff55c}")
@Guid("40e32faeb0494fbcafe9e2a610eff55c")
@WinRTInterface("40e32faeb0494fbcafe9e2a610eff55c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsFilterRule.ByReference::class)
public interface ISmsFilterRule : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MessageType(): SmsMessageType?

  @InterfaceMethod(1)
  public fun get_ImsiPrefixes(): IVector<String?>?

  @InterfaceMethod(2)
  public fun get_DeviceIds(): IVector<String?>?

  @InterfaceMethod(3)
  public fun get_SenderNumbers(): IVector<String?>?

  @InterfaceMethod(4)
  public fun get_TextMessagePrefixes(): IVector<String?>?

  @InterfaceMethod(5)
  public fun get_PortNumbers(): IVector<Int>?

  @InterfaceMethod(6)
  public fun get_CellularClass(): CellularClass?

  @InterfaceMethod(7)
  public fun put_CellularClass(value: CellularClass?): Unit

  @InterfaceMethod(8)
  public fun get_ProtocolIds(): IVector<Int>?

  @InterfaceMethod(9)
  public fun get_TeleserviceIds(): IVector<Int>?

  @InterfaceMethod(10)
  public fun get_WapApplicationIds(): IVector<String?>?

  @InterfaceMethod(11)
  public fun get_WapContentTypes(): IVector<String?>?

  @InterfaceMethod(12)
  public fun get_BroadcastTypes(): IVector<SmsBroadcastType?>?

  @InterfaceMethod(13)
  public fun get_BroadcastChannels(): IVector<Int>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISmsFilterRule>
      {
    public override fun getValue() = ABI.makeISmsFilterRule(pointer.getPointer(0))

    public fun setValue(value: ISmsFilterRule_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsFilterRule {
    public val __1071311297_Ptr: Pointer?

    public val _1071311297_VtblPtr: Pointer?
      get() = __1071311297_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MessageType(): SmsMessageType? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsMessageType>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsMessageType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ImsiPrefixes(): IVector<String?>? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DeviceIds(): IVector<String?>? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SenderNumbers(): IVector<String?>? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TextMessagePrefixes(): IVector<String?>? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PortNumbers(): IVector<Int>? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Int>>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CellularClass(): CellularClass? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CellularClass>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CellularClass>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CellularClass(value: CellularClass?): Unit {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ProtocolIds(): IVector<Int>? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Int>>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_TeleserviceIds(): IVector<Int>? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Int>>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_WapApplicationIds(): IVector<String?>? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_WapContentTypes(): IVector<String?>? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_BroadcastTypes(): IVector<SmsBroadcastType?>? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SmsBroadcastType?>>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SmsBroadcastType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_BroadcastChannels(): IVector<Int>? {
      val fnPtr = _1071311297_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Int>>()
      val hr = fn.invokeHR(arrayOf(__1071311297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Int>>(result.getValue())
      return resultValue
    }
  }

  public class ISmsFilterRule_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1071311297_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsFilterRule, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40e32faeb0494fbcafe9e2a610eff55c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsFilterRule(ptr: Pointer?): WithDefault = ISmsFilterRule_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsFilterRule {
      val address = segment.toRawLongValue()
      return makeISmsFilterRule(Pointer(address))
    }

    public override fun toNative(obj: ISmsFilterRule): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1071311297_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsFilterRule): Array<ISmsFilterRule?> = (elements as
        Array<ISmsFilterRule?>).castToImpl<ISmsFilterRule,ISmsFilterRule_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsFilterRule?> =
        arrayOfNulls<ISmsFilterRule_Impl>(size) as Array<ISmsFilterRule?>
  }
}
