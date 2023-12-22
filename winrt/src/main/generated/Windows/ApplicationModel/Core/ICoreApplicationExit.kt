package Windows.ApplicationModel.Core

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(ICoreApplicationExit.ABI::class)
@Signature("{cf86461d-261e-4b72-9acd-44ed2ace6a29}")
@Guid("cf86461d261e4b729acd44ed2ace6a29")
@WinRTInterface("cf86461d261e4b729acd44ed2ace6a29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreApplicationExit.ByReference::class)
public interface ICoreApplicationExit : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Exit(): Unit

  @InterfaceMethod(1)
  public fun add_Exiting(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Exiting(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreApplicationExit> {
    public override fun getValue() = ABI.makeICoreApplicationExit(pointer.getPointer(0))

    public fun setValue(value: ICoreApplicationExit_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreApplicationExit {
    public val __1816879823_Ptr: Pointer?

    public val _1816879823_VtblPtr: Pointer?
      get() = __1816879823_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Exit(): Unit {
      val fnPtr = _1816879823_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1816879823_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun add_Exiting(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1816879823_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1816879823_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Exiting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1816879823_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1816879823_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreApplicationExit_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1816879823_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreApplicationExit, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf86461d261e4b729acd44ed2ace6a29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreApplicationExit(ptr: Pointer?): WithDefault = ICoreApplicationExit_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreApplicationExit {
      val address = segment.toRawLongValue()
      return makeICoreApplicationExit(Pointer(address))
    }

    public override fun toNative(obj: ICoreApplicationExit): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1816879823_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreApplicationExit): Array<ICoreApplicationExit?> =
        (elements as
        Array<ICoreApplicationExit?>).castToImpl<ICoreApplicationExit,ICoreApplicationExit_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreApplicationExit?> =
        arrayOfNulls<ICoreApplicationExit_Impl>(size) as Array<ICoreApplicationExit?>
  }
}
