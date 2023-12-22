package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
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

@ABIMarker(IScheduledToastNotificationFactory.ABI::class)
@Signature("{e7bed191-0bb9-4189-8394-31761b476fd7}")
@Guid("e7bed1910bb94189839431761b476fd7")
@WinRTInterface("e7bed1910bb94189839431761b476fd7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScheduledToastNotificationFactory.ByReference::class)
public interface IScheduledToastNotificationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateScheduledToastNotification(content: XmlDocument?, deliveryTime: DateTime?):
      ScheduledToastNotification?

  @InterfaceMethod(1)
  public fun CreateScheduledToastNotificationRecurring(
    content: XmlDocument?,
    deliveryTime: DateTime?,
    snoozeInterval: TimeSpan?,
    maximumSnoozeCount: WinDef.UINT
  ): ScheduledToastNotification?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScheduledToastNotificationFactory> {
    public override fun getValue() =
        ABI.makeIScheduledToastNotificationFactory(pointer.getPointer(0))

    public fun setValue(value: IScheduledToastNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScheduledToastNotificationFactory {
    public val __172739755_Ptr: Pointer?

    public val _172739755_VtblPtr: Pointer?
      get() = __172739755_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateScheduledToastNotification(content: XmlDocument?,
        deliveryTime: DateTime?): ScheduledToastNotification? {
      val fnPtr = _172739755_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScheduledToastNotification>()
      val hr = fn.invokeHR(arrayOf(__172739755_Ptr, marshalToNative(content),
          marshalToNative(deliveryTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScheduledToastNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateScheduledToastNotificationRecurring(
      content: XmlDocument?,
      deliveryTime: DateTime?,
      snoozeInterval: TimeSpan?,
      maximumSnoozeCount: WinDef.UINT
    ): ScheduledToastNotification? {
      val fnPtr = _172739755_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScheduledToastNotification>()
      val hr = fn.invokeHR(arrayOf(__172739755_Ptr, marshalToNative(content),
          marshalToNative(deliveryTime), marshalToNative(snoozeInterval), maximumSnoozeCount,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScheduledToastNotification>(result.getValue())
      return resultValue
    }
  }

  public class IScheduledToastNotificationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __172739755_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScheduledToastNotificationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7bed1910bb94189839431761b476fd7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScheduledToastNotificationFactory(ptr: Pointer?): WithDefault =
        IScheduledToastNotificationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScheduledToastNotificationFactory {
      val address = segment.toRawLongValue()
      return makeIScheduledToastNotificationFactory(Pointer(address))
    }

    public override fun toNative(obj: IScheduledToastNotificationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__172739755_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledToastNotificationFactory):
        Array<IScheduledToastNotificationFactory?> = (elements as
        Array<IScheduledToastNotificationFactory?>).castToImpl<IScheduledToastNotificationFactory,IScheduledToastNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledToastNotificationFactory?> =
        arrayOfNulls<IScheduledToastNotificationFactory_Impl>(size) as
        Array<IScheduledToastNotificationFactory?>
  }
}
