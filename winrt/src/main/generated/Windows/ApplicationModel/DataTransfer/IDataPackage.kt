package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IMap
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IDataPackage.ABI::class)
@Signature("{61ebf5c7-efea-4346-9554-981d7e198ffe}")
@Guid("61ebf5c7efea43469554981d7e198ffe")
@WinRTInterface("61ebf5c7efea43469554981d7e198ffe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackage.ByReference::class)
public interface IDataPackage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetView(): DataPackageView?

  @InterfaceMethod(1)
  public fun get_Properties(): DataPackagePropertySet?

  @InterfaceMethod(2)
  public fun get_RequestedOperation(): DataPackageOperation?

  @InterfaceMethod(3)
  public fun put_RequestedOperation(value: DataPackageOperation?): Unit

  @InterfaceMethod(4)
  public fun add_OperationCompleted(handler: TypedEventHandler<DataPackage?,
      OperationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_OperationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_Destroyed(handler: TypedEventHandler<DataPackage?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Destroyed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun SetData(formatId: String?, value: IUnknown?): Unit

  @InterfaceMethod(9)
  public fun SetDataProvider(formatId: String?, delayRenderer: DataProviderHandler?): Unit

  @InterfaceMethod(10)
  public fun SetText(value: String?): Unit

  @InterfaceMethod(11)
  public fun SetUri(value: Uri?): Unit

  @InterfaceMethod(12)
  public fun SetHtmlFormat(value: String?): Unit

  @InterfaceMethod(13)
  public fun get_ResourceMap(): IMap<String?, RandomAccessStreamReference?>?

  @InterfaceMethod(14)
  public fun SetRtf(value: String?): Unit

  @InterfaceMethod(15)
  public fun SetBitmap(value: RandomAccessStreamReference?): Unit

  @InterfaceMethod(16)
  public fun SetStorageItems(value: IIterable<IStorageItem?>?): Unit

  @InterfaceMethod(17)
  public fun SetStorageItems(value: IIterable<IStorageItem?>?, readOnly: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataPackage> {
    public override fun getValue() = ABI.makeIDataPackage(pointer.getPointer(0))

    public fun setValue(value: IDataPackage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackage {
    public val __258915790_Ptr: Pointer?

    public val _258915790_VtblPtr: Pointer?
      get() = __258915790_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetView(): DataPackageView? {
      val fnPtr = _258915790_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageView>()
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): DataPackagePropertySet? {
      val fnPtr = _258915790_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackagePropertySet>()
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackagePropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RequestedOperation(): DataPackageOperation? {
      val fnPtr = _258915790_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RequestedOperation(value: DataPackageOperation?): Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_OperationCompleted(handler: TypedEventHandler<DataPackage?,
        OperationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _258915790_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_OperationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Destroyed(handler: TypedEventHandler<DataPackage?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _258915790_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Destroyed(token: EventRegistrationToken?): Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun SetData(formatId: String?, value: IUnknown?): Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(formatId),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SetDataProvider(formatId: String?, delayRenderer: DataProviderHandler?):
        Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(formatId),
          marshalToNative(delayRenderer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun SetText(value: String?): Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun SetUri(value: Uri?): Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun SetHtmlFormat(value: String?): Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_ResourceMap(): IMap<String?, RandomAccessStreamReference?>? {
      val fnPtr = _258915790_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, RandomAccessStreamReference?>>()
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?,
          RandomAccessStreamReference?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun SetRtf(value: String?): Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun SetBitmap(value: RandomAccessStreamReference?): Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun SetStorageItems(value: IIterable<IStorageItem?>?): Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun SetStorageItems(value: IIterable<IStorageItem?>?, readOnly: Boolean): Unit {
      val fnPtr = _258915790_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258915790_Ptr, marshalToNative(value), readOnly,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataPackage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __258915790_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61ebf5c7efea43469554981d7e198ffe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackage(ptr: Pointer?): WithDefault = IDataPackage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackage {
      val address = segment.toRawLongValue()
      return makeIDataPackage(Pointer(address))
    }

    public override fun toNative(obj: IDataPackage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__258915790_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackage): Array<IDataPackage?> = (elements as
        Array<IDataPackage?>).castToImpl<IDataPackage,IDataPackage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackage?> =
        arrayOfNulls<IDataPackage_Impl>(size) as Array<IDataPackage?>
  }
}
