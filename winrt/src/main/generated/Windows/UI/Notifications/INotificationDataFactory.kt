package Windows.UI.Notifications

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INotificationDataFactory.ABI::class)
@Signature("{23c1e33a-1c10-46fb-8040-dec384621cf8}")
@Guid("23c1e33a1c1046fb8040dec384621cf8")
@WinRTInterface("23c1e33a1c1046fb8040dec384621cf8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotificationDataFactory.ByReference::class)
public interface INotificationDataFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateNotificationData(initialValues: IIterable<IKeyValuePair<String?, String?>?>?,
      sequenceNumber: WinDef.UINT): NotificationData?

  @InterfaceMethod(1)
  public fun CreateNotificationData(initialValues: IIterable<IKeyValuePair<String?, String?>?>?):
      NotificationData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotificationDataFactory> {
    public override fun getValue() = ABI.makeINotificationDataFactory(pointer.getPointer(0))

    public fun setValue(value: INotificationDataFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotificationDataFactory {
    public val __587259483_Ptr: Pointer?

    public val _587259483_VtblPtr: Pointer?
      get() = __587259483_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateNotificationData(initialValues: IIterable<IKeyValuePair<String?,
        String?>?>?, sequenceNumber: WinDef.UINT): NotificationData? {
      val fnPtr = _587259483_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationData>()
      val hr = fn.invokeHR(arrayOf(__587259483_Ptr, marshalToNative(initialValues), sequenceNumber,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateNotificationData(initialValues: IIterable<IKeyValuePair<String?,
        String?>?>?): NotificationData? {
      val fnPtr = _587259483_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationData>()
      val hr = fn.invokeHR(arrayOf(__587259483_Ptr, marshalToNative(initialValues), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationData>(result.getValue())
      return resultValue
    }
  }

  public class INotificationDataFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __587259483_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotificationDataFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23c1e33a1c1046fb8040dec384621cf8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotificationDataFactory(ptr: Pointer?): WithDefault =
        INotificationDataFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotificationDataFactory {
      val address = segment.toRawLongValue()
      return makeINotificationDataFactory(Pointer(address))
    }

    public override fun toNative(obj: INotificationDataFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__587259483_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotificationDataFactory):
        Array<INotificationDataFactory?> = (elements as
        Array<INotificationDataFactory?>).castToImpl<INotificationDataFactory,INotificationDataFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotificationDataFactory?> =
        arrayOfNulls<INotificationDataFactory_Impl>(size) as Array<INotificationDataFactory?>
  }
}
