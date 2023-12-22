package Windows.UI.Text.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Globalization.Language
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

@ABIMarker(ICoreTextServicesManager.ABI::class)
@Signature("{c2507d83-6e0a-4a8a-bdf8-1948874854ba}")
@Guid("c2507d836e0a4a8abdf81948874854ba")
@WinRTInterface("c2507d836e0a4a8abdf81948874854ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextServicesManager.ByReference::class)
public interface ICoreTextServicesManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InputLanguage(): Language?

  @InterfaceMethod(1)
  public fun add_InputLanguageChanged(handler: TypedEventHandler<CoreTextServicesManager?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_InputLanguageChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun CreateEditContext(): CoreTextEditContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextServicesManager> {
    public override fun getValue() = ABI.makeICoreTextServicesManager(pointer.getPointer(0))

    public fun setValue(value: ICoreTextServicesManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextServicesManager {
    public val __460636011_Ptr: Pointer?

    public val _460636011_VtblPtr: Pointer?
      get() = __460636011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InputLanguage(): Language? {
      val fnPtr = _460636011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Language>()
      val hr = fn.invokeHR(arrayOf(__460636011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Language>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun add_InputLanguageChanged(handler: TypedEventHandler<CoreTextServicesManager?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _460636011_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__460636011_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_InputLanguageChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _460636011_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__460636011_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun CreateEditContext(): CoreTextEditContext? {
      val fnPtr = _460636011_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextEditContext>()
      val hr = fn.invokeHR(arrayOf(__460636011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextEditContext>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextServicesManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __460636011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextServicesManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2507d836e0a4a8abdf81948874854ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextServicesManager(ptr: Pointer?): WithDefault =
        ICoreTextServicesManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextServicesManager {
      val address = segment.toRawLongValue()
      return makeICoreTextServicesManager(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextServicesManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__460636011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextServicesManager):
        Array<ICoreTextServicesManager?> = (elements as
        Array<ICoreTextServicesManager?>).castToImpl<ICoreTextServicesManager,ICoreTextServicesManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextServicesManager?> =
        arrayOfNulls<ICoreTextServicesManager_Impl>(size) as Array<ICoreTextServicesManager?>
  }
}
