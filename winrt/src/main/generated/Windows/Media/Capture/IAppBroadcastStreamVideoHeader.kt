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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastStreamVideoHeader.ABI::class)
@Signature("{0b9ebece-7e32-432d-8ca2-36bf10b9f462}")
@Guid("0b9ebece7e32432d8ca236bf10b9f462")
@WinRTInterface("0b9ebece7e32432d8ca236bf10b9f462")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastStreamVideoHeader.ByReference::class)
public interface IAppBroadcastStreamVideoHeader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AbsoluteTimestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_RelativeTimestamp(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_IsKeyFrame(): Boolean

  @InterfaceMethod(4)
  public fun get_HasDiscontinuity(): Boolean

  @InterfaceMethod(5)
  public fun get_FrameId(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastStreamVideoHeader> {
    public override fun getValue() = ABI.makeIAppBroadcastStreamVideoHeader(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastStreamVideoHeader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastStreamVideoHeader {
    public val __1099309392_Ptr: Pointer?

    public val _1099309392_VtblPtr: Pointer?
      get() = __1099309392_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AbsoluteTimestamp(): DateTime? {
      val fnPtr = _1099309392_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1099309392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RelativeTimestamp(): TimeSpan? {
      val fnPtr = _1099309392_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1099309392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _1099309392_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1099309392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsKeyFrame(): Boolean {
      val fnPtr = _1099309392_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1099309392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_HasDiscontinuity(): Boolean {
      val fnPtr = _1099309392_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1099309392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_FrameId(): WinDef.ULONG {
      val fnPtr = _1099309392_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1099309392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppBroadcastStreamVideoHeader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1099309392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastStreamVideoHeader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b9ebece7e32432d8ca236bf10b9f462")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastStreamVideoHeader(ptr: Pointer?): WithDefault =
        IAppBroadcastStreamVideoHeader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastStreamVideoHeader {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastStreamVideoHeader(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastStreamVideoHeader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1099309392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastStreamVideoHeader):
        Array<IAppBroadcastStreamVideoHeader?> = (elements as
        Array<IAppBroadcastStreamVideoHeader?>).castToImpl<IAppBroadcastStreamVideoHeader,IAppBroadcastStreamVideoHeader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastStreamVideoHeader?> =
        arrayOfNulls<IAppBroadcastStreamVideoHeader_Impl>(size) as
        Array<IAppBroadcastStreamVideoHeader?>
  }
}
