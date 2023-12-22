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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToastNotificationFactory.ABI::class)
@Signature("{04124b20-82c6-4229-b109-fd9ed4662b53}")
@Guid("04124b2082c64229b109fd9ed4662b53")
@WinRTInterface("04124b2082c64229b109fd9ed4662b53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationFactory.ByReference::class)
public interface IToastNotificationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateToastNotification(content: XmlDocument?): ToastNotification?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationFactory> {
    public override fun getValue() = ABI.makeIToastNotificationFactory(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationFactory {
    public val __1004720232_Ptr: Pointer?

    public val _1004720232_VtblPtr: Pointer?
      get() = __1004720232_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateToastNotification(content: XmlDocument?): ToastNotification? {
      val fnPtr = _1004720232_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotification>()
      val hr = fn.invokeHR(arrayOf(__1004720232_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotification>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1004720232_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("04124b2082c64229b109fd9ed4662b53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationFactory(ptr: Pointer?): WithDefault =
        IToastNotificationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationFactory {
      val address = segment.toRawLongValue()
      return makeIToastNotificationFactory(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1004720232_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationFactory):
        Array<IToastNotificationFactory?> = (elements as
        Array<IToastNotificationFactory?>).castToImpl<IToastNotificationFactory,IToastNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationFactory?> =
        arrayOfNulls<IToastNotificationFactory_Impl>(size) as Array<IToastNotificationFactory?>
  }
}
