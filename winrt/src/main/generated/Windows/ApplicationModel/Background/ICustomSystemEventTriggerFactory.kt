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

@ABIMarker(ICustomSystemEventTriggerFactory.ABI::class)
@Signature("{6bcb16c5-f2dc-41b2-9efd-b96bdcd13ced}")
@Guid("6bcb16c5f2dc41b29efdb96bdcd13ced")
@WinRTInterface("6bcb16c5f2dc41b29efdb96bdcd13ced")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomSystemEventTriggerFactory.ByReference::class)
public interface ICustomSystemEventTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(triggerId: String?, recurrence: CustomSystemEventTriggerRecurrence?):
      CustomSystemEventTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomSystemEventTriggerFactory> {
    public override fun getValue() = ABI.makeICustomSystemEventTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: ICustomSystemEventTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomSystemEventTriggerFactory {
    public val __2039558085_Ptr: Pointer?

    public val _2039558085_VtblPtr: Pointer?
      get() = __2039558085_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(triggerId: String?, recurrence: CustomSystemEventTriggerRecurrence?):
        CustomSystemEventTrigger? {
      val fnPtr = _2039558085_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CustomSystemEventTrigger>()
      val hr = fn.invokeHR(arrayOf(__2039558085_Ptr, marshalToNative(triggerId),
          marshalToNative(recurrence), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CustomSystemEventTrigger>(result.getValue())
      return resultValue
    }
  }

  public class ICustomSystemEventTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2039558085_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomSystemEventTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6bcb16c5f2dc41b29efdb96bdcd13ced")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomSystemEventTriggerFactory(ptr: Pointer?): WithDefault =
        ICustomSystemEventTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomSystemEventTriggerFactory {
      val address = segment.toRawLongValue()
      return makeICustomSystemEventTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: ICustomSystemEventTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2039558085_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomSystemEventTriggerFactory):
        Array<ICustomSystemEventTriggerFactory?> = (elements as
        Array<ICustomSystemEventTriggerFactory?>).castToImpl<ICustomSystemEventTriggerFactory,ICustomSystemEventTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomSystemEventTriggerFactory?> =
        arrayOfNulls<ICustomSystemEventTriggerFactory_Impl>(size) as
        Array<ICustomSystemEventTriggerFactory?>
  }
}
