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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITileNotification.ABI::class)
@Signature("{ebaec8fa-50ec-4c18-b4d0-3af02e5540ab}")
@Guid("ebaec8fa50ec4c18b4d03af02e5540ab")
@WinRTInterface("ebaec8fa50ec4c18b4d03af02e5540ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileNotification.ByReference::class)
public interface ITileNotification : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): XmlDocument?

  @InterfaceMethod(1)
  public fun put_ExpirationTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(2)
  public fun get_ExpirationTime(): IReference<DateTime?>?

  @InterfaceMethod(3)
  public fun put_Tag(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Tag(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileNotification> {
    public override fun getValue() = ABI.makeITileNotification(pointer.getPointer(0))

    public fun setValue(value: ITileNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileNotification {
    public val __152023255_Ptr: Pointer?

    public val _152023255_VtblPtr: Pointer?
      get() = __152023255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): XmlDocument? {
      val fnPtr = _152023255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__152023255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ExpirationTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _152023255_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__152023255_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ExpirationTime(): IReference<DateTime?>? {
      val fnPtr = _152023255_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__152023255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Tag(value: String?): Unit {
      val fnPtr = _152023255_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__152023255_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Tag(): String? {
      val fnPtr = _152023255_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__152023255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ITileNotification_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __152023255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileNotification, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ebaec8fa50ec4c18b4d03af02e5540ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileNotification(ptr: Pointer?): WithDefault = ITileNotification_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileNotification {
      val address = segment.toRawLongValue()
      return makeITileNotification(Pointer(address))
    }

    public override fun toNative(obj: ITileNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__152023255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileNotification): Array<ITileNotification?> = (elements
        as Array<ITileNotification?>).castToImpl<ITileNotification,ITileNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileNotification?> =
        arrayOfNulls<ITileNotification_Impl>(size) as Array<ITileNotification?>
  }
}
