package Windows.Devices.PointOfService

import Windows.Foundation.Point
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

@ABIMarker(ILineDisplayCursorAttributes.ABI::class)
@Signature("{4e2d54fe-4ffd-4190-aae1-ce285f20c896}")
@Guid("4e2d54fe4ffd4190aae1ce285f20c896")
@WinRTInterface("4e2d54fe4ffd4190aae1ce285f20c896")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayCursorAttributes.ByReference::class)
public interface ILineDisplayCursorAttributes : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBlinkEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsBlinkEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_CursorType(): LineDisplayCursorType?

  @InterfaceMethod(3)
  public fun put_CursorType(value: LineDisplayCursorType?): Unit

  @InterfaceMethod(4)
  public fun get_IsAutoAdvanceEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsAutoAdvanceEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_Position(): Point?

  @InterfaceMethod(7)
  public fun put_Position(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayCursorAttributes> {
    public override fun getValue() = ABI.makeILineDisplayCursorAttributes(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayCursorAttributes_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayCursorAttributes {
    public val __934989084_Ptr: Pointer?

    public val _934989084_VtblPtr: Pointer?
      get() = __934989084_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBlinkEnabled(): Boolean {
      val fnPtr = _934989084_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__934989084_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsBlinkEnabled(value: Boolean): Unit {
      val fnPtr = _934989084_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__934989084_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CursorType(): LineDisplayCursorType? {
      val fnPtr = _934989084_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayCursorType>()
      val hr = fn.invokeHR(arrayOf(__934989084_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayCursorType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CursorType(value: LineDisplayCursorType?): Unit {
      val fnPtr = _934989084_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__934989084_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsAutoAdvanceEnabled(): Boolean {
      val fnPtr = _934989084_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__934989084_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsAutoAdvanceEnabled(value: Boolean): Unit {
      val fnPtr = _934989084_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__934989084_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Position(): Point? {
      val fnPtr = _934989084_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__934989084_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Position(value: Point?): Unit {
      val fnPtr = _934989084_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__934989084_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILineDisplayCursorAttributes_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __934989084_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayCursorAttributes, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e2d54fe4ffd4190aae1ce285f20c896")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayCursorAttributes(ptr: Pointer?): WithDefault =
        ILineDisplayCursorAttributes_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayCursorAttributes {
      val address = segment.toRawLongValue()
      return makeILineDisplayCursorAttributes(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayCursorAttributes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__934989084_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayCursorAttributes):
        Array<ILineDisplayCursorAttributes?> = (elements as
        Array<ILineDisplayCursorAttributes?>).castToImpl<ILineDisplayCursorAttributes,ILineDisplayCursorAttributes_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayCursorAttributes?> =
        arrayOfNulls<ILineDisplayCursorAttributes_Impl>(size) as
        Array<ILineDisplayCursorAttributes?>
  }
}
