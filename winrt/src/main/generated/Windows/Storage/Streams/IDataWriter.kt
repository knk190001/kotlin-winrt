package Windows.Storage.Streams

import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IDataWriter.ABI::class)
@Signature("{64b89265-d341-4922-b38a-dd4af8808c4e}")
@Guid("64b89265d3414922b38add4af8808c4e")
@WinRTInterface("64b89265d3414922b38add4af8808c4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataWriter.ByReference::class)
public interface IDataWriter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UnstoredBufferLength(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_UnicodeEncoding(): UnicodeEncoding?

  @InterfaceMethod(2)
  public fun put_UnicodeEncoding(value: UnicodeEncoding?): Unit

  @InterfaceMethod(3)
  public fun get_ByteOrder(): ByteOrder?

  @InterfaceMethod(4)
  public fun put_ByteOrder(value: ByteOrder?): Unit

  @InterfaceMethod(5)
  public fun WriteByte(value: Byte): Unit

  @InterfaceMethod(6)
  public fun WriteBytes(value: Array<Byte>): Unit

  @InterfaceMethod(7)
  public fun WriteBuffer(buffer: IBuffer?): Unit

  @InterfaceMethod(8)
  public fun WriteBuffer(
    buffer: IBuffer?,
    start: WinDef.UINT,
    count: WinDef.UINT
  ): Unit

  @InterfaceMethod(9)
  public fun WriteBoolean(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun WriteGuid(value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(11)
  public fun WriteInt16(value: Short): Unit

  @InterfaceMethod(12)
  public fun WriteInt32(value: Int): Unit

  @InterfaceMethod(13)
  public fun WriteInt64(value: Long): Unit

  @InterfaceMethod(14)
  public fun WriteUInt16(value: WinDef.USHORT): Unit

  @InterfaceMethod(15)
  public fun WriteUInt32(value: WinDef.UINT): Unit

  @InterfaceMethod(16)
  public fun WriteUInt64(value: WinDef.ULONG): Unit

  @InterfaceMethod(17)
  public fun WriteSingle(value: Float): Unit

  @InterfaceMethod(18)
  public fun WriteDouble(value: Double): Unit

  @InterfaceMethod(19)
  public fun WriteDateTime(value: DateTime?): Unit

  @InterfaceMethod(20)
  public fun WriteTimeSpan(value: TimeSpan?): Unit

  @InterfaceMethod(21)
  public fun WriteString(value: String?): WinDef.UINT

  @InterfaceMethod(22)
  public fun MeasureString(value: String?): WinDef.UINT

  @InterfaceMethod(23)
  public fun StoreAsync(): DataWriterStoreOperation?

  @InterfaceMethod(24)
  public fun FlushAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(25)
  public fun DetachBuffer(): IBuffer?

  @InterfaceMethod(26)
  public fun DetachStream(): IOutputStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataWriter> {
    public override fun getValue() = ABI.makeIDataWriter(pointer.getPointer(0))

    public fun setValue(value: IDataWriter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataWriter {
    public val __1098420241_Ptr: Pointer?

    public val _1098420241_VtblPtr: Pointer?
      get() = __1098420241_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UnstoredBufferLength(): WinDef.UINT {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_UnicodeEncoding(): UnicodeEncoding? {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnicodeEncoding>()
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnicodeEncoding>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_UnicodeEncoding(value: UnicodeEncoding?): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ByteOrder(): ByteOrder? {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ByteOrder>()
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ByteOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ByteOrder(value: ByteOrder?): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun WriteByte(value: Byte): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun WriteBytes(value: Array<Byte>): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun WriteBuffer(buffer: IBuffer?): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun WriteBuffer(
      buffer: IBuffer?,
      start: WinDef.UINT,
      count: WinDef.UINT
    ): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, marshalToNative(buffer), start, count,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun WriteBoolean(value: Boolean): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun WriteGuid(value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun WriteInt16(value: Short): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun WriteInt32(value: Int): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun WriteInt64(value: Long): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun WriteUInt16(value: WinDef.USHORT): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun WriteUInt32(value: WinDef.UINT): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun WriteUInt64(value: WinDef.ULONG): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun WriteSingle(value: Float): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun WriteDouble(value: Double): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun WriteDateTime(value: DateTime?): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun WriteTimeSpan(value: TimeSpan?): Unit {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun WriteString(value: String?): WinDef.UINT {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun MeasureString(value: String?): WinDef.UINT {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun StoreAsync(): DataWriterStoreOperation? {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataWriterStoreOperation>()
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataWriterStoreOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun FlushAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun DetachBuffer(): IBuffer? {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun DetachStream(): IOutputStream? {
      val fnPtr = _1098420241_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__1098420241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }
  }

  public class IDataWriter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1098420241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataWriter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64b89265d3414922b38add4af8808c4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataWriter(ptr: Pointer?): WithDefault = IDataWriter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataWriter {
      val address = segment.toRawLongValue()
      return makeIDataWriter(Pointer(address))
    }

    public override fun toNative(obj: IDataWriter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1098420241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataWriter): Array<IDataWriter?> = (elements as
        Array<IDataWriter?>).castToImpl<IDataWriter,IDataWriter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataWriter?> =
        arrayOfNulls<IDataWriter_Impl>(size) as Array<IDataWriter?>
  }
}
