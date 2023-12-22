package Windows.Media.Devices

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IOpticalImageStabilizationControl.ABI::class)
@Signature("{bfad9c1d-00bc-423b-8eb2-a0178ca94247}")
@Guid("bfad9c1d00bc423b8eb2a0178ca94247")
@WinRTInterface("bfad9c1d00bc423b8eb2a0178ca94247")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOpticalImageStabilizationControl.ByReference::class)
public interface IOpticalImageStabilizationControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_SupportedModes(): IVectorView<OpticalImageStabilizationMode?>?

  @InterfaceMethod(2)
  public fun get_Mode(): OpticalImageStabilizationMode?

  @InterfaceMethod(3)
  public fun put_Mode(value: OpticalImageStabilizationMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOpticalImageStabilizationControl> {
    public override fun getValue() =
        ABI.makeIOpticalImageStabilizationControl(pointer.getPointer(0))

    public fun setValue(value: IOpticalImageStabilizationControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOpticalImageStabilizationControl {
    public val __1969761150_Ptr: Pointer?

    public val _1969761150_VtblPtr: Pointer?
      get() = __1969761150_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _1969761150_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1969761150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SupportedModes(): IVectorView<OpticalImageStabilizationMode?>? {
      val fnPtr = _1969761150_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<OpticalImageStabilizationMode?>>()
      val hr = fn.invokeHR(arrayOf(__1969761150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<OpticalImageStabilizationMode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Mode(): OpticalImageStabilizationMode? {
      val fnPtr = _1969761150_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OpticalImageStabilizationMode>()
      val hr = fn.invokeHR(arrayOf(__1969761150_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OpticalImageStabilizationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Mode(value: OpticalImageStabilizationMode?): Unit {
      val fnPtr = _1969761150_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1969761150_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IOpticalImageStabilizationControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1969761150_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOpticalImageStabilizationControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bfad9c1d00bc423b8eb2a0178ca94247")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOpticalImageStabilizationControl(ptr: Pointer?): WithDefault =
        IOpticalImageStabilizationControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOpticalImageStabilizationControl {
      val address = segment.toRawLongValue()
      return makeIOpticalImageStabilizationControl(Pointer(address))
    }

    public override fun toNative(obj: IOpticalImageStabilizationControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1969761150_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOpticalImageStabilizationControl):
        Array<IOpticalImageStabilizationControl?> = (elements as
        Array<IOpticalImageStabilizationControl?>).castToImpl<IOpticalImageStabilizationControl,IOpticalImageStabilizationControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOpticalImageStabilizationControl?> =
        arrayOfNulls<IOpticalImageStabilizationControl_Impl>(size) as
        Array<IOpticalImageStabilizationControl?>
  }
}
