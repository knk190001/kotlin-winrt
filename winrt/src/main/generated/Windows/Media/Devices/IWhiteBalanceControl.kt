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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IWhiteBalanceControl.ABI::class)
@Signature("{781f047e-7162-49c8-a8f9-9481c565363e}")
@Guid("781f047e716249c8a8f99481c565363e")
@WinRTInterface("781f047e716249c8a8f99481c565363e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWhiteBalanceControl.ByReference::class)
public interface IWhiteBalanceControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_Preset(): ColorTemperaturePreset?

  @InterfaceMethod(2)
  public fun SetPresetAsync(preset: ColorTemperaturePreset?): IAsyncAction?

  @InterfaceMethod(3)
  public fun get_Min(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_Max(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_Step(): WinDef.UINT

  @InterfaceMethod(6)
  public fun get_Value(): WinDef.UINT

  @InterfaceMethod(7)
  public fun SetValueAsync(temperature: WinDef.UINT): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWhiteBalanceControl> {
    public override fun getValue() = ABI.makeIWhiteBalanceControl(pointer.getPointer(0))

    public fun setValue(value: IWhiteBalanceControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWhiteBalanceControl {
    public val __52966231_Ptr: Pointer?

    public val _52966231_VtblPtr: Pointer?
      get() = __52966231_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _52966231_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__52966231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Preset(): ColorTemperaturePreset? {
      val fnPtr = _52966231_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorTemperaturePreset>()
      val hr = fn.invokeHR(arrayOf(__52966231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorTemperaturePreset>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetPresetAsync(preset: ColorTemperaturePreset?): IAsyncAction? {
      val fnPtr = _52966231_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__52966231_Ptr, marshalToNative(preset), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Min(): WinDef.UINT {
      val fnPtr = _52966231_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__52966231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Max(): WinDef.UINT {
      val fnPtr = _52966231_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__52966231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Step(): WinDef.UINT {
      val fnPtr = _52966231_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__52966231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_Value(): WinDef.UINT {
      val fnPtr = _52966231_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__52966231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun SetValueAsync(temperature: WinDef.UINT): IAsyncAction? {
      val fnPtr = _52966231_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__52966231_Ptr, temperature, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IWhiteBalanceControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __52966231_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWhiteBalanceControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("781f047e716249c8a8f99481c565363e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWhiteBalanceControl(ptr: Pointer?): WithDefault = IWhiteBalanceControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWhiteBalanceControl {
      val address = segment.toRawLongValue()
      return makeIWhiteBalanceControl(Pointer(address))
    }

    public override fun toNative(obj: IWhiteBalanceControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__52966231_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWhiteBalanceControl): Array<IWhiteBalanceControl?> =
        (elements as
        Array<IWhiteBalanceControl?>).castToImpl<IWhiteBalanceControl,IWhiteBalanceControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWhiteBalanceControl?> =
        arrayOfNulls<IWhiteBalanceControl_Impl>(size) as Array<IWhiteBalanceControl?>
  }
}
