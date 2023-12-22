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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAppNotificationProgressDataFactory.ABI::class)
@Signature("{c08e4a0f-3a75-55d6-8c3e-14f03ae46046}")
@Guid("c08e4a0f3a7555d68c3e14f03ae46046")
@WinRTInterface("c08e4a0f3a7555d68c3e14f03ae46046")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationProgressDataFactory.ByReference::class)
public interface IAppNotificationProgressDataFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(sequenceNumber: WinDef.UINT): AppNotificationProgressData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationProgressDataFactory> {
    public override fun getValue() =
        ABI.makeIAppNotificationProgressDataFactory(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationProgressDataFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationProgressDataFactory {
    public val __1879430274_Ptr: Pointer?

    public val _1879430274_VtblPtr: Pointer?
      get() = __1879430274_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(sequenceNumber: WinDef.UINT): AppNotificationProgressData? {
      val fnPtr = _1879430274_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationProgressData>()
      val hr = fn.invokeHR(arrayOf(__1879430274_Ptr, sequenceNumber, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationProgressData>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationProgressDataFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1879430274_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationProgressDataFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c08e4a0f3a7555d68c3e14f03ae46046")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationProgressDataFactory(ptr: Pointer?): WithDefault =
        IAppNotificationProgressDataFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationProgressDataFactory {
      val address = segment.toRawLongValue()
      return makeIAppNotificationProgressDataFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationProgressDataFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1879430274_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationProgressDataFactory):
        Array<IAppNotificationProgressDataFactory?> = (elements as
        Array<IAppNotificationProgressDataFactory?>).castToImpl<IAppNotificationProgressDataFactory,IAppNotificationProgressDataFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationProgressDataFactory?> =
        arrayOfNulls<IAppNotificationProgressDataFactory_Impl>(size) as
        Array<IAppNotificationProgressDataFactory?>
  }
}
