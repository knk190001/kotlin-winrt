package Windows.Media.Core

import Windows.UI.Color
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITimedTextBouten.ABI::class)
@Signature("{d9062783-5597-5092-820c-8f738e0f774a}")
@Guid("d906278355975092820c8f738e0f774a")
@WinRTInterface("d906278355975092820c8f738e0f774a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedTextBouten.ByReference::class)
public interface ITimedTextBouten : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): TimedTextBoutenType?

  @InterfaceMethod(1)
  public fun put_Type(value: TimedTextBoutenType?): Unit

  @InterfaceMethod(2)
  public fun get_Color(): Color?

  @InterfaceMethod(3)
  public fun put_Color(value: Color?): Unit

  @InterfaceMethod(4)
  public fun get_Position(): TimedTextBoutenPosition?

  @InterfaceMethod(5)
  public fun put_Position(value: TimedTextBoutenPosition?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedTextBouten> {
    public override fun getValue() = ABI.makeITimedTextBouten(pointer.getPointer(0))

    public fun setValue(value: ITimedTextBouten_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedTextBouten {
    public val __2525180_Ptr: Pointer?

    public val _2525180_VtblPtr: Pointer?
      get() = __2525180_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): TimedTextBoutenType? {
      val fnPtr = _2525180_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextBoutenType>()
      val hr = fn.invokeHR(arrayOf(__2525180_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextBoutenType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Type(value: TimedTextBoutenType?): Unit {
      val fnPtr = _2525180_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2525180_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Color(): Color? {
      val fnPtr = _2525180_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__2525180_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _2525180_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2525180_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Position(): TimedTextBoutenPosition? {
      val fnPtr = _2525180_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextBoutenPosition>()
      val hr = fn.invokeHR(arrayOf(__2525180_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextBoutenPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Position(value: TimedTextBoutenPosition?): Unit {
      val fnPtr = _2525180_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2525180_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimedTextBouten_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2525180_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedTextBouten, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d906278355975092820c8f738e0f774a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedTextBouten(ptr: Pointer?): WithDefault = ITimedTextBouten_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedTextBouten {
      val address = segment.toRawLongValue()
      return makeITimedTextBouten(Pointer(address))
    }

    public override fun toNative(obj: ITimedTextBouten): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2525180_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedTextBouten): Array<ITimedTextBouten?> = (elements as
        Array<ITimedTextBouten?>).castToImpl<ITimedTextBouten,ITimedTextBouten_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedTextBouten?> =
        arrayOfNulls<ITimedTextBouten_Impl>(size) as Array<ITimedTextBouten?>
  }
}
