package Windows.Storage.Streams

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDataReaderStatics.ABI::class)
@Signature("{11fcbfc8-f93a-471b-b121-f379e349313c}")
@Guid("11fcbfc8f93a471bb121f379e349313c")
@WinRTInterface("11fcbfc8f93a471bb121f379e349313c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataReaderStatics.ByReference::class)
public interface IDataReaderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromBuffer(buffer: IBuffer?): DataReader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataReaderStatics> {
    public override fun getValue() = ABI.makeIDataReaderStatics(pointer.getPointer(0))

    public fun setValue(value: IDataReaderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataReaderStatics {
    public val __814535716_Ptr: Pointer?

    public val _814535716_VtblPtr: Pointer?
      get() = __814535716_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromBuffer(buffer: IBuffer?): DataReader? {
      val fnPtr = _814535716_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataReader>()
      val hr = fn.invokeHR(arrayOf(__814535716_Ptr, marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataReader>(result.getValue())
      return resultValue
    }
  }

  public class IDataReaderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __814535716_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataReaderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("11fcbfc8f93a471bb121f379e349313c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataReaderStatics(ptr: Pointer?): WithDefault = IDataReaderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataReaderStatics {
      val address = segment.toRawLongValue()
      return makeIDataReaderStatics(Pointer(address))
    }

    public override fun toNative(obj: IDataReaderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__814535716_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataReaderStatics): Array<IDataReaderStatics?> =
        (elements as
        Array<IDataReaderStatics?>).castToImpl<IDataReaderStatics,IDataReaderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataReaderStatics?> =
        arrayOfNulls<IDataReaderStatics_Impl>(size) as Array<IDataReaderStatics?>
  }
}
