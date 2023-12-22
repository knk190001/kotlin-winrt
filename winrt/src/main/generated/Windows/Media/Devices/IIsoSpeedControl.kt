package Windows.Media.Devices

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IIsoSpeedControl.ABI::class)
@Signature("{27b6c322-25ad-4f1b-aaab-524ab376ca33}")
@Guid("27b6c32225ad4f1baaab524ab376ca33")
@WinRTInterface("27b6c32225ad4f1baaab524ab376ca33")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsoSpeedControl.ByReference::class)
public interface IIsoSpeedControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_SupportedPresets(): IVectorView<IsoSpeedPreset?>?

  @InterfaceMethod(2)
  public fun get_Preset(): IsoSpeedPreset?

  @InterfaceMethod(3)
  public fun SetPresetAsync(preset: IsoSpeedPreset?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsoSpeedControl> {
    public override fun getValue() = ABI.makeIIsoSpeedControl(pointer.getPointer(0))

    public fun setValue(value: IIsoSpeedControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsoSpeedControl {
    public val __883426554_Ptr: Pointer?

    public val _883426554_VtblPtr: Pointer?
      get() = __883426554_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _883426554_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__883426554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SupportedPresets(): IVectorView<IsoSpeedPreset?>? {
      val fnPtr = _883426554_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IsoSpeedPreset?>>()
      val hr = fn.invokeHR(arrayOf(__883426554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IsoSpeedPreset?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Preset(): IsoSpeedPreset? {
      val fnPtr = _883426554_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsoSpeedPreset>()
      val hr = fn.invokeHR(arrayOf(__883426554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IsoSpeedPreset>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetPresetAsync(preset: IsoSpeedPreset?): IAsyncAction? {
      val fnPtr = _883426554_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__883426554_Ptr, marshalToNative(preset), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IIsoSpeedControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __883426554_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsoSpeedControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27b6c32225ad4f1baaab524ab376ca33")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsoSpeedControl(ptr: Pointer?): WithDefault = IIsoSpeedControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsoSpeedControl {
      val address = segment.toRawLongValue()
      return makeIIsoSpeedControl(Pointer(address))
    }

    public override fun toNative(obj: IIsoSpeedControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__883426554_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsoSpeedControl): Array<IIsoSpeedControl?> = (elements as
        Array<IIsoSpeedControl?>).castToImpl<IIsoSpeedControl,IIsoSpeedControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsoSpeedControl?> =
        arrayOfNulls<IIsoSpeedControl_Impl>(size) as Array<IIsoSpeedControl?>
  }
}
