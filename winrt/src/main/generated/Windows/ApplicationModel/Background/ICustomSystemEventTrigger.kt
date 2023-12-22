package Windows.ApplicationModel.Background

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICustomSystemEventTrigger.ABI::class)
@Signature("{f3596798-cf6b-4ef4-a0ca-29cf4a278c87}")
@Guid("f3596798cf6b4ef4a0ca29cf4a278c87")
@WinRTInterface("f3596798cf6b4ef4a0ca29cf4a278c87")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomSystemEventTrigger.ByReference::class)
public interface ICustomSystemEventTrigger : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TriggerId(): String?

  @InterfaceMethod(1)
  public fun get_Recurrence(): CustomSystemEventTriggerRecurrence?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomSystemEventTrigger> {
    public override fun getValue() = ABI.makeICustomSystemEventTrigger(pointer.getPointer(0))

    public fun setValue(value: ICustomSystemEventTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomSystemEventTrigger {
    public val __1886462415_Ptr: Pointer?

    public val _1886462415_VtblPtr: Pointer?
      get() = __1886462415_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TriggerId(): String? {
      val fnPtr = _1886462415_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1886462415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Recurrence(): CustomSystemEventTriggerRecurrence? {
      val fnPtr = _1886462415_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CustomSystemEventTriggerRecurrence>()
      val hr = fn.invokeHR(arrayOf(__1886462415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CustomSystemEventTriggerRecurrence>(result.getValue())
      return resultValue
    }
  }

  public class ICustomSystemEventTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1886462415_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomSystemEventTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3596798cf6b4ef4a0ca29cf4a278c87")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomSystemEventTrigger(ptr: Pointer?): WithDefault =
        ICustomSystemEventTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomSystemEventTrigger {
      val address = segment.toRawLongValue()
      return makeICustomSystemEventTrigger(Pointer(address))
    }

    public override fun toNative(obj: ICustomSystemEventTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1886462415_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomSystemEventTrigger):
        Array<ICustomSystemEventTrigger?> = (elements as
        Array<ICustomSystemEventTrigger?>).castToImpl<ICustomSystemEventTrigger,ICustomSystemEventTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomSystemEventTrigger?> =
        arrayOfNulls<ICustomSystemEventTrigger_Impl>(size) as Array<ICustomSystemEventTrigger?>
  }
}
