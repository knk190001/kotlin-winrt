package Microsoft.Windows.AppNotifications

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

@ABIMarker(IAppNotificationFactory.ABI::class)
@Signature("{9ffee485-184a-5c65-87a9-c1d94469dbe7}")
@Guid("9ffee485184a5c6587a9c1d94469dbe7")
@WinRTInterface("9ffee485184a5c6587a9c1d94469dbe7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationFactory.ByReference::class)
public interface IAppNotificationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(payload: String?): AppNotification?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationFactory> {
    public override fun getValue() = ABI.makeIAppNotificationFactory(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationFactory {
    public val __1738483573_Ptr: Pointer?

    public val _1738483573_VtblPtr: Pointer?
      get() = __1738483573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(payload: String?): AppNotification? {
      val fnPtr = _1738483573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotification>()
      val hr = fn.invokeHR(arrayOf(__1738483573_Ptr, marshalToNative(payload), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotification>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1738483573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ffee485184a5c6587a9c1d94469dbe7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationFactory(ptr: Pointer?): WithDefault =
        IAppNotificationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationFactory {
      val address = segment.toRawLongValue()
      return makeIAppNotificationFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1738483573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationFactory): Array<IAppNotificationFactory?>
        = (elements as
        Array<IAppNotificationFactory?>).castToImpl<IAppNotificationFactory,IAppNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationFactory?> =
        arrayOfNulls<IAppNotificationFactory_Impl>(size) as Array<IAppNotificationFactory?>
  }
}
