package Windows.Media.Capture

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

@ABIMarker(IGameBarServicesManager.ABI::class)
@Signature("{3a4b9cfa-7f8b-4c60-9dbb-0bcd262dffc6}")
@Guid("3a4b9cfa7f8b4c609dbb0bcd262dffc6")
@WinRTInterface("3a4b9cfa7f8b4c609dbb0bcd262dffc6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameBarServicesManager.ByReference::class)
public interface IGameBarServicesManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_GameBarServicesCreated(value: TypedEventHandler<GameBarServicesManager?,
      GameBarServicesManagerGameBarServicesCreatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_GameBarServicesCreated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameBarServicesManager> {
    public override fun getValue() = ABI.makeIGameBarServicesManager(pointer.getPointer(0))

    public fun setValue(value: IGameBarServicesManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameBarServicesManager {
    public val __2096470458_Ptr: Pointer?

    public val _2096470458_VtblPtr: Pointer?
      get() = __2096470458_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_GameBarServicesCreated(value: TypedEventHandler<GameBarServicesManager?,
        GameBarServicesManagerGameBarServicesCreatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2096470458_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2096470458_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_GameBarServicesCreated(token: EventRegistrationToken?): Unit {
      val fnPtr = _2096470458_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2096470458_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGameBarServicesManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2096470458_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameBarServicesManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a4b9cfa7f8b4c609dbb0bcd262dffc6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameBarServicesManager(ptr: Pointer?): WithDefault =
        IGameBarServicesManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameBarServicesManager {
      val address = segment.toRawLongValue()
      return makeIGameBarServicesManager(Pointer(address))
    }

    public override fun toNative(obj: IGameBarServicesManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2096470458_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameBarServicesManager): Array<IGameBarServicesManager?>
        = (elements as
        Array<IGameBarServicesManager?>).castToImpl<IGameBarServicesManager,IGameBarServicesManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameBarServicesManager?> =
        arrayOfNulls<IGameBarServicesManager_Impl>(size) as Array<IGameBarServicesManager?>
  }
}
