package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDeviceManufacturerNotificationTrigger.ABI::class)
@Signature("{81278ab5-41ab-16da-86c2-7f7bf0912f5b}")
@Guid("81278ab541ab16da86c27f7bf0912f5b")
@WinRTInterface("81278ab541ab16da86c27f7bf0912f5b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceManufacturerNotificationTrigger.ByReference::class)
public interface IDeviceManufacturerNotificationTrigger : NativeMapped, IWinRTInterface,
    IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun get_TriggerQualifier(): String?

  @InterfaceMethod(1)
  public fun get_OneShot(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceManufacturerNotificationTrigger> {
    public override fun getValue() =
        ABI.makeIDeviceManufacturerNotificationTrigger(pointer.getPointer(0))

    public fun setValue(value: IDeviceManufacturerNotificationTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceManufacturerNotificationTrigger,
      IBackgroundTrigger.WithDefault {
    public val __1020770869_Ptr: Pointer?

    public val _1020770869_VtblPtr: Pointer?
      get() = __1020770869_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TriggerQualifier(): String? {
      val fnPtr = _1020770869_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1020770869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OneShot(): Boolean {
      val fnPtr = _1020770869_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1020770869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDeviceManufacturerNotificationTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1020770869_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1020770869_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceManufacturerNotificationTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81278ab541ab16da86c27f7bf0912f5b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceManufacturerNotificationTrigger(ptr: Pointer?): WithDefault =
        IDeviceManufacturerNotificationTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceManufacturerNotificationTrigger {
      val address = segment.toRawLongValue()
      return makeIDeviceManufacturerNotificationTrigger(Pointer(address))
    }

    public override fun toNative(obj: IDeviceManufacturerNotificationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1020770869_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceManufacturerNotificationTrigger):
        Array<IDeviceManufacturerNotificationTrigger?> = (elements as
        Array<IDeviceManufacturerNotificationTrigger?>).castToImpl<IDeviceManufacturerNotificationTrigger,IDeviceManufacturerNotificationTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceManufacturerNotificationTrigger?> =
        arrayOfNulls<IDeviceManufacturerNotificationTrigger_Impl>(size) as
        Array<IDeviceManufacturerNotificationTrigger?>
  }
}
