package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Storage.IStorageItem
import Windows.Storage.Streams.RandomAccessStreamReference
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDataPackageView.ABI::class)
@Signature("{7b840471-5900-4d85-a90b-10cb85fe3552}")
@Guid("7b84047159004d85a90b10cb85fe3552")
@WinRTInterface("7b84047159004d85a90b10cb85fe3552")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackageView.ByReference::class)
public interface IDataPackageView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Properties(): DataPackagePropertySetView?

  @InterfaceMethod(1)
  public fun get_RequestedOperation(): DataPackageOperation?

  @InterfaceMethod(2)
  public fun ReportOperationCompleted(value: DataPackageOperation?): Unit

  @InterfaceMethod(3)
  public fun get_AvailableFormats(): IVectorView<String?>?

  @InterfaceMethod(4)
  public fun Contains(formatId: String?): Boolean

  @InterfaceMethod(5)
  public fun GetDataAsync(formatId: String?): IAsyncOperation<IUnknown?>?

  @InterfaceMethod(6)
  public fun GetTextAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(7)
  public fun GetTextAsync(formatId: String?): IAsyncOperation<String?>?

  @InterfaceMethod(8)
  public fun GetUriAsync(): IAsyncOperation<Uri?>?

  @InterfaceMethod(9)
  public fun GetHtmlFormatAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(10)
  public fun GetResourceMapAsync(): IAsyncOperation<IMapView<String?,
      RandomAccessStreamReference?>?>?

  @InterfaceMethod(11)
  public fun GetRtfAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(12)
  public fun GetBitmapAsync(): IAsyncOperation<RandomAccessStreamReference?>?

  @InterfaceMethod(13)
  public fun GetStorageItemsAsync(): IAsyncOperation<IVectorView<IStorageItem?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackageView> {
    public override fun getValue() = ABI.makeIDataPackageView(pointer.getPointer(0))

    public fun setValue(value: IDataPackageView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackageView {
    public val __452360201_Ptr: Pointer?

    public val _452360201_VtblPtr: Pointer?
      get() = __452360201_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Properties(): DataPackagePropertySetView? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackagePropertySetView>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackagePropertySetView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RequestedOperation(): DataPackageOperation? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportOperationCompleted(value: DataPackageOperation?): Unit {
      val fnPtr = _452360201_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AvailableFormats(): IVectorView<String?>? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Contains(formatId: String?): Boolean {
      val fnPtr = _452360201_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr, marshalToNative(formatId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun GetDataAsync(formatId: String?): IAsyncOperation<IUnknown?>? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr, marshalToNative(formatId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetTextAsync(): IAsyncOperation<String?>? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetTextAsync(formatId: String?): IAsyncOperation<String?>? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr, marshalToNative(formatId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetUriAsync(): IAsyncOperation<Uri?>? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetHtmlFormatAsync(): IAsyncOperation<String?>? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetResourceMapAsync(): IAsyncOperation<IMapView<String?,
        RandomAccessStreamReference?>?>? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMapView<String?,
          RandomAccessStreamReference?>?>>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMapView<String?,
          RandomAccessStreamReference?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetRtfAsync(): IAsyncOperation<String?>? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetBitmapAsync(): IAsyncOperation<RandomAccessStreamReference?>? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RandomAccessStreamReference?>>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<RandomAccessStreamReference?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetStorageItemsAsync(): IAsyncOperation<IVectorView<IStorageItem?>?>? {
      val fnPtr = _452360201_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IStorageItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__452360201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IStorageItem?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IDataPackageView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __452360201_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackageView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b84047159004d85a90b10cb85fe3552")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackageView(ptr: Pointer?): WithDefault = IDataPackageView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackageView {
      val address = segment.toRawLongValue()
      return makeIDataPackageView(Pointer(address))
    }

    public override fun toNative(obj: IDataPackageView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__452360201_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackageView): Array<IDataPackageView?> = (elements as
        Array<IDataPackageView?>).castToImpl<IDataPackageView,IDataPackageView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackageView?> =
        arrayOfNulls<IDataPackageView_Impl>(size) as Array<IDataPackageView?>
  }
}
