package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Rect
import Windows.Foundation.Size
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IClaimedLineDisplay2.ABI::class)
@Signature("{a31c75ed-41f5-4e76-a074-795e47a46e97}")
@Guid("a31c75ed41f54e76a074795e47a46e97")
@WinRTInterface("a31c75ed41f54e76a074795e47a46e97")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedLineDisplay2.ByReference::class)
public interface IClaimedLineDisplay2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStatisticsAsync(statisticsCategories: IIterable<String?>?):
      IAsyncOperation<String?>?

  @InterfaceMethod(1)
  public fun CheckHealthAsync(level: UnifiedPosHealthCheckLevel?): IAsyncOperation<String?>?

  @InterfaceMethod(2)
  public fun CheckPowerStatusAsync(): IAsyncOperation<LineDisplayPowerStatus?>?

  @InterfaceMethod(3)
  public fun add_StatusUpdated(handler: TypedEventHandler<ClaimedLineDisplay?,
      LineDisplayStatusUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_StatusUpdated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun get_SupportedScreenSizesInCharacters(): IVectorView<Size?>?

  @InterfaceMethod(6)
  public fun get_MaxBitmapSizeInPixels(): Size?

  @InterfaceMethod(7)
  public fun get_SupportedCharacterSets(): IVectorView<Int>?

  @InterfaceMethod(8)
  public fun get_CustomGlyphs(): LineDisplayCustomGlyphs?

  @InterfaceMethod(9)
  public fun GetAttributes(): LineDisplayAttributes?

  @InterfaceMethod(10)
  public fun TryUpdateAttributesAsync(attributes: LineDisplayAttributes?): IAsyncOperation<Boolean>?

  @InterfaceMethod(11)
  public fun TrySetDescriptorAsync(descriptor: WinDef.UINT,
      descriptorState: LineDisplayDescriptorState?): IAsyncOperation<Boolean>?

  @InterfaceMethod(12)
  public fun TryClearDescriptorsAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(13)
  public fun TryCreateWindowAsync(viewport: Rect?, windowSize: Size?):
      IAsyncOperation<LineDisplayWindow?>?

  @InterfaceMethod(14)
  public fun TryStoreStorageFileBitmapAsync(bitmap: StorageFile?):
      IAsyncOperation<LineDisplayStoredBitmap?>?

  @InterfaceMethod(15)
  public fun TryStoreStorageFileBitmapAsync(
    bitmap: StorageFile?,
    horizontalAlignment: LineDisplayHorizontalAlignment?,
    verticalAlignment: LineDisplayVerticalAlignment?
  ): IAsyncOperation<LineDisplayStoredBitmap?>?

  @InterfaceMethod(16)
  public fun TryStoreStorageFileBitmapAsync(
    bitmap: StorageFile?,
    horizontalAlignment: LineDisplayHorizontalAlignment?,
    verticalAlignment: LineDisplayVerticalAlignment?,
    widthInPixels: Int
  ): IAsyncOperation<LineDisplayStoredBitmap?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedLineDisplay2> {
    public override fun getValue() = ABI.makeIClaimedLineDisplay2(pointer.getPointer(0))

    public fun setValue(value: IClaimedLineDisplay2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedLineDisplay2 {
    public val __1926415296_Ptr: Pointer?

    public val _1926415296_VtblPtr: Pointer?
      get() = __1926415296_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStatisticsAsync(statisticsCategories: IIterable<String?>?):
        IAsyncOperation<String?>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr, marshalToNative(statisticsCategories), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CheckHealthAsync(level: UnifiedPosHealthCheckLevel?):
        IAsyncOperation<String?>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr, marshalToNative(level), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CheckPowerStatusAsync(): IAsyncOperation<LineDisplayPowerStatus?>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LineDisplayPowerStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LineDisplayPowerStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_StatusUpdated(handler: TypedEventHandler<ClaimedLineDisplay?,
        LineDisplayStatusUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_StatusUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_SupportedScreenSizesInCharacters(): IVectorView<Size?>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Size?>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Size?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MaxBitmapSizeInPixels(): Size? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SupportedCharacterSets(): IVectorView<Int>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Int>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_CustomGlyphs(): LineDisplayCustomGlyphs? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayCustomGlyphs>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayCustomGlyphs>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetAttributes(): LineDisplayAttributes? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayAttributes>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayAttributes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun TryUpdateAttributesAsync(attributes: LineDisplayAttributes?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr, marshalToNative(attributes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun TrySetDescriptorAsync(descriptor: WinDef.UINT,
        descriptorState: LineDisplayDescriptorState?): IAsyncOperation<Boolean>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr, descriptor, marshalToNative(descriptorState),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun TryClearDescriptorsAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun TryCreateWindowAsync(viewport: Rect?, windowSize: Size?):
        IAsyncOperation<LineDisplayWindow?>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LineDisplayWindow?>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr, marshalToNative(viewport),
          marshalToNative(windowSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LineDisplayWindow?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun TryStoreStorageFileBitmapAsync(bitmap: StorageFile?):
        IAsyncOperation<LineDisplayStoredBitmap?>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LineDisplayStoredBitmap?>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr, marshalToNative(bitmap), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LineDisplayStoredBitmap?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun TryStoreStorageFileBitmapAsync(
      bitmap: StorageFile?,
      horizontalAlignment: LineDisplayHorizontalAlignment?,
      verticalAlignment: LineDisplayVerticalAlignment?
    ): IAsyncOperation<LineDisplayStoredBitmap?>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LineDisplayStoredBitmap?>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr, marshalToNative(bitmap),
          marshalToNative(horizontalAlignment), marshalToNative(verticalAlignment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LineDisplayStoredBitmap?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun TryStoreStorageFileBitmapAsync(
      bitmap: StorageFile?,
      horizontalAlignment: LineDisplayHorizontalAlignment?,
      verticalAlignment: LineDisplayVerticalAlignment?,
      widthInPixels: Int
    ): IAsyncOperation<LineDisplayStoredBitmap?>? {
      val fnPtr = _1926415296_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LineDisplayStoredBitmap?>>()
      val hr = fn.invokeHR(arrayOf(__1926415296_Ptr, marshalToNative(bitmap),
          marshalToNative(horizontalAlignment), marshalToNative(verticalAlignment), widthInPixels,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LineDisplayStoredBitmap?>>(result.getValue())
      return resultValue
    }
  }

  public class IClaimedLineDisplay2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1926415296_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedLineDisplay2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a31c75ed41f54e76a074795e47a46e97")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedLineDisplay2(ptr: Pointer?): WithDefault = IClaimedLineDisplay2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedLineDisplay2 {
      val address = segment.toRawLongValue()
      return makeIClaimedLineDisplay2(Pointer(address))
    }

    public override fun toNative(obj: IClaimedLineDisplay2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1926415296_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedLineDisplay2): Array<IClaimedLineDisplay2?> =
        (elements as
        Array<IClaimedLineDisplay2?>).castToImpl<IClaimedLineDisplay2,IClaimedLineDisplay2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedLineDisplay2?> =
        arrayOfNulls<IClaimedLineDisplay2_Impl>(size) as Array<IClaimedLineDisplay2?>
  }
}
