package Windows.ApplicationModel.UserActivities

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

@ABIMarker(IUserActivitySessionHistoryItem.ABI::class)
@Signature("{e8d59bd3-3e5d-49fd-98d7-6da97521e255}")
@Guid("e8d59bd33e5d49fd98d76da97521e255")
@WinRTInterface("e8d59bd33e5d49fd98d76da97521e255")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivitySessionHistoryItem.ByReference::class)
public interface IUserActivitySessionHistoryItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UserActivity(): UserActivity?

  @InterfaceMethod(1)
  public fun get_StartTime(): DateTime?

  @InterfaceMethod(2)
  public fun get_EndTime(): IReference<DateTime?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivitySessionHistoryItem> {
    public override fun getValue() = ABI.makeIUserActivitySessionHistoryItem(pointer.getPointer(0))

    public fun setValue(value: IUserActivitySessionHistoryItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivitySessionHistoryItem {
    public val __235568142_Ptr: Pointer?

    public val _235568142_VtblPtr: Pointer?
      get() = __235568142_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UserActivity(): UserActivity? {
      val fnPtr = _235568142_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivity>()
      val hr = fn.invokeHR(arrayOf(__235568142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StartTime(): DateTime? {
      val fnPtr = _235568142_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__235568142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_EndTime(): IReference<DateTime?>? {
      val fnPtr = _235568142_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__235568142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivitySessionHistoryItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __235568142_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivitySessionHistoryItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8d59bd33e5d49fd98d76da97521e255")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivitySessionHistoryItem(ptr: Pointer?): WithDefault =
        IUserActivitySessionHistoryItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivitySessionHistoryItem {
      val address = segment.toRawLongValue()
      return makeIUserActivitySessionHistoryItem(Pointer(address))
    }

    public override fun toNative(obj: IUserActivitySessionHistoryItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__235568142_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivitySessionHistoryItem):
        Array<IUserActivitySessionHistoryItem?> = (elements as
        Array<IUserActivitySessionHistoryItem?>).castToImpl<IUserActivitySessionHistoryItem,IUserActivitySessionHistoryItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivitySessionHistoryItem?> =
        arrayOfNulls<IUserActivitySessionHistoryItem_Impl>(size) as
        Array<IUserActivitySessionHistoryItem?>
  }
}
