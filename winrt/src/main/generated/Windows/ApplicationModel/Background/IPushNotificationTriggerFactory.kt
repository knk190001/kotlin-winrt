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

@ABIMarker(IPushNotificationTriggerFactory.ABI::class)
@Signature("{6dd8ed1b-458e-4fc2-bc2e-d5664f77ed19}")
@Guid("6dd8ed1b458e4fc2bc2ed5664f77ed19")
@WinRTInterface("6dd8ed1b458e4fc2bc2ed5664f77ed19")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationTriggerFactory.ByReference::class)
public interface IPushNotificationTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(applicationId: String?): PushNotificationTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationTriggerFactory> {
    public override fun getValue() = ABI.makeIPushNotificationTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationTriggerFactory {
    public val __28853528_Ptr: Pointer?

    public val _28853528_VtblPtr: Pointer?
      get() = __28853528_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(applicationId: String?): PushNotificationTrigger? {
      val fnPtr = _28853528_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PushNotificationTrigger>()
      val hr = fn.invokeHR(arrayOf(__28853528_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PushNotificationTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IPushNotificationTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __28853528_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6dd8ed1b458e4fc2bc2ed5664f77ed19")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationTriggerFactory(ptr: Pointer?): WithDefault =
        IPushNotificationTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPushNotificationTriggerFactory {
      val address = segment.toRawLongValue()
      return makeIPushNotificationTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__28853528_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationTriggerFactory):
        Array<IPushNotificationTriggerFactory?> = (elements as
        Array<IPushNotificationTriggerFactory?>).castToImpl<IPushNotificationTriggerFactory,IPushNotificationTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationTriggerFactory?> =
        arrayOfNulls<IPushNotificationTriggerFactory_Impl>(size) as
        Array<IPushNotificationTriggerFactory?>
  }
}
