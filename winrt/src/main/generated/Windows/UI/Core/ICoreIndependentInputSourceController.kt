package Windows.UI.Core

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

@ABIMarker(ICoreIndependentInputSourceController.ABI::class)
@Signature("{0963261c-84fe-578a-83ca-6425309ccde4}")
@Guid("0963261c84fe578a83ca6425309ccde4")
@WinRTInterface("0963261c84fe578a83ca6425309ccde4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreIndependentInputSourceController.ByReference::class)
public interface ICoreIndependentInputSourceController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTransparentForUncontrolledInput(): Boolean

  @InterfaceMethod(1)
  public fun put_IsTransparentForUncontrolledInput(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsPalmRejectionEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsPalmRejectionEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_Source(): CoreIndependentInputSource?

  @InterfaceMethod(5)
  public fun SetControlledInput(inputTypes: CoreInputDeviceTypes?): Unit

  @InterfaceMethod(6)
  public fun SetControlledInput(
    inputTypes: CoreInputDeviceTypes?,
    required: CoreIndependentInputFilters?,
    excluded: CoreIndependentInputFilters?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreIndependentInputSourceController> {
    public override fun getValue() =
        ABI.makeICoreIndependentInputSourceController(pointer.getPointer(0))

    public fun setValue(value: ICoreIndependentInputSourceController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreIndependentInputSourceController {
    public val __2119982911_Ptr: Pointer?

    public val _2119982911_VtblPtr: Pointer?
      get() = __2119982911_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTransparentForUncontrolledInput(): Boolean {
      val fnPtr = _2119982911_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2119982911_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsTransparentForUncontrolledInput(value: Boolean): Unit {
      val fnPtr = _2119982911_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119982911_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsPalmRejectionEnabled(): Boolean {
      val fnPtr = _2119982911_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2119982911_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsPalmRejectionEnabled(value: Boolean): Unit {
      val fnPtr = _2119982911_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119982911_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Source(): CoreIndependentInputSource? {
      val fnPtr = _2119982911_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreIndependentInputSource>()
      val hr = fn.invokeHR(arrayOf(__2119982911_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreIndependentInputSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetControlledInput(inputTypes: CoreInputDeviceTypes?): Unit {
      val fnPtr = _2119982911_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119982911_Ptr, marshalToNative(inputTypes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetControlledInput(
      inputTypes: CoreInputDeviceTypes?,
      required: CoreIndependentInputFilters?,
      excluded: CoreIndependentInputFilters?
    ): Unit {
      val fnPtr = _2119982911_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119982911_Ptr, marshalToNative(inputTypes),
          marshalToNative(required), marshalToNative(excluded),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreIndependentInputSourceController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2119982911_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreIndependentInputSourceController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0963261c84fe578a83ca6425309ccde4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreIndependentInputSourceController(ptr: Pointer?): WithDefault =
        ICoreIndependentInputSourceController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreIndependentInputSourceController {
      val address = segment.toRawLongValue()
      return makeICoreIndependentInputSourceController(Pointer(address))
    }

    public override fun toNative(obj: ICoreIndependentInputSourceController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2119982911_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreIndependentInputSourceController):
        Array<ICoreIndependentInputSourceController?> = (elements as
        Array<ICoreIndependentInputSourceController?>).castToImpl<ICoreIndependentInputSourceController,ICoreIndependentInputSourceController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreIndependentInputSourceController?> =
        arrayOfNulls<ICoreIndependentInputSourceController_Impl>(size) as
        Array<ICoreIndependentInputSourceController?>
  }
}
