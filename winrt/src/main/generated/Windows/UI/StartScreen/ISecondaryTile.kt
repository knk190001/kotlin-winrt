package Windows.UI.StartScreen

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.Foundation.Uri
import Windows.UI.Color
import Windows.UI.Popups.Placement
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

@ABIMarker(ISecondaryTile.ABI::class)
@Signature("{9e9e51e0-2bb5-4bc0-bb8d-42b23abcc88d}")
@Guid("9e9e51e02bb54bc0bb8d42b23abcc88d")
@WinRTInterface("9e9e51e02bb54bc0bb8d42b23abcc88d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryTile.ByReference::class)
public interface ISecondaryTile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_TileId(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_TileId(): String?

  @InterfaceMethod(2)
  public fun put_Arguments(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Arguments(): String?

  @InterfaceMethod(4)
  public fun put_ShortName(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_ShortName(): String?

  @InterfaceMethod(6)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_DisplayName(): String?

  @InterfaceMethod(8)
  public fun put_Logo(value: Uri?): Unit

  @InterfaceMethod(9)
  public fun get_Logo(): Uri?

  @InterfaceMethod(10)
  public fun put_SmallLogo(value: Uri?): Unit

  @InterfaceMethod(11)
  public fun get_SmallLogo(): Uri?

  @InterfaceMethod(12)
  public fun put_WideLogo(value: Uri?): Unit

  @InterfaceMethod(13)
  public fun get_WideLogo(): Uri?

  @InterfaceMethod(14)
  public fun put_LockScreenBadgeLogo(value: Uri?): Unit

  @InterfaceMethod(15)
  public fun get_LockScreenBadgeLogo(): Uri?

  @InterfaceMethod(16)
  public fun put_LockScreenDisplayBadgeAndTileText(value: Boolean): Unit

  @InterfaceMethod(17)
  public fun get_LockScreenDisplayBadgeAndTileText(): Boolean

  @InterfaceMethod(18)
  public fun put_TileOptions(value: TileOptions?): Unit

  @InterfaceMethod(19)
  public fun get_TileOptions(): TileOptions?

  @InterfaceMethod(20)
  public fun put_ForegroundText(value: ForegroundText?): Unit

  @InterfaceMethod(21)
  public fun get_ForegroundText(): ForegroundText?

  @InterfaceMethod(22)
  public fun put_BackgroundColor(value: Color?): Unit

  @InterfaceMethod(23)
  public fun get_BackgroundColor(): Color?

  @InterfaceMethod(24)
  public fun RequestCreateAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(25)
  public fun RequestCreateAsync(invocationPoint: Point?): IAsyncOperation<Boolean>?

  @InterfaceMethod(26)
  public fun RequestCreateForSelectionAsync(selection: Rect?): IAsyncOperation<Boolean>?

  @InterfaceMethod(27)
  public fun RequestCreateForSelectionAsync(selection: Rect?, preferredPlacement: Placement?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(28)
  public fun RequestDeleteAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(29)
  public fun RequestDeleteAsync(invocationPoint: Point?): IAsyncOperation<Boolean>?

  @InterfaceMethod(30)
  public fun RequestDeleteForSelectionAsync(selection: Rect?): IAsyncOperation<Boolean>?

  @InterfaceMethod(31)
  public fun RequestDeleteForSelectionAsync(selection: Rect?, preferredPlacement: Placement?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(32)
  public fun UpdateAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISecondaryTile>
      {
    public override fun getValue() = ABI.makeISecondaryTile(pointer.getPointer(0))

    public fun setValue(value: ISecondaryTile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryTile {
    public val __19566616_Ptr: Pointer?

    public val _19566616_VtblPtr: Pointer?
      get() = __19566616_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_TileId(value: String?): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_TileId(): String? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Arguments(value: String?): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Arguments(): String? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ShortName(value: String?): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ShortName(): String? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_DisplayName(): String? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Logo(value: Uri?): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Logo(): Uri? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_SmallLogo(value: Uri?): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_SmallLogo(): Uri? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_WideLogo(value: Uri?): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_WideLogo(): Uri? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_LockScreenBadgeLogo(value: Uri?): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_LockScreenBadgeLogo(): Uri? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_LockScreenDisplayBadgeAndTileText(value: Boolean): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_LockScreenDisplayBadgeAndTileText(): Boolean {
      val fnPtr = _19566616_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_TileOptions(value: TileOptions?): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_TileOptions(): TileOptions? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileOptions>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_ForegroundText(value: ForegroundText?): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_ForegroundText(): ForegroundText? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ForegroundText>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ForegroundText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_BackgroundColor(value: Color?): Unit {
      val fnPtr = _19566616_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_BackgroundColor(): Color? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun RequestCreateAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun RequestCreateAsync(invocationPoint: Point?): IAsyncOperation<Boolean>? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(invocationPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun RequestCreateForSelectionAsync(selection: Rect?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun RequestCreateForSelectionAsync(selection: Rect?,
        preferredPlacement: Placement?): IAsyncOperation<Boolean>? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(selection),
          marshalToNative(preferredPlacement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun RequestDeleteAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun RequestDeleteAsync(invocationPoint: Point?): IAsyncOperation<Boolean>? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(invocationPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun RequestDeleteForSelectionAsync(selection: Rect?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun RequestDeleteForSelectionAsync(selection: Rect?,
        preferredPlacement: Placement?): IAsyncOperation<Boolean>? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr, marshalToNative(selection),
          marshalToNative(preferredPlacement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun UpdateAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _19566616_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__19566616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryTile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __19566616_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryTile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e9e51e02bb54bc0bb8d42b23abcc88d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryTile(ptr: Pointer?): WithDefault = ISecondaryTile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISecondaryTile {
      val address = segment.toRawLongValue()
      return makeISecondaryTile(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryTile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__19566616_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryTile): Array<ISecondaryTile?> = (elements as
        Array<ISecondaryTile?>).castToImpl<ISecondaryTile,ISecondaryTile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryTile?> =
        arrayOfNulls<ISecondaryTile_Impl>(size) as Array<ISecondaryTile?>
  }
}
