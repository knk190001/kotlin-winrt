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

@ABIMarker(IScheduledToastNotification4.ABI::class)
@Signature("{1d4761fd-bdef-4e4a-96be-0101369b58d2}")
@Guid("1d4761fdbdef4e4a96be0101369b58d2")
@WinRTInterface("1d4761fdbdef4e4a96be0101369b58d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScheduledToastNotification4.ByReference::class)
public interface IScheduledToastNotification4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExpirationTime(): IReference<DateTime?>?

  @InterfaceMethod(1)
  public fun put_ExpirationTime(value: IReference<DateTime?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScheduledToastNotification4> {
    public override fun getValue() = ABI.makeIScheduledToastNotification4(pointer.getPointer(0))

    public fun setValue(value: IScheduledToastNotification4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScheduledToastNotification4 {
    public val __1189128481_Ptr: Pointer?

    public val _1189128481_VtblPtr: Pointer?
      get() = __1189128481_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExpirationTime(): IReference<DateTime?>? {
      val fnPtr = _1189128481_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1189128481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ExpirationTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _1189128481_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189128481_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScheduledToastNotification4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1189128481_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScheduledToastNotification4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d4761fdbdef4e4a96be0101369b58d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScheduledToastNotification4(ptr: Pointer?): WithDefault =
        IScheduledToastNotification4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScheduledToastNotification4 {
      val address = segment.toRawLongValue()
      return makeIScheduledToastNotification4(Pointer(address))
    }

    public override fun toNative(obj: IScheduledToastNotification4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1189128481_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScheduledToastNotification4):
        Array<IScheduledToastNotification4?> = (elements as
        Array<IScheduledToastNotification4?>).castToImpl<IScheduledToastNotification4,IScheduledToastNotification4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScheduledToastNotification4?> =
        arrayOfNulls<IScheduledToastNotification4_Impl>(size) as
        Array<IScheduledToastNotification4?>
  }
}
