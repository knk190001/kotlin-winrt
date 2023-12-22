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

@ABIMarker(IDataReaderFactory.ABI::class)
@Signature("{d7527847-57da-4e15-914c-06806699a098}")
@Guid("d752784757da4e15914c06806699a098")
@WinRTInterface("d752784757da4e15914c06806699a098")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataReaderFactory.ByReference::class)
public interface IDataReaderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateDataReader(inputStream: IInputStream?): DataReader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataReaderFactory> {
    public override fun getValue() = ABI.makeIDataReaderFactory(pointer.getPointer(0))

    public fun setValue(value: IDataReaderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataReaderFactory {
    public val __1619789161_Ptr: Pointer?

    public val _1619789161_VtblPtr: Pointer?
      get() = __1619789161_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateDataReader(inputStream: IInputStream?): DataReader? {
      val fnPtr = _1619789161_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataReader>()
      val hr = fn.invokeHR(arrayOf(__1619789161_Ptr, marshalToNative(inputStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataReader>(result.getValue())
      return resultValue
    }
  }

  public class IDataReaderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1619789161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataReaderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d752784757da4e15914c06806699a098")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataReaderFactory(ptr: Pointer?): WithDefault = IDataReaderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataReaderFactory {
      val address = segment.toRawLongValue()
      return makeIDataReaderFactory(Pointer(address))
    }

    public override fun toNative(obj: IDataReaderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1619789161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataReaderFactory): Array<IDataReaderFactory?> =
        (elements as
        Array<IDataReaderFactory?>).castToImpl<IDataReaderFactory,IDataReaderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataReaderFactory?> =
        arrayOfNulls<IDataReaderFactory_Impl>(size) as Array<IDataReaderFactory?>
  }
}
