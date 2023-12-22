package Windows.Media.Devices

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IExposureCompensationControl.ABI::class)
@Signature("{81c8e834-dcec-4011-a610-1f3847e64aca}")
@Guid("81c8e834dcec4011a6101f3847e64aca")
@WinRTInterface("81c8e834dcec4011a6101f3847e64aca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExposureCompensationControl.ByReference::class)
public interface IExposureCompensationControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_Min(): Float

  @InterfaceMethod(2)
  public fun get_Max(): Float

  @InterfaceMethod(3)
  public fun get_Step(): Float

  @InterfaceMethod(4)
  public fun get_Value(): Float

  @InterfaceMethod(5)
  public fun SetValueAsync(value: Float): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExposureCompensationControl> {
    public override fun getValue() = ABI.makeIExposureCompensationControl(pointer.getPointer(0))

    public fun setValue(value: IExposureCompensationControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExposureCompensationControl {
    public val __730691237_Ptr: Pointer?

    public val _730691237_VtblPtr: Pointer?
      get() = __730691237_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _730691237_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__730691237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Min(): Float {
      val fnPtr = _730691237_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__730691237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Max(): Float {
      val fnPtr = _730691237_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__730691237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Step(): Float {
      val fnPtr = _730691237_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__730691237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Value(): Float {
      val fnPtr = _730691237_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__730691237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun SetValueAsync(value: Float): IAsyncAction? {
      val fnPtr = _730691237_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__730691237_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IExposureCompensationControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __730691237_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExposureCompensationControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81c8e834dcec4011a6101f3847e64aca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExposureCompensationControl(ptr: Pointer?): WithDefault =
        IExposureCompensationControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExposureCompensationControl {
      val address = segment.toRawLongValue()
      return makeIExposureCompensationControl(Pointer(address))
    }

    public override fun toNative(obj: IExposureCompensationControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__730691237_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExposureCompensationControl):
        Array<IExposureCompensationControl?> = (elements as
        Array<IExposureCompensationControl?>).castToImpl<IExposureCompensationControl,IExposureCompensationControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExposureCompensationControl?> =
        arrayOfNulls<IExposureCompensationControl_Impl>(size) as
        Array<IExposureCompensationControl?>
  }
}
