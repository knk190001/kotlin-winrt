package Windows.Media.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ISingleSelectMediaTrackList.ABI::class)
@Signature("{77206f1f-c34f-494f-8077-2bad9ff4ecf1}")
@Guid("77206f1fc34f494f80772bad9ff4ecf1")
@WinRTInterface("77206f1fc34f494f80772bad9ff4ecf1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISingleSelectMediaTrackList.ByReference::class)
public interface ISingleSelectMediaTrackList : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SelectedIndexChanged(handler: TypedEventHandler<ISingleSelectMediaTrackList?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SelectedIndexChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun put_SelectedIndex(value: Int): Unit

  @InterfaceMethod(3)
  public fun get_SelectedIndex(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISingleSelectMediaTrackList> {
    public override fun getValue() = ABI.makeISingleSelectMediaTrackList(pointer.getPointer(0))

    public fun setValue(value: ISingleSelectMediaTrackList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISingleSelectMediaTrackList {
    public val __1015321570_Ptr: Pointer?

    public val _1015321570_VtblPtr: Pointer?
      get() = __1015321570_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_SelectedIndexChanged(handler: TypedEventHandler<ISingleSelectMediaTrackList?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1015321570_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1015321570_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SelectedIndexChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1015321570_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015321570_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun put_SelectedIndex(value: Int): Unit {
      val fnPtr = _1015321570_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1015321570_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_SelectedIndex(): Int {
      val fnPtr = _1015321570_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1015321570_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ISingleSelectMediaTrackList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1015321570_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISingleSelectMediaTrackList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77206f1fc34f494f80772bad9ff4ecf1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISingleSelectMediaTrackList(ptr: Pointer?): WithDefault =
        ISingleSelectMediaTrackList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISingleSelectMediaTrackList {
      val address = segment.toRawLongValue()
      return makeISingleSelectMediaTrackList(Pointer(address))
    }

    public override fun toNative(obj: ISingleSelectMediaTrackList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1015321570_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISingleSelectMediaTrackList):
        Array<ISingleSelectMediaTrackList?> = (elements as
        Array<ISingleSelectMediaTrackList?>).castToImpl<ISingleSelectMediaTrackList,ISingleSelectMediaTrackList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISingleSelectMediaTrackList?> =
        arrayOfNulls<ISingleSelectMediaTrackList_Impl>(size) as Array<ISingleSelectMediaTrackList?>
  }
}
