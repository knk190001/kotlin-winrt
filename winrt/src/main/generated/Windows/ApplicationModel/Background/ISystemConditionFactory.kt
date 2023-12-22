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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISystemConditionFactory.ABI::class)
@Signature("{d269d1f1-05a7-49ae-87d7-16b2b8b9a553}")
@Guid("d269d1f105a749ae87d716b2b8b9a553")
@WinRTInterface("d269d1f105a749ae87d716b2b8b9a553")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemConditionFactory.ByReference::class)
public interface ISystemConditionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(conditionType: SystemConditionType?): SystemCondition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemConditionFactory> {
    public override fun getValue() = ABI.makeISystemConditionFactory(pointer.getPointer(0))

    public fun setValue(value: ISystemConditionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemConditionFactory {
    public val __2001025775_Ptr: Pointer?

    public val _2001025775_VtblPtr: Pointer?
      get() = __2001025775_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(conditionType: SystemConditionType?): SystemCondition? {
      val fnPtr = _2001025775_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemCondition>()
      val hr = fn.invokeHR(arrayOf(__2001025775_Ptr, marshalToNative(conditionType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemCondition>(result.getValue())
      return resultValue
    }
  }

  public class ISystemConditionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2001025775_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemConditionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d269d1f105a749ae87d716b2b8b9a553")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemConditionFactory(ptr: Pointer?): WithDefault =
        ISystemConditionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemConditionFactory {
      val address = segment.toRawLongValue()
      return makeISystemConditionFactory(Pointer(address))
    }

    public override fun toNative(obj: ISystemConditionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2001025775_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemConditionFactory): Array<ISystemConditionFactory?>
        = (elements as
        Array<ISystemConditionFactory?>).castToImpl<ISystemConditionFactory,ISystemConditionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemConditionFactory?> =
        arrayOfNulls<ISystemConditionFactory_Impl>(size) as Array<ISystemConditionFactory?>
  }
}
