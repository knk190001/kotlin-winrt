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

@ABIMarker(IDataWriterFactory.ABI::class)
@Signature("{338c67c2-8b84-4c2b-9c50-7b8767847a1f}")
@Guid("338c67c28b844c2b9c507b8767847a1f")
@WinRTInterface("338c67c28b844c2b9c507b8767847a1f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataWriterFactory.ByReference::class)
public interface IDataWriterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateDataWriter(outputStream: IOutputStream?): DataWriter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataWriterFactory> {
    public override fun getValue() = ABI.makeIDataWriterFactory(pointer.getPointer(0))

    public fun setValue(value: IDataWriterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataWriterFactory {
    public val __1490891705_Ptr: Pointer?

    public val _1490891705_VtblPtr: Pointer?
      get() = __1490891705_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateDataWriter(outputStream: IOutputStream?): DataWriter? {
      val fnPtr = _1490891705_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataWriter>()
      val hr = fn.invokeHR(arrayOf(__1490891705_Ptr, marshalToNative(outputStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataWriter>(result.getValue())
      return resultValue
    }
  }

  public class IDataWriterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1490891705_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataWriterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("338c67c28b844c2b9c507b8767847a1f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataWriterFactory(ptr: Pointer?): WithDefault = IDataWriterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataWriterFactory {
      val address = segment.toRawLongValue()
      return makeIDataWriterFactory(Pointer(address))
    }

    public override fun toNative(obj: IDataWriterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1490891705_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataWriterFactory): Array<IDataWriterFactory?> =
        (elements as
        Array<IDataWriterFactory?>).castToImpl<IDataWriterFactory,IDataWriterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataWriterFactory?> =
        arrayOfNulls<IDataWriterFactory_Impl>(size) as Array<IDataWriterFactory?>
  }
}
