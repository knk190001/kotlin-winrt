package Windows.Devices.Gpio

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IGpioChangeReader.ABI::class)
@Signature("{0abc885f-e031-48e8-8590-70de78363c6d}")
@Guid("0abc885fe03148e8859070de78363c6d")
@WinRTInterface("0abc885fe03148e8859070de78363c6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioChangeReader.ByReference::class)
public interface IGpioChangeReader : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Capacity(): Int

  @InterfaceMethod(1)
  public fun get_Length(): Int

  @InterfaceMethod(2)
  public fun get_IsEmpty(): Boolean

  @InterfaceMethod(3)
  public fun get_IsOverflowed(): Boolean

  @InterfaceMethod(4)
  public fun put_Polarity(value: GpioChangePolarity?): Unit

  @InterfaceMethod(5)
  public fun get_Polarity(): GpioChangePolarity?

  @InterfaceMethod(6)
  public fun get_IsStarted(): Boolean

  @InterfaceMethod(7)
  public fun Start(): Unit

  @InterfaceMethod(8)
  public fun Stop(): Unit

  @InterfaceMethod(9)
  public fun Clear(): Unit

  @InterfaceMethod(10)
  public fun GetNextItem(): GpioChangeRecord?

  @InterfaceMethod(11)
  public fun PeekNextItem(): GpioChangeRecord?

  @InterfaceMethod(12)
  public fun GetAllItems(): IVector<GpioChangeRecord?>?

  @InterfaceMethod(13)
  public fun WaitForItemsAsync(count: Int): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGpioChangeReader> {
    public override fun getValue() = ABI.makeIGpioChangeReader(pointer.getPointer(0))

    public fun setValue(value: IGpioChangeReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioChangeReader, IClosable.WithDefault {
    public val __1621227424_Ptr: Pointer?

    public val _1621227424_VtblPtr: Pointer?
      get() = __1621227424_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Capacity(): Int {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Length(): Int {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsEmpty(): Boolean {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsOverflowed(): Boolean {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_Polarity(value: GpioChangePolarity?): Unit {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Polarity(): GpioChangePolarity? {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioChangePolarity>()
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioChangePolarity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsStarted(): Boolean {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun Start(): Unit {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun Stop(): Unit {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun Clear(): Unit {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun GetNextItem(): GpioChangeRecord? {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioChangeRecord>()
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioChangeRecord>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun PeekNextItem(): GpioChangeRecord? {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioChangeRecord>()
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioChangeRecord>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetAllItems(): IVector<GpioChangeRecord?>? {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<GpioChangeRecord?>>()
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<GpioChangeRecord?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun WaitForItemsAsync(count: Int): IAsyncAction? {
      val fnPtr = _1621227424_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1621227424_Ptr, count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IGpioChangeReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1621227424_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1621227424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioChangeReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0abc885fe03148e8859070de78363c6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioChangeReader(ptr: Pointer?): WithDefault = IGpioChangeReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGpioChangeReader {
      val address = segment.toRawLongValue()
      return makeIGpioChangeReader(Pointer(address))
    }

    public override fun toNative(obj: IGpioChangeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1621227424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioChangeReader): Array<IGpioChangeReader?> = (elements
        as Array<IGpioChangeReader?>).castToImpl<IGpioChangeReader,IGpioChangeReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioChangeReader?> =
        arrayOfNulls<IGpioChangeReader_Impl>(size) as Array<IGpioChangeReader?>
  }
}
