package Windows.System

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDispatcherQueueController.ABI::class)
@Signature("{22f34e66-50db-4e36-a98d-61c01b384d20}")
@Guid("22f34e6650db4e36a98d61c01b384d20")
@WinRTInterface("22f34e6650db4e36a98d61c01b384d20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDispatcherQueueController.ByReference::class)
public interface IDispatcherQueueController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DispatcherQueue(): DispatcherQueue?

  @InterfaceMethod(1)
  public fun ShutdownQueueAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDispatcherQueueController> {
    public override fun getValue() = ABI.makeIDispatcherQueueController(pointer.getPointer(0))

    public fun setValue(value: IDispatcherQueueController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDispatcherQueueController {
    public val __2086939305_Ptr: Pointer?

    public val _2086939305_VtblPtr: Pointer?
      get() = __2086939305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _2086939305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__2086939305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShutdownQueueAsync(): IAsyncAction? {
      val fnPtr = _2086939305_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2086939305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IDispatcherQueueController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2086939305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDispatcherQueueController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22f34e6650db4e36a98d61c01b384d20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDispatcherQueueController(ptr: Pointer?): WithDefault =
        IDispatcherQueueController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDispatcherQueueController {
      val address = segment.toRawLongValue()
      return makeIDispatcherQueueController(Pointer(address))
    }

    public override fun toNative(obj: IDispatcherQueueController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2086939305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDispatcherQueueController):
        Array<IDispatcherQueueController?> = (elements as
        Array<IDispatcherQueueController?>).castToImpl<IDispatcherQueueController,IDispatcherQueueController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDispatcherQueueController?> =
        arrayOfNulls<IDispatcherQueueController_Impl>(size) as Array<IDispatcherQueueController?>
  }
}
