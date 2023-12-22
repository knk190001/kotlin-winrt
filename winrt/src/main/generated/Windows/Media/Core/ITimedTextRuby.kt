package Windows.Media.Core

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

@ABIMarker(ITimedTextRuby.ABI::class)
@Signature("{10335c29-5b3c-5693-9959-d05a0bd24628}")
@Guid("10335c295b3c56939959d05a0bd24628")
@WinRTInterface("10335c295b3c56939959d05a0bd24628")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedTextRuby.ByReference::class)
public interface ITimedTextRuby : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Text(): String?

  @InterfaceMethod(1)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Position(): TimedTextRubyPosition?

  @InterfaceMethod(3)
  public fun put_Position(value: TimedTextRubyPosition?): Unit

  @InterfaceMethod(4)
  public fun get_Align(): TimedTextRubyAlign?

  @InterfaceMethod(5)
  public fun put_Align(value: TimedTextRubyAlign?): Unit

  @InterfaceMethod(6)
  public fun get_Reserve(): TimedTextRubyReserve?

  @InterfaceMethod(7)
  public fun put_Reserve(value: TimedTextRubyReserve?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITimedTextRuby>
      {
    public override fun getValue() = ABI.makeITimedTextRuby(pointer.getPointer(0))

    public fun setValue(value: ITimedTextRuby_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedTextRuby {
    public val __241819721_Ptr: Pointer?

    public val _241819721_VtblPtr: Pointer?
      get() = __241819721_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Text(): String? {
      val fnPtr = _241819721_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__241819721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _241819721_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241819721_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Position(): TimedTextRubyPosition? {
      val fnPtr = _241819721_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextRubyPosition>()
      val hr = fn.invokeHR(arrayOf(__241819721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextRubyPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Position(value: TimedTextRubyPosition?): Unit {
      val fnPtr = _241819721_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241819721_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Align(): TimedTextRubyAlign? {
      val fnPtr = _241819721_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextRubyAlign>()
      val hr = fn.invokeHR(arrayOf(__241819721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextRubyAlign>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Align(value: TimedTextRubyAlign?): Unit {
      val fnPtr = _241819721_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241819721_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Reserve(): TimedTextRubyReserve? {
      val fnPtr = _241819721_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextRubyReserve>()
      val hr = fn.invokeHR(arrayOf(__241819721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextRubyReserve>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Reserve(value: TimedTextRubyReserve?): Unit {
      val fnPtr = _241819721_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241819721_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimedTextRuby_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __241819721_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedTextRuby, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10335c295b3c56939959d05a0bd24628")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedTextRuby(ptr: Pointer?): WithDefault = ITimedTextRuby_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedTextRuby {
      val address = segment.toRawLongValue()
      return makeITimedTextRuby(Pointer(address))
    }

    public override fun toNative(obj: ITimedTextRuby): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__241819721_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedTextRuby): Array<ITimedTextRuby?> = (elements as
        Array<ITimedTextRuby?>).castToImpl<ITimedTextRuby,ITimedTextRuby_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedTextRuby?> =
        arrayOfNulls<ITimedTextRuby_Impl>(size) as Array<ITimedTextRuby?>
  }
}
