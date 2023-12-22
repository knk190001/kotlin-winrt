package Windows.Services.TargetedContent

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ITargetedContentSubscriptionStatics.ABI::class)
@Signature("{faddfe80-360d-4916-b53c-7ea27090d02a}")
@Guid("faddfe80360d4916b53c7ea27090d02a")
@WinRTInterface("faddfe80360d4916b53c7ea27090d02a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentSubscriptionStatics.ByReference::class)
public interface ITargetedContentSubscriptionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsync(subscriptionId: String?): IAsyncOperation<TargetedContentSubscription?>?

  @InterfaceMethod(1)
  public fun GetOptions(subscriptionId: String?): TargetedContentSubscriptionOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentSubscriptionStatics> {
    public override fun getValue() =
        ABI.makeITargetedContentSubscriptionStatics(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentSubscriptionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentSubscriptionStatics {
    public val __1613292644_Ptr: Pointer?

    public val _1613292644_VtblPtr: Pointer?
      get() = __1613292644_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsync(subscriptionId: String?):
        IAsyncOperation<TargetedContentSubscription?>? {
      val fnPtr = _1613292644_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<TargetedContentSubscription?>>()
      val hr = fn.invokeHR(arrayOf(__1613292644_Ptr, marshalToNative(subscriptionId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<TargetedContentSubscription?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetOptions(subscriptionId: String?): TargetedContentSubscriptionOptions? {
      val fnPtr = _1613292644_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentSubscriptionOptions>()
      val hr = fn.invokeHR(arrayOf(__1613292644_Ptr, marshalToNative(subscriptionId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentSubscriptionOptions>(result.getValue())
      return resultValue
    }
  }

  public class ITargetedContentSubscriptionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1613292644_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentSubscriptionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("faddfe80360d4916b53c7ea27090d02a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentSubscriptionStatics(ptr: Pointer?): WithDefault =
        ITargetedContentSubscriptionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentSubscriptionStatics {
      val address = segment.toRawLongValue()
      return makeITargetedContentSubscriptionStatics(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentSubscriptionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1613292644_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentSubscriptionStatics):
        Array<ITargetedContentSubscriptionStatics?> = (elements as
        Array<ITargetedContentSubscriptionStatics?>).castToImpl<ITargetedContentSubscriptionStatics,ITargetedContentSubscriptionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentSubscriptionStatics?> =
        arrayOfNulls<ITargetedContentSubscriptionStatics_Impl>(size) as
        Array<ITargetedContentSubscriptionStatics?>
  }
}
