package Windows.ApplicationModel.UserDataTasks

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IUserDataTaskReader.ABI::class)
@Signature("{03e688b1-4ccf-4500-883b-e76290cfed63}")
@Guid("03e688b14ccf4500883be76290cfed63")
@WinRTInterface("03e688b14ccf4500883be76290cfed63")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskReader.ByReference::class)
public interface IUserDataTaskReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadBatchAsync(): IAsyncOperation<UserDataTaskBatch?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskReader> {
    public override fun getValue() = ABI.makeIUserDataTaskReader(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskReader {
    public val __386961289_Ptr: Pointer?

    public val _386961289_VtblPtr: Pointer?
      get() = __386961289_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadBatchAsync(): IAsyncOperation<UserDataTaskBatch?>? {
      val fnPtr = _386961289_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataTaskBatch?>>()
      val hr = fn.invokeHR(arrayOf(__386961289_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataTaskBatch?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __386961289_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03e688b14ccf4500883be76290cfed63")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskReader(ptr: Pointer?): WithDefault = IUserDataTaskReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskReader {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskReader(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__386961289_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskReader): Array<IUserDataTaskReader?> =
        (elements as
        Array<IUserDataTaskReader?>).castToImpl<IUserDataTaskReader,IUserDataTaskReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskReader?> =
        arrayOfNulls<IUserDataTaskReader_Impl>(size) as Array<IUserDataTaskReader?>
  }
}
