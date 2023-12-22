package Windows.ApplicationModel.LockScreen

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IRandomAccessStream
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILockScreenInfo.ABI::class)
@Signature("{f59aa65c-9711-4dc9-a630-95b6cb8cdad0}")
@Guid("f59aa65c97114dc9a63095b6cb8cdad0")
@WinRTInterface("f59aa65c97114dc9a63095b6cb8cdad0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILockScreenInfo.ByReference::class)
public interface ILockScreenInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_LockScreenImageChanged(handler: TypedEventHandler<LockScreenInfo?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_LockScreenImageChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_LockScreenImage(): IRandomAccessStream?

  @InterfaceMethod(3)
  public fun add_BadgesChanged(handler: TypedEventHandler<LockScreenInfo?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_BadgesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun get_Badges(): IVectorView<LockScreenBadge?>?

  @InterfaceMethod(6)
  public fun add_DetailTextChanged(handler: TypedEventHandler<LockScreenInfo?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_DetailTextChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun get_DetailText(): IVectorView<String?>?

  @InterfaceMethod(9)
  public fun add_AlarmIconChanged(handler: TypedEventHandler<LockScreenInfo?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_AlarmIconChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun get_AlarmIcon(): IRandomAccessStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILockScreenInfo> {
    public override fun getValue() = ABI.makeILockScreenInfo(pointer.getPointer(0))

    public fun setValue(value: ILockScreenInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILockScreenInfo {
    public val __1016195981_Ptr: Pointer?

    public val _1016195981_VtblPtr: Pointer?
      get() = __1016195981_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_LockScreenImageChanged(handler: TypedEventHandler<LockScreenInfo?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_LockScreenImageChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LockScreenImage(): IRandomAccessStream? {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_BadgesChanged(handler: TypedEventHandler<LockScreenInfo?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_BadgesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Badges(): IVectorView<LockScreenBadge?>? {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<LockScreenBadge?>>()
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<LockScreenBadge?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_DetailTextChanged(handler: TypedEventHandler<LockScreenInfo?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_DetailTextChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DetailText(): IVectorView<String?>? {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun add_AlarmIconChanged(handler: TypedEventHandler<LockScreenInfo?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_AlarmIconChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_AlarmIcon(): IRandomAccessStream? {
      val fnPtr = _1016195981_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__1016195981_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }
  }

  public class ILockScreenInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1016195981_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILockScreenInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f59aa65c97114dc9a63095b6cb8cdad0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILockScreenInfo(ptr: Pointer?): WithDefault = ILockScreenInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILockScreenInfo {
      val address = segment.toRawLongValue()
      return makeILockScreenInfo(Pointer(address))
    }

    public override fun toNative(obj: ILockScreenInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1016195981_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILockScreenInfo): Array<ILockScreenInfo?> = (elements as
        Array<ILockScreenInfo?>).castToImpl<ILockScreenInfo,ILockScreenInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILockScreenInfo?> =
        arrayOfNulls<ILockScreenInfo_Impl>(size) as Array<ILockScreenInfo?>
  }
}
