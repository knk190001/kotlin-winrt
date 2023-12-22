package Windows.Media.Import

import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Storage.IStorageFolder
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhotoImportSession.ABI::class)
@Signature("{aa63916e-ecdb-4efe-94c6-5f5cafe34cfb}")
@Guid("aa63916eecdb4efe94c65f5cafe34cfb")
@WinRTInterface("aa63916eecdb4efe94c65f5cafe34cfb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportSession.ByReference::class)
public interface IPhotoImportSession : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Source(): PhotoImportSource?

  @InterfaceMethod(1)
  public fun get_SessionId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun put_DestinationFolder(value: IStorageFolder?): Unit

  @InterfaceMethod(3)
  public fun get_DestinationFolder(): IStorageFolder?

  @InterfaceMethod(4)
  public fun put_AppendSessionDateToDestinationFolder(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_AppendSessionDateToDestinationFolder(): Boolean

  @InterfaceMethod(6)
  public fun put_SubfolderCreationMode(value: PhotoImportSubfolderCreationMode?): Unit

  @InterfaceMethod(7)
  public fun get_SubfolderCreationMode(): PhotoImportSubfolderCreationMode?

  @InterfaceMethod(8)
  public fun put_DestinationFileNamePrefix(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_DestinationFileNamePrefix(): String?

  @InterfaceMethod(10)
  public fun FindItemsAsync(contentTypeFilter: PhotoImportContentTypeFilter?,
      itemSelectionMode: PhotoImportItemSelectionMode?):
      IAsyncOperationWithProgress<PhotoImportFindItemsResult?, WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportSession> {
    public override fun getValue() = ABI.makeIPhotoImportSession(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportSession, IClosable.WithDefault {
    public val __1917188818_Ptr: Pointer?

    public val _1917188818_VtblPtr: Pointer?
      get() = __1917188818_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): PhotoImportSource? {
      val fnPtr = _1917188818_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportSource>()
      val hr = fn.invokeHR(arrayOf(__1917188818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SessionId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1917188818_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1917188818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_DestinationFolder(value: IStorageFolder?): Unit {
      val fnPtr = _1917188818_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1917188818_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_DestinationFolder(): IStorageFolder? {
      val fnPtr = _1917188818_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IStorageFolder>()
      val hr = fn.invokeHR(arrayOf(__1917188818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IStorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_AppendSessionDateToDestinationFolder(value: Boolean): Unit {
      val fnPtr = _1917188818_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1917188818_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_AppendSessionDateToDestinationFolder(): Boolean {
      val fnPtr = _1917188818_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1917188818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_SubfolderCreationMode(value: PhotoImportSubfolderCreationMode?): Unit {
      val fnPtr = _1917188818_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1917188818_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_SubfolderCreationMode(): PhotoImportSubfolderCreationMode? {
      val fnPtr = _1917188818_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportSubfolderCreationMode>()
      val hr = fn.invokeHR(arrayOf(__1917188818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportSubfolderCreationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_DestinationFileNamePrefix(value: String?): Unit {
      val fnPtr = _1917188818_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1917188818_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_DestinationFileNamePrefix(): String? {
      val fnPtr = _1917188818_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1917188818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun FindItemsAsync(contentTypeFilter: PhotoImportContentTypeFilter?,
        itemSelectionMode: PhotoImportItemSelectionMode?):
        IAsyncOperationWithProgress<PhotoImportFindItemsResult?, WinDef.UINT>? {
      val fnPtr = _1917188818_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<PhotoImportFindItemsResult?,
          WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1917188818_Ptr, marshalToNative(contentTypeFilter),
          marshalToNative(itemSelectionMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<PhotoImportFindItemsResult?,
          WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IPhotoImportSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1917188818_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1917188818_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa63916eecdb4efe94c65f5cafe34cfb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportSession(ptr: Pointer?): WithDefault = IPhotoImportSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportSession {
      val address = segment.toRawLongValue()
      return makeIPhotoImportSession(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1917188818_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportSession): Array<IPhotoImportSession?> =
        (elements as
        Array<IPhotoImportSession?>).castToImpl<IPhotoImportSession,IPhotoImportSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportSession?> =
        arrayOfNulls<IPhotoImportSession_Impl>(size) as Array<IPhotoImportSession?>
  }
}
