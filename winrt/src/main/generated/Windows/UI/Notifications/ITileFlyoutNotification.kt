package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(ITileFlyoutNotification.ABI::class)
@Signature("{9a53b261-c70c-42be-b2f3-f42aa97d34e5}")
@Guid("9a53b261c70c42beb2f3f42aa97d34e5")
@WinRTInterface("9a53b261c70c42beb2f3f42aa97d34e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileFlyoutNotification.ByReference::class)
public interface ITileFlyoutNotification : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): XmlDocument?

  @InterfaceMethod(1)
  public fun put_ExpirationTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(2)
  public fun get_ExpirationTime(): IReference<DateTime?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileFlyoutNotification> {
    public override fun getValue() = ABI.makeITileFlyoutNotification(pointer.getPointer(0))

    public fun setValue(value: ITileFlyoutNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileFlyoutNotification {
    public val __231979452_Ptr: Pointer?

    public val _231979452_VtblPtr: Pointer?
      get() = __231979452_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): XmlDocument? {
      val fnPtr = _231979452_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__231979452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ExpirationTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _231979452_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__231979452_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ExpirationTime(): IReference<DateTime?>? {
      val fnPtr = _231979452_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__231979452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }
  }

  public class ITileFlyoutNotification_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __231979452_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileFlyoutNotification, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a53b261c70c42beb2f3f42aa97d34e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileFlyoutNotification(ptr: Pointer?): WithDefault =
        ITileFlyoutNotification_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileFlyoutNotification {
      val address = segment.toRawLongValue()
      return makeITileFlyoutNotification(Pointer(address))
    }

    public override fun toNative(obj: ITileFlyoutNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__231979452_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileFlyoutNotification): Array<ITileFlyoutNotification?>
        = (elements as
        Array<ITileFlyoutNotification?>).castToImpl<ITileFlyoutNotification,ITileFlyoutNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileFlyoutNotification?> =
        arrayOfNulls<ITileFlyoutNotification_Impl>(size) as Array<ITileFlyoutNotification?>
  }
}
