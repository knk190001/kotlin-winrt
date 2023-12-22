package Windows.Storage.Provider

import Windows.Storage.IStorageFile
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

@ABIMarker(IFileUpdateRequest.ABI::class)
@Signature("{40c82536-c1fe-4d93-a792-1e736bc70837}")
@Guid("40c82536c1fe4d93a7921e736bc70837")
@WinRTInterface("40c82536c1fe4d93a7921e736bc70837")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileUpdateRequest.ByReference::class)
public interface IFileUpdateRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentId(): String?

  @InterfaceMethod(1)
  public fun get_File(): StorageFile?

  @InterfaceMethod(2)
  public fun get_Status(): FileUpdateStatus?

  @InterfaceMethod(3)
  public fun put_Status(value: FileUpdateStatus?): Unit

  @InterfaceMethod(4)
  public fun GetDeferral(): FileUpdateRequestDeferral?

  @InterfaceMethod(5)
  public fun UpdateLocalFile(value: IStorageFile?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileUpdateRequest> {
    public override fun getValue() = ABI.makeIFileUpdateRequest(pointer.getPointer(0))

    public fun setValue(value: IFileUpdateRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileUpdateRequest {
    public val __1220412112_Ptr: Pointer?

    public val _1220412112_VtblPtr: Pointer?
      get() = __1220412112_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentId(): String? {
      val fnPtr = _1220412112_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1220412112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_File(): StorageFile? {
      val fnPtr = _1220412112_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFile>()
      val hr = fn.invokeHR(arrayOf(__1220412112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Status(): FileUpdateStatus? {
      val fnPtr = _1220412112_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileUpdateStatus>()
      val hr = fn.invokeHR(arrayOf(__1220412112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileUpdateStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Status(value: FileUpdateStatus?): Unit {
      val fnPtr = _1220412112_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1220412112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetDeferral(): FileUpdateRequestDeferral? {
      val fnPtr = _1220412112_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileUpdateRequestDeferral>()
      val hr = fn.invokeHR(arrayOf(__1220412112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileUpdateRequestDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun UpdateLocalFile(value: IStorageFile?): Unit {
      val fnPtr = _1220412112_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1220412112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFileUpdateRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1220412112_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileUpdateRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40c82536c1fe4d93a7921e736bc70837")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileUpdateRequest(ptr: Pointer?): WithDefault = IFileUpdateRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileUpdateRequest {
      val address = segment.toRawLongValue()
      return makeIFileUpdateRequest(Pointer(address))
    }

    public override fun toNative(obj: IFileUpdateRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1220412112_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileUpdateRequest): Array<IFileUpdateRequest?> =
        (elements as
        Array<IFileUpdateRequest?>).castToImpl<IFileUpdateRequest,IFileUpdateRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileUpdateRequest?> =
        arrayOfNulls<IFileUpdateRequest_Impl>(size) as Array<IFileUpdateRequest?>
  }
}
