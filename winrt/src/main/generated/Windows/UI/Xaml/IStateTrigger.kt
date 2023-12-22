package Windows.UI.Xaml

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

@ABIMarker(IStateTrigger.ABI::class)
@Signature("{67adef2e-d8d9-49f7-a1fd-2e35eedd23cd}")
@Guid("67adef2ed8d949f7a1fd2e35eedd23cd")
@WinRTInterface("67adef2ed8d949f7a1fd2e35eedd23cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStateTrigger.ByReference::class)
public interface IStateTrigger : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(1)
  public fun put_IsActive(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStateTrigger>
      {
    public override fun getValue() = ABI.makeIStateTrigger(pointer.getPointer(0))

    public fun setValue(value: IStateTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStateTrigger {
    public val __1303253191_Ptr: Pointer?

    public val _1303253191_VtblPtr: Pointer?
      get() = __1303253191_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _1303253191_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1303253191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsActive(value: Boolean): Unit {
      val fnPtr = _1303253191_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1303253191_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStateTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1303253191_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStateTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67adef2ed8d949f7a1fd2e35eedd23cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStateTrigger(ptr: Pointer?): WithDefault = IStateTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStateTrigger {
      val address = segment.toRawLongValue()
      return makeIStateTrigger(Pointer(address))
    }

    public override fun toNative(obj: IStateTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1303253191_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStateTrigger): Array<IStateTrigger?> = (elements as
        Array<IStateTrigger?>).castToImpl<IStateTrigger,IStateTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStateTrigger?> =
        arrayOfNulls<IStateTrigger_Impl>(size) as Array<IStateTrigger?>
  }
}
