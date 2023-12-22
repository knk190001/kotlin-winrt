package Windows.Media.Devices.Core

import Windows.Foundation.IReference
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrameExposureCompensationControl.ABI::class)
@Signature("{e95896c9-f7f9-48ca-8591-a26531cb1578}")
@Guid("e95896c9f7f948ca8591a26531cb1578")
@WinRTInterface("e95896c9f7f948ca8591a26531cb1578")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameExposureCompensationControl.ByReference::class)
public interface IFrameExposureCompensationControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): IReference<Float>?

  @InterfaceMethod(1)
  public fun put_Value(value: IReference<Float>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameExposureCompensationControl> {
    public override fun getValue() =
        ABI.makeIFrameExposureCompensationControl(pointer.getPointer(0))

    public fun setValue(value: IFrameExposureCompensationControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameExposureCompensationControl {
    public val __431627053_Ptr: Pointer?

    public val _431627053_VtblPtr: Pointer?
      get() = __431627053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): IReference<Float>? {
      val fnPtr = _431627053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__431627053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Value(value: IReference<Float>?): Unit {
      val fnPtr = _431627053_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__431627053_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameExposureCompensationControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __431627053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameExposureCompensationControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e95896c9f7f948ca8591a26531cb1578")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameExposureCompensationControl(ptr: Pointer?): WithDefault =
        IFrameExposureCompensationControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameExposureCompensationControl {
      val address = segment.toRawLongValue()
      return makeIFrameExposureCompensationControl(Pointer(address))
    }

    public override fun toNative(obj: IFrameExposureCompensationControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__431627053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameExposureCompensationControl):
        Array<IFrameExposureCompensationControl?> = (elements as
        Array<IFrameExposureCompensationControl?>).castToImpl<IFrameExposureCompensationControl,IFrameExposureCompensationControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameExposureCompensationControl?> =
        arrayOfNulls<IFrameExposureCompensationControl_Impl>(size) as
        Array<IFrameExposureCompensationControl?>
  }
}
