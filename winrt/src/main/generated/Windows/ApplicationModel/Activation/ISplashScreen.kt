package Windows.ApplicationModel.Activation

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Rect
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

@ABIMarker(ISplashScreen.ABI::class)
@Signature("{ca4d975c-d4d6-43f0-97c0-0833c6391c24}")
@Guid("ca4d975cd4d643f097c00833c6391c24")
@WinRTInterface("ca4d975cd4d643f097c00833c6391c24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplashScreen.ByReference::class)
public interface ISplashScreen : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ImageLocation(): Rect?

  @InterfaceMethod(1)
  public fun add_Dismissed(handler: TypedEventHandler<SplashScreen?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Dismissed(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISplashScreen>
      {
    public override fun getValue() = ABI.makeISplashScreen(pointer.getPointer(0))

    public fun setValue(value: ISplashScreen_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplashScreen {
    public val __261685444_Ptr: Pointer?

    public val _261685444_VtblPtr: Pointer?
      get() = __261685444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ImageLocation(): Rect? {
      val fnPtr = _261685444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__261685444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_Dismissed(handler: TypedEventHandler<SplashScreen?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _261685444_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__261685444_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Dismissed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _261685444_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__261685444_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISplashScreen_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __261685444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplashScreen, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca4d975cd4d643f097c00833c6391c24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplashScreen(ptr: Pointer?): WithDefault = ISplashScreen_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplashScreen {
      val address = segment.toRawLongValue()
      return makeISplashScreen(Pointer(address))
    }

    public override fun toNative(obj: ISplashScreen): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__261685444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplashScreen): Array<ISplashScreen?> = (elements as
        Array<ISplashScreen?>).castToImpl<ISplashScreen,ISplashScreen_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplashScreen?> =
        arrayOfNulls<ISplashScreen_Impl>(size) as Array<ISplashScreen?>
  }
}
