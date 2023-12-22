package Windows.Storage.Pickers

import Windows.Foundation.IAsyncOperation
import Windows.Storage.StorageFile
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFileOpenPickerWithOperationId.ABI::class)
@Signature("{3f57b569-2522-4ca5-aa73-a15509f1fcbf}")
@Guid("3f57b56925224ca5aa73a15509f1fcbf")
@WinRTInterface("3f57b56925224ca5aa73a15509f1fcbf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileOpenPickerWithOperationId.ByReference::class)
public interface IFileOpenPickerWithOperationId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PickSingleFileAsync(pickerOperationId: String?): IAsyncOperation<StorageFile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileOpenPickerWithOperationId> {
    public override fun getValue() = ABI.makeIFileOpenPickerWithOperationId(pointer.getPointer(0))

    public fun setValue(value: IFileOpenPickerWithOperationId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileOpenPickerWithOperationId {
    public val __401707238_Ptr: Pointer?

    public val _401707238_VtblPtr: Pointer?
      get() = __401707238_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PickSingleFileAsync(pickerOperationId: String?):
        IAsyncOperation<StorageFile?>? {
      val fnPtr = _401707238_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__401707238_Ptr, marshalToNative(pickerOperationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }
  }

  public class IFileOpenPickerWithOperationId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __401707238_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileOpenPickerWithOperationId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f57b56925224ca5aa73a15509f1fcbf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileOpenPickerWithOperationId(ptr: Pointer?): WithDefault =
        IFileOpenPickerWithOperationId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileOpenPickerWithOperationId {
      val address = segment.toRawLongValue()
      return makeIFileOpenPickerWithOperationId(Pointer(address))
    }

    public override fun toNative(obj: IFileOpenPickerWithOperationId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__401707238_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileOpenPickerWithOperationId):
        Array<IFileOpenPickerWithOperationId?> = (elements as
        Array<IFileOpenPickerWithOperationId?>).castToImpl<IFileOpenPickerWithOperationId,IFileOpenPickerWithOperationId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileOpenPickerWithOperationId?> =
        arrayOfNulls<IFileOpenPickerWithOperationId_Impl>(size) as
        Array<IFileOpenPickerWithOperationId?>
  }
}
