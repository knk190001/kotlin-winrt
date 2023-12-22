package Windows.Storage.Search

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Search.IStorageQueryResultBase.ABI.IID
import Windows.Storage.StorageFolder
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageFolderQueryResult.ABI::class)
@Signature("{6654c911-7d66-46fa-aecf-e4a4baa93ab8}")
@Guid("6654c9117d6646faaecfe4a4baa93ab8")
@WinRTInterface("6654c9117d6646faaecfe4a4baa93ab8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFolderQueryResult.ByReference::class)
public interface IStorageFolderQueryResult : NativeMapped, IWinRTInterface, IStorageQueryResultBase
    {
  @InterfaceMethod(0)
  public fun GetFoldersAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
      IAsyncOperation<IVectorView<StorageFolder?>?>?

  @InterfaceMethod(1)
  public fun GetFoldersAsync(): IAsyncOperation<IVectorView<StorageFolder?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageFolderQueryResult> {
    public override fun getValue() = ABI.makeIStorageFolderQueryResult(pointer.getPointer(0))

    public fun setValue(value: IStorageFolderQueryResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFolderQueryResult, IStorageQueryResultBase.WithDefault {
    public val __111331073_Ptr: Pointer?

    public val _111331073_VtblPtr: Pointer?
      get() = __111331073_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFoldersAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
        IAsyncOperation<IVectorView<StorageFolder?>?>? {
      val fnPtr = _111331073_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageFolder?>?>>()
      val hr = fn.invokeHR(arrayOf(__111331073_Ptr, startIndex, maxNumberOfItems, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageFolder?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetFoldersAsync(): IAsyncOperation<IVectorView<StorageFolder?>?>? {
      val fnPtr = _111331073_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageFolder?>?>>()
      val hr = fn.invokeHR(arrayOf(__111331073_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageFolder?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageFolderQueryResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageQueryResultBase {
    public override val __1632583490_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_111331073_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __111331073_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFolderQueryResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6654c9117d6646faaecfe4a4baa93ab8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFolderQueryResult(ptr: Pointer?): WithDefault =
        IStorageFolderQueryResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFolderQueryResult {
      val address = segment.toRawLongValue()
      return makeIStorageFolderQueryResult(Pointer(address))
    }

    public override fun toNative(obj: IStorageFolderQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__111331073_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolderQueryResult):
        Array<IStorageFolderQueryResult?> = (elements as
        Array<IStorageFolderQueryResult?>).castToImpl<IStorageFolderQueryResult,IStorageFolderQueryResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolderQueryResult?> =
        arrayOfNulls<IStorageFolderQueryResult_Impl>(size) as Array<IStorageFolderQueryResult?>
  }
}
