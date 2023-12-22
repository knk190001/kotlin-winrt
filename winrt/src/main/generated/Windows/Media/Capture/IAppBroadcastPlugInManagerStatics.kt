package Windows.Media.Capture

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

@ABIMarker(IAppBroadcastPlugInManagerStatics.ABI::class)
@Signature("{f2645c20-5c76-4cdc-9364-82fe9eb6534d}")
@Guid("f2645c205c764cdc936482fe9eb6534d")
@WinRTInterface("f2645c205c764cdc936482fe9eb6534d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastPlugInManagerStatics.ByReference::class)
public interface IAppBroadcastPlugInManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): AppBroadcastPlugInManager?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): AppBroadcastPlugInManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastPlugInManagerStatics> {
    public override fun getValue() =
        ABI.makeIAppBroadcastPlugInManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastPlugInManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastPlugInManagerStatics {
    public val __570356003_Ptr: Pointer?

    public val _570356003_VtblPtr: Pointer?
      get() = __570356003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): AppBroadcastPlugInManager? {
      val fnPtr = _570356003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastPlugInManager>()
      val hr = fn.invokeHR(arrayOf(__570356003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastPlugInManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): AppBroadcastPlugInManager? {
      val fnPtr = _570356003_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastPlugInManager>()
      val hr = fn.invokeHR(arrayOf(__570356003_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastPlugInManager>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastPlugInManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __570356003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastPlugInManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2645c205c764cdc936482fe9eb6534d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastPlugInManagerStatics(ptr: Pointer?): WithDefault =
        IAppBroadcastPlugInManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastPlugInManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastPlugInManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastPlugInManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__570356003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastPlugInManagerStatics):
        Array<IAppBroadcastPlugInManagerStatics?> = (elements as
        Array<IAppBroadcastPlugInManagerStatics?>).castToImpl<IAppBroadcastPlugInManagerStatics,IAppBroadcastPlugInManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastPlugInManagerStatics?> =
        arrayOfNulls<IAppBroadcastPlugInManagerStatics_Impl>(size) as
        Array<IAppBroadcastPlugInManagerStatics?>
  }
}
