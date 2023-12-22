package Windows.Storage.Compression

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Storage.Streams.IOutputStream
import Windows.Storage.Streams.IOutputStream.ABI.IID
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

@ABIMarker(ICompressor.ABI::class)
@Signature("{0ac3645a-57ac-4ee1-b702-84d39d5424e0}")
@Guid("0ac3645a57ac4ee1b70284d39d5424e0")
@WinRTInterface("0ac3645a57ac4ee1b70284d39d5424e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompressor.ByReference::class)
public interface ICompressor : NativeMapped, IWinRTInterface, IOutputStream, IClosable {
  @InterfaceMethod(0)
  public fun FinishAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun DetachStream(): IOutputStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICompressor> {
    public override fun getValue() = ABI.makeICompressor(pointer.getPointer(0))

    public fun setValue(value: ICompressor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompressor, IOutputStream.WithDefault, IClosable.WithDefault {
    public val __1048478406_Ptr: Pointer?

    public val _1048478406_VtblPtr: Pointer?
      get() = __1048478406_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FinishAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1048478406_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1048478406_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun DetachStream(): IOutputStream? {
      val fnPtr = _1048478406_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__1048478406_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }
  }

  public class ICompressor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IOutputStream, IClosable {
    public override val __591248843_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1048478406_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1048478406_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1048478406_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompressor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ac3645a57ac4ee1b70284d39d5424e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompressor(ptr: Pointer?): WithDefault = ICompressor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompressor {
      val address = segment.toRawLongValue()
      return makeICompressor(Pointer(address))
    }

    public override fun toNative(obj: ICompressor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1048478406_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompressor): Array<ICompressor?> = (elements as
        Array<ICompressor?>).castToImpl<ICompressor,ICompressor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompressor?> =
        arrayOfNulls<ICompressor_Impl>(size) as Array<ICompressor?>
  }
}
