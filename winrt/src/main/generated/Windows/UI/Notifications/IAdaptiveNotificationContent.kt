package Windows.UI.Notifications

import Windows.Foundation.Collections.IMap
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

@ABIMarker(IAdaptiveNotificationContent.ABI::class)
@Signature("{eb0dbe66-7448-448d-9db8-d78acd2abba9}")
@Guid("eb0dbe667448448d9db8d78acd2abba9")
@WinRTInterface("eb0dbe667448448d9db8d78acd2abba9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveNotificationContent.ByReference::class)
public interface IAdaptiveNotificationContent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): AdaptiveNotificationContentKind?

  @InterfaceMethod(1)
  public fun get_Hints(): IMap<String?, String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveNotificationContent> {
    public override fun getValue() = ABI.makeIAdaptiveNotificationContent(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveNotificationContent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveNotificationContent {
    public val __73964616_Ptr: Pointer?

    public val _73964616_VtblPtr: Pointer?
      get() = __73964616_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): AdaptiveNotificationContentKind? {
      val fnPtr = _73964616_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveNotificationContentKind>()
      val hr = fn.invokeHR(arrayOf(__73964616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveNotificationContentKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Hints(): IMap<String?, String?>? {
      val fnPtr = _73964616_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__73964616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveNotificationContent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __73964616_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveNotificationContent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb0dbe667448448d9db8d78acd2abba9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveNotificationContent(ptr: Pointer?): WithDefault =
        IAdaptiveNotificationContent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveNotificationContent {
      val address = segment.toRawLongValue()
      return makeIAdaptiveNotificationContent(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveNotificationContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__73964616_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveNotificationContent):
        Array<IAdaptiveNotificationContent?> = (elements as
        Array<IAdaptiveNotificationContent?>).castToImpl<IAdaptiveNotificationContent,IAdaptiveNotificationContent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveNotificationContent?> =
        arrayOfNulls<IAdaptiveNotificationContent_Impl>(size) as
        Array<IAdaptiveNotificationContent?>
  }
}
