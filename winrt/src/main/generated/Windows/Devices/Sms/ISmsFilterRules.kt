package Windows.Devices.Sms

import Windows.Foundation.Collections.IVector
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

@ABIMarker(ISmsFilterRules.ABI::class)
@Signature("{4e47eafb-79cd-4881-9894-55a4135b23fa}")
@Guid("4e47eafb79cd4881989455a4135b23fa")
@WinRTInterface("4e47eafb79cd4881989455a4135b23fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsFilterRules.ByReference::class)
public interface ISmsFilterRules : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActionType(): SmsFilterActionType?

  @InterfaceMethod(1)
  public fun get_Rules(): IVector<SmsFilterRule?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsFilterRules> {
    public override fun getValue() = ABI.makeISmsFilterRules(pointer.getPointer(0))

    public fun setValue(value: ISmsFilterRules_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsFilterRules {
    public val __1149088046_Ptr: Pointer?

    public val _1149088046_VtblPtr: Pointer?
      get() = __1149088046_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActionType(): SmsFilterActionType? {
      val fnPtr = _1149088046_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsFilterActionType>()
      val hr = fn.invokeHR(arrayOf(__1149088046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsFilterActionType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Rules(): IVector<SmsFilterRule?>? {
      val fnPtr = _1149088046_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SmsFilterRule?>>()
      val hr = fn.invokeHR(arrayOf(__1149088046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SmsFilterRule?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmsFilterRules_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1149088046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsFilterRules, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e47eafb79cd4881989455a4135b23fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsFilterRules(ptr: Pointer?): WithDefault = ISmsFilterRules_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsFilterRules {
      val address = segment.toRawLongValue()
      return makeISmsFilterRules(Pointer(address))
    }

    public override fun toNative(obj: ISmsFilterRules): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1149088046_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsFilterRules): Array<ISmsFilterRules?> = (elements as
        Array<ISmsFilterRules?>).castToImpl<ISmsFilterRules,ISmsFilterRules_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsFilterRules?> =
        arrayOfNulls<ISmsFilterRules_Impl>(size) as Array<ISmsFilterRules?>
  }
}
