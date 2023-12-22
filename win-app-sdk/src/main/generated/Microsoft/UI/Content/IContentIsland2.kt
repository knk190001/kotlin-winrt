package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
import Microsoft.UI.Composition.Visual
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

@ABIMarker(IContentIsland2.ABI::class)
@Signature("{7891e8a0-4f21-555f-be28-0120d5edc031}")
@Guid("7891e8a04f21555fbe280120d5edc031")
@WinRTInterface("7891e8a04f21555fbe280120d5edc031")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentIsland2.ByReference::class)
public interface IContentIsland2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Compositor(): Compositor?

  @InterfaceMethod(1)
  public fun get_Root(): Visual?

  @InterfaceMethod(2)
  public fun put_Root(value: Visual?): Unit

  @InterfaceMethod(3)
  public fun add_Connected(handler: EventHandler<ContentIsland?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Connected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_Disconnected(handler: EventHandler<ContentIsland?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Disconnected(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentIsland2> {
    public override fun getValue() = ABI.makeIContentIsland2(pointer.getPointer(0))

    public fun setValue(value: IContentIsland2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentIsland2 {
    public val __1237130066_Ptr: Pointer?

    public val _1237130066_VtblPtr: Pointer?
      get() = __1237130066_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Compositor(): Compositor? {
      val fnPtr = _1237130066_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Compositor>()
      val hr = fn.invokeHR(arrayOf(__1237130066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Compositor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Root(): Visual? {
      val fnPtr = _1237130066_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__1237130066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Root(value: Visual?): Unit {
      val fnPtr = _1237130066_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1237130066_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Connected(handler: EventHandler<ContentIsland?>?):
        EventRegistrationToken? {
      val fnPtr = _1237130066_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1237130066_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Connected(token: EventRegistrationToken?): Unit {
      val fnPtr = _1237130066_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1237130066_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_Disconnected(handler: EventHandler<ContentIsland?>?):
        EventRegistrationToken? {
      val fnPtr = _1237130066_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1237130066_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Disconnected(token: EventRegistrationToken?): Unit {
      val fnPtr = _1237130066_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1237130066_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentIsland2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237130066_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentIsland2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7891e8a04f21555fbe280120d5edc031")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentIsland2(ptr: Pointer?): WithDefault = IContentIsland2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentIsland2 {
      val address = segment.toRawLongValue()
      return makeIContentIsland2(Pointer(address))
    }

    public override fun toNative(obj: IContentIsland2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237130066_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentIsland2): Array<IContentIsland2?> = (elements as
        Array<IContentIsland2?>).castToImpl<IContentIsland2,IContentIsland2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentIsland2?> =
        arrayOfNulls<IContentIsland2_Impl>(size) as Array<IContentIsland2?>
  }
}
