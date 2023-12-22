package Windows.Media.Import

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhotoImportImportItemsResult.ABI::class)
@Signature("{e4d4f478-d419-4443-a84e-f06a850c0b00}")
@Guid("e4d4f478d4194443a84ef06a850c0b00")
@WinRTInterface("e4d4f478d4194443a84ef06a850c0b00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportImportItemsResult.ByReference::class)
public interface IPhotoImportImportItemsResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Session(): PhotoImportSession?

  @InterfaceMethod(1)
  public fun get_HasSucceeded(): Boolean

  @InterfaceMethod(2)
  public fun get_ImportedItems(): IVectorView<PhotoImportItem?>?

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
  public fun DeleteImportedItemsFromSourceAsync():
      IAsyncOperationWithProgress<PhotoImportDeleteImportedItemsFromSourceResult?, Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportImportItemsResult> {
    public override fun getValue() = ABI.makeIPhotoImportImportItemsResult(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportImportItemsResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportImportItemsResult {
    public val __2063522736_Ptr: Pointer?

    public val _2063522736_VtblPtr: Pointer?
      get() = __2063522736_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Session(): PhotoImportSession? {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportSession>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HasSucceeded(): Boolean {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ImportedItems(): IVectorView<PhotoImportItem?>? {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PhotoImportItem?>>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PhotoImportItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PhotosCount(): WinDef.UINT {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_PhotosSizeInBytes(): WinDef.ULONG {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_VideosCount(): WinDef.UINT {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_VideosSizeInBytes(): WinDef.ULONG {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_SidecarsCount(): WinDef.UINT {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_SidecarsSizeInBytes(): WinDef.ULONG {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_SiblingsCount(): WinDef.UINT {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_SiblingsSizeInBytes(): WinDef.ULONG {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_TotalCount(): WinDef.UINT {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_TotalSizeInBytes(): WinDef.ULONG {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun DeleteImportedItemsFromSourceAsync():
        IAsyncOperationWithProgress<PhotoImportDeleteImportedItemsFromSourceResult?, Double>? {
      val fnPtr = _2063522736_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperationWithProgress<PhotoImportDeleteImportedItemsFromSourceResult?,
          Double>>()
      val hr = fn.invokeHR(arrayOf(__2063522736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperationWithProgress<PhotoImportDeleteImportedItemsFromSourceResult?,
          Double>>(result.getValue())
      return resultValue
    }
  }

  public class IPhotoImportImportItemsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2063522736_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportImportItemsResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4d4f478d4194443a84ef06a850c0b00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportImportItemsResult(ptr: Pointer?): WithDefault =
        IPhotoImportImportItemsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportImportItemsResult {
      val address = segment.toRawLongValue()
      return makeIPhotoImportImportItemsResult(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportImportItemsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2063522736_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportImportItemsResult):
        Array<IPhotoImportImportItemsResult?> = (elements as
        Array<IPhotoImportImportItemsResult?>).castToImpl<IPhotoImportImportItemsResult,IPhotoImportImportItemsResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportImportItemsResult?> =
        arrayOfNulls<IPhotoImportImportItemsResult_Impl>(size) as
        Array<IPhotoImportImportItemsResult?>
  }
}
