package Windows.UI.Input.Inking

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Core.CoreInputDeviceTypes
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

@ABIMarker(IInkPresenter.ABI::class)
@Signature("{a69b70e2-887b-458f-b173-4fe4438930a3}")
@Guid("a69b70e2887b458fb1734fe4438930a3")
@WinRTInterface("a69b70e2887b458fb1734fe4438930a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPresenter.ByReference::class)
public interface IInkPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsInputEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsInputEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_InputDeviceTypes(): CoreInputDeviceTypes?

  @InterfaceMethod(3)
  public fun put_InputDeviceTypes(value: CoreInputDeviceTypes?): Unit

  @InterfaceMethod(4)
  public fun get_UnprocessedInput(): InkUnprocessedInput?

  @InterfaceMethod(5)
  public fun get_StrokeInput(): InkStrokeInput?

  @InterfaceMethod(6)
  public fun get_InputProcessingConfiguration(): InkInputProcessingConfiguration?

  @InterfaceMethod(7)
  public fun get_StrokeContainer(): InkStrokeContainer?

  @InterfaceMethod(8)
  public fun put_StrokeContainer(value: InkStrokeContainer?): Unit

  @InterfaceMethod(9)
  public fun CopyDefaultDrawingAttributes(): InkDrawingAttributes?

  @InterfaceMethod(10)
  public fun UpdateDefaultDrawingAttributes(value: InkDrawingAttributes?): Unit

  @InterfaceMethod(11)
  public fun ActivateCustomDrying(): InkSynchronizer?

  @InterfaceMethod(12)
  public fun SetPredefinedConfiguration(value: InkPresenterPredefinedConfiguration?): Unit

  @InterfaceMethod(13)
  public fun add_StrokesCollected(handler: TypedEventHandler<InkPresenter?,
      InkStrokesCollectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_StrokesCollected(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_StrokesErased(handler: TypedEventHandler<InkPresenter?,
      InkStrokesErasedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_StrokesErased(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkPresenter>
      {
    public override fun getValue() = ABI.makeIInkPresenter(pointer.getPointer(0))

    public fun setValue(value: IInkPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPresenter {
    public val __592762884_Ptr: Pointer?

    public val _592762884_VtblPtr: Pointer?
      get() = __592762884_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsInputEnabled(): Boolean {
      val fnPtr = _592762884_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsInputEnabled(value: Boolean): Unit {
      val fnPtr = _592762884_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_InputDeviceTypes(): CoreInputDeviceTypes? {
      val fnPtr = _592762884_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreInputDeviceTypes>()
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreInputDeviceTypes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_InputDeviceTypes(value: CoreInputDeviceTypes?): Unit {
      val fnPtr = _592762884_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_UnprocessedInput(): InkUnprocessedInput? {
      val fnPtr = _592762884_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkUnprocessedInput>()
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkUnprocessedInput>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_StrokeInput(): InkStrokeInput? {
      val fnPtr = _592762884_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkStrokeInput>()
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkStrokeInput>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_InputProcessingConfiguration(): InkInputProcessingConfiguration? {
      val fnPtr = _592762884_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkInputProcessingConfiguration>()
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkInputProcessingConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_StrokeContainer(): InkStrokeContainer? {
      val fnPtr = _592762884_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkStrokeContainer>()
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkStrokeContainer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_StrokeContainer(value: InkStrokeContainer?): Unit {
      val fnPtr = _592762884_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun CopyDefaultDrawingAttributes(): InkDrawingAttributes? {
      val fnPtr = _592762884_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkDrawingAttributes>()
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkDrawingAttributes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun UpdateDefaultDrawingAttributes(value: InkDrawingAttributes?): Unit {
      val fnPtr = _592762884_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun ActivateCustomDrying(): InkSynchronizer? {
      val fnPtr = _592762884_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkSynchronizer>()
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkSynchronizer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun SetPredefinedConfiguration(value: InkPresenterPredefinedConfiguration?):
        Unit {
      val fnPtr = _592762884_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_StrokesCollected(handler: TypedEventHandler<InkPresenter?,
        InkStrokesCollectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _592762884_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_StrokesCollected(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _592762884_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_StrokesErased(handler: TypedEventHandler<InkPresenter?,
        InkStrokesErasedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _592762884_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_StrokesErased(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _592762884_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__592762884_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __592762884_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a69b70e2887b458fb1734fe4438930a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPresenter(ptr: Pointer?): WithDefault = IInkPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPresenter {
      val address = segment.toRawLongValue()
      return makeIInkPresenter(Pointer(address))
    }

    public override fun toNative(obj: IInkPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__592762884_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPresenter): Array<IInkPresenter?> = (elements as
        Array<IInkPresenter?>).castToImpl<IInkPresenter,IInkPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPresenter?> =
        arrayOfNulls<IInkPresenter_Impl>(size) as Array<IInkPresenter?>
  }
}
