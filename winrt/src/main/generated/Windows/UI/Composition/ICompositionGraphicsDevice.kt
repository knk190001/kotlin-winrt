package Windows.UI.Composition

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Size
import Windows.Foundation.TypedEventHandler
import Windows.Graphics.DirectX.DirectXAlphaMode
import Windows.Graphics.DirectX.DirectXPixelFormat
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionGraphicsDevice.ABI::class)
@Signature("{fb22c6e1-80a2-4667-9936-dbeaf6eefe95}")
@Guid("fb22c6e180a246679936dbeaf6eefe95")
@WinRTInterface("fb22c6e180a246679936dbeaf6eefe95")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionGraphicsDevice.ByReference::class)
public interface ICompositionGraphicsDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateDrawingSurface(
    sizePixels: Size?,
    pixelFormat: DirectXPixelFormat?,
    alphaMode: DirectXAlphaMode?
  ): CompositionDrawingSurface?

  @InterfaceMethod(1)
  public fun add_RenderingDeviceReplaced(handler: TypedEventHandler<CompositionGraphicsDevice?,
      RenderingDeviceReplacedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_RenderingDeviceReplaced(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionGraphicsDevice> {
    public override fun getValue() = ABI.makeICompositionGraphicsDevice(pointer.getPointer(0))

    public fun setValue(value: ICompositionGraphicsDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionGraphicsDevice {
    public val __1398964963_Ptr: Pointer?

    public val _1398964963_VtblPtr: Pointer?
      get() = __1398964963_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateDrawingSurface(
      sizePixels: Size?,
      pixelFormat: DirectXPixelFormat?,
      alphaMode: DirectXAlphaMode?
    ): CompositionDrawingSurface? {
      val fnPtr = _1398964963_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionDrawingSurface>()
      val hr = fn.invokeHR(arrayOf(__1398964963_Ptr, marshalToNative(sizePixels),
          marshalToNative(pixelFormat), marshalToNative(alphaMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionDrawingSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun add_RenderingDeviceReplaced(handler: TypedEventHandler<CompositionGraphicsDevice?,
        RenderingDeviceReplacedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1398964963_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1398964963_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_RenderingDeviceReplaced(token: EventRegistrationToken?): Unit {
      val fnPtr = _1398964963_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1398964963_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionGraphicsDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1398964963_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionGraphicsDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb22c6e180a246679936dbeaf6eefe95")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionGraphicsDevice(ptr: Pointer?): WithDefault =
        ICompositionGraphicsDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionGraphicsDevice {
      val address = segment.toRawLongValue()
      return makeICompositionGraphicsDevice(Pointer(address))
    }

    public override fun toNative(obj: ICompositionGraphicsDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1398964963_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionGraphicsDevice):
        Array<ICompositionGraphicsDevice?> = (elements as
        Array<ICompositionGraphicsDevice?>).castToImpl<ICompositionGraphicsDevice,ICompositionGraphicsDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionGraphicsDevice?> =
        arrayOfNulls<ICompositionGraphicsDevice_Impl>(size) as Array<ICompositionGraphicsDevice?>
  }
}
