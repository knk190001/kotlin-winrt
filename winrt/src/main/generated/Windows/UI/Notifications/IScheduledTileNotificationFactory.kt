package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
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

@ABIMarker(IScheduledTileNotificationFactory.ABI::class)
@Signature("{3383138a-98c0-4c3b-bbd6-4a633c7cfc29}")
@Guid("3383138a98c04c3bbbd64a633c7cfc29")
@WinRTInterface("3383138a98c04c3bbbd64a633c7cfc29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScheduledTileNotificationFactory.ByReference::class)
public interface IScheduledTileNotificationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateScheduledTileNotification(content: XmlDocument?, deliveryTime: DateTime?):
      ScheduledTileNotification?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScheduledTileNotificationFactory> {
    public override fun getValue() =
        ABI.makeIScheduledTileNotificationFactory(pointer.getPointer(0))

    public fun setValue(value: IScheduledTileNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScheduledTileNotificationFactory {
    public val __1766642964_Ptr: Pointer?

    public val _1766642964_VtblPtr: Pointer?
      get() = __1766642964_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateScheduledTileNotification(content: XmlDocument?,
        deliveryTime: DateTime?): ScheduledTileNotification? {
      val fnPtr = _1766642964_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScheduledTileNotification>()
      val hr = fn.invokeHR(arrayOf(__1766642964_Ptr, marshalToNative(content),
          marshalToNative(deliveryTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScheduledTileNotification>(result.getValue())
      return resultValue
    }
  }

  public class IScheduledTileNotificationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1766642964_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScheduledTileNotificationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3383138a98c04c3bbbd64a633c7cfc29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScheduledTileNotificationFactory(ptr: Pointer?): WithDefault =
        IScheduledTileNotificationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScheduledTileNotificationFactory {
      val address = segment.toRawLongValue()
      return makeIScheduledTileNotificationFactory(Pointer(address))
    }

    public override fun toNative(obj: IScheduledTileNotificationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1766642964_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledTileNotificationFactory):
        Array<IScheduledTileNotificationFactory?> = (elements as
        Array<IScheduledTileNotificationFactory?>).castToImpl<IScheduledTileNotificationFactory,IScheduledTileNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledTileNotificationFactory?> =
        arrayOfNulls<IScheduledTileNotificationFactory_Impl>(size) as
        Array<IScheduledTileNotificationFactory?>
  }
}
