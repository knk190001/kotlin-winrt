package Windows.Media.Capture

import Windows.Foundation.DateTime
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastPreviewStreamVideoHeader.ABI::class)
@Signature("{8bef6113-da84-4499-a7ab-87118cb4a157}")
@Guid("8bef6113da844499a7ab87118cb4a157")
@WinRTInterface("8bef6113da844499a7ab87118cb4a157")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastPreviewStreamVideoHeader.ByReference::class)
public interface IAppBroadcastPreviewStreamVideoHeader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AbsoluteTimestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_RelativeTimestamp(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_FrameId(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastPreviewStreamVideoHeader> {
    public override fun getValue() =
        ABI.makeIAppBroadcastPreviewStreamVideoHeader(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastPreviewStreamVideoHeader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastPreviewStreamVideoHeader {
    public val __1816946680_Ptr: Pointer?

    public val _1816946680_VtblPtr: Pointer?
      get() = __1816946680_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AbsoluteTimestamp(): DateTime? {
      val fnPtr = _1816946680_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1816946680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RelativeTimestamp(): TimeSpan? {
      val fnPtr = _1816946680_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1816946680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _1816946680_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1816946680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FrameId(): WinDef.ULONG {
      val fnPtr = _1816946680_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1816946680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppBroadcastPreviewStreamVideoHeader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1816946680_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastPreviewStreamVideoHeader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8bef6113da844499a7ab87118cb4a157")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastPreviewStreamVideoHeader(ptr: Pointer?): WithDefault =
        IAppBroadcastPreviewStreamVideoHeader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastPreviewStreamVideoHeader {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastPreviewStreamVideoHeader(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastPreviewStreamVideoHeader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1816946680_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastPreviewStreamVideoHeader):
        Array<IAppBroadcastPreviewStreamVideoHeader?> = (elements as
        Array<IAppBroadcastPreviewStreamVideoHeader?>).castToImpl<IAppBroadcastPreviewStreamVideoHeader,IAppBroadcastPreviewStreamVideoHeader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastPreviewStreamVideoHeader?> =
        arrayOfNulls<IAppBroadcastPreviewStreamVideoHeader_Impl>(size) as
        Array<IAppBroadcastPreviewStreamVideoHeader?>
  }
}
