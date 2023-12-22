package Windows.ApplicationModel.DataTransfer.DragDrop.Core

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

@ABIMarker(ICoreDragDropManager.ABI::class)
@Signature("{7d56d344-8464-4faf-aa49-37ea6e2d7bd1}")
@Guid("7d56d34484644fafaa4937ea6e2d7bd1")
@WinRTInterface("7d56d34484644fafaa4937ea6e2d7bd1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreDragDropManager.ByReference::class)
public interface ICoreDragDropManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_TargetRequested(value: TypedEventHandler<CoreDragDropManager?,
      CoreDropOperationTargetRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_TargetRequested(value: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_AreConcurrentOperationsEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_AreConcurrentOperationsEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreDragDropManager> {
    public override fun getValue() = ABI.makeICoreDragDropManager(pointer.getPointer(0))

    public fun setValue(value: ICoreDragDropManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreDragDropManager {
    public val __1943047165_Ptr: Pointer?

    public val _1943047165_VtblPtr: Pointer?
      get() = __1943047165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_TargetRequested(value: TypedEventHandler<CoreDragDropManager?,
        CoreDropOperationTargetRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1943047165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1943047165_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_TargetRequested(value: EventRegistrationToken?): Unit {
      val fnPtr = _1943047165_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1943047165_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AreConcurrentOperationsEnabled(): Boolean {
      val fnPtr = _1943047165_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1943047165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_AreConcurrentOperationsEnabled(value: Boolean): Unit {
      val fnPtr = _1943047165_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1943047165_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreDragDropManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1943047165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreDragDropManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d56d34484644fafaa4937ea6e2d7bd1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreDragDropManager(ptr: Pointer?): WithDefault = ICoreDragDropManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreDragDropManager {
      val address = segment.toRawLongValue()
      return makeICoreDragDropManager(Pointer(address))
    }

    public override fun toNative(obj: ICoreDragDropManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1943047165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreDragDropManager): Array<ICoreDragDropManager?> =
        (elements as
        Array<ICoreDragDropManager?>).castToImpl<ICoreDragDropManager,ICoreDragDropManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreDragDropManager?> =
        arrayOfNulls<ICoreDragDropManager_Impl>(size) as Array<ICoreDragDropManager?>
  }
}
