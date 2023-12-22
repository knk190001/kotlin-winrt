package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.Rect
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICalendarViewTemplateSettings.ABI::class)
@Signature("{56c71483-64e1-477c-8a0b-cb2f3334b9b0}")
@Guid("56c7148364e1477c8a0bcb2f3334b9b0")
@WinRTInterface("56c7148364e1477c8a0bcb2f3334b9b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarViewTemplateSettings.ByReference::class)
public interface ICalendarViewTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MinViewWidth(): Double

  @InterfaceMethod(1)
  public fun get_HeaderText(): String?

  @InterfaceMethod(2)
  public fun get_WeekDay1(): String?

  @InterfaceMethod(3)
  public fun get_WeekDay2(): String?

  @InterfaceMethod(4)
  public fun get_WeekDay3(): String?

  @InterfaceMethod(5)
  public fun get_WeekDay4(): String?

  @InterfaceMethod(6)
  public fun get_WeekDay5(): String?

  @InterfaceMethod(7)
  public fun get_WeekDay6(): String?

  @InterfaceMethod(8)
  public fun get_WeekDay7(): String?

  @InterfaceMethod(9)
  public fun get_HasMoreContentAfter(): Boolean

  @InterfaceMethod(10)
  public fun get_HasMoreContentBefore(): Boolean

  @InterfaceMethod(11)
  public fun get_HasMoreViews(): Boolean

  @InterfaceMethod(12)
  public fun get_ClipRect(): Rect?

  @InterfaceMethod(13)
  public fun get_CenterX(): Double

  @InterfaceMethod(14)
  public fun get_CenterY(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarViewTemplateSettings> {
    public override fun getValue() = ABI.makeICalendarViewTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ICalendarViewTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarViewTemplateSettings {
    public val __1942729916_Ptr: Pointer?

    public val _1942729916_VtblPtr: Pointer?
      get() = __1942729916_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinViewWidth(): Double {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_HeaderText(): String? {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_WeekDay1(): String? {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_WeekDay2(): String? {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_WeekDay3(): String? {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_WeekDay4(): String? {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_WeekDay5(): String? {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_WeekDay6(): String? {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_WeekDay7(): String? {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_HasMoreContentAfter(): Boolean {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_HasMoreContentBefore(): Boolean {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_HasMoreViews(): Boolean {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_ClipRect(): Rect? {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_CenterX(): Double {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_CenterY(): Double {
      val fnPtr = _1942729916_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1942729916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class ICalendarViewTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1942729916_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarViewTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56c7148364e1477c8a0bcb2f3334b9b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarViewTemplateSettings(ptr: Pointer?): WithDefault =
        ICalendarViewTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarViewTemplateSettings {
      val address = segment.toRawLongValue()
      return makeICalendarViewTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ICalendarViewTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1942729916_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarViewTemplateSettings):
        Array<ICalendarViewTemplateSettings?> = (elements as
        Array<ICalendarViewTemplateSettings?>).castToImpl<ICalendarViewTemplateSettings,ICalendarViewTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarViewTemplateSettings?> =
        arrayOfNulls<ICalendarViewTemplateSettings_Impl>(size) as
        Array<ICalendarViewTemplateSettings?>
  }
}
