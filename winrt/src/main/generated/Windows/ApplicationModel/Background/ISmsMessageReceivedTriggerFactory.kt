package Windows.ApplicationModel.Background

import Windows.Devices.Sms.SmsFilterRules
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

@ABIMarker(ISmsMessageReceivedTriggerFactory.ABI::class)
@Signature("{ea3ad8c8-6ba4-4ab2-8d21-bc6b09c77564}")
@Guid("ea3ad8c86ba44ab28d21bc6b09c77564")
@WinRTInterface("ea3ad8c86ba44ab28d21bc6b09c77564")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsMessageReceivedTriggerFactory.ByReference::class)
public interface ISmsMessageReceivedTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(filterRules: SmsFilterRules?): SmsMessageReceivedTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsMessageReceivedTriggerFactory> {
    public override fun getValue() =
        ABI.makeISmsMessageReceivedTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: ISmsMessageReceivedTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsMessageReceivedTriggerFactory {
    public val __742623346_Ptr: Pointer?

    public val _742623346_VtblPtr: Pointer?
      get() = __742623346_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(filterRules: SmsFilterRules?): SmsMessageReceivedTrigger? {
      val fnPtr = _742623346_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsMessageReceivedTrigger>()
      val hr = fn.invokeHR(arrayOf(__742623346_Ptr, marshalToNative(filterRules), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsMessageReceivedTrigger>(result.getValue())
      return resultValue
    }
  }

  public class ISmsMessageReceivedTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __742623346_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsMessageReceivedTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea3ad8c86ba44ab28d21bc6b09c77564")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsMessageReceivedTriggerFactory(ptr: Pointer?): WithDefault =
        ISmsMessageReceivedTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsMessageReceivedTriggerFactory {
      val address = segment.toRawLongValue()
      return makeISmsMessageReceivedTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISmsMessageReceivedTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__742623346_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsMessageReceivedTriggerFactory):
        Array<ISmsMessageReceivedTriggerFactory?> = (elements as
        Array<ISmsMessageReceivedTriggerFactory?>).castToImpl<ISmsMessageReceivedTriggerFactory,ISmsMessageReceivedTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsMessageReceivedTriggerFactory?> =
        arrayOfNulls<ISmsMessageReceivedTriggerFactory_Impl>(size) as
        Array<ISmsMessageReceivedTriggerFactory?>
  }
}
