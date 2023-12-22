package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Input.InputPointerSource
import Microsoft.UI.Input.InputPointerSourceDeviceKinds
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISwapChainPanel.ABI::class)
@Signature("{08844f85-aa1b-540d-bef2-b2bb7b257f8c}")
@Guid("08844f85aa1b540dbef2b2bb7b257f8c")
@WinRTInterface("08844f85aa1b540dbef2b2bb7b257f8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwapChainPanel.ByReference::class)
public interface ISwapChainPanel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CompositionScaleX(): Float

  @InterfaceMethod(1)
  public fun get_CompositionScaleY(): Float

  @InterfaceMethod(2)
  public fun add_CompositionScaleChanged(handler: TypedEventHandler<SwapChainPanel?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_CompositionScaleChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun CreateCoreIndependentInputSource(deviceKinds: InputPointerSourceDeviceKinds?):
      InputPointerSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwapChainPanel> {
    public override fun getValue() = ABI.makeISwapChainPanel(pointer.getPointer(0))

    public fun setValue(value: ISwapChainPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwapChainPanel {
    public val __983845693_Ptr: Pointer?

    public val _983845693_VtblPtr: Pointer?
      get() = __983845693_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CompositionScaleX(): Float {
      val fnPtr = _983845693_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__983845693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CompositionScaleY(): Float {
      val fnPtr = _983845693_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__983845693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_CompositionScaleChanged(handler: TypedEventHandler<SwapChainPanel?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _983845693_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__983845693_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_CompositionScaleChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _983845693_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__983845693_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun CreateCoreIndependentInputSource(deviceKinds: InputPointerSourceDeviceKinds?):
        InputPointerSource? {
      val fnPtr = _983845693_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputPointerSource>()
      val hr = fn.invokeHR(arrayOf(__983845693_Ptr, marshalToNative(deviceKinds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputPointerSource>(result.getValue())
      return resultValue
    }
  }

  public class ISwapChainPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __983845693_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwapChainPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08844f85aa1b540dbef2b2bb7b257f8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwapChainPanel(ptr: Pointer?): WithDefault = ISwapChainPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwapChainPanel {
      val address = segment.toRawLongValue()
      return makeISwapChainPanel(Pointer(address))
    }

    public override fun toNative(obj: ISwapChainPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__983845693_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwapChainPanel): Array<ISwapChainPanel?> = (elements as
        Array<ISwapChainPanel?>).castToImpl<ISwapChainPanel,ISwapChainPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwapChainPanel?> =
        arrayOfNulls<ISwapChainPanel_Impl>(size) as Array<ISwapChainPanel?>
  }
}
