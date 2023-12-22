package Windows.Foundation.Diagnostics

import Windows.Foundation.DateTime
import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.Foundation.Size
import Windows.Foundation.TimeSpan
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

@ABIMarker(ILoggingFields.ABI::class)
@Signature("{d7f6b7af-762d-4579-83bd-52c23bc333bc}")
@Guid("d7f6b7af762d457983bd52c23bc333bc")
@WinRTInterface("d7f6b7af762d457983bd52c23bc333bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingFields.ByReference::class)
public interface ILoggingFields : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Clear(): Unit

  @InterfaceMethod(1)
  public fun BeginStruct(name: String?): Unit

  @InterfaceMethod(2)
  public fun BeginStruct(name: String?, tags: Int): Unit

  @InterfaceMethod(3)
  public fun EndStruct(): Unit

  @InterfaceMethod(4)
  public fun AddEmpty(name: String?): Unit

  @InterfaceMethod(5)
  public fun AddEmpty(name: String?, format: LoggingFieldFormat?): Unit

  @InterfaceMethod(6)
  public fun AddEmpty(
    name: String?,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(7)
  public fun AddUInt8(name: String?, value: Byte): Unit

  @InterfaceMethod(8)
  public fun AddUInt8(
    name: String?,
    value: Byte,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(9)
  public fun AddUInt8(
    name: String?,
    value: Byte,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(10)
  public fun AddUInt8Array(name: String?, value: Array<Byte>): Unit

  @InterfaceMethod(11)
  public fun AddUInt8Array(
    name: String?,
    value: Array<Byte>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(12)
  public fun AddUInt8Array(
    name: String?,
    value: Array<Byte>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(13)
  public fun AddInt16(name: String?, value: Short): Unit

  @InterfaceMethod(14)
  public fun AddInt16(
    name: String?,
    value: Short,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(15)
  public fun AddInt16(
    name: String?,
    value: Short,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(16)
  public fun AddInt16Array(name: String?, value: Array<Short>): Unit

  @InterfaceMethod(17)
  public fun AddInt16Array(
    name: String?,
    value: Array<Short>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(18)
  public fun AddInt16Array(
    name: String?,
    value: Array<Short>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(19)
  public fun AddUInt16(name: String?, value: WinDef.USHORT): Unit

  @InterfaceMethod(20)
  public fun AddUInt16(
    name: String?,
    value: WinDef.USHORT,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(21)
  public fun AddUInt16(
    name: String?,
    value: WinDef.USHORT,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(22)
  public fun AddUInt16Array(name: String?, value: Array<WinDef.USHORT>): Unit

  @InterfaceMethod(23)
  public fun AddUInt16Array(
    name: String?,
    value: Array<WinDef.USHORT>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(24)
  public fun AddUInt16Array(
    name: String?,
    value: Array<WinDef.USHORT>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(25)
  public fun AddInt32(name: String?, value: Int): Unit

  @InterfaceMethod(26)
  public fun AddInt32(
    name: String?,
    value: Int,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(27)
  public fun AddInt32(
    name: String?,
    value: Int,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(28)
  public fun AddInt32Array(name: String?, value: Array<Int>): Unit

  @InterfaceMethod(29)
  public fun AddInt32Array(
    name: String?,
    value: Array<Int>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(30)
  public fun AddInt32Array(
    name: String?,
    value: Array<Int>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(31)
  public fun AddUInt32(name: String?, value: WinDef.UINT): Unit

  @InterfaceMethod(32)
  public fun AddUInt32(
    name: String?,
    value: WinDef.UINT,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(33)
  public fun AddUInt32(
    name: String?,
    value: WinDef.UINT,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(34)
  public fun AddUInt32Array(name: String?, value: Array<WinDef.UINT>): Unit

  @InterfaceMethod(35)
  public fun AddUInt32Array(
    name: String?,
    value: Array<WinDef.UINT>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(36)
  public fun AddUInt32Array(
    name: String?,
    value: Array<WinDef.UINT>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(37)
  public fun AddInt64(name: String?, value: Long): Unit

  @InterfaceMethod(38)
  public fun AddInt64(
    name: String?,
    value: Long,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(39)
  public fun AddInt64(
    name: String?,
    value: Long,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(40)
  public fun AddInt64Array(name: String?, value: Array<Long>): Unit

  @InterfaceMethod(41)
  public fun AddInt64Array(
    name: String?,
    value: Array<Long>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(42)
  public fun AddInt64Array(
    name: String?,
    value: Array<Long>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(43)
  public fun AddUInt64(name: String?, value: WinDef.ULONG): Unit

  @InterfaceMethod(44)
  public fun AddUInt64(
    name: String?,
    value: WinDef.ULONG,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(45)
  public fun AddUInt64(
    name: String?,
    value: WinDef.ULONG,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(46)
  public fun AddUInt64Array(name: String?, value: Array<WinDef.ULONG>): Unit

  @InterfaceMethod(47)
  public fun AddUInt64Array(
    name: String?,
    value: Array<WinDef.ULONG>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(48)
  public fun AddUInt64Array(
    name: String?,
    value: Array<WinDef.ULONG>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(49)
  public fun AddSingle(name: String?, value: Float): Unit

  @InterfaceMethod(50)
  public fun AddSingle(
    name: String?,
    value: Float,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(51)
  public fun AddSingle(
    name: String?,
    value: Float,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(52)
  public fun AddSingleArray(name: String?, value: Array<Float>): Unit

  @InterfaceMethod(53)
  public fun AddSingleArray(
    name: String?,
    value: Array<Float>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(54)
  public fun AddSingleArray(
    name: String?,
    value: Array<Float>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(55)
  public fun AddDouble(name: String?, value: Double): Unit

  @InterfaceMethod(56)
  public fun AddDouble(
    name: String?,
    value: Double,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(57)
  public fun AddDouble(
    name: String?,
    value: Double,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(58)
  public fun AddDoubleArray(name: String?, value: Array<Double>): Unit

  @InterfaceMethod(59)
  public fun AddDoubleArray(
    name: String?,
    value: Array<Double>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(60)
  public fun AddDoubleArray(
    name: String?,
    value: Array<Double>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(61)
  public fun AddChar16(name: String?, value: Char): Unit

  @InterfaceMethod(62)
  public fun AddChar16(
    name: String?,
    value: Char,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(63)
  public fun AddChar16(
    name: String?,
    value: Char,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(64)
  public fun AddChar16Array(name: String?, value: Array<Char>): Unit

  @InterfaceMethod(65)
  public fun AddChar16Array(
    name: String?,
    value: Array<Char>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(66)
  public fun AddChar16Array(
    name: String?,
    value: Array<Char>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(67)
  public fun AddBoolean(name: String?, value: Boolean): Unit

  @InterfaceMethod(68)
  public fun AddBoolean(
    name: String?,
    value: Boolean,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(69)
  public fun AddBoolean(
    name: String?,
    value: Boolean,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(70)
  public fun AddBooleanArray(name: String?, value: Array<Boolean>): Unit

  @InterfaceMethod(71)
  public fun AddBooleanArray(
    name: String?,
    value: Array<Boolean>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(72)
  public fun AddBooleanArray(
    name: String?,
    value: Array<Boolean>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(73)
  public fun AddString(name: String?, value: String?): Unit

  @InterfaceMethod(74)
  public fun AddString(
    name: String?,
    value: String?,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(75)
  public fun AddString(
    name: String?,
    value: String?,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(76)
  public fun AddStringArray(name: String?, value: Array<String?>): Unit

  @InterfaceMethod(77)
  public fun AddStringArray(
    name: String?,
    value: Array<String?>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(78)
  public fun AddStringArray(
    name: String?,
    value: Array<String?>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(79)
  public fun AddGuid(name: String?, value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(80)
  public fun AddGuid(
    name: String?,
    value: com.sun.jna.platform.win32.Guid.GUID?,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(81)
  public fun AddGuid(
    name: String?,
    value: com.sun.jna.platform.win32.Guid.GUID?,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(82)
  public fun AddGuidArray(name: String?, value: Array<com.sun.jna.platform.win32.Guid.GUID?>): Unit

  @InterfaceMethod(83)
  public fun AddGuidArray(
    name: String?,
    value: Array<com.sun.jna.platform.win32.Guid.GUID?>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(84)
  public fun AddGuidArray(
    name: String?,
    value: Array<com.sun.jna.platform.win32.Guid.GUID?>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(85)
  public fun AddDateTime(name: String?, value: DateTime?): Unit

  @InterfaceMethod(86)
  public fun AddDateTime(
    name: String?,
    value: DateTime?,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(87)
  public fun AddDateTime(
    name: String?,
    value: DateTime?,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(88)
  public fun AddDateTimeArray(name: String?, value: Array<DateTime?>): Unit

  @InterfaceMethod(89)
  public fun AddDateTimeArray(
    name: String?,
    value: Array<DateTime?>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(90)
  public fun AddDateTimeArray(
    name: String?,
    value: Array<DateTime?>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(91)
  public fun AddTimeSpan(name: String?, value: TimeSpan?): Unit

  @InterfaceMethod(92)
  public fun AddTimeSpan(
    name: String?,
    value: TimeSpan?,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(93)
  public fun AddTimeSpan(
    name: String?,
    value: TimeSpan?,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(94)
  public fun AddTimeSpanArray(name: String?, value: Array<TimeSpan?>): Unit

  @InterfaceMethod(95)
  public fun AddTimeSpanArray(
    name: String?,
    value: Array<TimeSpan?>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(96)
  public fun AddTimeSpanArray(
    name: String?,
    value: Array<TimeSpan?>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(97)
  public fun AddPoint(name: String?, value: Point?): Unit

  @InterfaceMethod(98)
  public fun AddPoint(
    name: String?,
    value: Point?,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(99)
  public fun AddPoint(
    name: String?,
    value: Point?,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(100)
  public fun AddPointArray(name: String?, value: Array<Point?>): Unit

  @InterfaceMethod(101)
  public fun AddPointArray(
    name: String?,
    value: Array<Point?>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(102)
  public fun AddPointArray(
    name: String?,
    value: Array<Point?>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(103)
  public fun AddSize(name: String?, value: Size?): Unit

  @InterfaceMethod(104)
  public fun AddSize(
    name: String?,
    value: Size?,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(105)
  public fun AddSize(
    name: String?,
    value: Size?,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(106)
  public fun AddSizeArray(name: String?, value: Array<Size?>): Unit

  @InterfaceMethod(107)
  public fun AddSizeArray(
    name: String?,
    value: Array<Size?>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(108)
  public fun AddSizeArray(
    name: String?,
    value: Array<Size?>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(109)
  public fun AddRect(name: String?, value: Rect?): Unit

  @InterfaceMethod(110)
  public fun AddRect(
    name: String?,
    value: Rect?,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(111)
  public fun AddRect(
    name: String?,
    value: Rect?,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  @InterfaceMethod(112)
  public fun AddRectArray(name: String?, value: Array<Rect?>): Unit

  @InterfaceMethod(113)
  public fun AddRectArray(
    name: String?,
    value: Array<Rect?>,
    format: LoggingFieldFormat?
  ): Unit

  @InterfaceMethod(114)
  public fun AddRectArray(
    name: String?,
    value: Array<Rect?>,
    format: LoggingFieldFormat?,
    tags: Int
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILoggingFields>
      {
    public override fun getValue() = ABI.makeILoggingFields(pointer.getPointer(0))

    public fun setValue(value: ILoggingFields_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingFields {
    public val __1512475381_Ptr: Pointer?

    public val _1512475381_VtblPtr: Pointer?
      get() = __1512475381_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Clear(): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun BeginStruct(name: String?): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun BeginStruct(name: String?, tags: Int): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun EndStruct(): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun AddEmpty(name: String?): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun AddEmpty(name: String?, format: LoggingFieldFormat?): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun AddEmpty(
      name: String?,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(format),
          tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun AddUInt8(name: String?, value: Byte): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun AddUInt8(
      name: String?,
      value: Byte,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun AddUInt8(
      name: String?,
      value: Byte,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun AddUInt8Array(name: String?, value: Array<Byte>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun AddUInt8Array(
      name: String?,
      value: Array<Byte>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun AddUInt8Array(
      name: String?,
      value: Array<Byte>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun AddInt16(name: String?, value: Short): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun AddInt16(
      name: String?,
      value: Short,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun AddInt16(
      name: String?,
      value: Short,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun AddInt16Array(name: String?, value: Array<Short>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun AddInt16Array(
      name: String?,
      value: Array<Short>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun AddInt16Array(
      name: String?,
      value: Array<Short>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun AddUInt16(name: String?, value: WinDef.USHORT): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun AddUInt16(
      name: String?,
      value: WinDef.USHORT,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun AddUInt16(
      name: String?,
      value: WinDef.USHORT,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun AddUInt16Array(name: String?, value: Array<WinDef.USHORT>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun AddUInt16Array(
      name: String?,
      value: Array<WinDef.USHORT>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun AddUInt16Array(
      name: String?,
      value: Array<WinDef.USHORT>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun AddInt32(name: String?, value: Int): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun AddInt32(
      name: String?,
      value: Int,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun AddInt32(
      name: String?,
      value: Int,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun AddInt32Array(name: String?, value: Array<Int>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun AddInt32Array(
      name: String?,
      value: Array<Int>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun AddInt32Array(
      name: String?,
      value: Array<Int>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun AddUInt32(name: String?, value: WinDef.UINT): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun AddUInt32(
      name: String?,
      value: WinDef.UINT,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun AddUInt32(
      name: String?,
      value: WinDef.UINT,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun AddUInt32Array(name: String?, value: Array<WinDef.UINT>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun AddUInt32Array(
      name: String?,
      value: Array<WinDef.UINT>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun AddUInt32Array(
      name: String?,
      value: Array<WinDef.UINT>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun AddInt64(name: String?, value: Long): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun AddInt64(
      name: String?,
      value: Long,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun AddInt64(
      name: String?,
      value: Long,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun AddInt64Array(name: String?, value: Array<Long>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun AddInt64Array(
      name: String?,
      value: Array<Long>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun AddInt64Array(
      name: String?,
      value: Array<Long>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun AddUInt64(name: String?, value: WinDef.ULONG): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun AddUInt64(
      name: String?,
      value: WinDef.ULONG,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun AddUInt64(
      name: String?,
      value: WinDef.ULONG,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun AddUInt64Array(name: String?, value: Array<WinDef.ULONG>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun AddUInt64Array(
      name: String?,
      value: Array<WinDef.ULONG>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun AddUInt64Array(
      name: String?,
      value: Array<WinDef.ULONG>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun AddSingle(name: String?, value: Float): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun AddSingle(
      name: String?,
      value: Float,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(51)
    public override fun AddSingle(
      name: String?,
      value: Float,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun AddSingleArray(name: String?, value: Array<Float>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(53)
    public override fun AddSingleArray(
      name: String?,
      value: Array<Float>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun AddSingleArray(
      name: String?,
      value: Array<Float>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(55)
    public override fun AddDouble(name: String?, value: Double): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(56)
    public override fun AddDouble(
      name: String?,
      value: Double,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(57)
    public override fun AddDouble(
      name: String?,
      value: Double,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(58)
    public override fun AddDoubleArray(name: String?, value: Array<Double>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(59)
    public override fun AddDoubleArray(
      name: String?,
      value: Array<Double>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(60)
    public override fun AddDoubleArray(
      name: String?,
      value: Array<Double>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(61)
    public override fun AddChar16(name: String?, value: Char): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(62)
    public override fun AddChar16(
      name: String?,
      value: Char,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(63)
    public override fun AddChar16(
      name: String?,
      value: Char,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(64)
    public override fun AddChar16Array(name: String?, value: Array<Char>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(65)
    public override fun AddChar16Array(
      name: String?,
      value: Array<Char>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(66)
    public override fun AddChar16Array(
      name: String?,
      value: Array<Char>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(67)
    public override fun AddBoolean(name: String?, value: Boolean): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(68)
    public override fun AddBoolean(
      name: String?,
      value: Boolean,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(69)
    public override fun AddBoolean(
      name: String?,
      value: Boolean,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), value,
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(70)
    public override fun AddBooleanArray(name: String?, value: Array<Boolean>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(71)
    public override fun AddBooleanArray(
      name: String?,
      value: Array<Boolean>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(72)
    public override fun AddBooleanArray(
      name: String?,
      value: Array<Boolean>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(73)
    public override fun AddString(name: String?, value: String?): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(74)
    public override fun AddString(
      name: String?,
      value: String?,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(75)
    public override fun AddString(
      name: String?,
      value: String?,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(81L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(76)
    public override fun AddStringArray(name: String?, value: Array<String?>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(82L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(77)
    public override fun AddStringArray(
      name: String?,
      value: Array<String?>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(83L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(78)
    public override fun AddStringArray(
      name: String?,
      value: Array<String?>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(84L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(79)
    public override fun AddGuid(name: String?, value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(85L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(80)
    public override fun AddGuid(
      name: String?,
      value: com.sun.jna.platform.win32.Guid.GUID?,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(86L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(81)
    public override fun AddGuid(
      name: String?,
      value: com.sun.jna.platform.win32.Guid.GUID?,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(87L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(82)
    public override fun AddGuidArray(name: String?,
        value: Array<com.sun.jna.platform.win32.Guid.GUID?>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(88L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(83)
    public override fun AddGuidArray(
      name: String?,
      value: Array<com.sun.jna.platform.win32.Guid.GUID?>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(89L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(84)
    public override fun AddGuidArray(
      name: String?,
      value: Array<com.sun.jna.platform.win32.Guid.GUID?>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(90L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(85)
    public override fun AddDateTime(name: String?, value: DateTime?): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(91L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(86)
    public override fun AddDateTime(
      name: String?,
      value: DateTime?,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(92L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(87)
    public override fun AddDateTime(
      name: String?,
      value: DateTime?,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(93L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(88)
    public override fun AddDateTimeArray(name: String?, value: Array<DateTime?>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(94L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(89)
    public override fun AddDateTimeArray(
      name: String?,
      value: Array<DateTime?>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(95L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(90)
    public override fun AddDateTimeArray(
      name: String?,
      value: Array<DateTime?>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(96L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(91)
    public override fun AddTimeSpan(name: String?, value: TimeSpan?): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(97L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(92)
    public override fun AddTimeSpan(
      name: String?,
      value: TimeSpan?,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(98L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(93)
    public override fun AddTimeSpan(
      name: String?,
      value: TimeSpan?,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(99L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(94)
    public override fun AddTimeSpanArray(name: String?, value: Array<TimeSpan?>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(100L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(95)
    public override fun AddTimeSpanArray(
      name: String?,
      value: Array<TimeSpan?>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(101L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(96)
    public override fun AddTimeSpanArray(
      name: String?,
      value: Array<TimeSpan?>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(102L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(97)
    public override fun AddPoint(name: String?, value: Point?): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(103L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(98)
    public override fun AddPoint(
      name: String?,
      value: Point?,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(104L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(99)
    public override fun AddPoint(
      name: String?,
      value: Point?,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(105L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(100)
    public override fun AddPointArray(name: String?, value: Array<Point?>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(106L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(101)
    public override fun AddPointArray(
      name: String?,
      value: Array<Point?>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(107L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(102)
    public override fun AddPointArray(
      name: String?,
      value: Array<Point?>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(108L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(103)
    public override fun AddSize(name: String?, value: Size?): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(109L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(104)
    public override fun AddSize(
      name: String?,
      value: Size?,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(110L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(105)
    public override fun AddSize(
      name: String?,
      value: Size?,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(111L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(106)
    public override fun AddSizeArray(name: String?, value: Array<Size?>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(112L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(107)
    public override fun AddSizeArray(
      name: String?,
      value: Array<Size?>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(113L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(108)
    public override fun AddSizeArray(
      name: String?,
      value: Array<Size?>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(114L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(109)
    public override fun AddRect(name: String?, value: Rect?): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(115L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(110)
    public override fun AddRect(
      name: String?,
      value: Rect?,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(116L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(111)
    public override fun AddRect(
      name: String?,
      value: Rect?,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(117L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(112)
    public override fun AddRectArray(name: String?, value: Array<Rect?>): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(118L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(113)
    public override fun AddRectArray(
      name: String?,
      value: Array<Rect?>,
      format: LoggingFieldFormat?
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(119L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(114)
    public override fun AddRectArray(
      name: String?,
      value: Array<Rect?>,
      format: LoggingFieldFormat?,
      tags: Int
    ): Unit {
      val fnPtr = _1512475381_VtblPtr!!.getPointer(120L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512475381_Ptr, marshalToNative(name),
          value.size,marshalToNative(value), marshalToNative(format), tags,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILoggingFields_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1512475381_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingFields, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7f6b7af762d457983bd52c23bc333bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingFields(ptr: Pointer?): WithDefault = ILoggingFields_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingFields {
      val address = segment.toRawLongValue()
      return makeILoggingFields(Pointer(address))
    }

    public override fun toNative(obj: ILoggingFields): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1512475381_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingFields): Array<ILoggingFields?> = (elements as
        Array<ILoggingFields?>).castToImpl<ILoggingFields,ILoggingFields_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingFields?> =
        arrayOfNulls<ILoggingFields_Impl>(size) as Array<ILoggingFields?>
  }
}
