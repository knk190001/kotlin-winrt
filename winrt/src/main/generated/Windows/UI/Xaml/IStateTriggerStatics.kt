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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStateTriggerStatics.ABI::class)
@Signature("{71e95c90-b3fe-4dd3-a8a8-44a2ce25e0b8}")
@Guid("71e95c90b3fe4dd3a8a844a2ce25e0b8")
@WinRTInterface("71e95c90b3fe4dd3a8a844a2ce25e0b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStateTriggerStatics.ByReference::class)
public interface IStateTriggerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsActiveProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStateTriggerStatics> {
    public override fun getValue() = ABI.makeIStateTriggerStatics(pointer.getPointer(0))

    public fun setValue(value: IStateTriggerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStateTriggerStatics {
    public val __1933916596_Ptr: Pointer?

    public val _1933916596_VtblPtr: Pointer?
      get() = __1933916596_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsActiveProperty(): DependencyProperty? {
      val fnPtr = _1933916596_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1933916596_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IStateTriggerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1933916596_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStateTriggerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71e95c90b3fe4dd3a8a844a2ce25e0b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStateTriggerStatics(ptr: Pointer?): WithDefault = IStateTriggerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStateTriggerStatics {
      val address = segment.toRawLongValue()
      return makeIStateTriggerStatics(Pointer(address))
    }

    public override fun toNative(obj: IStateTriggerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1933916596_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStateTriggerStatics): Array<IStateTriggerStatics?> =
        (elements as
        Array<IStateTriggerStatics?>).castToImpl<IStateTriggerStatics,IStateTriggerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStateTriggerStatics?> =
        arrayOfNulls<IStateTriggerStatics_Impl>(size) as Array<IStateTriggerStatics?>
  }
}
