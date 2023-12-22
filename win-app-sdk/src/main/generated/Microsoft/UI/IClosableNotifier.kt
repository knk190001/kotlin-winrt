package Microsoft.UI

import Windows.Foundation.EventRegistrationToken
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClosableNotifier.ABI::class)
@Signature("{2989e93b-ed0f-5e79-90f2-eac592fc6e6a}")
@Guid("2989e93bed0f5e7990f2eac592fc6e6a")
@WinRTInterface("2989e93bed0f5e7990f2eac592fc6e6a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClosableNotifier.ByReference::class)
public interface IClosableNotifier : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsClosed(): Boolean

  @InterfaceMethod(1)
  public fun add_Closed(handler: ClosableNotifierHandler?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_FrameworkClosed(handler: ClosableNotifierHandler?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_FrameworkClosed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClosableNotifier> {
    public override fun getValue() = ABI.makeIClosableNotifier(pointer.getPointer(0))

    public fun setValue(value: IClosableNotifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClosableNotifier {
    public val __105354978_Ptr: Pointer?

    public val _105354978_VtblPtr: Pointer?
      get() = __105354978_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsClosed(): Boolean {
      val fnPtr = _105354978_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__105354978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_Closed(handler: ClosableNotifierHandler?): EventRegistrationToken? {
      val fnPtr = _105354978_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__105354978_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _105354978_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__105354978_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_FrameworkClosed(handler: ClosableNotifierHandler?):
        EventRegistrationToken? {
      val fnPtr = _105354978_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__105354978_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_FrameworkClosed(token: EventRegistrationToken?): Unit {
      val fnPtr = _105354978_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__105354978_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClosableNotifier_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __105354978_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClosableNotifier, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2989e93bed0f5e7990f2eac592fc6e6a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClosableNotifier(ptr: Pointer?): WithDefault = IClosableNotifier_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClosableNotifier {
      val address = segment.toRawLongValue()
      return makeIClosableNotifier(Pointer(address))
    }

    public override fun toNative(obj: IClosableNotifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__105354978_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClosableNotifier): Array<IClosableNotifier?> = (elements
        as Array<IClosableNotifier?>).castToImpl<IClosableNotifier,IClosableNotifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClosableNotifier?> =
        arrayOfNulls<IClosableNotifier_Impl>(size) as Array<IClosableNotifier?>
  }
}
