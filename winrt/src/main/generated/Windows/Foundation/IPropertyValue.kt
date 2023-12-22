package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.OutArray
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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Char
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPropertyValue.ABI::class)
@Signature("{4bd682dd-7554-40e9-9a9b-82654ede7e62}")
@Guid("4bd682dd755440e99a9b82654ede7e62")
@WinRTInterface("4bd682dd755440e99a9b82654ede7e62")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPropertyValue.ByReference::class)
public interface IPropertyValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): PropertyType?

  @InterfaceMethod(1)
  public fun get_IsNumericScalar(): Boolean

  @InterfaceMethod(2)
  public fun GetUInt8(): Byte

  @InterfaceMethod(3)
  public fun GetInt16(): Short

  @InterfaceMethod(4)
  public fun GetUInt16(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun GetInt32(): Int

  @InterfaceMethod(6)
  public fun GetUInt32(): WinDef.UINT

  @InterfaceMethod(7)
  public fun GetInt64(): Long

  @InterfaceMethod(8)
  public fun GetUInt64(): WinDef.ULONG

  @InterfaceMethod(9)
  public fun GetSingle(): Float

  @InterfaceMethod(10)
  public fun GetDouble(): Double

  @InterfaceMethod(11)
  public fun GetChar16(): Char

  @InterfaceMethod(12)
  public fun GetBoolean(): Boolean

  @InterfaceMethod(13)
  public fun GetString(): String?

  @InterfaceMethod(14)
  public fun GetGuid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(15)
  public fun GetDateTime(): DateTime?

  @InterfaceMethod(16)
  public fun GetTimeSpan(): TimeSpan?

  @InterfaceMethod(17)
  public fun GetPoint(): Point?

  @InterfaceMethod(18)
  public fun GetSize(): Size?

  @InterfaceMethod(19)
  public fun GetRect(): Rect?

  @InterfaceMethod(20)
  public fun GetUInt8Array(value: OutArray<Byte>): Unit

  @InterfaceMethod(21)
  public fun GetInt16Array(value: OutArray<Short>): Unit

  @InterfaceMethod(22)
  public fun GetUInt16Array(value: OutArray<WinDef.USHORT>): Unit

  @InterfaceMethod(23)
  public fun GetInt32Array(value: OutArray<Int>): Unit

  @InterfaceMethod(24)
  public fun GetUInt32Array(value: OutArray<WinDef.UINT>): Unit

  @InterfaceMethod(25)
  public fun GetInt64Array(value: OutArray<Long>): Unit

  @InterfaceMethod(26)
  public fun GetUInt64Array(value: OutArray<WinDef.ULONG>): Unit

  @InterfaceMethod(27)
  public fun GetSingleArray(value: OutArray<Float>): Unit

  @InterfaceMethod(28)
  public fun GetDoubleArray(value: OutArray<Double>): Unit

  @InterfaceMethod(29)
  public fun GetChar16Array(value: OutArray<Char>): Unit

  @InterfaceMethod(30)
  public fun GetBooleanArray(value: OutArray<Boolean>): Unit

  @InterfaceMethod(31)
  public fun GetStringArray(value: OutArray<String?>): Unit

  @InterfaceMethod(32)
  public fun GetInspectableArray(value: OutArray<IUnknown?>): Unit

  @InterfaceMethod(33)
  public fun GetGuidArray(value: OutArray<com.sun.jna.platform.win32.Guid.GUID?>): Unit

  @InterfaceMethod(34)
  public fun GetDateTimeArray(value: OutArray<DateTime?>): Unit

  @InterfaceMethod(35)
  public fun GetTimeSpanArray(value: OutArray<TimeSpan?>): Unit

  @InterfaceMethod(36)
  public fun GetPointArray(value: OutArray<Point?>): Unit

  @InterfaceMethod(37)
  public fun GetSizeArray(value: OutArray<Size?>): Unit

  @InterfaceMethod(38)
  public fun GetRectArray(value: OutArray<Rect?>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPropertyValue>
      {
    public override fun getValue() = ABI.makeIPropertyValue(pointer.getPointer(0))

    public fun setValue(value: IPropertyValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPropertyValue {
    public val __1012155281_Ptr: Pointer?

    public val _1012155281_VtblPtr: Pointer?
      get() = __1012155281_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): PropertyType? {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyType>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsNumericScalar(): Boolean {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetUInt8(): Byte {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun GetInt16(): Short {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Short>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Short>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun GetUInt16(): WinDef.USHORT {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun GetInt32(): Int {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun GetUInt32(): WinDef.UINT {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun GetInt64(): Long {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun GetUInt64(): WinDef.ULONG {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun GetSingle(): Float {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun GetDouble(): Double {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun GetChar16(): Char {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Char>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Char>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun GetBoolean(): Boolean {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun GetString(): String? {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetGuid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun GetDateTime(): DateTime? {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetTimeSpan(): TimeSpan? {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun GetPoint(): Point? {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun GetSize(): Size? {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetRect(): Rect? {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun GetUInt8Array(value: OutArray<Byte>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun GetInt16Array(value: OutArray<Short>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun GetUInt16Array(value: OutArray<WinDef.USHORT>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun GetInt32Array(value: OutArray<Int>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun GetUInt32Array(value: OutArray<WinDef.UINT>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun GetInt64Array(value: OutArray<Long>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun GetUInt64Array(value: OutArray<WinDef.ULONG>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun GetSingleArray(value: OutArray<Float>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun GetDoubleArray(value: OutArray<Double>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun GetChar16Array(value: OutArray<Char>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun GetBooleanArray(value: OutArray<Boolean>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun GetStringArray(value: OutArray<String?>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun GetInspectableArray(value: OutArray<IUnknown?>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun GetGuidArray(value: OutArray<com.sun.jna.platform.win32.Guid.GUID?>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun GetDateTimeArray(value: OutArray<DateTime?>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun GetTimeSpanArray(value: OutArray<TimeSpan?>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun GetPointArray(value: OutArray<Point?>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun GetSizeArray(value: OutArray<Size?>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun GetRectArray(value: OutArray<Rect?>): Unit {
      val fnPtr = _1012155281_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012155281_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPropertyValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1012155281_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertyValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4bd682dd755440e99a9b82654ede7e62")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertyValue(ptr: Pointer?): WithDefault = IPropertyValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertyValue {
      val address = segment.toRawLongValue()
      return makeIPropertyValue(Pointer(address))
    }

    public override fun toNative(obj: IPropertyValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1012155281_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertyValue): Array<IPropertyValue?> = (elements as
        Array<IPropertyValue?>).castToImpl<IPropertyValue,IPropertyValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertyValue?> =
        arrayOfNulls<IPropertyValue_Impl>(size) as Array<IPropertyValue?>
  }
}
