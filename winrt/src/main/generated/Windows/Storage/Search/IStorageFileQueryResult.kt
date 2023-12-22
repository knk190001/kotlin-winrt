package Windows.Storage.Search

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Search.IStorageQueryResultBase.ABI.IID
import Windows.Storage.StorageFile
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

@ABIMarker(IStorageFileQueryResult.ABI::class)
@Signature("{52fda447-2baa-412c-b29f-d4b1778efa1e}")
@Guid("52fda4472baa412cb29fd4b1778efa1e")
@WinRTInterface("52fda4472baa412cb29fd4b1778efa1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFileQueryResult.ByReference::class)
public interface IStorageFileQueryResult : NativeMapped, IWinRTInterface, IStorageQueryResultBase {
  @InterfaceMethod(0)
  public fun GetFilesAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
      IAsyncOperation<IVectorView<StorageFile?>?>?

  @InterfaceMethod(1)
  public fun GetFilesAsync(): IAsyncOperation<IVectorView<StorageFile?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageFileQueryResult> {
    public override fun getValue() = ABI.makeIStorageFileQueryResult(pointer.getPointer(0))

    public fun setValue(value: IStorageFileQueryResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFileQueryResult, IStorageQueryResultBase.WithDefault {
    public val __1369899727_Ptr: Pointer?

    public val _1369899727_VtblPtr: Pointer?
      get() = __1369899727_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFilesAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
        IAsyncOperation<IVectorView<StorageFile?>?>? {
      val fnPtr = _1369899727_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageFile?>?>>()
      val hr = fn.invokeHR(arrayOf(__1369899727_Ptr, startIndex, maxNumberOfItems, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageFile?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetFilesAsync(): IAsyncOperation<IVectorView<StorageFile?>?>? {
      val fnPtr = _1369899727_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageFile?>?>>()
      val hr = fn.invokeHR(arrayOf(__1369899727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageFile?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageFileQueryResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageQueryResultBase {
    public override val __1632583490_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1369899727_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1369899727_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFileQueryResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52fda4472baa412cb29fd4b1778efa1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFileQueryResult(ptr: Pointer?): WithDefault =
        IStorageFileQueryResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFileQueryResult {
      val address = segment.toRawLongValue()
      return makeIStorageFileQueryResult(Pointer(address))
    }

    public override fun toNative(obj: IStorageFileQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1369899727_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFileQueryResult): Array<IStorageFileQueryResult?>
        = (elements as
        Array<IStorageFileQueryResult?>).castToImpl<IStorageFileQueryResult,IStorageFileQueryResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFileQueryResult?> =
        arrayOfNulls<IStorageFileQueryResult_Impl>(size) as Array<IStorageFileQueryResult?>
  }
}
