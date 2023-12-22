package Windows.Security.EnterpriseData

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

@ABIMarker(IProtectedContainerExportResult.ABI::class)
@Signature("{3948ef95-f7fb-4b42-afb0-df70b41543c1}")
@Guid("3948ef95f7fb4b42afb0df70b41543c1")
@WinRTInterface("3948ef95f7fb4b42afb0df70b41543c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectedContainerExportResult.ByReference::class)
public interface IProtectedContainerExportResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): ProtectedImportExportStatus?

  @InterfaceMethod(1)
  public fun get_File(): StorageFile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectedContainerExportResult> {
    public override fun getValue() = ABI.makeIProtectedContainerExportResult(pointer.getPointer(0))

    public fun setValue(value: IProtectedContainerExportResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectedContainerExportResult {
    public val __903265953_Ptr: Pointer?

    public val _903265953_VtblPtr: Pointer?
      get() = __903265953_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): ProtectedImportExportStatus? {
      val fnPtr = _903265953_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProtectedImportExportStatus>()
      val hr = fn.invokeHR(arrayOf(__903265953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProtectedImportExportStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_File(): StorageFile? {
      val fnPtr = _903265953_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFile>()
      val hr = fn.invokeHR(arrayOf(__903265953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFile>(result.getValue())
      return resultValue
    }
  }

  public class IProtectedContainerExportResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __903265953_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectedContainerExportResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3948ef95f7fb4b42afb0df70b41543c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectedContainerExportResult(ptr: Pointer?): WithDefault =
        IProtectedContainerExportResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectedContainerExportResult {
      val address = segment.toRawLongValue()
      return makeIProtectedContainerExportResult(Pointer(address))
    }

    public override fun toNative(obj: IProtectedContainerExportResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__903265953_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectedContainerExportResult):
        Array<IProtectedContainerExportResult?> = (elements as
        Array<IProtectedContainerExportResult?>).castToImpl<IProtectedContainerExportResult,IProtectedContainerExportResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectedContainerExportResult?> =
        arrayOfNulls<IProtectedContainerExportResult_Impl>(size) as
        Array<IProtectedContainerExportResult?>
  }
}
