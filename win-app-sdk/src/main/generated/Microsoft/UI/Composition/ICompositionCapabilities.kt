package Microsoft.UI.Composition

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionCapabilities.ABI::class)
@Signature("{7689bf12-75c0-52ea-81cb-463ed1c16c45}")
@Guid("7689bf1275c052ea81cb463ed1c16c45")
@WinRTInterface("7689bf1275c052ea81cb463ed1c16c45")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionCapabilities.ByReference::class)
public interface ICompositionCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AreEffectsSupported(): Boolean

  @InterfaceMethod(1)
  public fun AreEffectsFast(): Boolean

  @InterfaceMethod(2)
  public fun add_Changed(handler: TypedEventHandler<CompositionCapabilities?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionCapabilities> {
    public override fun getValue() = ABI.makeICompositionCapabilities(pointer.getPointer(0))

    public fun setValue(value: ICompositionCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionCapabilities {
    public val __2007329351_Ptr: Pointer?

    public val _2007329351_VtblPtr: Pointer?
      get() = __2007329351_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AreEffectsSupported(): Boolean {
      val fnPtr = _2007329351_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2007329351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun AreEffectsFast(): Boolean {
      val fnPtr = _2007329351_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2007329351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_Changed(handler: TypedEventHandler<CompositionCapabilities?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2007329351_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2007329351_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _2007329351_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007329351_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2007329351_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7689bf1275c052ea81cb463ed1c16c45")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionCapabilities(ptr: Pointer?): WithDefault =
        ICompositionCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionCapabilities {
      val address = segment.toRawLongValue()
      return makeICompositionCapabilities(Pointer(address))
    }

    public override fun toNative(obj: ICompositionCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2007329351_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionCapabilities):
        Array<ICompositionCapabilities?> = (elements as
        Array<ICompositionCapabilities?>).castToImpl<ICompositionCapabilities,ICompositionCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionCapabilities?> =
        arrayOfNulls<ICompositionCapabilities_Impl>(size) as Array<ICompositionCapabilities?>
  }
}
