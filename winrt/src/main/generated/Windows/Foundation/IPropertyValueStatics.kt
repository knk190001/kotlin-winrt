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

@ABIMarker(IPropertyValueStatics.ABI::class)
@Signature("{629bdbc8-d932-4ff4-96b9-8d96c5c1e858}")
@Guid("629bdbc8d9324ff496b98d96c5c1e858")
@WinRTInterface("629bdbc8d9324ff496b98d96c5c1e858")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPropertyValueStatics.ByReference::class)
public interface IPropertyValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateEmpty(): IUnknown?

  @InterfaceMethod(1)
  public fun CreateUInt8(value: Byte): IUnknown?

  @InterfaceMethod(2)
  public fun CreateInt16(value: Short): IUnknown?

  @InterfaceMethod(3)
  public fun CreateUInt16(value: WinDef.USHORT): IUnknown?

  @InterfaceMethod(4)
  public fun CreateInt32(value: Int): IUnknown?

  @InterfaceMethod(5)
  public fun CreateUInt32(value: WinDef.UINT): IUnknown?

  @InterfaceMethod(6)
  public fun CreateInt64(value: Long): IUnknown?

  @InterfaceMethod(7)
  public fun CreateUInt64(value: WinDef.ULONG): IUnknown?

  @InterfaceMethod(8)
  public fun CreateSingle(value: Float): IUnknown?

  @InterfaceMethod(9)
  public fun CreateDouble(value: Double): IUnknown?

  @InterfaceMethod(10)
  public fun CreateChar16(value: Char): IUnknown?

  @InterfaceMethod(11)
  public fun CreateBoolean(value: Boolean): IUnknown?

  @InterfaceMethod(12)
  public fun CreateString(value: String?): IUnknown?

  @InterfaceMethod(13)
  public fun CreateInspectable(value: IUnknown?): IUnknown?

  @InterfaceMethod(14)
  public fun CreateGuid(value: com.sun.jna.platform.win32.Guid.GUID?): IUnknown?

  @InterfaceMethod(15)
  public fun CreateDateTime(value: DateTime?): IUnknown?

  @InterfaceMethod(16)
  public fun CreateTimeSpan(value: TimeSpan?): IUnknown?

  @InterfaceMethod(17)
  public fun CreatePoint(value: Point?): IUnknown?

  @InterfaceMethod(18)
  public fun CreateSize(value: Size?): IUnknown?

  @InterfaceMethod(19)
  public fun CreateRect(value: Rect?): IUnknown?

  @InterfaceMethod(20)
  public fun CreateUInt8Array(value: Array<Byte>): IUnknown?

  @InterfaceMethod(21)
  public fun CreateInt16Array(value: Array<Short>): IUnknown?

  @InterfaceMethod(22)
  public fun CreateUInt16Array(value: Array<WinDef.USHORT>): IUnknown?

  @InterfaceMethod(23)
  public fun CreateInt32Array(value: Array<Int>): IUnknown?

  @InterfaceMethod(24)
  public fun CreateUInt32Array(value: Array<WinDef.UINT>): IUnknown?

  @InterfaceMethod(25)
  public fun CreateInt64Array(value: Array<Long>): IUnknown?

  @InterfaceMethod(26)
  public fun CreateUInt64Array(value: Array<WinDef.ULONG>): IUnknown?

  @InterfaceMethod(27)
  public fun CreateSingleArray(value: Array<Float>): IUnknown?

  @InterfaceMethod(28)
  public fun CreateDoubleArray(value: Array<Double>): IUnknown?

  @InterfaceMethod(29)
  public fun CreateChar16Array(value: Array<Char>): IUnknown?

  @InterfaceMethod(30)
  public fun CreateBooleanArray(value: Array<Boolean>): IUnknown?

  @InterfaceMethod(31)
  public fun CreateStringArray(value: Array<String?>): IUnknown?

  @InterfaceMethod(32)
  public fun CreateInspectableArray(value: Array<IUnknown?>): IUnknown?

  @InterfaceMethod(33)
  public fun CreateGuidArray(value: Array<com.sun.jna.platform.win32.Guid.GUID?>): IUnknown?

  @InterfaceMethod(34)
  public fun CreateDateTimeArray(value: Array<DateTime?>): IUnknown?

  @InterfaceMethod(35)
  public fun CreateTimeSpanArray(value: Array<TimeSpan?>): IUnknown?

  @InterfaceMethod(36)
  public fun CreatePointArray(value: Array<Point?>): IUnknown?

  @InterfaceMethod(37)
  public fun CreateSizeArray(value: Array<Size?>): IUnknown?

  @InterfaceMethod(38)
  public fun CreateRectArray(value: Array<Rect?>): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPropertyValueStatics> {
    public override fun getValue() = ABI.makeIPropertyValueStatics(pointer.getPointer(0))

    public fun setValue(value: IPropertyValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPropertyValueStatics {
    public val __1265017100_Ptr: Pointer?

    public val _1265017100_VtblPtr: Pointer?
      get() = __1265017100_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateEmpty(): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateUInt8(value: Byte): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateInt16(value: Short): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateUInt16(value: WinDef.USHORT): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateInt32(value: Int): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateUInt32(value: WinDef.UINT): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateInt64(value: Long): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateUInt64(value: WinDef.ULONG): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateSingle(value: Float): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateDouble(value: Double): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreateChar16(value: Char): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun CreateBoolean(value: Boolean): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun CreateString(value: String?): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun CreateInspectable(value: IUnknown?): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun CreateGuid(value: com.sun.jna.platform.win32.Guid.GUID?): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun CreateDateTime(value: DateTime?): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun CreateTimeSpan(value: TimeSpan?): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun CreatePoint(value: Point?): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun CreateSize(value: Size?): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun CreateRect(value: Rect?): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun CreateUInt8Array(value: Array<Byte>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun CreateInt16Array(value: Array<Short>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun CreateUInt16Array(value: Array<WinDef.USHORT>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun CreateInt32Array(value: Array<Int>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun CreateUInt32Array(value: Array<WinDef.UINT>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun CreateInt64Array(value: Array<Long>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun CreateUInt64Array(value: Array<WinDef.ULONG>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun CreateSingleArray(value: Array<Float>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun CreateDoubleArray(value: Array<Double>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun CreateChar16Array(value: Array<Char>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun CreateBooleanArray(value: Array<Boolean>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun CreateStringArray(value: Array<String?>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun CreateInspectableArray(value: Array<IUnknown?>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun CreateGuidArray(value: Array<com.sun.jna.platform.win32.Guid.GUID?>):
        IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun CreateDateTimeArray(value: Array<DateTime?>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun CreateTimeSpanArray(value: Array<TimeSpan?>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun CreatePointArray(value: Array<Point?>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun CreateSizeArray(value: Array<Size?>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun CreateRectArray(value: Array<Rect?>): IUnknown? {
      val fnPtr = _1265017100_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1265017100_Ptr, value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IPropertyValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1265017100_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertyValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("629bdbc8d9324ff496b98d96c5c1e858")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertyValueStatics(ptr: Pointer?): WithDefault =
        IPropertyValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertyValueStatics {
      val address = segment.toRawLongValue()
      return makeIPropertyValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IPropertyValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1265017100_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertyValueStatics): Array<IPropertyValueStatics?> =
        (elements as
        Array<IPropertyValueStatics?>).castToImpl<IPropertyValueStatics,IPropertyValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertyValueStatics?> =
        arrayOfNulls<IPropertyValueStatics_Impl>(size) as Array<IPropertyValueStatics?>
  }
}
