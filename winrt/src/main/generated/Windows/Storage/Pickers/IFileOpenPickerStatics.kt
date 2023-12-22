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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFileOpenPickerStatics.ABI::class)
@Signature("{6821573b-2f02-4833-96d4-abbfad72b67b}")
@Guid("6821573b2f02483396d4abbfad72b67b")
@WinRTInterface("6821573b2f02483396d4abbfad72b67b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileOpenPickerStatics.ByReference::class)
public interface IFileOpenPickerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ResumePickSingleFileAsync(): IAsyncOperation<StorageFile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileOpenPickerStatics> {
    public override fun getValue() = ABI.makeIFileOpenPickerStatics(pointer.getPointer(0))

    public fun setValue(value: IFileOpenPickerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileOpenPickerStatics {
    public val __2000738927_Ptr: Pointer?

    public val _2000738927_VtblPtr: Pointer?
      get() = __2000738927_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ResumePickSingleFileAsync(): IAsyncOperation<StorageFile?>? {
      val fnPtr = _2000738927_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__2000738927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }
  }

  public class IFileOpenPickerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2000738927_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileOpenPickerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6821573b2f02483396d4abbfad72b67b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileOpenPickerStatics(ptr: Pointer?): WithDefault =
        IFileOpenPickerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileOpenPickerStatics {
      val address = segment.toRawLongValue()
      return makeIFileOpenPickerStatics(Pointer(address))
    }

    public override fun toNative(obj: IFileOpenPickerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2000738927_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileOpenPickerStatics): Array<IFileOpenPickerStatics?> =
        (elements as
        Array<IFileOpenPickerStatics?>).castToImpl<IFileOpenPickerStatics,IFileOpenPickerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileOpenPickerStatics?> =
        arrayOfNulls<IFileOpenPickerStatics_Impl>(size) as Array<IFileOpenPickerStatics?>
  }
}
