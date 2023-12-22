package Windows.Media.Import

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhotoImportFindItemsResult.ABI::class)
@Signature("{3915e647-6c78-492b-844e-8fe5e8f6bfb9}")
@Guid("3915e6476c78492b844e8fe5e8f6bfb9")
@WinRTInterface("3915e6476c78492b844e8fe5e8f6bfb9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportFindItemsResult.ByReference::class)
public interface IPhotoImportFindItemsResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Session(): PhotoImportSession?

  @InterfaceMethod(1)
  public fun get_HasSucceeded(): Boolean

  @InterfaceMethod(2)
  public fun get_FoundItems(): IVectorView<PhotoImportItem?>?

  @InterfaceMethod(3)
  public fun get_PhotosCount(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_PhotosSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(5)
  public fun get_VideosCount(): WinDef.UINT

  @InterfaceMethod(6)
  public fun get_VideosSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(7)
  public fun get_SidecarsCount(): WinDef.UINT

  @InterfaceMethod(8)
  public fun get_SidecarsSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(9)
  public fun get_SiblingsCount(): WinDef.UINT

  @InterfaceMethod(10)
  public fun get_SiblingsSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(11)
  public fun get_TotalCount(): WinDef.UINT

  @InterfaceMethod(12)
  public fun get_TotalSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(13)
  public fun SelectAll(): Unit

  @InterfaceMethod(14)
  public fun SelectNone(): Unit

  @InterfaceMethod(15)
  public fun SelectNewAsync(): IAsyncAction?

  @InterfaceMethod(16)
  public fun SetImportMode(value: PhotoImportImportMode?): Unit

  @InterfaceMethod(17)
  public fun get_ImportMode(): PhotoImportImportMode?

  @InterfaceMethod(18)
  public fun get_SelectedPhotosCount(): WinDef.UINT

  @InterfaceMethod(19)
  public fun get_SelectedPhotosSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(20)
  public fun get_SelectedVideosCount(): WinDef.UINT

  @InterfaceMethod(21)
  public fun get_SelectedVideosSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(22)
  public fun get_SelectedSidecarsCount(): WinDef.UINT

  @InterfaceMethod(23)
  public fun get_SelectedSidecarsSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(24)
  public fun get_SelectedSiblingsCount(): WinDef.UINT

  @InterfaceMethod(25)
  public fun get_SelectedSiblingsSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(26)
  public fun get_SelectedTotalCount(): WinDef.UINT

  @InterfaceMethod(27)
  public fun get_SelectedTotalSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(28)
  public fun add_SelectionChanged(value: TypedEventHandler<PhotoImportFindItemsResult?,
      PhotoImportSelectionChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(30)
  public fun ImportItemsAsync(): IAsyncOperationWithProgress<PhotoImportImportItemsResult?,
      PhotoImportProgress?>?

  @InterfaceMethod(31)
  public fun add_ItemImported(value: TypedEventHandler<PhotoImportFindItemsResult?,
      PhotoImportItemImportedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(32)
  public fun remove_ItemImported(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportFindItemsResult> {
    public override fun getValue() = ABI.makeIPhotoImportFindItemsResult(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportFindItemsResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportFindItemsResult {
    public val __1946399972_Ptr: Pointer?

    public val _1946399972_VtblPtr: Pointer?
      get() = __1946399972_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Session(): PhotoImportSession? {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportSession>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HasSucceeded(): Boolean {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_FoundItems(): IVectorView<PhotoImportItem?>? {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PhotoImportItem?>>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PhotoImportItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PhotosCount(): WinDef.UINT {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_PhotosSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_VideosCount(): WinDef.UINT {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_VideosSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_SidecarsCount(): WinDef.UINT {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_SidecarsSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_SiblingsCount(): WinDef.UINT {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_SiblingsSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_TotalCount(): WinDef.UINT {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_TotalSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun SelectAll(): Unit {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun SelectNone(): Unit {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun SelectNewAsync(): IAsyncAction? {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun SetImportMode(value: PhotoImportImportMode?): Unit {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_ImportMode(): PhotoImportImportMode? {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportImportMode>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportImportMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_SelectedPhotosCount(): WinDef.UINT {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun get_SelectedPhotosSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun get_SelectedVideosCount(): WinDef.UINT {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun get_SelectedVideosSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun get_SelectedSidecarsCount(): WinDef.UINT {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun get_SelectedSidecarsSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun get_SelectedSiblingsCount(): WinDef.UINT {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun get_SelectedSiblingsSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun get_SelectedTotalCount(): WinDef.UINT {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun get_SelectedTotalSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(28)
    public override fun add_SelectionChanged(value: TypedEventHandler<PhotoImportFindItemsResult?,
        PhotoImportSelectionChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun ImportItemsAsync():
        IAsyncOperationWithProgress<PhotoImportImportItemsResult?, PhotoImportProgress?>? {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<PhotoImportImportItemsResult?,
          PhotoImportProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<PhotoImportImportItemsResult?,
          PhotoImportProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun add_ItemImported(value: TypedEventHandler<PhotoImportFindItemsResult?,
        PhotoImportItemImportedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun remove_ItemImported(token: EventRegistrationToken?): Unit {
      val fnPtr = _1946399972_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946399972_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhotoImportFindItemsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946399972_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportFindItemsResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3915e6476c78492b844e8fe5e8f6bfb9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportFindItemsResult(ptr: Pointer?): WithDefault =
        IPhotoImportFindItemsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportFindItemsResult {
      val address = segment.toRawLongValue()
      return makeIPhotoImportFindItemsResult(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportFindItemsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946399972_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportFindItemsResult):
        Array<IPhotoImportFindItemsResult?> = (elements as
        Array<IPhotoImportFindItemsResult?>).castToImpl<IPhotoImportFindItemsResult,IPhotoImportFindItemsResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportFindItemsResult?> =
        arrayOfNulls<IPhotoImportFindItemsResult_Impl>(size) as Array<IPhotoImportFindItemsResult?>
  }
}
