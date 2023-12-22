package Microsoft.Windows.AppNotifications.Builder

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

@ABIMarker(IAppNotificationButtonFactory.ABI::class)
@Signature("{4f109286-0a6d-5a5e-9e8f-9fe31669fbb8}")
@Guid("4f1092860a6d5a5e9e8f9fe31669fbb8")
@WinRTInterface("4f1092860a6d5a5e9e8f9fe31669fbb8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationButtonFactory.ByReference::class)
public interface IAppNotificationButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(content: String?): AppNotificationButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationButtonFactory> {
    public override fun getValue() = ABI.makeIAppNotificationButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationButtonFactory {
    public val __2122931914_Ptr: Pointer?

    public val _2122931914_VtblPtr: Pointer?
      get() = __2122931914_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(content: String?): AppNotificationButton? {
      val fnPtr = _2122931914_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationButton>()
      val hr = fn.invokeHR(arrayOf(__2122931914_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationButton>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2122931914_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f1092860a6d5a5e9e8f9fe31669fbb8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationButtonFactory(ptr: Pointer?): WithDefault =
        IAppNotificationButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationButtonFactory {
      val address = segment.toRawLongValue()
      return makeIAppNotificationButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2122931914_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationButtonFactory):
        Array<IAppNotificationButtonFactory?> = (elements as
        Array<IAppNotificationButtonFactory?>).castToImpl<IAppNotificationButtonFactory,IAppNotificationButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationButtonFactory?> =
        arrayOfNulls<IAppNotificationButtonFactory_Impl>(size) as
        Array<IAppNotificationButtonFactory?>
  }
}
