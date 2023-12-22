package Windows.Storage.Streams

import Windows.Foundation.DateTime
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

@ABIMarker(IDataReader.ABI::class)
@Signature("{e2b50029-b4c1-4314-a4b8-fb813a2f275e}")
@Guid("e2b50029b4c14314a4b8fb813a2f275e")
@WinRTInterface("e2b50029b4c14314a4b8fb813a2f275e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataReader.ByReference::class)
public interface IDataReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UnconsumedBufferLength(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_UnicodeEncoding(): UnicodeEncoding?

  @InterfaceMethod(2)
  public fun put_UnicodeEncoding(value: UnicodeEncoding?): Unit

  @InterfaceMethod(3)
  public fun get_ByteOrder(): ByteOrder?

  @InterfaceMethod(4)
  public fun put_ByteOrder(value: ByteOrder?): Unit

  @InterfaceMethod(5)
  public fun get_InputStreamOptions(): InputStreamOptions?

  @InterfaceMethod(6)
  public fun put_InputStreamOptions(value: InputStreamOptions?): Unit

  @InterfaceMethod(7)
  public fun ReadByte(): Byte

  @InterfaceMethod(8)
  public fun ReadBytes(value: Array<Byte>): Unit

  @InterfaceMethod(9)
  public fun ReadBuffer(length: WinDef.UINT): IBuffer?

  @InterfaceMethod(10)
  public fun ReadBoolean(): Boolean

  @InterfaceMethod(11)
  public fun ReadGuid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(12)
  public fun ReadInt16(): Short

  @InterfaceMethod(13)
  public fun ReadInt32(): Int

  @InterfaceMethod(14)
  public fun ReadInt64(): Long

  @InterfaceMethod(15)
  public fun ReadUInt16(): WinDef.USHORT

  @InterfaceMethod(16)
  public fun ReadUInt32(): WinDef.UINT

  @InterfaceMethod(17)
  public fun ReadUInt64(): WinDef.ULONG

  @InterfaceMethod(18)
  public fun ReadSingle(): Float

  @InterfaceMethod(19)
  public fun ReadDouble(): Double

  @InterfaceMethod(20)
  public fun ReadString(codeUnitCount: WinDef.UINT): String?

  @InterfaceMethod(21)
  public fun ReadDateTime(): DateTime?

  @InterfaceMethod(22)
  public fun ReadTimeSpan(): TimeSpan?

  @InterfaceMethod(23)
  public fun LoadAsync(count: WinDef.UINT): DataReaderLoadOperation?

  @InterfaceMethod(24)
  public fun DetachBuffer(): IBuffer?

  @InterfaceMethod(25)
  public fun DetachStream(): IInputStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataReader> {
    public override fun getValue() = ABI.makeIDataReader(pointer.getPointer(0))

    public fun setValue(value: IDataReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataReader {
    public val __943015009_Ptr: Pointer?

    public val _943015009_VtblPtr: Pointer?
      get() = __943015009_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UnconsumedBufferLength(): WinDef.UINT {
      val fnPtr = _943015009_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_UnicodeEncoding(): UnicodeEncoding? {
      val fnPtr = _943015009_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnicodeEncoding>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnicodeEncoding>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_UnicodeEncoding(value: UnicodeEncoding?): Unit {
      val fnPtr = _943015009_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ByteOrder(): ByteOrder? {
      val fnPtr = _943015009_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ByteOrder>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ByteOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ByteOrder(value: ByteOrder?): Unit {
      val fnPtr = _943015009_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_InputStreamOptions(): InputStreamOptions? {
      val fnPtr = _943015009_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputStreamOptions>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputStreamOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_InputStreamOptions(value: InputStreamOptions?): Unit {
      val fnPtr = _943015009_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun ReadByte(): Byte {
      val fnPtr = _943015009_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun ReadBytes(value: Array<Byte>): Unit {
      val fnPtr = _943015009_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun ReadBuffer(length: WinDef.UINT): IBuffer? {
      val fnPtr = _943015009_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr, length, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun ReadBoolean(): Boolean {
      val fnPtr = _943015009_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun ReadGuid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _943015009_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun ReadInt16(): Short {
      val fnPtr = _943015009_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Short>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Short>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun ReadInt32(): Int {
      val fnPtr = _943015009_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun ReadInt64(): Long {
      val fnPtr = _943015009_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun ReadUInt16(): WinDef.USHORT {
      val fnPtr = _943015009_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun ReadUInt32(): WinDef.UINT {
      val fnPtr = _943015009_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun ReadUInt64(): WinDef.ULONG {
      val fnPtr = _943015009_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun ReadSingle(): Float {
      val fnPtr = _943015009_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun ReadDouble(): Double {
      val fnPtr = _943015009_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun ReadString(codeUnitCount: WinDef.UINT): String? {
      val fnPtr = _943015009_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr, codeUnitCount, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun ReadDateTime(): DateTime? {
      val fnPtr = _943015009_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun ReadTimeSpan(): TimeSpan? {
      val fnPtr = _943015009_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun LoadAsync(count: WinDef.UINT): DataReaderLoadOperation? {
      val fnPtr = _943015009_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataReaderLoadOperation>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr, count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataReaderLoadOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun DetachBuffer(): IBuffer? {
      val fnPtr = _943015009_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun DetachStream(): IInputStream? {
      val fnPtr = _943015009_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__943015009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }
  }

  public class IDataReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __943015009_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e2b50029b4c14314a4b8fb813a2f275e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataReader(ptr: Pointer?): WithDefault = IDataReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataReader {
      val address = segment.toRawLongValue()
      return makeIDataReader(Pointer(address))
    }

    public override fun toNative(obj: IDataReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__943015009_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataReader): Array<IDataReader?> = (elements as
        Array<IDataReader?>).castToImpl<IDataReader,IDataReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataReader?> =
        arrayOfNulls<IDataReader_Impl>(size) as Array<IDataReader?>
  }
}
