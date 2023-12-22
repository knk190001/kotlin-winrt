package Windows.Media.Devices.Core

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrameFlashControl.ABI::class)
@Signature("{75d5f6c7-bd45-4fab-9375-45ac04b332c2}")
@Guid("75d5f6c7bd454fab937545ac04b332c2")
@WinRTInterface("75d5f6c7bd454fab937545ac04b332c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameFlashControl.ByReference::class)
public interface IFrameFlashControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): FrameFlashMode?

  @InterfaceMethod(1)
  public fun put_Mode(value: FrameFlashMode?): Unit

  @InterfaceMethod(2)
  public fun get_Auto(): Boolean

  @InterfaceMethod(3)
  public fun put_Auto(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_RedEyeReduction(): Boolean

  @InterfaceMethod(5)
  public fun put_RedEyeReduction(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_PowerPercent(): Float

  @InterfaceMethod(7)
  public fun put_PowerPercent(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameFlashControl> {
    public override fun getValue() = ABI.makeIFrameFlashControl(pointer.getPointer(0))

    public fun setValue(value: IFrameFlashControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameFlashControl {
    public val __1544874614_Ptr: Pointer?

    public val _1544874614_VtblPtr: Pointer?
      get() = __1544874614_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): FrameFlashMode? {
      val fnPtr = _1544874614_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameFlashMode>()
      val hr = fn.invokeHR(arrayOf(__1544874614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameFlashMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mode(value: FrameFlashMode?): Unit {
      val fnPtr = _1544874614_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1544874614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Auto(): Boolean {
      val fnPtr = _1544874614_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1544874614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Auto(value: Boolean): Unit {
      val fnPtr = _1544874614_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1544874614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RedEyeReduction(): Boolean {
      val fnPtr = _1544874614_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1544874614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_RedEyeReduction(value: Boolean): Unit {
      val fnPtr = _1544874614_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1544874614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PowerPercent(): Float {
      val fnPtr = _1544874614_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1544874614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_PowerPercent(value: Float): Unit {
      val fnPtr = _1544874614_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1544874614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameFlashControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1544874614_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameFlashControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75d5f6c7bd454fab937545ac04b332c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameFlashControl(ptr: Pointer?): WithDefault = IFrameFlashControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameFlashControl {
      val address = segment.toRawLongValue()
      return makeIFrameFlashControl(Pointer(address))
    }

    public override fun toNative(obj: IFrameFlashControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1544874614_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameFlashControl): Array<IFrameFlashControl?> =
        (elements as
        Array<IFrameFlashControl?>).castToImpl<IFrameFlashControl,IFrameFlashControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameFlashControl?> =
        arrayOfNulls<IFrameFlashControl_Impl>(size) as Array<IFrameFlashControl?>
  }
}
