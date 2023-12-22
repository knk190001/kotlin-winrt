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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrameController.ABI::class)
@Signature("{c16459d9-baef-4052-9177-48aff2af7522}")
@Guid("c16459d9baef4052917748aff2af7522")
@WinRTInterface("c16459d9baef4052917748aff2af7522")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameController.ByReference::class)
public interface IFrameController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExposureControl(): FrameExposureControl?

  @InterfaceMethod(1)
  public fun get_ExposureCompensationControl(): FrameExposureCompensationControl?

  @InterfaceMethod(2)
  public fun get_IsoSpeedControl(): FrameIsoSpeedControl?

  @InterfaceMethod(3)
  public fun get_FocusControl(): FrameFocusControl?

  @InterfaceMethod(4)
  public fun get_PhotoConfirmationEnabled(): IReference<Boolean>?

  @InterfaceMethod(5)
  public fun put_PhotoConfirmationEnabled(value: IReference<Boolean>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameController> {
    public override fun getValue() = ABI.makeIFrameController(pointer.getPointer(0))

    public fun setValue(value: IFrameController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameController {
    public val __1600570629_Ptr: Pointer?

    public val _1600570629_VtblPtr: Pointer?
      get() = __1600570629_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExposureControl(): FrameExposureControl? {
      val fnPtr = _1600570629_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameExposureControl>()
      val hr = fn.invokeHR(arrayOf(__1600570629_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameExposureControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExposureCompensationControl(): FrameExposureCompensationControl? {
      val fnPtr = _1600570629_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameExposureCompensationControl>()
      val hr = fn.invokeHR(arrayOf(__1600570629_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameExposureCompensationControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsoSpeedControl(): FrameIsoSpeedControl? {
      val fnPtr = _1600570629_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameIsoSpeedControl>()
      val hr = fn.invokeHR(arrayOf(__1600570629_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameIsoSpeedControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FocusControl(): FrameFocusControl? {
      val fnPtr = _1600570629_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameFocusControl>()
      val hr = fn.invokeHR(arrayOf(__1600570629_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameFocusControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PhotoConfirmationEnabled(): IReference<Boolean>? {
      val fnPtr = _1600570629_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1600570629_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PhotoConfirmationEnabled(value: IReference<Boolean>?): Unit {
      val fnPtr = _1600570629_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600570629_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1600570629_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c16459d9baef4052917748aff2af7522")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameController(ptr: Pointer?): WithDefault = IFrameController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameController {
      val address = segment.toRawLongValue()
      return makeIFrameController(Pointer(address))
    }

    public override fun toNative(obj: IFrameController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1600570629_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameController): Array<IFrameController?> = (elements as
        Array<IFrameController?>).castToImpl<IFrameController,IFrameController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameController?> =
        arrayOfNulls<IFrameController_Impl>(size) as Array<IFrameController?>
  }
}
