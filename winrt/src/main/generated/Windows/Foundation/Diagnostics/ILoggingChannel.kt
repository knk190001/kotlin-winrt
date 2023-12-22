package Windows.Foundation.Diagnostics

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ILoggingChannel.ABI::class)
@Signature("{e9a50343-11d7-4f01-b5ca-cf495278c0a8}")
@Guid("e9a5034311d74f01b5cacf495278c0a8")
@WinRTInterface("e9a5034311d74f01b5cacf495278c0a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingChannel.ByReference::class)
public interface ILoggingChannel : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Enabled(): Boolean

  @InterfaceMethod(2)
  public fun get_Level(): LoggingLevel?

  @InterfaceMethod(3)
  public fun LogMessage(eventString: String?): Unit

  @InterfaceMethod(4)
  public fun LogMessage(eventString: String?, level: LoggingLevel?): Unit

  @InterfaceMethod(5)
  public fun LogValuePair(value1: String?, value2: Int): Unit

  @InterfaceMethod(6)
  public fun LogValuePair(
    value1: String?,
    value2: Int,
    level: LoggingLevel?
  ): Unit

  @InterfaceMethod(7)
  public fun add_LoggingEnabled(handler: TypedEventHandler<ILoggingChannel?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_LoggingEnabled(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoggingChannel> {
    public override fun getValue() = ABI.makeILoggingChannel(pointer.getPointer(0))

    public fun setValue(value: ILoggingChannel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingChannel, IClosable.WithDefault {
    public val __1958105329_Ptr: Pointer?

    public val _1958105329_VtblPtr: Pointer?
      get() = __1958105329_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1958105329_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1958105329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Enabled(): Boolean {
      val fnPtr = _1958105329_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1958105329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Level(): LoggingLevel? {
      val fnPtr = _1958105329_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingLevel>()
      val hr = fn.invokeHR(arrayOf(__1958105329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun LogMessage(eventString: String?): Unit {
      val fnPtr = _1958105329_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1958105329_Ptr, marshalToNative(eventString),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun LogMessage(eventString: String?, level: LoggingLevel?): Unit {
      val fnPtr = _1958105329_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1958105329_Ptr, marshalToNative(eventString),
          marshalToNative(level),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun LogValuePair(value1: String?, value2: Int): Unit {
      val fnPtr = _1958105329_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1958105329_Ptr, marshalToNative(value1), value2,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun LogValuePair(
      value1: String?,
      value2: Int,
      level: LoggingLevel?
    ): Unit {
      val fnPtr = _1958105329_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1958105329_Ptr, marshalToNative(value1), value2,
          marshalToNative(level),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_LoggingEnabled(handler: TypedEventHandler<ILoggingChannel?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1958105329_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1958105329_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_LoggingEnabled(token: EventRegistrationToken?): Unit {
      val fnPtr = _1958105329_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1958105329_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILoggingChannel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1958105329_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1958105329_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingChannel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e9a5034311d74f01b5cacf495278c0a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingChannel(ptr: Pointer?): WithDefault = ILoggingChannel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingChannel {
      val address = segment.toRawLongValue()
      return makeILoggingChannel(Pointer(address))
    }

    public override fun toNative(obj: ILoggingChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1958105329_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingChannel): Array<ILoggingChannel?> = (elements as
        Array<ILoggingChannel?>).castToImpl<ILoggingChannel,ILoggingChannel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingChannel?> =
        arrayOfNulls<ILoggingChannel_Impl>(size) as Array<ILoggingChannel?>
  }
}
