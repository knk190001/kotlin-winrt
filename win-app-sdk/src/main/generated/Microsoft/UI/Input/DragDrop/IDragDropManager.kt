package Microsoft.UI.Input.DragDrop

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

@ABIMarker(IDragDropManager.ABI::class)
@Signature("{4fea9efc-b073-5fbe-9c95-a4113ef6393f}")
@Guid("4fea9efcb0735fbe9c95a4113ef6393f")
@WinRTInterface("4fea9efcb0735fbe9c95a4113ef6393f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragDropManager.ByReference::class)
public interface IDragDropManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreConcurrentOperationsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_AreConcurrentOperationsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun add_TargetRequested(handler: TypedEventHandler<DragDropManager?,
      DropOperationTargetRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_TargetRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragDropManager> {
    public override fun getValue() = ABI.makeIDragDropManager(pointer.getPointer(0))

    public fun setValue(value: IDragDropManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragDropManager {
    public val __2027805698_Ptr: Pointer?

    public val _2027805698_VtblPtr: Pointer?
      get() = __2027805698_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreConcurrentOperationsEnabled(): Boolean {
      val fnPtr = _2027805698_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2027805698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AreConcurrentOperationsEnabled(value: Boolean): Unit {
      val fnPtr = _2027805698_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2027805698_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_TargetRequested(handler: TypedEventHandler<DragDropManager?,
        DropOperationTargetRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2027805698_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2027805698_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_TargetRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2027805698_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2027805698_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDragDropManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2027805698_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragDropManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4fea9efcb0735fbe9c95a4113ef6393f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragDropManager(ptr: Pointer?): WithDefault = IDragDropManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragDropManager {
      val address = segment.toRawLongValue()
      return makeIDragDropManager(Pointer(address))
    }

    public override fun toNative(obj: IDragDropManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2027805698_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragDropManager): Array<IDragDropManager?> = (elements as
        Array<IDragDropManager?>).castToImpl<IDragDropManager,IDragDropManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragDropManager?> =
        arrayOfNulls<IDragDropManager_Impl>(size) as Array<IDragDropManager?>
  }
}
