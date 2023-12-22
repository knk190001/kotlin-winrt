package Windows.Media.Capture

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

@ABIMarker(IAppBroadcastManagerStatics.ABI::class)
@Signature("{364e018b-1e4e-411f-ab3e-92959844c156}")
@Guid("364e018b1e4e411fab3e92959844c156")
@WinRTInterface("364e018b1e4e411fab3e92959844c156")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastManagerStatics.ByReference::class)
public interface IAppBroadcastManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetGlobalSettings(): AppBroadcastGlobalSettings?

  @InterfaceMethod(1)
  public fun ApplyGlobalSettings(value: AppBroadcastGlobalSettings?): Unit

  @InterfaceMethod(2)
  public fun GetProviderSettings(): AppBroadcastProviderSettings?

  @InterfaceMethod(3)
  public fun ApplyProviderSettings(value: AppBroadcastProviderSettings?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastManagerStatics> {
    public override fun getValue() = ABI.makeIAppBroadcastManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastManagerStatics {
    public val __1308301552_Ptr: Pointer?

    public val _1308301552_VtblPtr: Pointer?
      get() = __1308301552_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetGlobalSettings(): AppBroadcastGlobalSettings? {
      val fnPtr = _1308301552_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastGlobalSettings>()
      val hr = fn.invokeHR(arrayOf(__1308301552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastGlobalSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ApplyGlobalSettings(value: AppBroadcastGlobalSettings?): Unit {
      val fnPtr = _1308301552_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1308301552_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetProviderSettings(): AppBroadcastProviderSettings? {
      val fnPtr = _1308301552_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastProviderSettings>()
      val hr = fn.invokeHR(arrayOf(__1308301552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastProviderSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ApplyProviderSettings(value: AppBroadcastProviderSettings?): Unit {
      val fnPtr = _1308301552_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1308301552_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1308301552_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("364e018b1e4e411fab3e92959844c156")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastManagerStatics(ptr: Pointer?): WithDefault =
        IAppBroadcastManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1308301552_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastManagerStatics):
        Array<IAppBroadcastManagerStatics?> = (elements as
        Array<IAppBroadcastManagerStatics?>).castToImpl<IAppBroadcastManagerStatics,IAppBroadcastManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastManagerStatics?> =
        arrayOfNulls<IAppBroadcastManagerStatics_Impl>(size) as Array<IAppBroadcastManagerStatics?>
  }
}
