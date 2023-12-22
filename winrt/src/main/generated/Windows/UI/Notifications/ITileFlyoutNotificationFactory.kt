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

@ABIMarker(ITileFlyoutNotificationFactory.ABI::class)
@Signature("{ef556ff5-5226-4f2b-b278-88a35dfe569f}")
@Guid("ef556ff552264f2bb27888a35dfe569f")
@WinRTInterface("ef556ff552264f2bb27888a35dfe569f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileFlyoutNotificationFactory.ByReference::class)
public interface ITileFlyoutNotificationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateTileFlyoutNotification(content: XmlDocument?): TileFlyoutNotification?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileFlyoutNotificationFactory> {
    public override fun getValue() = ABI.makeITileFlyoutNotificationFactory(pointer.getPointer(0))

    public fun setValue(value: ITileFlyoutNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileFlyoutNotificationFactory {
    public val __796086746_Ptr: Pointer?

    public val _796086746_VtblPtr: Pointer?
      get() = __796086746_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateTileFlyoutNotification(content: XmlDocument?):
        TileFlyoutNotification? {
      val fnPtr = _796086746_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileFlyoutNotification>()
      val hr = fn.invokeHR(arrayOf(__796086746_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileFlyoutNotification>(result.getValue())
      return resultValue
    }
  }

  public class ITileFlyoutNotificationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __796086746_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileFlyoutNotificationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef556ff552264f2bb27888a35dfe569f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileFlyoutNotificationFactory(ptr: Pointer?): WithDefault =
        ITileFlyoutNotificationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileFlyoutNotificationFactory {
      val address = segment.toRawLongValue()
      return makeITileFlyoutNotificationFactory(Pointer(address))
    }

    public override fun toNative(obj: ITileFlyoutNotificationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__796086746_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileFlyoutNotificationFactory):
        Array<ITileFlyoutNotificationFactory?> = (elements as
        Array<ITileFlyoutNotificationFactory?>).castToImpl<ITileFlyoutNotificationFactory,ITileFlyoutNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileFlyoutNotificationFactory?> =
        arrayOfNulls<ITileFlyoutNotificationFactory_Impl>(size) as
        Array<ITileFlyoutNotificationFactory?>
  }
}
