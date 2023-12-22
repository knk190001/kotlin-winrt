package Windows.Devices.PointOfService

import Windows.Foundation.IAsyncOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILineDisplayCursor.ABI::class)
@Signature("{ecdffc45-754a-4e3b-ab2b-151181085605}")
@Guid("ecdffc45754a4e3bab2b151181085605")
@WinRTInterface("ecdffc45754a4e3bab2b151181085605")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayCursor.ByReference::class)
public interface ILineDisplayCursor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanCustomize(): Boolean

  @InterfaceMethod(1)
  public fun get_IsBlinkSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_IsBlockSupported(): Boolean

  @InterfaceMethod(3)
  public fun get_IsHalfBlockSupported(): Boolean

  @InterfaceMethod(4)
  public fun get_IsUnderlineSupported(): Boolean

  @InterfaceMethod(5)
  public fun get_IsReverseSupported(): Boolean

  @InterfaceMethod(6)
  public fun get_IsOtherSupported(): Boolean

  @InterfaceMethod(7)
  public fun GetAttributes(): LineDisplayCursorAttributes?

  @InterfaceMethod(8)
  public fun TryUpdateAttributesAsync(attributes: LineDisplayCursorAttributes?):
      IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayCursor> {
    public override fun getValue() = ABI.makeILineDisplayCursor(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayCursor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayCursor {
    public val __558063131_Ptr: Pointer?

    public val _558063131_VtblPtr: Pointer?
      get() = __558063131_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanCustomize(): Boolean {
      val fnPtr = _558063131_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__558063131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsBlinkSupported(): Boolean {
      val fnPtr = _558063131_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__558063131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsBlockSupported(): Boolean {
      val fnPtr = _558063131_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__558063131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsHalfBlockSupported(): Boolean {
      val fnPtr = _558063131_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__558063131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsUnderlineSupported(): Boolean {
      val fnPtr = _558063131_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__558063131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsReverseSupported(): Boolean {
      val fnPtr = _558063131_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__558063131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsOtherSupported(): Boolean {
      val fnPtr = _558063131_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__558063131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun GetAttributes(): LineDisplayCursorAttributes? {
      val fnPtr = _558063131_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayCursorAttributes>()
      val hr = fn.invokeHR(arrayOf(__558063131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayCursorAttributes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun TryUpdateAttributesAsync(attributes: LineDisplayCursorAttributes?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _558063131_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__558063131_Ptr, marshalToNative(attributes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplayCursor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __558063131_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayCursor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ecdffc45754a4e3bab2b151181085605")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayCursor(ptr: Pointer?): WithDefault = ILineDisplayCursor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayCursor {
      val address = segment.toRawLongValue()
      return makeILineDisplayCursor(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__558063131_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayCursor): Array<ILineDisplayCursor?> =
        (elements as
        Array<ILineDisplayCursor?>).castToImpl<ILineDisplayCursor,ILineDisplayCursor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayCursor?> =
        arrayOfNulls<ILineDisplayCursor_Impl>(size) as Array<ILineDisplayCursor?>
  }
}
