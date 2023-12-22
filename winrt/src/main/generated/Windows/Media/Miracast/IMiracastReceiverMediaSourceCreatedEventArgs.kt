package Windows.Media.Miracast

import Windows.Foundation.Deferral
import Windows.Media.Core.MediaSource
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

@ABIMarker(IMiracastReceiverMediaSourceCreatedEventArgs.ABI::class)
@Signature("{17cf519e-1246-531d-945a-6b158e39c3aa}")
@Guid("17cf519e1246531d945a6b158e39c3aa")
@WinRTInterface("17cf519e1246531d945a6b158e39c3aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverMediaSourceCreatedEventArgs.ByReference::class)
public interface IMiracastReceiverMediaSourceCreatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Connection(): MiracastReceiverConnection?

  @InterfaceMethod(1)
  public fun get_MediaSource(): MediaSource?

  @InterfaceMethod(2)
  public fun get_CursorImageChannelSettings(): MiracastReceiverCursorImageChannelSettings?

  @InterfaceMethod(3)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverMediaSourceCreatedEventArgs> {
    public override fun getValue() =
        ABI.makeIMiracastReceiverMediaSourceCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverMediaSourceCreatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverMediaSourceCreatedEventArgs {
    public val __2001931115_Ptr: Pointer?

    public val _2001931115_VtblPtr: Pointer?
      get() = __2001931115_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Connection(): MiracastReceiverConnection? {
      val fnPtr = _2001931115_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverConnection>()
      val hr = fn.invokeHR(arrayOf(__2001931115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverConnection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MediaSource(): MediaSource? {
      val fnPtr = _2001931115_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__2001931115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CursorImageChannelSettings():
        MiracastReceiverCursorImageChannelSettings? {
      val fnPtr = _2001931115_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverCursorImageChannelSettings>()
      val hr = fn.invokeHR(arrayOf(__2001931115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MiracastReceiverCursorImageChannelSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _2001931115_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__2001931115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IMiracastReceiverMediaSourceCreatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2001931115_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverMediaSourceCreatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17cf519e1246531d945a6b158e39c3aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverMediaSourceCreatedEventArgs(ptr: Pointer?): WithDefault =
        IMiracastReceiverMediaSourceCreatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMiracastReceiverMediaSourceCreatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverMediaSourceCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverMediaSourceCreatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2001931115_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverMediaSourceCreatedEventArgs):
        Array<IMiracastReceiverMediaSourceCreatedEventArgs?> = (elements as
        Array<IMiracastReceiverMediaSourceCreatedEventArgs?>).castToImpl<IMiracastReceiverMediaSourceCreatedEventArgs,IMiracastReceiverMediaSourceCreatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverMediaSourceCreatedEventArgs?> =
        arrayOfNulls<IMiracastReceiverMediaSourceCreatedEventArgs_Impl>(size) as
        Array<IMiracastReceiverMediaSourceCreatedEventArgs?>
  }
}
