package Windows.UI.Notifications

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScheduledToastNotification.ABI::class)
@Signature("{79f577f8-0de7-48cd-9740-9b370490c838}")
@Guid("79f577f80de748cd97409b370490c838")
@WinRTInterface("79f577f80de748cd97409b370490c838")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScheduledToastNotification.ByReference::class)
public interface IScheduledToastNotification : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): XmlDocument?

  @InterfaceMethod(1)
  public fun get_DeliveryTime(): DateTime?

  @InterfaceMethod(2)
  public fun get_SnoozeInterval(): IReference<TimeSpan?>?

  @InterfaceMethod(3)
  public fun get_MaximumSnoozeCount(): WinDef.UINT

  @InterfaceMethod(4)
  public fun put_Id(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_Id(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScheduledToastNotification> {
    public override fun getValue() = ABI.makeIScheduledToastNotification(pointer.getPointer(0))

    public fun setValue(value: IScheduledToastNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScheduledToastNotification {
    public val __2039850997_Ptr: Pointer?

    public val _2039850997_VtblPtr: Pointer?
      get() = __2039850997_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): XmlDocument? {
      val fnPtr = _2039850997_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__2039850997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeliveryTime(): DateTime? {
      val fnPtr = _2039850997_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2039850997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SnoozeInterval(): IReference<TimeSpan?>? {
      val fnPtr = _2039850997_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__2039850997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MaximumSnoozeCount(): WinDef.UINT {
      val fnPtr = _2039850997_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2039850997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_Id(value: String?): Unit {
      val fnPtr = _2039850997_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039850997_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Id(): String? {
      val fnPtr = _2039850997_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2039850997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IScheduledToastNotification_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2039850997_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScheduledToastNotification, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79f577f80de748cd97409b370490c838")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScheduledToastNotification(ptr: Pointer?): WithDefault =
        IScheduledToastNotification_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScheduledToastNotification {
      val address = segment.toRawLongValue()
      return makeIScheduledToastNotification(Pointer(address))
    }

    public override fun toNative(obj: IScheduledToastNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2039850997_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledToastNotification):
        Array<IScheduledToastNotification?> = (elements as
        Array<IScheduledToastNotification?>).castToImpl<IScheduledToastNotification,IScheduledToastNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledToastNotification?> =
        arrayOfNulls<IScheduledToastNotification_Impl>(size) as Array<IScheduledToastNotification?>
  }
}
