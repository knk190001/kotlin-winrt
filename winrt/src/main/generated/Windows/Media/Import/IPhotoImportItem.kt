package Windows.Media.Import

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhotoImportItem.ABI::class)
@Signature("{a9d07e76-9bfc-43b8-b356-633b6a988c9e}")
@Guid("a9d07e769bfc43b8b356633b6a988c9e")
@WinRTInterface("a9d07e769bfc43b8b356633b6a988c9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportItem.ByReference::class)
public interface IPhotoImportItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_ItemKey(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_ContentType(): PhotoImportContentType?

  @InterfaceMethod(3)
  public fun get_SizeInBytes(): WinDef.ULONG

  @InterfaceMethod(4)
  public fun get_Date(): DateTime?

  @InterfaceMethod(5)
  public fun get_Sibling(): PhotoImportSidecar?

  @InterfaceMethod(6)
  public fun get_Sidecars(): IVectorView<PhotoImportSidecar?>?

  @InterfaceMethod(7)
  public fun get_VideoSegments(): IVectorView<PhotoImportVideoSegment?>?

  @InterfaceMethod(8)
  public fun get_IsSelected(): Boolean

  @InterfaceMethod(9)
  public fun put_IsSelected(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_Thumbnail(): IRandomAccessStreamReference?

  @InterfaceMethod(11)
  public fun get_ImportedFileNames(): IVectorView<String?>?

  @InterfaceMethod(12)
  public fun get_DeletedFileNames(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportItem> {
    public override fun getValue() = ABI.makeIPhotoImportItem(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportItem {
    public val __1367392123_Ptr: Pointer?

    public val _1367392123_VtblPtr: Pointer?
      get() = __1367392123_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemKey(): WinDef.ULONG {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ContentType(): PhotoImportContentType? {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportContentType>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportContentType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SizeInBytes(): WinDef.ULONG {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Date(): DateTime? {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Sibling(): PhotoImportSidecar? {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportSidecar>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportSidecar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Sidecars(): IVectorView<PhotoImportSidecar?>? {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PhotoImportSidecar?>>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PhotoImportSidecar?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_VideoSegments(): IVectorView<PhotoImportVideoSegment?>? {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PhotoImportVideoSegment?>>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PhotoImportVideoSegment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_IsSelected(): Boolean {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsSelected(value: Boolean): Unit {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Thumbnail(): IRandomAccessStreamReference? {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_ImportedFileNames(): IVectorView<String?>? {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_DeletedFileNames(): IVectorView<String?>? {
      val fnPtr = _1367392123_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1367392123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhotoImportItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1367392123_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9d07e769bfc43b8b356633b6a988c9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportItem(ptr: Pointer?): WithDefault = IPhotoImportItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportItem {
      val address = segment.toRawLongValue()
      return makeIPhotoImportItem(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1367392123_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportItem): Array<IPhotoImportItem?> = (elements as
        Array<IPhotoImportItem?>).castToImpl<IPhotoImportItem,IPhotoImportItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportItem?> =
        arrayOfNulls<IPhotoImportItem_Impl>(size) as Array<IPhotoImportItem?>
  }
}
