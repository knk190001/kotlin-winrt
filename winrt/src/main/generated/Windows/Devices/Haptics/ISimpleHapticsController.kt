package Windows.Devices.Haptics

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISimpleHapticsController.ABI::class)
@Signature("{3d577ef9-4cee-11e6-b535-001bdc06ab3b}")
@Guid("3d577ef94cee11e6b535001bdc06ab3b")
@WinRTInterface("3d577ef94cee11e6b535001bdc06ab3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISimpleHapticsController.ByReference::class)
public interface ISimpleHapticsController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_SupportedFeedback(): IVectorView<SimpleHapticsControllerFeedback?>?

  @InterfaceMethod(2)
  public fun get_IsIntensitySupported(): Boolean

  @InterfaceMethod(3)
  public fun get_IsPlayCountSupported(): Boolean

  @InterfaceMethod(4)
  public fun get_IsPlayDurationSupported(): Boolean

  @InterfaceMethod(5)
  public fun get_IsReplayPauseIntervalSupported(): Boolean

  @InterfaceMethod(6)
  public fun StopFeedback(): Unit

  @InterfaceMethod(7)
  public fun SendHapticFeedback(feedback: SimpleHapticsControllerFeedback?): Unit

  @InterfaceMethod(8)
  public fun SendHapticFeedback(feedback: SimpleHapticsControllerFeedback?, intensity: Double): Unit

  @InterfaceMethod(9)
  public fun SendHapticFeedbackForDuration(
    feedback: SimpleHapticsControllerFeedback?,
    intensity: Double,
    playDuration: TimeSpan?
  ): Unit

  @InterfaceMethod(10)
  public fun SendHapticFeedbackForPlayCount(
    feedback: SimpleHapticsControllerFeedback?,
    intensity: Double,
    playCount: Int,
    replayPauseInterval: TimeSpan?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISimpleHapticsController> {
    public override fun getValue() = ABI.makeISimpleHapticsController(pointer.getPointer(0))

    public fun setValue(value: ISimpleHapticsController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISimpleHapticsController {
    public val __744671683_Ptr: Pointer?

    public val _744671683_VtblPtr: Pointer?
      get() = __744671683_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _744671683_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__744671683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedFeedback(): IVectorView<SimpleHapticsControllerFeedback?>? {
      val fnPtr = _744671683_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SimpleHapticsControllerFeedback?>>()
      val hr = fn.invokeHR(arrayOf(__744671683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SimpleHapticsControllerFeedback?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsIntensitySupported(): Boolean {
      val fnPtr = _744671683_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__744671683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsPlayCountSupported(): Boolean {
      val fnPtr = _744671683_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__744671683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsPlayDurationSupported(): Boolean {
      val fnPtr = _744671683_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__744671683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsReplayPauseIntervalSupported(): Boolean {
      val fnPtr = _744671683_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__744671683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun StopFeedback(): Unit {
      val fnPtr = _744671683_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__744671683_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun SendHapticFeedback(feedback: SimpleHapticsControllerFeedback?): Unit {
      val fnPtr = _744671683_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__744671683_Ptr, marshalToNative(feedback),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun SendHapticFeedback(feedback: SimpleHapticsControllerFeedback?,
        intensity: Double): Unit {
      val fnPtr = _744671683_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__744671683_Ptr, marshalToNative(feedback), intensity,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SendHapticFeedbackForDuration(
      feedback: SimpleHapticsControllerFeedback?,
      intensity: Double,
      playDuration: TimeSpan?
    ): Unit {
      val fnPtr = _744671683_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__744671683_Ptr, marshalToNative(feedback), intensity,
          marshalToNative(playDuration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun SendHapticFeedbackForPlayCount(
      feedback: SimpleHapticsControllerFeedback?,
      intensity: Double,
      playCount: Int,
      replayPauseInterval: TimeSpan?
    ): Unit {
      val fnPtr = _744671683_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__744671683_Ptr, marshalToNative(feedback), intensity, playCount,
          marshalToNative(replayPauseInterval),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISimpleHapticsController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __744671683_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISimpleHapticsController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d577ef94cee11e6b535001bdc06ab3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISimpleHapticsController(ptr: Pointer?): WithDefault =
        ISimpleHapticsController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISimpleHapticsController {
      val address = segment.toRawLongValue()
      return makeISimpleHapticsController(Pointer(address))
    }

    public override fun toNative(obj: ISimpleHapticsController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__744671683_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISimpleHapticsController):
        Array<ISimpleHapticsController?> = (elements as
        Array<ISimpleHapticsController?>).castToImpl<ISimpleHapticsController,ISimpleHapticsController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISimpleHapticsController?> =
        arrayOfNulls<ISimpleHapticsController_Impl>(size) as Array<ISimpleHapticsController?>
  }
}
