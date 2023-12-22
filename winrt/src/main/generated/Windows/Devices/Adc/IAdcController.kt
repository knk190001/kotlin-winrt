package Windows.Devices.Adc

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

@ABIMarker(IAdcController.ABI::class)
@Signature("{2a76e4b0-a896-4219-86b6-ea8cdce98f56}")
@Guid("2a76e4b0a896421986b6ea8cdce98f56")
@WinRTInterface("2a76e4b0a896421986b6ea8cdce98f56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdcController.ByReference::class)
public interface IAdcController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChannelCount(): Int

  @InterfaceMethod(1)
  public fun get_ResolutionInBits(): Int

  @InterfaceMethod(2)
  public fun get_MinValue(): Int

  @InterfaceMethod(3)
  public fun get_MaxValue(): Int

  @InterfaceMethod(4)
  public fun get_ChannelMode(): AdcChannelMode?

  @InterfaceMethod(5)
  public fun put_ChannelMode(value: AdcChannelMode?): Unit

  @InterfaceMethod(6)
  public fun IsChannelModeSupported(channelMode: AdcChannelMode?): Boolean

  @InterfaceMethod(7)
  public fun OpenChannel(channelNumber: Int): AdcChannel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAdcController>
      {
    public override fun getValue() = ABI.makeIAdcController(pointer.getPointer(0))

    public fun setValue(value: IAdcController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdcController {
    public val __836924503_Ptr: Pointer?

    public val _836924503_VtblPtr: Pointer?
      get() = __836924503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChannelCount(): Int {
      val fnPtr = _836924503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__836924503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ResolutionInBits(): Int {
      val fnPtr = _836924503_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__836924503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MinValue(): Int {
      val fnPtr = _836924503_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__836924503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MaxValue(): Int {
      val fnPtr = _836924503_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__836924503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ChannelMode(): AdcChannelMode? {
      val fnPtr = _836924503_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdcChannelMode>()
      val hr = fn.invokeHR(arrayOf(__836924503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdcChannelMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ChannelMode(value: AdcChannelMode?): Unit {
      val fnPtr = _836924503_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__836924503_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun IsChannelModeSupported(channelMode: AdcChannelMode?): Boolean {
      val fnPtr = _836924503_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__836924503_Ptr, marshalToNative(channelMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun OpenChannel(channelNumber: Int): AdcChannel? {
      val fnPtr = _836924503_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdcChannel>()
      val hr = fn.invokeHR(arrayOf(__836924503_Ptr, channelNumber, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdcChannel>(result.getValue())
      return resultValue
    }
  }

  public class IAdcController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __836924503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdcController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a76e4b0a896421986b6ea8cdce98f56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdcController(ptr: Pointer?): WithDefault = IAdcController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdcController {
      val address = segment.toRawLongValue()
      return makeIAdcController(Pointer(address))
    }

    public override fun toNative(obj: IAdcController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__836924503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdcController): Array<IAdcController?> = (elements as
        Array<IAdcController?>).castToImpl<IAdcController,IAdcController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdcController?> =
        arrayOfNulls<IAdcController_Impl>(size) as Array<IAdcController?>
  }
}
