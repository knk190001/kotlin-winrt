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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITimedTextStyle2.ABI::class)
@Signature("{655f492d-6111-4787-89cc-686fece57e14}")
@Guid("655f492d6111478789cc686fece57e14")
@WinRTInterface("655f492d6111478789cc686fece57e14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedTextStyle2.ByReference::class)
public interface ITimedTextStyle2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FontStyle(): TimedTextFontStyle?

  @InterfaceMethod(1)
  public fun put_FontStyle(value: TimedTextFontStyle?): Unit

  @InterfaceMethod(2)
  public fun get_IsUnderlineEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsUnderlineEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsLineThroughEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsLineThroughEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsOverlineEnabled(): Boolean

  @InterfaceMethod(7)
  public fun put_IsOverlineEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedTextStyle2> {
    public override fun getValue() = ABI.makeITimedTextStyle2(pointer.getPointer(0))

    public fun setValue(value: ITimedTextStyle2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedTextStyle2 {
    public val __488899408_Ptr: Pointer?

    public val _488899408_VtblPtr: Pointer?
      get() = __488899408_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FontStyle(): TimedTextFontStyle? {
      val fnPtr = _488899408_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextFontStyle>()
      val hr = fn.invokeHR(arrayOf(__488899408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextFontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FontStyle(value: TimedTextFontStyle?): Unit {
      val fnPtr = _488899408_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__488899408_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsUnderlineEnabled(): Boolean {
      val fnPtr = _488899408_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__488899408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsUnderlineEnabled(value: Boolean): Unit {
      val fnPtr = _488899408_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__488899408_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsLineThroughEnabled(): Boolean {
      val fnPtr = _488899408_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__488899408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsLineThroughEnabled(value: Boolean): Unit {
      val fnPtr = _488899408_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__488899408_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsOverlineEnabled(): Boolean {
      val fnPtr = _488899408_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__488899408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsOverlineEnabled(value: Boolean): Unit {
      val fnPtr = _488899408_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__488899408_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimedTextStyle2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __488899408_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedTextStyle2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("655f492d6111478789cc686fece57e14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedTextStyle2(ptr: Pointer?): WithDefault = ITimedTextStyle2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedTextStyle2 {
      val address = segment.toRawLongValue()
      return makeITimedTextStyle2(Pointer(address))
    }

    public override fun toNative(obj: ITimedTextStyle2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__488899408_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedTextStyle2): Array<ITimedTextStyle2?> = (elements as
        Array<ITimedTextStyle2?>).castToImpl<ITimedTextStyle2,ITimedTextStyle2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedTextStyle2?> =
        arrayOfNulls<ITimedTextStyle2_Impl>(size) as Array<ITimedTextStyle2?>
  }
}
