package Windows.Media.Devices.Core

import Windows.Foundation.IReference
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

@ABIMarker(IFrameExposureControl.ABI::class)
@Signature("{b1605a61-ffaf-4752-b621-f5b6f117f432}")
@Guid("b1605a61ffaf4752b621f5b6f117f432")
@WinRTInterface("b1605a61ffaf4752b621f5b6f117f432")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameExposureControl.ByReference::class)
public interface IFrameExposureControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Auto(): Boolean

  @InterfaceMethod(1)
  public fun put_Auto(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Value(): IReference<TimeSpan?>?

  @InterfaceMethod(3)
  public fun put_Value(value: IReference<TimeSpan?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameExposureControl> {
    public override fun getValue() = ABI.makeIFrameExposureControl(pointer.getPointer(0))

    public fun setValue(value: IFrameExposureControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameExposureControl {
    public val __901303667_Ptr: Pointer?

    public val _901303667_VtblPtr: Pointer?
      get() = __901303667_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Auto(): Boolean {
      val fnPtr = _901303667_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__901303667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Auto(value: Boolean): Unit {
      val fnPtr = _901303667_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__901303667_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Value(): IReference<TimeSpan?>? {
      val fnPtr = _901303667_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__901303667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Value(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _901303667_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__901303667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameExposureControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __901303667_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameExposureControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1605a61ffaf4752b621f5b6f117f432")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameExposureControl(ptr: Pointer?): WithDefault =
        IFrameExposureControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameExposureControl {
      val address = segment.toRawLongValue()
      return makeIFrameExposureControl(Pointer(address))
    }

    public override fun toNative(obj: IFrameExposureControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__901303667_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameExposureControl): Array<IFrameExposureControl?> =
        (elements as
        Array<IFrameExposureControl?>).castToImpl<IFrameExposureControl,IFrameExposureControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameExposureControl?> =
        arrayOfNulls<IFrameExposureControl_Impl>(size) as Array<IFrameExposureControl?>
  }
}
