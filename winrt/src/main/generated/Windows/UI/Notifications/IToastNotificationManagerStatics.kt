package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
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

@ABIMarker(IToastNotificationManagerStatics.ABI::class)
@Signature("{50ac103f-d235-4598-bbef-98fe4d1a3ad4}")
@Guid("50ac103fd2354598bbef98fe4d1a3ad4")
@WinRTInterface("50ac103fd2354598bbef98fe4d1a3ad4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationManagerStatics.ByReference::class)
public interface IToastNotificationManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateToastNotifier(): ToastNotifier?

  @InterfaceMethod(1)
  public fun CreateToastNotifier(applicationId: String?): ToastNotifier?

  @InterfaceMethod(2)
  public fun GetTemplateContent(type: ToastTemplateType?): XmlDocument?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationManagerStatics> {
    public override fun getValue() = ABI.makeIToastNotificationManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationManagerStatics {
    public val __1883376070_Ptr: Pointer?

    public val _1883376070_VtblPtr: Pointer?
      get() = __1883376070_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateToastNotifier(): ToastNotifier? {
      val fnPtr = _1883376070_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotifier>()
      val hr = fn.invokeHR(arrayOf(__1883376070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotifier>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateToastNotifier(applicationId: String?): ToastNotifier? {
      val fnPtr = _1883376070_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotifier>()
      val hr = fn.invokeHR(arrayOf(__1883376070_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotifier>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetTemplateContent(type: ToastTemplateType?): XmlDocument? {
      val fnPtr = _1883376070_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__1883376070_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1883376070_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50ac103fd2354598bbef98fe4d1a3ad4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationManagerStatics(ptr: Pointer?): WithDefault =
        IToastNotificationManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationManagerStatics {
      val address = segment.toRawLongValue()
      return makeIToastNotificationManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1883376070_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerStatics):
        Array<IToastNotificationManagerStatics?> = (elements as
        Array<IToastNotificationManagerStatics?>).castToImpl<IToastNotificationManagerStatics,IToastNotificationManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerStatics?> =
        arrayOfNulls<IToastNotificationManagerStatics_Impl>(size) as
        Array<IToastNotificationManagerStatics?>
  }
}
