package Windows.Media.AppBroadcasting

import Windows.System.User
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

@ABIMarker(IAppBroadcastingUIStatics.ABI::class)
@Signature("{55a8a79d-23cb-4579-9c34-886fe02c045a}")
@Guid("55a8a79d23cb45799c34886fe02c045a")
@WinRTInterface("55a8a79d23cb45799c34886fe02c045a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastingUIStatics.ByReference::class)
public interface IAppBroadcastingUIStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): AppBroadcastingUI?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): AppBroadcastingUI?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastingUIStatics> {
    public override fun getValue() = ABI.makeIAppBroadcastingUIStatics(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastingUIStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastingUIStatics {
    public val __1228569067_Ptr: Pointer?

    public val _1228569067_VtblPtr: Pointer?
      get() = __1228569067_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): AppBroadcastingUI? {
      val fnPtr = _1228569067_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastingUI>()
      val hr = fn.invokeHR(arrayOf(__1228569067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastingUI>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): AppBroadcastingUI? {
      val fnPtr = _1228569067_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastingUI>()
      val hr = fn.invokeHR(arrayOf(__1228569067_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastingUI>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastingUIStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1228569067_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastingUIStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55a8a79d23cb45799c34886fe02c045a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastingUIStatics(ptr: Pointer?): WithDefault =
        IAppBroadcastingUIStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastingUIStatics {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastingUIStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastingUIStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1228569067_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastingUIStatics):
        Array<IAppBroadcastingUIStatics?> = (elements as
        Array<IAppBroadcastingUIStatics?>).castToImpl<IAppBroadcastingUIStatics,IAppBroadcastingUIStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastingUIStatics?> =
        arrayOfNulls<IAppBroadcastingUIStatics_Impl>(size) as Array<IAppBroadcastingUIStatics?>
  }
}
