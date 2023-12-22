package Windows.Devices.Sms

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

@ABIMarker(ISmsFilterRulesFactory.ABI::class)
@Signature("{a09924ed-6e2e-4530-9fde-465d02eed00e}")
@Guid("a09924ed6e2e45309fde465d02eed00e")
@WinRTInterface("a09924ed6e2e45309fde465d02eed00e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsFilterRulesFactory.ByReference::class)
public interface ISmsFilterRulesFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFilterRules(actionType: SmsFilterActionType?): SmsFilterRules?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsFilterRulesFactory> {
    public override fun getValue() = ABI.makeISmsFilterRulesFactory(pointer.getPointer(0))

    public fun setValue(value: ISmsFilterRulesFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsFilterRulesFactory {
    public val __1564177960_Ptr: Pointer?

    public val _1564177960_VtblPtr: Pointer?
      get() = __1564177960_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFilterRules(actionType: SmsFilterActionType?): SmsFilterRules? {
      val fnPtr = _1564177960_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsFilterRules>()
      val hr = fn.invokeHR(arrayOf(__1564177960_Ptr, marshalToNative(actionType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsFilterRules>(result.getValue())
      return resultValue
    }
  }

  public class ISmsFilterRulesFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1564177960_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsFilterRulesFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a09924ed6e2e45309fde465d02eed00e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsFilterRulesFactory(ptr: Pointer?): WithDefault =
        ISmsFilterRulesFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsFilterRulesFactory {
      val address = segment.toRawLongValue()
      return makeISmsFilterRulesFactory(Pointer(address))
    }

    public override fun toNative(obj: ISmsFilterRulesFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1564177960_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsFilterRulesFactory): Array<ISmsFilterRulesFactory?> =
        (elements as
        Array<ISmsFilterRulesFactory?>).castToImpl<ISmsFilterRulesFactory,ISmsFilterRulesFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsFilterRulesFactory?> =
        arrayOfNulls<ISmsFilterRulesFactory_Impl>(size) as Array<ISmsFilterRulesFactory?>
  }
}
