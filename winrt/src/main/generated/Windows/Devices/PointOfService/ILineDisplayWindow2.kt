package Windows.Devices.PointOfService

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Point
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILineDisplayWindow2.ABI::class)
@Signature("{a95ce2e6-bdd8-4365-8e11-de94de8dff02}")
@Guid("a95ce2e6bdd843658e11de94de8dff02")
@WinRTInterface("a95ce2e6bdd843658e11de94de8dff02")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayWindow2.ByReference::class)
public interface ILineDisplayWindow2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cursor(): LineDisplayCursor?

  @InterfaceMethod(1)
  public fun get_Marquee(): LineDisplayMarquee?

  @InterfaceMethod(2)
  public fun ReadCharacterAtCursorAsync(): IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun TryDisplayStoredBitmapAtCursorAsync(bitmap: LineDisplayStoredBitmap?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(4)
  public fun TryDisplayStorageFileBitmapAtCursorAsync(bitmap: StorageFile?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun TryDisplayStorageFileBitmapAtCursorAsync(
    bitmap: StorageFile?,
    horizontalAlignment: LineDisplayHorizontalAlignment?,
    verticalAlignment: LineDisplayVerticalAlignment?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(6)
  public fun TryDisplayStorageFileBitmapAtCursorAsync(
    bitmap: StorageFile?,
    horizontalAlignment: LineDisplayHorizontalAlignment?,
    verticalAlignment: LineDisplayVerticalAlignment?,
    widthInPixels: Int
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(7)
  public fun TryDisplayStorageFileBitmapAtPointAsync(bitmap: StorageFile?, offsetInPixels: Point?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(8)
  public fun TryDisplayStorageFileBitmapAtPointAsync(
    bitmap: StorageFile?,
    offsetInPixels: Point?,
    widthInPixels: Int
  ): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayWindow2> {
    public override fun getValue() = ABI.makeILineDisplayWindow2(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayWindow2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayWindow2 {
    public val __102426003_Ptr: Pointer?

    public val _102426003_VtblPtr: Pointer?
      get() = __102426003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cursor(): LineDisplayCursor? {
      val fnPtr = _102426003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayCursor>()
      val hr = fn.invokeHR(arrayOf(__102426003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayCursor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Marquee(): LineDisplayMarquee? {
      val fnPtr = _102426003_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayMarquee>()
      val hr = fn.invokeHR(arrayOf(__102426003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayMarquee>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReadCharacterAtCursorAsync(): IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _102426003_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__102426003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TryDisplayStoredBitmapAtCursorAsync(bitmap: LineDisplayStoredBitmap?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _102426003_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__102426003_Ptr, marshalToNative(bitmap), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TryDisplayStorageFileBitmapAtCursorAsync(bitmap: StorageFile?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _102426003_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__102426003_Ptr, marshalToNative(bitmap), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun TryDisplayStorageFileBitmapAtCursorAsync(
      bitmap: StorageFile?,
      horizontalAlignment: LineDisplayHorizontalAlignment?,
      verticalAlignment: LineDisplayVerticalAlignment?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _102426003_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__102426003_Ptr, marshalToNative(bitmap),
          marshalToNative(horizontalAlignment), marshalToNative(verticalAlignment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun TryDisplayStorageFileBitmapAtCursorAsync(
      bitmap: StorageFile?,
      horizontalAlignment: LineDisplayHorizontalAlignment?,
      verticalAlignment: LineDisplayVerticalAlignment?,
      widthInPixels: Int
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _102426003_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__102426003_Ptr, marshalToNative(bitmap),
          marshalToNative(horizontalAlignment), marshalToNative(verticalAlignment), widthInPixels,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun TryDisplayStorageFileBitmapAtPointAsync(bitmap: StorageFile?,
        offsetInPixels: Point?): IAsyncOperation<Boolean>? {
      val fnPtr = _102426003_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__102426003_Ptr, marshalToNative(bitmap),
          marshalToNative(offsetInPixels), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun TryDisplayStorageFileBitmapAtPointAsync(
      bitmap: StorageFile?,
      offsetInPixels: Point?,
      widthInPixels: Int
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _102426003_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__102426003_Ptr, marshalToNative(bitmap),
          marshalToNative(offsetInPixels), widthInPixels, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplayWindow2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __102426003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayWindow2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a95ce2e6bdd843658e11de94de8dff02")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayWindow2(ptr: Pointer?): WithDefault = ILineDisplayWindow2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayWindow2 {
      val address = segment.toRawLongValue()
      return makeILineDisplayWindow2(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayWindow2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__102426003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayWindow2): Array<ILineDisplayWindow2?> =
        (elements as
        Array<ILineDisplayWindow2?>).castToImpl<ILineDisplayWindow2,ILineDisplayWindow2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayWindow2?> =
        arrayOfNulls<ILineDisplayWindow2_Impl>(size) as Array<ILineDisplayWindow2?>
  }
}
