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

@ABIMarker(ISmsFilterRuleFactory.ABI::class)
@Signature("{00c36508-6296-4f29-9aad-8920ceba3ce8}")
@Guid("00c3650862964f299aad8920ceba3ce8")
@WinRTInterface("00c3650862964f299aad8920ceba3ce8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsFilterRuleFactory.ByReference::class)
public interface ISmsFilterRuleFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFilterRule(messageType: SmsMessageType?): SmsFilterRule?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsFilterRuleFactory> {
    public override fun getValue() = ABI.makeISmsFilterRuleFactory(pointer.getPointer(0))

    public fun setValue(value: ISmsFilterRuleFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsFilterRuleFactory {
    public val __2074317833_Ptr: Pointer?

    public val _2074317833_VtblPtr: Pointer?
      get() = __2074317833_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFilterRule(messageType: SmsMessageType?): SmsFilterRule? {
      val fnPtr = _2074317833_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsFilterRule>()
      val hr = fn.invokeHR(arrayOf(__2074317833_Ptr, marshalToNative(messageType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsFilterRule>(result.getValue())
      return resultValue
    }
  }

  public class ISmsFilterRuleFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2074317833_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsFilterRuleFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00c3650862964f299aad8920ceba3ce8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsFilterRuleFactory(ptr: Pointer?): WithDefault =
        ISmsFilterRuleFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsFilterRuleFactory {
      val address = segment.toRawLongValue()
      return makeISmsFilterRuleFactory(Pointer(address))
    }

    public override fun toNative(obj: ISmsFilterRuleFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2074317833_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsFilterRuleFactory): Array<ISmsFilterRuleFactory?> =
        (elements as
        Array<ISmsFilterRuleFactory?>).castToImpl<ISmsFilterRuleFactory,ISmsFilterRuleFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsFilterRuleFactory?> =
        arrayOfNulls<ISmsFilterRuleFactory_Impl>(size) as Array<ISmsFilterRuleFactory?>
  }
}
