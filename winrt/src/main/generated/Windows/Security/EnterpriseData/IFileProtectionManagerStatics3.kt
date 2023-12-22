package Windows.Security.EnterpriseData

import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageItem
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

@ABIMarker(IFileProtectionManagerStatics3.ABI::class)
@Signature("{6918849a-624f-46d6-b241-e9cd5fdf3e3f}")
@Guid("6918849a624f46d6b241e9cd5fdf3e3f")
@WinRTInterface("6918849a624f46d6b241e9cd5fdf3e3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileProtectionManagerStatics3.ByReference::class)
public interface IFileProtectionManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun UnprotectAsync(target: IStorageItem?): IAsyncOperation<FileProtectionInfo?>?

  @InterfaceMethod(1)
  public fun UnprotectAsync(target: IStorageItem?, options: FileUnprotectOptions?):
      IAsyncOperation<FileProtectionInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileProtectionManagerStatics3> {
    public override fun getValue() = ABI.makeIFileProtectionManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IFileProtectionManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileProtectionManagerStatics3 {
    public val __463197717_Ptr: Pointer?

    public val _463197717_VtblPtr: Pointer?
      get() = __463197717_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun UnprotectAsync(target: IStorageItem?):
        IAsyncOperation<FileProtectionInfo?>? {
      val fnPtr = _463197717_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FileProtectionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__463197717_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FileProtectionInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UnprotectAsync(target: IStorageItem?, options: FileUnprotectOptions?):
        IAsyncOperation<FileProtectionInfo?>? {
      val fnPtr = _463197717_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FileProtectionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__463197717_Ptr, marshalToNative(target),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FileProtectionInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IFileProtectionManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __463197717_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileProtectionManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6918849a624f46d6b241e9cd5fdf3e3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileProtectionManagerStatics3(ptr: Pointer?): WithDefault =
        IFileProtectionManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileProtectionManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIFileProtectionManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IFileProtectionManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__463197717_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileProtectionManagerStatics3):
        Array<IFileProtectionManagerStatics3?> = (elements as
        Array<IFileProtectionManagerStatics3?>).castToImpl<IFileProtectionManagerStatics3,IFileProtectionManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileProtectionManagerStatics3?> =
        arrayOfNulls<IFileProtectionManagerStatics3_Impl>(size) as
        Array<IFileProtectionManagerStatics3?>
  }
}
