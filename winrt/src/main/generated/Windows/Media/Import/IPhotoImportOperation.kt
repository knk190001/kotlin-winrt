package Windows.Media.Import

import Windows.Foundation.IAsyncOperationWithProgress
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhotoImportOperation.ABI::class)
@Signature("{d9f797e4-a09a-4ee4-a4b1-20940277a5be}")
@Guid("d9f797e4a09a4ee4a4b120940277a5be")
@WinRTInterface("d9f797e4a09a4ee4a4b120940277a5be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportOperation.ByReference::class)
public interface IPhotoImportOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Stage(): PhotoImportStage?

  @InterfaceMethod(1)
  public fun get_Session(): PhotoImportSession?

  @InterfaceMethod(2)
  public fun get_ContinueFindingItemsAsync():
      IAsyncOperationWithProgress<PhotoImportFindItemsResult?, WinDef.UINT>?

  @InterfaceMethod(3)
  public fun get_ContinueImportingItemsAsync():
      IAsyncOperationWithProgress<PhotoImportImportItemsResult?, PhotoImportProgress?>?

  @InterfaceMethod(4)
  public fun get_ContinueDeletingImportedItemsFromSourceAsync():
      IAsyncOperationWithProgress<PhotoImportDeleteImportedItemsFromSourceResult?, Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportOperation> {
    public override fun getValue() = ABI.makeIPhotoImportOperation(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportOperation {
    public val __1177424383_Ptr: Pointer?

    public val _1177424383_VtblPtr: Pointer?
      get() = __1177424383_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Stage(): PhotoImportStage? {
      val fnPtr = _1177424383_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportStage>()
      val hr = fn.invokeHR(arrayOf(__1177424383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportStage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Session(): PhotoImportSession? {
      val fnPtr = _1177424383_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportSession>()
      val hr = fn.invokeHR(arrayOf(__1177424383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ContinueFindingItemsAsync():
        IAsyncOperationWithProgress<PhotoImportFindItemsResult?, WinDef.UINT>? {
      val fnPtr = _1177424383_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<PhotoImportFindItemsResult?,
          WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1177424383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<PhotoImportFindItemsResult?,
          WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ContinueImportingItemsAsync():
        IAsyncOperationWithProgress<PhotoImportImportItemsResult?, PhotoImportProgress?>? {
      val fnPtr = _1177424383_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<PhotoImportImportItemsResult?,
          PhotoImportProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1177424383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<PhotoImportImportItemsResult?,
          PhotoImportProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ContinueDeletingImportedItemsFromSourceAsync():
        IAsyncOperationWithProgress<PhotoImportDeleteImportedItemsFromSourceResult?, Double>? {
      val fnPtr = _1177424383_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperationWithProgress<PhotoImportDeleteImportedItemsFromSourceResult?,
          Double>>()
      val hr = fn.invokeHR(arrayOf(__1177424383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperationWithProgress<PhotoImportDeleteImportedItemsFromSourceResult?,
          Double>>(result.getValue())
      return resultValue
    }
  }

  public class IPhotoImportOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1177424383_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d9f797e4a09a4ee4a4b120940277a5be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportOperation(ptr: Pointer?): WithDefault =
        IPhotoImportOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportOperation {
      val address = segment.toRawLongValue()
      return makeIPhotoImportOperation(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1177424383_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportOperation): Array<IPhotoImportOperation?> =
        (elements as
        Array<IPhotoImportOperation?>).castToImpl<IPhotoImportOperation,IPhotoImportOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportOperation?> =
        arrayOfNulls<IPhotoImportOperation_Impl>(size) as Array<IPhotoImportOperation?>
  }
}
