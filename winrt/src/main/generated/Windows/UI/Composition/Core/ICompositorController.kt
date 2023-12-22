package Windows.UI.Composition.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.TypedEventHandler
import Windows.UI.Composition.Compositor
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

@ABIMarker(ICompositorController.ABI::class)
@Signature("{2d75f35a-70a7-4395-ba2d-cef0b18399f9}")
@Guid("2d75f35a70a74395ba2dcef0b18399f9")
@WinRTInterface("2d75f35a70a74395ba2dcef0b18399f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositorController.ByReference::class)
public interface ICompositorController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Compositor(): Compositor?

  @InterfaceMethod(1)
  public fun Commit(): Unit

  @InterfaceMethod(2)
  public fun EnsurePreviousCommitCompletedAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun add_CommitNeeded(handler: TypedEventHandler<CompositorController?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_CommitNeeded(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositorController> {
    public override fun getValue() = ABI.makeICompositorController(pointer.getPointer(0))

    public fun setValue(value: ICompositorController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositorController {
    public val __664775180_Ptr: Pointer?

    public val _664775180_VtblPtr: Pointer?
      get() = __664775180_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Compositor(): Compositor? {
      val fnPtr = _664775180_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Compositor>()
      val hr = fn.invokeHR(arrayOf(__664775180_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Compositor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Commit(): Unit {
      val fnPtr = _664775180_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__664775180_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun EnsurePreviousCommitCompletedAsync(): IAsyncAction? {
      val fnPtr = _664775180_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__664775180_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_CommitNeeded(handler: TypedEventHandler<CompositorController?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _664775180_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__664775180_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_CommitNeeded(token: EventRegistrationToken?): Unit {
      val fnPtr = _664775180_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__664775180_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositorController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __664775180_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositorController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d75f35a70a74395ba2dcef0b18399f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositorController(ptr: Pointer?): WithDefault =
        ICompositorController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositorController {
      val address = segment.toRawLongValue()
      return makeICompositorController(Pointer(address))
    }

    public override fun toNative(obj: ICompositorController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__664775180_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositorController): Array<ICompositorController?> =
        (elements as
        Array<ICompositorController?>).castToImpl<ICompositorController,ICompositorController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositorController?> =
        arrayOfNulls<ICompositorController_Impl>(size) as Array<ICompositorController?>
  }
}
