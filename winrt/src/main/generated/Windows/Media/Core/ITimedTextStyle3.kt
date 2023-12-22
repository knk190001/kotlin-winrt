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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITimedTextStyle3.ABI::class)
@Signature("{f803f93b-3e99-595e-bbb7-78a2fa13c270}")
@Guid("f803f93b3e99595ebbb778a2fa13c270")
@WinRTInterface("f803f93b3e99595ebbb778a2fa13c270")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedTextStyle3.ByReference::class)
public interface ITimedTextStyle3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Ruby(): TimedTextRuby?

  @InterfaceMethod(1)
  public fun get_Bouten(): TimedTextBouten?

  @InterfaceMethod(2)
  public fun get_IsTextCombined(): Boolean

  @InterfaceMethod(3)
  public fun put_IsTextCombined(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_FontAngleInDegrees(): Double

  @InterfaceMethod(5)
  public fun put_FontAngleInDegrees(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedTextStyle3> {
    public override fun getValue() = ABI.makeITimedTextStyle3(pointer.getPointer(0))

    public fun setValue(value: ITimedTextStyle3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedTextStyle3 {
    public val __488899409_Ptr: Pointer?

    public val _488899409_VtblPtr: Pointer?
      get() = __488899409_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Ruby(): TimedTextRuby? {
      val fnPtr = _488899409_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextRuby>()
      val hr = fn.invokeHR(arrayOf(__488899409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextRuby>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Bouten(): TimedTextBouten? {
      val fnPtr = _488899409_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextBouten>()
      val hr = fn.invokeHR(arrayOf(__488899409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextBouten>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsTextCombined(): Boolean {
      val fnPtr = _488899409_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__488899409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsTextCombined(value: Boolean): Unit {
      val fnPtr = _488899409_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__488899409_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FontAngleInDegrees(): Double {
      val fnPtr = _488899409_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__488899409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_FontAngleInDegrees(value: Double): Unit {
      val fnPtr = _488899409_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__488899409_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimedTextStyle3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __488899409_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedTextStyle3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f803f93b3e99595ebbb778a2fa13c270")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedTextStyle3(ptr: Pointer?): WithDefault = ITimedTextStyle3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedTextStyle3 {
      val address = segment.toRawLongValue()
      return makeITimedTextStyle3(Pointer(address))
    }

    public override fun toNative(obj: ITimedTextStyle3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__488899409_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedTextStyle3): Array<ITimedTextStyle3?> = (elements as
        Array<ITimedTextStyle3?>).castToImpl<ITimedTextStyle3,ITimedTextStyle3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedTextStyle3?> =
        arrayOfNulls<ITimedTextStyle3_Impl>(size) as Array<ITimedTextStyle3?>
  }
}
