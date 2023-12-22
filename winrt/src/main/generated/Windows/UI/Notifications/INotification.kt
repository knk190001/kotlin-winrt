package Windows.UI.Notifications

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

@ABIMarker(INotification.ABI::class)
@Signature("{108037fe-eb76-4f82-97bc-da07530a2e20}")
@Guid("108037feeb764f8297bcda07530a2e20")
@WinRTInterface("108037feeb764f8297bcda07530a2e20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotification.ByReference::class)
public interface INotification : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExpirationTime(): IReference<DateTime?>?

  @InterfaceMethod(1)
  public fun put_ExpirationTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(2)
  public fun get_Visual(): NotificationVisual?

  @InterfaceMethod(3)
  public fun put_Visual(value: NotificationVisual?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<INotification>
      {
    public override fun getValue() = ABI.makeINotification(pointer.getPointer(0))

    public fun setValue(value: INotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotification {
    public val __2125919579_Ptr: Pointer?

    public val _2125919579_VtblPtr: Pointer?
      get() = __2125919579_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExpirationTime(): IReference<DateTime?>? {
      val fnPtr = _2125919579_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__2125919579_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ExpirationTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _2125919579_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2125919579_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Visual(): NotificationVisual? {
      val fnPtr = _2125919579_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationVisual>()
      val hr = fn.invokeHR(arrayOf(__2125919579_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationVisual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Visual(value: NotificationVisual?): Unit {
      val fnPtr = _2125919579_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2125919579_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INotification_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2125919579_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotification, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("108037feeb764f8297bcda07530a2e20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotification(ptr: Pointer?): WithDefault = INotification_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotification {
      val address = segment.toRawLongValue()
      return makeINotification(Pointer(address))
    }

    public override fun toNative(obj: INotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2125919579_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotification): Array<INotification?> = (elements as
        Array<INotification?>).castToImpl<INotification,INotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotification?> =
        arrayOfNulls<INotification_Impl>(size) as Array<INotification?>
  }
}
