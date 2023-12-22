package Windows.System.Preview

import Windows.Devices.Sensors.SimpleOrientation
import Windows.Foundation.DateTime
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITwoPanelHingedDevicePosturePreviewReading.ABI::class)
@Signature("{a0251452-4ad6-4b38-8426-c59a15493a7d}")
@Guid("a02514524ad64b388426c59a15493a7d")
@WinRTInterface("a02514524ad64b388426c59a15493a7d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITwoPanelHingedDevicePosturePreviewReading.ByReference::class)
public interface ITwoPanelHingedDevicePosturePreviewReading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_HingeState(): HingeState?

  @InterfaceMethod(2)
  public fun get_Panel1Orientation(): SimpleOrientation?

  @InterfaceMethod(3)
  public fun get_Panel1Id(): String?

  @InterfaceMethod(4)
  public fun get_Panel2Orientation(): SimpleOrientation?

  @InterfaceMethod(5)
  public fun get_Panel2Id(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITwoPanelHingedDevicePosturePreviewReading> {
    public override fun getValue() =
        ABI.makeITwoPanelHingedDevicePosturePreviewReading(pointer.getPointer(0))

    public fun setValue(value: ITwoPanelHingedDevicePosturePreviewReading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITwoPanelHingedDevicePosturePreviewReading {
    public val __1301041680_Ptr: Pointer?

    public val _1301041680_VtblPtr: Pointer?
      get() = __1301041680_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _1301041680_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1301041680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HingeState(): HingeState? {
      val fnPtr = _1301041680_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HingeState>()
      val hr = fn.invokeHR(arrayOf(__1301041680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HingeState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Panel1Orientation(): SimpleOrientation? {
      val fnPtr = _1301041680_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SimpleOrientation>()
      val hr = fn.invokeHR(arrayOf(__1301041680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SimpleOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Panel1Id(): String? {
      val fnPtr = _1301041680_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1301041680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Panel2Orientation(): SimpleOrientation? {
      val fnPtr = _1301041680_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SimpleOrientation>()
      val hr = fn.invokeHR(arrayOf(__1301041680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SimpleOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Panel2Id(): String? {
      val fnPtr = _1301041680_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1301041680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ITwoPanelHingedDevicePosturePreviewReading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1301041680_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITwoPanelHingedDevicePosturePreviewReading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a02514524ad64b388426c59a15493a7d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITwoPanelHingedDevicePosturePreviewReading(ptr: Pointer?): WithDefault =
        ITwoPanelHingedDevicePosturePreviewReading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ITwoPanelHingedDevicePosturePreviewReading {
      val address = segment.toRawLongValue()
      return makeITwoPanelHingedDevicePosturePreviewReading(Pointer(address))
    }

    public override fun toNative(obj: ITwoPanelHingedDevicePosturePreviewReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1301041680_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITwoPanelHingedDevicePosturePreviewReading):
        Array<ITwoPanelHingedDevicePosturePreviewReading?> = (elements as
        Array<ITwoPanelHingedDevicePosturePreviewReading?>).castToImpl<ITwoPanelHingedDevicePosturePreviewReading,ITwoPanelHingedDevicePosturePreviewReading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITwoPanelHingedDevicePosturePreviewReading?> =
        arrayOfNulls<ITwoPanelHingedDevicePosturePreviewReading_Impl>(size) as
        Array<ITwoPanelHingedDevicePosturePreviewReading?>
  }
}
