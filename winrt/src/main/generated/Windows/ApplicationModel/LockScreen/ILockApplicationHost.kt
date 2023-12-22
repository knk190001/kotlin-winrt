package Windows.ApplicationModel.LockScreen

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

@ABIMarker(ILockApplicationHost.ABI::class)
@Signature("{38ee31ad-d94f-4e7c-81fa-4f4436506281}")
@Guid("38ee31add94f4e7c81fa4f4436506281")
@WinRTInterface("38ee31add94f4e7c81fa4f4436506281")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILockApplicationHost.ByReference::class)
public interface ILockApplicationHost : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestUnlock(): Unit

  @InterfaceMethod(1)
  public fun add_Unlocking(handler: TypedEventHandler<LockApplicationHost?,
      LockScreenUnlockingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Unlocking(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILockApplicationHost> {
    public override fun getValue() = ABI.makeILockApplicationHost(pointer.getPointer(0))

    public fun setValue(value: ILockApplicationHost_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILockApplicationHost {
    public val __942611109_Ptr: Pointer?

    public val _942611109_VtblPtr: Pointer?
      get() = __942611109_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestUnlock(): Unit {
      val fnPtr = _942611109_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__942611109_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun add_Unlocking(handler: TypedEventHandler<LockApplicationHost?,
        LockScreenUnlockingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _942611109_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__942611109_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Unlocking(token: EventRegistrationToken?): Unit {
      val fnPtr = _942611109_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__942611109_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILockApplicationHost_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __942611109_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILockApplicationHost, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38ee31add94f4e7c81fa4f4436506281")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILockApplicationHost(ptr: Pointer?): WithDefault = ILockApplicationHost_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILockApplicationHost {
      val address = segment.toRawLongValue()
      return makeILockApplicationHost(Pointer(address))
    }

    public override fun toNative(obj: ILockApplicationHost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__942611109_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILockApplicationHost): Array<ILockApplicationHost?> =
        (elements as
        Array<ILockApplicationHost?>).castToImpl<ILockApplicationHost,ILockApplicationHost_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILockApplicationHost?> =
        arrayOfNulls<ILockApplicationHost_Impl>(size) as Array<ILockApplicationHost?>
  }
}
