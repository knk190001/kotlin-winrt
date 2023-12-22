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

@ABIMarker(IAppNotificationComboBoxFactory.ABI::class)
@Signature("{1b31b5b0-9d86-59ed-8629-a79498ab5d4b}")
@Guid("1b31b5b09d8659ed8629a79498ab5d4b")
@WinRTInterface("1b31b5b09d8659ed8629a79498ab5d4b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationComboBoxFactory.ByReference::class)
public interface IAppNotificationComboBoxFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(id: String?): AppNotificationComboBox?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationComboBoxFactory> {
    public override fun getValue() = ABI.makeIAppNotificationComboBoxFactory(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationComboBoxFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationComboBoxFactory {
    public val __179218133_Ptr: Pointer?

    public val _179218133_VtblPtr: Pointer?
      get() = __179218133_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(id: String?): AppNotificationComboBox? {
      val fnPtr = _179218133_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationComboBox>()
      val hr = fn.invokeHR(arrayOf(__179218133_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationComboBox>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationComboBoxFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __179218133_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationComboBoxFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b31b5b09d8659ed8629a79498ab5d4b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationComboBoxFactory(ptr: Pointer?): WithDefault =
        IAppNotificationComboBoxFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationComboBoxFactory {
      val address = segment.toRawLongValue()
      return makeIAppNotificationComboBoxFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationComboBoxFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__179218133_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationComboBoxFactory):
        Array<IAppNotificationComboBoxFactory?> = (elements as
        Array<IAppNotificationComboBoxFactory?>).castToImpl<IAppNotificationComboBoxFactory,IAppNotificationComboBoxFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationComboBoxFactory?> =
        arrayOfNulls<IAppNotificationComboBoxFactory_Impl>(size) as
        Array<IAppNotificationComboBoxFactory?>
  }
}
