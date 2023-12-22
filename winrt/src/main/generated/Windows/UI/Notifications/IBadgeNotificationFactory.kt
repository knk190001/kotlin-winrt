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

@ABIMarker(IBadgeNotificationFactory.ABI::class)
@Signature("{edf255ce-0618-4d59-948a-5a61040c52f9}")
@Guid("edf255ce06184d59948a5a61040c52f9")
@WinRTInterface("edf255ce06184d59948a5a61040c52f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBadgeNotificationFactory.ByReference::class)
public interface IBadgeNotificationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateBadgeNotification(content: XmlDocument?): BadgeNotification?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBadgeNotificationFactory> {
    public override fun getValue() = ABI.makeIBadgeNotificationFactory(pointer.getPointer(0))

    public fun setValue(value: IBadgeNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBadgeNotificationFactory {
    public val __554008212_Ptr: Pointer?

    public val _554008212_VtblPtr: Pointer?
      get() = __554008212_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateBadgeNotification(content: XmlDocument?): BadgeNotification? {
      val fnPtr = _554008212_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BadgeNotification>()
      val hr = fn.invokeHR(arrayOf(__554008212_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BadgeNotification>(result.getValue())
      return resultValue
    }
  }

  public class IBadgeNotificationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __554008212_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBadgeNotificationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("edf255ce06184d59948a5a61040c52f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBadgeNotificationFactory(ptr: Pointer?): WithDefault =
        IBadgeNotificationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBadgeNotificationFactory {
      val address = segment.toRawLongValue()
      return makeIBadgeNotificationFactory(Pointer(address))
    }

    public override fun toNative(obj: IBadgeNotificationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__554008212_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBadgeNotificationFactory):
        Array<IBadgeNotificationFactory?> = (elements as
        Array<IBadgeNotificationFactory?>).castToImpl<IBadgeNotificationFactory,IBadgeNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBadgeNotificationFactory?> =
        arrayOfNulls<IBadgeNotificationFactory_Impl>(size) as Array<IBadgeNotificationFactory?>
  }
}
