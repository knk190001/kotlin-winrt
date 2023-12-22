package Windows.UI.Input

import Windows.Devices.Input.PointerDevice
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

@ABIMarker(IPointerPoint.ABI::class)
@Signature("{e995317d-7296-42d9-8233-c5be73b74a4a}")
@Guid("e995317d729642d98233c5be73b74a4a")
@WinRTInterface("e995317d729642d98233c5be73b74a4a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerPoint.ByReference::class)
public interface IPointerPoint : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerDevice(): PointerDevice?

  @InterfaceMethod(1)
  public fun get_Position(): Point?

  @InterfaceMethod(2)
  public fun get_RawPosition(): Point?

  @InterfaceMethod(3)
  public fun get_PointerId(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_FrameId(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_Timestamp(): WinDef.ULONG

  @InterfaceMethod(6)
  public fun get_IsInContact(): Boolean

  @InterfaceMethod(7)
  public fun get_Properties(): PointerPointProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPointerPoint>
      {
    public override fun getValue() = ABI.makeIPointerPoint(pointer.getPointer(0))

    public fun setValue(value: IPointerPoint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerPoint {
    public val __1176154847_Ptr: Pointer?

    public val _1176154847_VtblPtr: Pointer?
      get() = __1176154847_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerDevice(): PointerDevice? {
      val fnPtr = _1176154847_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDevice>()
      val hr = fn.invokeHR(arrayOf(__1176154847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Position(): Point? {
      val fnPtr = _1176154847_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1176154847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RawPosition(): Point? {
      val fnPtr = _1176154847_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1176154847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PointerId(): WinDef.UINT {
      val fnPtr = _1176154847_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1176154847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_FrameId(): WinDef.UINT {
      val fnPtr = _1176154847_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1176154847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Timestamp(): WinDef.ULONG {
      val fnPtr = _1176154847_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1176154847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsInContact(): Boolean {
      val fnPtr = _1176154847_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1176154847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_Properties(): PointerPointProperties? {
      val fnPtr = _1176154847_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerPointProperties>()
      val hr = fn.invokeHR(arrayOf(__1176154847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerPointProperties>(result.getValue())
      return resultValue
    }
  }

  public class IPointerPoint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1176154847_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerPoint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e995317d729642d98233c5be73b74a4a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerPoint(ptr: Pointer?): WithDefault = IPointerPoint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerPoint {
      val address = segment.toRawLongValue()
      return makeIPointerPoint(Pointer(address))
    }

    public override fun toNative(obj: IPointerPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1176154847_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerPoint): Array<IPointerPoint?> = (elements as
        Array<IPointerPoint?>).castToImpl<IPointerPoint,IPointerPoint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerPoint?> =
        arrayOfNulls<IPointerPoint_Impl>(size) as Array<IPointerPoint?>
  }
}
