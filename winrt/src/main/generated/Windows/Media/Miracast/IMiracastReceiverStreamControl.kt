package Windows.Media.Miracast

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IMiracastReceiverStreamControl.ABI::class)
@Signature("{38ea2d8b-2769-5ad7-8a8a-254b9df7ba82}")
@Guid("38ea2d8b27695ad78a8a254b9df7ba82")
@WinRTInterface("38ea2d8b27695ad78a8a254b9df7ba82")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverStreamControl.ByReference::class)
public interface IMiracastReceiverStreamControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetVideoStreamSettings(): MiracastReceiverVideoStreamSettings?

  @InterfaceMethod(1)
  public fun GetVideoStreamSettingsAsync(): IAsyncOperation<MiracastReceiverVideoStreamSettings?>?

  @InterfaceMethod(2)
  public fun SuggestVideoStreamSettings(settings: MiracastReceiverVideoStreamSettings?): Unit

  @InterfaceMethod(3)
  public fun SuggestVideoStreamSettingsAsync(settings: MiracastReceiverVideoStreamSettings?):
      IAsyncAction?

  @InterfaceMethod(4)
  public fun get_MuteAudio(): Boolean

  @InterfaceMethod(5)
  public fun put_MuteAudio(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverStreamControl> {
    public override fun getValue() = ABI.makeIMiracastReceiverStreamControl(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverStreamControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverStreamControl {
    public val __637927450_Ptr: Pointer?

    public val _637927450_VtblPtr: Pointer?
      get() = __637927450_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetVideoStreamSettings(): MiracastReceiverVideoStreamSettings? {
      val fnPtr = _637927450_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverVideoStreamSettings>()
      val hr = fn.invokeHR(arrayOf(__637927450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverVideoStreamSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetVideoStreamSettingsAsync():
        IAsyncOperation<MiracastReceiverVideoStreamSettings?>? {
      val fnPtr = _637927450_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MiracastReceiverVideoStreamSettings?>>()
      val hr = fn.invokeHR(arrayOf(__637927450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MiracastReceiverVideoStreamSettings?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SuggestVideoStreamSettings(settings: MiracastReceiverVideoStreamSettings?):
        Unit {
      val fnPtr = _637927450_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__637927450_Ptr, marshalToNative(settings),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override
        fun SuggestVideoStreamSettingsAsync(settings: MiracastReceiverVideoStreamSettings?):
        IAsyncAction? {
      val fnPtr = _637927450_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__637927450_Ptr, marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MuteAudio(): Boolean {
      val fnPtr = _637927450_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__637927450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MuteAudio(value: Boolean): Unit {
      val fnPtr = _637927450_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__637927450_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMiracastReceiverStreamControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __637927450_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverStreamControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38ea2d8b27695ad78a8a254b9df7ba82")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverStreamControl(ptr: Pointer?): WithDefault =
        IMiracastReceiverStreamControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverStreamControl {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverStreamControl(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverStreamControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__637927450_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverStreamControl):
        Array<IMiracastReceiverStreamControl?> = (elements as
        Array<IMiracastReceiverStreamControl?>).castToImpl<IMiracastReceiverStreamControl,IMiracastReceiverStreamControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverStreamControl?> =
        arrayOfNulls<IMiracastReceiverStreamControl_Impl>(size) as
        Array<IMiracastReceiverStreamControl?>
  }
}
