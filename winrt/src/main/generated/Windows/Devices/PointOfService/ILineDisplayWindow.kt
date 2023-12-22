package Windows.Devices.PointOfService

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Point
import Windows.Foundation.Size
import Windows.Foundation.TimeSpan
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

@ABIMarker(ILineDisplayWindow.ABI::class)
@Signature("{d21feef4-2364-4be5-bee1-851680af4964}")
@Guid("d21feef423644be5bee1851680af4964")
@WinRTInterface("d21feef423644be5bee1851680af4964")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayWindow.ByReference::class)
public interface ILineDisplayWindow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SizeInCharacters(): Size?

  @InterfaceMethod(1)
  public fun get_InterCharacterWaitInterval(): TimeSpan?

  @InterfaceMethod(2)
  public fun put_InterCharacterWaitInterval(value: TimeSpan?): Unit

  @InterfaceMethod(3)
  public fun TryRefreshAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(4)
  public fun TryDisplayTextAsync(text: String?, displayAttribute: LineDisplayTextAttribute?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun TryDisplayTextAsync(
    text: String?,
    displayAttribute: LineDisplayTextAttribute?,
    startPosition: Point?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(6)
  public fun TryDisplayTextAsync(text: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(7)
  public fun TryScrollTextAsync(direction: LineDisplayScrollDirection?,
      numberOfColumnsOrRows: WinDef.UINT): IAsyncOperation<Boolean>?

  @InterfaceMethod(8)
  public fun TryClearTextAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayWindow> {
    public override fun getValue() = ABI.makeILineDisplayWindow(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayWindow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayWindow {
    public val __3304063_Ptr: Pointer?

    public val _3304063_VtblPtr: Pointer?
      get() = __3304063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SizeInCharacters(): Size? {
      val fnPtr = _3304063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__3304063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InterCharacterWaitInterval(): TimeSpan? {
      val fnPtr = _3304063_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__3304063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_InterCharacterWaitInterval(value: TimeSpan?): Unit {
      val fnPtr = _3304063_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3304063_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun TryRefreshAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _3304063_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__3304063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TryDisplayTextAsync(text: String?,
        displayAttribute: LineDisplayTextAttribute?): IAsyncOperation<Boolean>? {
      val fnPtr = _3304063_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__3304063_Ptr, marshalToNative(text),
          marshalToNative(displayAttribute), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun TryDisplayTextAsync(
      text: String?,
      displayAttribute: LineDisplayTextAttribute?,
      startPosition: Point?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _3304063_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__3304063_Ptr, marshalToNative(text),
          marshalToNative(displayAttribute), marshalToNative(startPosition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun TryDisplayTextAsync(text: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _3304063_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__3304063_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun TryScrollTextAsync(direction: LineDisplayScrollDirection?,
        numberOfColumnsOrRows: WinDef.UINT): IAsyncOperation<Boolean>? {
      val fnPtr = _3304063_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__3304063_Ptr, marshalToNative(direction), numberOfColumnsOrRows,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun TryClearTextAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _3304063_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__3304063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplayWindow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __3304063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayWindow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d21feef423644be5bee1851680af4964")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayWindow(ptr: Pointer?): WithDefault = ILineDisplayWindow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayWindow {
      val address = segment.toRawLongValue()
      return makeILineDisplayWindow(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__3304063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayWindow): Array<ILineDisplayWindow?> =
        (elements as
        Array<ILineDisplayWindow?>).castToImpl<ILineDisplayWindow,ILineDisplayWindow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayWindow?> =
        arrayOfNulls<ILineDisplayWindow_Impl>(size) as Array<ILineDisplayWindow?>
  }
}
