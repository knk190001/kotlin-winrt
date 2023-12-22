package Microsoft.UI.Xaml.Media

import Microsoft.UI.Composition.Compositor
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionTargetStatics.ABI::class)
@Signature("{12a4be6f-6db1-5165-b622-d57ab782745b}")
@Guid("12a4be6f6db15165b622d57ab782745b")
@WinRTInterface("12a4be6f6db15165b622d57ab782745b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionTargetStatics.ByReference::class)
public interface ICompositionTargetStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Rendering(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Rendering(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Rendered(handler: EventHandler<RenderedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Rendered(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_SurfaceContentsLost(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SurfaceContentsLost(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun GetCompositorForCurrentThread(): Compositor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionTargetStatics> {
    public override fun getValue() = ABI.makeICompositionTargetStatics(pointer.getPointer(0))

    public fun setValue(value: ICompositionTargetStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionTargetStatics {
    public val __883502949_Ptr: Pointer?

    public val _883502949_VtblPtr: Pointer?
      get() = __883502949_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Rendering(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _883502949_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__883502949_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Rendering(token: EventRegistrationToken?): Unit {
      val fnPtr = _883502949_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__883502949_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Rendered(handler: EventHandler<RenderedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _883502949_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__883502949_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Rendered(token: EventRegistrationToken?): Unit {
      val fnPtr = _883502949_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__883502949_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_SurfaceContentsLost(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _883502949_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__883502949_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SurfaceContentsLost(token: EventRegistrationToken?): Unit {
      val fnPtr = _883502949_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__883502949_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun GetCompositorForCurrentThread(): Compositor? {
      val fnPtr = _883502949_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Compositor>()
      val hr = fn.invokeHR(arrayOf(__883502949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Compositor>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionTargetStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __883502949_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionTargetStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12a4be6f6db15165b622d57ab782745b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionTargetStatics(ptr: Pointer?): WithDefault =
        ICompositionTargetStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionTargetStatics {
      val address = segment.toRawLongValue()
      return makeICompositionTargetStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompositionTargetStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__883502949_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionTargetStatics):
        Array<ICompositionTargetStatics?> = (elements as
        Array<ICompositionTargetStatics?>).castToImpl<ICompositionTargetStatics,ICompositionTargetStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionTargetStatics?> =
        arrayOfNulls<ICompositionTargetStatics_Impl>(size) as Array<ICompositionTargetStatics?>
  }
}
