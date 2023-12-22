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

@ABIMarker(ITileNotificationFactory.ABI::class)
@Signature("{c6abdd6e-4928-46c8-bdbf-81a047dea0d4}")
@Guid("c6abdd6e492846c8bdbf81a047dea0d4")
@WinRTInterface("c6abdd6e492846c8bdbf81a047dea0d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileNotificationFactory.ByReference::class)
public interface ITileNotificationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateTileNotification(content: XmlDocument?): TileNotification?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileNotificationFactory> {
    public override fun getValue() = ABI.makeITileNotificationFactory(pointer.getPointer(0))

    public fun setValue(value: ITileNotificationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileNotificationFactory {
    public val __1659057759_Ptr: Pointer?

    public val _1659057759_VtblPtr: Pointer?
      get() = __1659057759_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateTileNotification(content: XmlDocument?): TileNotification? {
      val fnPtr = _1659057759_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileNotification>()
      val hr = fn.invokeHR(arrayOf(__1659057759_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileNotification>(result.getValue())
      return resultValue
    }
  }

  public class ITileNotificationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1659057759_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileNotificationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6abdd6e492846c8bdbf81a047dea0d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileNotificationFactory(ptr: Pointer?): WithDefault =
        ITileNotificationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileNotificationFactory {
      val address = segment.toRawLongValue()
      return makeITileNotificationFactory(Pointer(address))
    }

    public override fun toNative(obj: ITileNotificationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1659057759_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileNotificationFactory):
        Array<ITileNotificationFactory?> = (elements as
        Array<ITileNotificationFactory?>).castToImpl<ITileNotificationFactory,ITileNotificationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileNotificationFactory?> =
        arrayOfNulls<ITileNotificationFactory_Impl>(size) as Array<ITileNotificationFactory?>
  }
}
