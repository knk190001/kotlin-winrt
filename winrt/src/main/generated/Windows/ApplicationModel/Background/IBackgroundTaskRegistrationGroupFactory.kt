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

@ABIMarker(IBackgroundTaskRegistrationGroupFactory.ABI::class)
@Signature("{83d92b69-44cf-4631-9740-03c7d8741bc5}")
@Guid("83d92b6944cf4631974003c7d8741bc5")
@WinRTInterface("83d92b6944cf4631974003c7d8741bc5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskRegistrationGroupFactory.ByReference::class)
public interface IBackgroundTaskRegistrationGroupFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(id: String?): BackgroundTaskRegistrationGroup?

  @InterfaceMethod(1)
  public fun CreateWithName(id: String?, name: String?): BackgroundTaskRegistrationGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskRegistrationGroupFactory> {
    public override fun getValue() =
        ABI.makeIBackgroundTaskRegistrationGroupFactory(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskRegistrationGroupFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskRegistrationGroupFactory {
    public val __1491689736_Ptr: Pointer?

    public val _1491689736_VtblPtr: Pointer?
      get() = __1491689736_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(id: String?): BackgroundTaskRegistrationGroup? {
      val fnPtr = _1491689736_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTaskRegistrationGroup>()
      val hr = fn.invokeHR(arrayOf(__1491689736_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTaskRegistrationGroup>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithName(id: String?, name: String?):
        BackgroundTaskRegistrationGroup? {
      val fnPtr = _1491689736_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTaskRegistrationGroup>()
      val hr = fn.invokeHR(arrayOf(__1491689736_Ptr, marshalToNative(id), marshalToNative(name),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTaskRegistrationGroup>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundTaskRegistrationGroupFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1491689736_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskRegistrationGroupFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83d92b6944cf4631974003c7d8741bc5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskRegistrationGroupFactory(ptr: Pointer?): WithDefault =
        IBackgroundTaskRegistrationGroupFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBackgroundTaskRegistrationGroupFactory {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskRegistrationGroupFactory(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskRegistrationGroupFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1491689736_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskRegistrationGroupFactory):
        Array<IBackgroundTaskRegistrationGroupFactory?> = (elements as
        Array<IBackgroundTaskRegistrationGroupFactory?>).castToImpl<IBackgroundTaskRegistrationGroupFactory,IBackgroundTaskRegistrationGroupFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskRegistrationGroupFactory?> =
        arrayOfNulls<IBackgroundTaskRegistrationGroupFactory_Impl>(size) as
        Array<IBackgroundTaskRegistrationGroupFactory?>
  }
}
