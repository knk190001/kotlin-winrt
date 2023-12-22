package Windows.Foundation.Diagnostics

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
import kotlin.Long
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILoggingOptions.ABI::class)
@Signature("{90bc7850-0192-4f5d-ac26-006adaca12d8}")
@Guid("90bc785001924f5dac26006adaca12d8")
@WinRTInterface("90bc785001924f5dac26006adaca12d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingOptions.ByReference::class)
public interface ILoggingOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Keywords(): Long

  @InterfaceMethod(1)
  public fun put_Keywords(value: Long): Unit

  @InterfaceMethod(2)
  public fun get_Tags(): Int

  @InterfaceMethod(3)
  public fun put_Tags(value: Int): Unit

  @InterfaceMethod(4)
  public fun get_Task(): Short

  @InterfaceMethod(5)
  public fun put_Task(value: Short): Unit

  @InterfaceMethod(6)
  public fun get_Opcode(): LoggingOpcode?

  @InterfaceMethod(7)
  public fun put_Opcode(value: LoggingOpcode?): Unit

  @InterfaceMethod(8)
  public fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(9)
  public fun put_ActivityId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(10)
  public fun get_RelatedActivityId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(11)
  public fun put_RelatedActivityId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoggingOptions> {
    public override fun getValue() = ABI.makeILoggingOptions(pointer.getPointer(0))

    public fun setValue(value: ILoggingOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingOptions {
    public val __30319988_Ptr: Pointer?

    public val _30319988_VtblPtr: Pointer?
      get() = __30319988_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Keywords(): Long {
      val fnPtr = _30319988_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Keywords(value: Long): Unit {
      val fnPtr = _30319988_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Tags(): Int {
      val fnPtr = _30319988_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Tags(value: Int): Unit {
      val fnPtr = _30319988_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Task(): Short {
      val fnPtr = _30319988_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Short>()
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Short>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Task(value: Short): Unit {
      val fnPtr = _30319988_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Opcode(): LoggingOpcode? {
      val fnPtr = _30319988_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingOpcode>()
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingOpcode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Opcode(value: LoggingOpcode?): Unit {
      val fnPtr = _30319988_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _30319988_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ActivityId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _30319988_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_RelatedActivityId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _30319988_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_RelatedActivityId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _30319988_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__30319988_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILoggingOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __30319988_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90bc785001924f5dac26006adaca12d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingOptions(ptr: Pointer?): WithDefault = ILoggingOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingOptions {
      val address = segment.toRawLongValue()
      return makeILoggingOptions(Pointer(address))
    }

    public override fun toNative(obj: ILoggingOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__30319988_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingOptions): Array<ILoggingOptions?> = (elements as
        Array<ILoggingOptions?>).castToImpl<ILoggingOptions,ILoggingOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingOptions?> =
        arrayOfNulls<ILoggingOptions_Impl>(size) as Array<ILoggingOptions?>
  }
}
